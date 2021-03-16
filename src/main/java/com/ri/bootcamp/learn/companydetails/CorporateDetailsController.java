package com.ri.bootcamp.learn.companydetails;

import java.util.List;

import com.ri.bootcamp.learn.domain.CorporateDetails;
import com.ri.bootcamp.learn.exception.CustomGenericException;
import com.ri.bootcamp.learn.utility.StringConstantsUtil;

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

@RestController
@RequestMapping(value = "/admin/corporate")
public class CorporateDetailsController {

    @Autowired
    CorporateDetailsService corporateDetailsService;

    private static final Logger LOGGER = LoggerFactory.getLogger(CorporateDetailsController.class);

    @PostMapping("/create")
    @ResponseStatus(value = HttpStatus.CREATED)
    public CorporateDetails create(@RequestBody CorporateDetails corporateDtlsIn) throws Exception {
	CorporateDetails corporateDtlsOut = corporateDetailsService.create(corporateDtlsIn);
	if (corporateDtlsOut == null) {
	    LOGGER.debug(StringConstantsUtil.CREATION_FAILED_FOR + corporateDtlsIn.getCorporateName());
	    throw new CustomGenericException(StringConstantsUtil.RESPONSE_CODE_417, StringConstantsUtil.CREATION_FAILED,
		    StringConstantsUtil.CREATION_FAILED_FOR + corporateDtlsIn.getCorporateName());
	}
	return corporateDtlsOut;
    }

    @PutMapping("/update")
    @ResponseStatus(value = HttpStatus.OK)
    public CorporateDetails update(@RequestBody CorporateDetails corporateDtlsIn) throws Exception {
	CorporateDetails corporateDtlsOut = corporateDetailsService.update(corporateDtlsIn);
	if (corporateDtlsOut == null) {
	    LOGGER.debug(StringConstantsUtil.UPDATION_FAILED_FOR + corporateDtlsIn.getId());
	    throw new CustomGenericException(StringConstantsUtil.RESPONSE_CODE_417, StringConstantsUtil.UPDATION_FAILED,
		    StringConstantsUtil.UPDATION_FAILED_FOR + corporateDtlsIn.getId());
	}
	return corporateDtlsOut;
    }

    @GetMapping("/get")
    @ResponseStatus(value = HttpStatus.OK)
    public CorporateDetails getById(@RequestParam String id) throws Exception {
	CorporateDetails corporateDtlsOut = corporateDetailsService.getById(id);
	if (corporateDtlsOut == null) {
	    LOGGER.debug(StringConstantsUtil.DETAILS_NOT_FOUND_FOR + id);
	    throw new CustomGenericException(StringConstantsUtil.RESPONSE_CODE_417,
		    StringConstantsUtil.DETAILS_NOT_FOUND, StringConstantsUtil.DETAILS_NOT_FOUND_FOR + id);
	}
	return corporateDtlsOut;
    }

    @GetMapping(value = "/get-all")
    @ResponseStatus(value = HttpStatus.OK)
    public List<CorporateDetails> getAll() {
	List<CorporateDetails> corporateDtlsOutList = corporateDetailsService.getAll();
	return corporateDtlsOutList;
    }

    @DeleteMapping(value = "/delete")
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteById(@RequestParam String id) {
	corporateDetailsService.deleteById(id);
    }
}
