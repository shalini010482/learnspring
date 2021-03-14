package com.ri.bootcamp.learn.state;

import java.util.List;

import com.ri.bootcamp.learn.domain.State;
import com.ri.bootcamp.learn.exception.CustomGenericException;
import com.ri.bootcamp.learn.utility.StringConstantsUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
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

@RestController
@RequestMapping(value = "/admin/address/state")
public class StateController {

    @Autowired
    StateService stateService;

    private static final Logger LOGGER = LoggerFactory.getLogger(StateController.class);

//	Create
    @PostMapping("/create")
    @ResponseStatus(value = HttpStatus.CREATED)
    public State create(@RequestBody State stateIn) throws Exception {
	State stateOut = stateService.create(stateIn);
	if (stateOut == null) {
	    LOGGER.debug(StringConstantsUtil.CREATION_FAILED_FOR + stateIn.getName());
	    throw new CustomGenericException(StringConstantsUtil.RESPONSE_CODE_417, StringConstantsUtil.CREATION_FAILED,
		    StringConstantsUtil.CREATION_FAILED_FOR + stateIn.getName());
	}
	return stateOut;
    }

//	Update
    @PutMapping("/update")
    @ResponseStatus(value = HttpStatus.OK)
    public State update(@RequestBody State stateIn) throws Exception {
	State stateOut = stateService.update(stateIn);
	if (stateOut == null) {
	    LOGGER.debug(StringConstantsUtil.UPDATION_FAILED_FOR + stateIn.getId());
	    throw new CustomGenericException(StringConstantsUtil.RESPONSE_CODE_417, StringConstantsUtil.UPDATION_FAILED,
		    StringConstantsUtil.UPDATION_FAILED_FOR + stateIn.getId());
	}
	return stateOut;
    }

//	Find
    @GetMapping(value = "/get")
    @ResponseStatus(value = HttpStatus.OK)
    public State getById(@RequestParam String id) {
	State stateOut = stateService.getById(id);
	if (stateOut == null) {
	    LOGGER.debug(StringConstantsUtil.DETAILS_NOT_FOUND_FOR + id);
	    throw new CustomGenericException(StringConstantsUtil.RESPONSE_CODE_417,
		    StringConstantsUtil.DETAILS_NOT_FOUND, StringConstantsUtil.DETAILS_NOT_FOUND_FOR + id);
	}
	return stateOut;
    }

//	ViewAll
    @GetMapping(value = "/get-all")
    @ResponseStatus(value = HttpStatus.OK)
    public List<State> getAll(String stateFilter) {
	List<State> stateListOut = stateService.getAll(stateFilter);
	return stateListOut;
    }

//	Delete
    @DeleteMapping(value = "/delete")
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteById(@RequestParam String id) {
	stateService.deleteById(id);
    }

}
