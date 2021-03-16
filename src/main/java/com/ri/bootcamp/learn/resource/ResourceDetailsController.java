package com.ri.bootcamp.learn.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ri.bootcamp.learn.domain.ResourceDetails;

@RestController
@RequestMapping(value = "/rms/resourcedetails")
public class ResourceDetailsController {

	@Autowired // dependency injection controller depend on service layer
	ResourceDetailsService resourceDetailsService;

	@PostMapping("/create")
	@ResponseStatus(value = HttpStatus.CREATED)
	public ResourceDetails create(@RequestBody ResourceDetails resourceDetailsIn) throws Exception {
		ResourceDetails resourceDetailsOut = resourceDetailsService.create(resourceDetailsIn);// domain
		return resourceDetailsOut;
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
