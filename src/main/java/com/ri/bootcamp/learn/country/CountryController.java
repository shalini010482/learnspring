package com.ri.bootcamp.learn.country;

import java.util.List;

import com.ri.bootcamp.learn.domain.Country;
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
@RequestMapping(value = "/admin/address/country")
public class CountryController {

    @Autowired
    CountryService countryService;

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    // Create
    @PostMapping("/create")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Country create(@RequestBody Country countryIn) throws Exception {
        Country countryOut = countryService.create(countryIn);
        if (countryOut == null) {
            LOGGER.debug(StringConstantsUtil.CREATION_FAILED_FOR + countryIn.getName());
            throw new CustomGenericException(StringConstantsUtil.RESPONSE_CODE_417, StringConstantsUtil.CREATION_FAILED,
                    StringConstantsUtil.CREATION_FAILED_FOR + countryIn.getName());
        }
        return countryOut;
    }

    // Update
    @PutMapping("/update")
    @ResponseStatus(value = HttpStatus.OK)
    public Country update(@RequestBody Country countryIn) throws Exception {
        Country countryOut = countryService.update(countryIn);
        if (countryOut == null) {
            LOGGER.debug(StringConstantsUtil.UPDATION_FAILED_FOR + countryIn.getId());
            throw new CustomGenericException(StringConstantsUtil.RESPONSE_CODE_417, StringConstantsUtil.UPDATION_FAILED,
                    StringConstantsUtil.UPDATION_FAILED_FOR + countryIn.getId());
        }
        return countryOut;
    }

    // Find
    @GetMapping(value = "/get")
    @ResponseStatus(value = HttpStatus.OK)
    public Country getById(@RequestParam String id) {
        Country countryOut = countryService.getById(id);
        if (countryOut == null) {
            LOGGER.debug(StringConstantsUtil.DETAILS_NOT_FOUND_FOR + id);
            throw new CustomGenericException(StringConstantsUtil.RESPONSE_CODE_417,
                    StringConstantsUtil.DETAILS_NOT_FOUND, StringConstantsUtil.DETAILS_NOT_FOUND_FOR + id);
        }
        return countryOut;
    }

    // ViewAll
    @GetMapping(value = "/get-all")
    @ResponseStatus(value = HttpStatus.OK)
    public List<Country> getAll(String countryFilter) {
        List<Country> countryListOut = countryService.getAll(countryFilter);
        return countryListOut;
    }

    // Delete
    @DeleteMapping(value = "/delete")
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteById(@RequestParam String id) {
        countryService.deleteById(id);
    }
}
