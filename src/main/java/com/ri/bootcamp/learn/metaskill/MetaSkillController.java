package com.ri.bootcamp.learn.metaskill;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.ri.bootcamp.learn.domain.MetaSkill;
import com.ri.bootcamp.learn.exception.CustomGenericException;
import com.ri.bootcamp.learn.resource.ResourceDetailsController;
import com.ri.bootcamp.learn.utility.StringConstantsUtil;

@RestController
@RequestMapping(value = "/rms/skilldetails")
public class MetaSkillController {

	@Autowired
	MetaSkillService metaSkillService;

	private static final Logger LOGGER = LoggerFactory.getLogger(ResourceDetailsController.class);

	@PostMapping("/create")
	@ResponseStatus(value = HttpStatus.CREATED)
	public MetaSkill create(@RequestBody MetaSkill skillDetailsIn) throws Exception {
		MetaSkill newskillDetailsOut = metaSkillService.create(skillDetailsIn);
		if (newskillDetailsOut == null) {
			LOGGER.debug(StringConstantsUtil.CREATION_FAILED_FOR + skillDetailsIn.getSkillName());
			throw new CustomGenericException(StringConstantsUtil.RESPONSE_CODE_417, StringConstantsUtil.CREATION_FAILED,
					StringConstantsUtil.CREATION_FAILED_FOR + skillDetailsIn.getSkillName());
		}
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
