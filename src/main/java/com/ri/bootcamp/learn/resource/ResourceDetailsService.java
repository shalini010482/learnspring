package com.ri.bootcamp.learn.resource;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ri.bootcamp.learn.dao.ResourceDetailsEntity;
import com.ri.bootcamp.learn.domain.MetaSkill;
import com.ri.bootcamp.learn.domain.ResourceDetails;
import com.ri.bootcamp.learn.exception.ClassMismatchException;
import com.ri.bootcamp.learn.metaskill.MetaSkillService;
import com.ri.bootcamp.learn.utility.BeanMapperUtil;

@Service
public class ResourceDetailsService {

	@Autowired
	ResourceDetailsRepository resourceDetailsRepository;

	@Autowired
	MetaSkillService metaSkillService;

	@Autowired
	BeanMapperUtil<ResourceDetails> beanMapperUtil;

	public ResourceDetails create(ResourceDetails resourceDetailsIn) {
		ResourceDetailsEntity resourceDetailsEntityIn = new ResourceDetailsEntity(resourceDetailsIn);// domain-->DAO
		ResourceDetailsEntity resourceDetailsEntityOut = resourceDetailsRepository.save(resourceDetailsEntityIn);
		ResourceDetails resourceDetailsOut = resourceDetailsEntityOut.getResourceDetailsDomain();
		resourceDetailsOut.setSkillSet(getMetaSkillSet(resourceDetailsEntityOut.getSkillIdList()));
		return resourceDetailsOut;
	}

	public ResourceDetails getById(String id) {
		Optional<ResourceDetailsEntity> optResourceDetailsEntyOut = resourceDetailsRepository.findById(id);
		ResourceDetails resourceDetailsOut = null;
		if (optResourceDetailsEntyOut.isPresent()) {
			ResourceDetailsEntity rscDetailEntity = optResourceDetailsEntyOut.get();
			resourceDetailsOut = optResourceDetailsEntyOut.get().getResourceDetailsDomain();
			resourceDetailsOut.setSkillSet(getMetaSkillSet(rscDetailEntity.getSkillIdList()));
		}
		return resourceDetailsOut;
	}

	private List<MetaSkill> getMetaSkillSet(String id) {
		List<MetaSkill> skillSet = new ArrayList<>();
		String[] ids = id.split(",");
		for (String skillId : ids) {
			skillSet.add(metaSkillService.getById(skillId));
		}
		return skillSet;
	}

	public List<ResourceDetails> getResourcesBySkill(String skill_ids) {
		String[] skillIdArr = skill_ids.split(",");
		List<ResourceDetails> resourcedetailsLst = new ArrayList<>();
		Set<ResourceDetailsEntity> resourceDetailEntitySet = new HashSet<>();
		for (String skillId : skillIdArr) {
			Set<ResourceDetailsEntity> resourceDetailsEntySet = resourceDetailsRepository.findBySkillIdListContains(skillId);
			resourceDetailEntitySet.addAll(resourceDetailsEntySet);
		}

		ResourceDetails resourceDtlsOut = null;
		for (ResourceDetailsEntity resourceDetailsEntity : resourceDetailEntitySet) {
			resourceDtlsOut = resourceDetailsEntity.getResourceDetailsDomain();
			resourceDtlsOut.setSkillSet(getMetaSkillSet(resourceDetailsEntity.getSkillIdList()));
			resourcedetailsLst.add(resourceDtlsOut);
		}
		return resourcedetailsLst;

	}

	public void deleteById(String id) {
		resourceDetailsRepository.deleteById(id);
	}

	public ResourceDetails update(ResourceDetails resourceDetailsIn) throws ClassMismatchException {
		Optional<ResourceDetailsEntity> optResourceDetailsEntityOut = resourceDetailsRepository
				.findById(resourceDetailsIn.getId());
		ResourceDetails resourceDetails = null;
		if (optResourceDetailsEntityOut.isPresent()) {
			ResourceDetails resourceDetailsDBObj = optResourceDetailsEntityOut.get().getResourceDetailsDomain();
			beanMapperUtil.copyNonNullProperties(resourceDetailsDBObj, resourceDetailsIn);
			ResourceDetailsEntity resourceDetailsSaveEntity = new ResourceDetailsEntity(resourceDetailsDBObj);
			ResourceDetailsEntity resourceDetailsEntityOut = resourceDetailsRepository.save(resourceDetailsSaveEntity);
			resourceDetails = resourceDetailsEntityOut.getResourceDetailsDomain();
		}
		return resourceDetails;
	}

}
