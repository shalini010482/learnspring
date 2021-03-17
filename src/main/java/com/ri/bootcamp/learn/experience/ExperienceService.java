package com.ri.bootcamp.learn.experience;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ri.bootcamp.learn.dao.ExperienceEntity;
import com.ri.bootcamp.learn.domain.Experience;

@Service
public class ExperienceService {

	@Autowired
	ExperienceRepository experienceRepository;

	public Experience getById(String id) {
		Optional<ExperienceEntity> òptExperienceDetailsOut = experienceRepository.findById(id);
		Experience experienceDetailsOut = null;
		if (òptExperienceDetailsOut.isPresent()) {
			experienceDetailsOut = òptExperienceDetailsOut.get().getExperienceDomain();
		}
		return experienceDetailsOut;
	}

//	ViewAll
	public List<Experience> getAll() {
		List<ExperienceEntity> experienceEntityList = null;
		List<Experience> experienceDomainList = new ArrayList<Experience>();
		experienceEntityList = (List<ExperienceEntity>) experienceRepository.findAll();
		for (ExperienceEntity experienceEntity : experienceEntityList) {
			experienceDomainList.add(experienceEntity.getExperienceDomain());
		}
		return experienceDomainList;
	}
}
