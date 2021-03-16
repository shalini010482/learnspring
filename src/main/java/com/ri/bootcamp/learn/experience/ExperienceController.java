package com.ri.bootcamp.learn.experience;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.ri.bootcamp.learn.domain.Experience;

@RestController
@RequestMapping(value = "/rms/experience")
public class ExperienceController {

	@Autowired
	ExperienceService experienceService;

	@PostMapping("/create")
	@ResponseStatus(value = HttpStatus.CREATED)
	public Experience create(Experience experienceIn) throws Exception {
		Experience experienceDetailsOut = experienceService.create(experienceIn);
		return experienceDetailsOut;
	}

}
