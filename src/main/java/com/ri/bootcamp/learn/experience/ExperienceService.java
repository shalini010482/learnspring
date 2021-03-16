package com.ri.bootcamp.learn.experience;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ri.bootcamp.learn.dao.ExperienceEntity;
import com.ri.bootcamp.learn.domain.Experience;

@Service
public class ExperienceService {

	@Autowired
	ExperienceRepository newExperienceRepository;

	public Experience create(Experience experienceIn) {
		ExperienceEntity experienceDetailsEntityIn = new ExperienceEntity(experienceIn);// domain--DAO
		ExperienceEntity experienceEntityOut = newExperienceRepository.save(experienceDetailsEntityIn);
		Experience experienceOut = experienceEntityOut.getExperienceDomain();
		return experienceOut;
	}

}
