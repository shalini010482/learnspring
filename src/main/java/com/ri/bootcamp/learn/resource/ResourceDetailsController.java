package com.ri.bootcamp.learn.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ri.bootcamp.learn.domain.ResourceDetails;
import com.ri.bootcamp.learn.exception.CustomGenericException;
import com.ri.bootcamp.learn.utility.StringConstantsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@RestController
@RequestMapping(value = "/rms/resourcedetails")
public class ResourceDetailsController {

	@Autowired // dependency injection controller depend on service layer
	ResourceDetailsService resourceDetailsService;
	
	// private static final Logger LOGGER = LoggerFactory.getLogger(com.ri.bootcamp.learn.resourceDetails.ResourceDetailsController.class);

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
	
	@DeleteMapping(value = "/delete")   
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteById(@RequestParam String id) {
		resourceDetailsService.deleteById(id);
    }
	
	@PutMapping("/update")   
    @ResponseStatus(value = HttpStatus.OK)
    public ResourceDetails update(@RequestBody ResourceDetails resourceDetailsIn) throws Exception {
		ResourceDetails resourceDetailsOut = resourceDetailsService.update(resourceDetailsIn);
        return resourceDetailsOut;
    }
}
