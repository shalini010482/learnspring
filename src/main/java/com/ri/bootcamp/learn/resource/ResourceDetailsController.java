package com.ri.bootcamp.learn.resource;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

@RestController
@RequestMapping(value = "/rms/resourcedetails")
public class ResourceDetailsController {

	@Autowired
	ResourceDetailsService resourceDetailsService;

	private static final Logger LOGGER = LoggerFactory.getLogger(ResourceDetailsController.class);

	@PostMapping("/create")
	@ResponseStatus(value = HttpStatus.CREATED)
	public ResourceDetails create(@RequestBody ResourceDetails resourceDetailsIn) throws Exception {
		ResourceDetails resourceDetailsOut = resourceDetailsService.create(resourceDetailsIn);
		if (resourceDetailsOut == null) {
			LOGGER.debug(StringConstantsUtil.CREATION_FAILED_FOR + resourceDetailsIn.getName());
			throw new CustomGenericException(StringConstantsUtil.RESPONSE_CODE_417, StringConstantsUtil.CREATION_FAILED,
					StringConstantsUtil.CREATION_FAILED_FOR + resourceDetailsIn.getName());
		}
		return resourceDetailsOut;
	}

	@GetMapping("/get")
	@ResponseStatus(value = HttpStatus.OK)
	public ResourceDetails getById(@RequestParam String id) throws Exception {
		ResourceDetails resourceDetailsOut = resourceDetailsService.getById(id);
		if (resourceDetailsOut == null) {
			LOGGER.debug(StringConstantsUtil.DETAILS_NOT_FOUND_FOR + id);
			throw new CustomGenericException(StringConstantsUtil.RESPONSE_CODE_417,
					StringConstantsUtil.DETAILS_NOT_FOUND, StringConstantsUtil.DETAILS_NOT_FOUND_FOR + id);
		}
		return resourceDetailsOut;
	}

	@GetMapping("/get-resources-by-skill")
	@ResponseStatus(value = HttpStatus.OK)
	public List<ResourceDetails> getResourcesBySkill(@RequestParam String skill_ids) throws Exception {
		List<ResourceDetails> resourceListOut = resourceDetailsService.getResourcesBySkill(skill_ids);
		if (resourceListOut == null) {
			LOGGER.debug(StringConstantsUtil.DETAILS_NOT_FOUND_FOR + skill_ids);
			throw new CustomGenericException(StringConstantsUtil.RESPONSE_CODE_417,
					StringConstantsUtil.DETAILS_NOT_FOUND, StringConstantsUtil.DETAILS_NOT_FOUND_FOR + skill_ids);
		}
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
		if (resourceDetailsOut == null) {
			LOGGER.debug(StringConstantsUtil.UPDATION_FAILED_FOR + resourceDetailsIn.getId());
			throw new CustomGenericException(StringConstantsUtil.RESPONSE_CODE_417, StringConstantsUtil.UPDATION_FAILED,
					StringConstantsUtil.UPDATION_FAILED_FOR + resourceDetailsIn.getId());
		}

		return resourceDetailsOut;
	}
}
