package com.ri.bootcamp.learn.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ri.bootcamp.learn.dao.ResourceDetailsEntity;
import com.ri.bootcamp.learn.domain.ResourceDetails;
import com.ri.bootcamp.learn.domain.MetaSkill;
import com.ri.bootcamp.learn.repository.ResourceDetailsRepository;

@Service
public class ResourceDetailsService {

	@Autowired
	ResourceDetailsRepository resourceDetailsRepository;

	@Autowired
	MetaSkillService metaSkillService;

	public ResourceDetails create(ResourceDetails resourceDetailsIn) {
		ResourceDetailsEntity resourceDetailsEntityIn = new ResourceDetailsEntity(resourceDetailsIn);// domain--DAO
		ResourceDetailsEntity resourceDetailsEntityOut = resourceDetailsRepository.save(resourceDetailsEntityIn);
		ResourceDetails resourceDetailsOut = resourceDetailsEntityOut.getResourceDetailsDomain();
		resourceDetailsOut.setSkillSet(getMetaSkillSet(resourceDetailsEntityOut.getSkillIdList()));
		return resourceDetailsOut;
	}

	public ResourceDetails getById(String id) {
		Optional<ResourceDetailsEntity> resourceDetailsIn = resourceDetailsRepository.findById(id);
		ResourceDetails resourceDetailsOut = null;
		if (resourceDetailsIn.isPresent()) {
			ResourceDetailsEntity rscDetailEntity = resourceDetailsIn.get();
			resourceDetailsOut = resourceDetailsIn.get().getResourceDetailsDomain();
			resourceDetailsOut.setSkillSet(getMetaSkillSet(rscDetailEntity.getSkillIdList()));
		}
		return resourceDetailsOut;
	}

	private Set<MetaSkill> getMetaSkillSet(String id) {
		Set<MetaSkill> skillSet = new HashSet<>();
		String[] ids = id.split(",");
		for (String skillId : ids) {
			skillSet.add(metaSkillService.getById(skillId));
		}
		return skillSet;
	}
	
	public List<ResourceDetails> getResourcesBySkill(String skill_ids) {
		String[] skillIdArr = skill_ids.split(",");
		List<ResourceDetails> resourcedetailsLst = new ArrayList<>();
		List<ResourceDetailsEntity> resourceDetailEntityList = new ArrayList<>();
		for (String skillId : skillIdArr) {
			List<ResourceDetailsEntity> tempList = resourceDetailsRepository.findBySkillIdListContains(skillId);
			resourceDetailEntityList.addAll(tempList);		
		}	
		
		ResourceDetails resourceDtlsOut = null;
		for(ResourceDetailsEntity resourceDetailsEntity : resourceDetailEntityList) {			
			resourceDtlsOut=resourceDetailsEntity.getResourceDetailsDomain();
			resourceDtlsOut.setSkillSet(getMetaSkillSet(resourceDetailsEntity.getSkillIdList()));
			resourcedetailsLst.add(resourceDtlsOut);
		}
		return resourcedetailsLst;

	}

}
