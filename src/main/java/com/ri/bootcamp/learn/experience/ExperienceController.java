package com.ri.bootcamp.learn.experience;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ri.bootcamp.learn.domain.Experience;
import com.ri.bootcamp.learn.exception.CustomGenericException;
import com.ri.bootcamp.learn.utility.StringConstantsUtil;

@RestController
@RequestMapping(value = "/rms/experience")
public class ExperienceController {

	@Autowired
	ExperienceService experienceService;

	private static final Logger LOGGER = LoggerFactory.getLogger(ExperienceController.class);
	
	@GetMapping("/get")
	@ResponseStatus(value = HttpStatus.OK)
	public Experience getById(@RequestParam String id) throws Exception {
		Experience experienceOut = experienceService.getById(id);
		if (experienceOut == null) {
			LOGGER.debug(StringConstantsUtil.DETAILS_NOT_FOUND_FOR + id);
			throw new CustomGenericException(StringConstantsUtil.RESPONSE_CODE_417,
					StringConstantsUtil.DETAILS_NOT_FOUND, StringConstantsUtil.DETAILS_NOT_FOUND_FOR + id);
		}
		return experienceOut;
	}

	@GetMapping(value = "/get-all")
	@ResponseStatus(value = HttpStatus.OK)
	public List<Experience> getAll() throws Exception {
		List<Experience> experienceListOut = experienceService.getAll();
		return experienceListOut;
	}

}
