package com.ri.bootcamp.learn.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ri.bootcamp.learn.dao.MetaSkillEntity;
import com.ri.bootcamp.learn.domain.MetaSkill;
import com.ri.bootcamp.learn.repository.MetaSkillRepository;

@Service
public class MetaSkillService {

	@Autowired
	MetaSkillRepository newMetaSkillRepository;

	public MetaSkill create(MetaSkill skillDetailsIn) {
		MetaSkillEntity skillDetailsEntityIn = new MetaSkillEntity(skillDetailsIn);// domain--DAO
		MetaSkillEntity skillDetailsEntityOut = newMetaSkillRepository.save(skillDetailsEntityIn);
		MetaSkill metaSkillOut = skillDetailsEntityOut.getMetaSkillDomain();
		return metaSkillOut;
	}

	public List<MetaSkill> getAll() {
		List<MetaSkillEntity> metaSkillEntityList = (List<MetaSkillEntity>) newMetaSkillRepository.findAll();
		List<MetaSkill> metaSkillLst = new ArrayList<>();
		for (MetaSkillEntity v : metaSkillEntityList) {
			metaSkillLst.add(v.getMetaSkillDomain());
		}
		return metaSkillLst;
	}

	public MetaSkill getById(String id) {
		Optional<MetaSkillEntity> optMetaSkillOut = newMetaSkillRepository.findById(id);
		MetaSkill metaSkillOut = null;
		if (optMetaSkillOut.isPresent()) {
			MetaSkillEntity skillEntityOut = optMetaSkillOut.get();
			metaSkillOut = skillEntityOut.getMetaSkillDomain();
		}
		return metaSkillOut;
	}

}
