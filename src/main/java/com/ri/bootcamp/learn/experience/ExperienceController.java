package com.ri.bootcamp.learn.experience;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ri.bootcamp.learn.domain.Experience;

@RestController
@RequestMapping(value = "/rms/experience")
public class ExperienceController {

	@Autowired
	ExperienceService experienceService;

	@GetMapping("/get")
	@ResponseStatus(value = HttpStatus.OK)
	public Experience getById(@RequestParam String id) throws Exception {
		Experience experienceOut = experienceService.getById(id);
		return experienceOut;
	}

	@GetMapping(value = "/get-all")
	@ResponseStatus(value = HttpStatus.OK)
	public List<Experience> getAll() throws Exception {
		List<Experience> experienceListOut = experienceService.getAll();
		return experienceListOut;
	}

}
