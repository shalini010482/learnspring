package com.ri.bootcamp.learn.experience;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService {

	@Autowired
	ExperienceRepository newExperienceRepository;
}
