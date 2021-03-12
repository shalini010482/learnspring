package com.ri.bootcamp.learn.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ri.bootcamp.learn.domain.ResourceDetails;
import com.ri.bootcamp.learn.domain.MetaSkill;
import com.ri.bootcamp.learn.service.ResourceDetailsService;

@RestController
@RequestMapping(value = "/rms/resourcedetails")
public class ResourceDetailsController {

	@Autowired // dependency injection controller depend on service layer
	ResourceDetailsService resourceDetailsService;

	@PostMapping("/create")
	// @LogExecutionTime
	@ResponseStatus(value = HttpStatus.CREATED)

	public ResourceDetails create() throws Exception {
		ResourceDetails resourceDetailsIn = new ResourceDetails();

		Set<MetaSkill> skillSet = new HashSet<>();
		skillSet.add(new MetaSkill("71d160aa-3d91-46da-860c-e1a320bb8b6b", 0, " ", " "));
		skillSet.add(new MetaSkill("b5c4e026-7cbe-4630-8bd4-06fa1348c5b8", 0, " ", " "));

		resourceDetailsIn.setName("Aku");
		resourceDetailsIn.setGender("Male");
		resourceDetailsIn.setCaste("Reddy");
		resourceDetailsIn.setReligion("Hindu");
		resourceDetailsIn.setMaritalStatus("Single");
		resourceDetailsIn.setQualification("MCA");
		resourceDetailsIn.setMotherTongue("Tamil");
		resourceDetailsIn.setPostApplierFor("Tester");

		resourceDetailsIn.setSkillSet(skillSet);

		ResourceDetails newjoineeDetailsOut = resourceDetailsService.create(resourceDetailsIn);// domain
		return newjoineeDetailsOut;
	}

	@GetMapping("/get")
	@ResponseStatus(value = HttpStatus.OK)
	public ResourceDetails getById(@RequestParam String id) throws Exception {
		ResourceDetails resourceDetailsOut = resourceDetailsService.getById(id);
		return resourceDetailsOut;
	}

	@GetMapping("/get-resources-by-skill")
	@ResponseStatus(value = HttpStatus.OK)
	public List<ResourceDetails> getResourcesBySkill(@RequestParam String skill_ids) throws Exception {
		List<ResourceDetails> resourceListOut = resourceDetailsService.getResourcesBySkill(skill_ids);
		return resourceListOut;
	}
}
