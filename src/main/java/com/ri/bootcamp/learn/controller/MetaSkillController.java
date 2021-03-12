package com.ri.bootcamp.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.ri.bootcamp.learn.domain.MetaSkill;
import com.ri.bootcamp.learn.service.MetaSkillService;

@RestController
@RequestMapping(value = "/rms/skilldetails")
public class MetaSkillController {

	@Autowired
	MetaSkillService metaSkillService;

	@PostMapping("/create")
	@ResponseStatus(value = HttpStatus.CREATED)
	public MetaSkill create(MetaSkill skillDetailsIn) throws Exception {
		skillDetailsIn.setSkillName("C");
		skillDetailsIn.setSkillDescription("Skill C");
		MetaSkill newskillDetailsOut = metaSkillService.create(skillDetailsIn);
		return newskillDetailsOut;
	}

	@GetMapping("/get-all")
	@ResponseStatus(value = HttpStatus.OK)
	public List<MetaSkill> getAll() {
		List<MetaSkill> skillDetailsOutList = metaSkillService.getAll();
		return skillDetailsOutList;
	}

	public MetaSkill getById(String id) {
		MetaSkill metaSkillOut = metaSkillService.getById(id);
		if (metaSkillOut == null) {
		}
		return metaSkillOut;
	}
}
