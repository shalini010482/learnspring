package com.ri.bootcamp.learn.country;

import java.util.List;
import java.util.Optional;

import com.ri.bootcamp.learn.dao.CountryEntity;
import com.ri.bootcamp.learn.domain.Country;
import com.ri.bootcamp.learn.exception.ClassMismatchException;
import com.ri.bootcamp.learn.utility.BeanMapperUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

	@Autowired
	CountryRepository countryRepository;

	@Autowired
	BeanMapperUtil<Country> beanMapperUtil;

	// Create
	public Country create(Country countryIn) {
		CountryEntity countryEntityIn = new CountryEntity(countryIn);
		CountryEntity countryEntityOut = countryRepository.save(countryEntityIn);
		Country countryOut = countryEntityOut.getCountryDomain();
		return countryOut;
	}

	// Update
	public Country update(Country countryIn) throws ClassMismatchException {
		Optional<CountryEntity> optCountryEntityIn = countryRepository.findById(countryIn.getId());
		Country countryOut = null;
		if (optCountryEntityIn.isPresent()) {
			Country countryDBObj = optCountryEntityIn.get().getCountryDomain();
			beanMapperUtil.copyNonNullProperties(countryDBObj, countryIn);
			CountryEntity countrySaveEntity = new CountryEntity(countryDBObj);
			CountryEntity countryEntityOut = countryRepository.save(countrySaveEntity);
			countryOut = countryEntityOut.getCountryDomain();
		}
		return countryOut;
	}

	// Find
	public Country getById(String id) {
		Optional<CountryEntity> optCountryEntityIn = countryRepository.findById(id);
		Country countryOut = null;
		if (optCountryEntityIn.isPresent()) {
			countryOut = optCountryEntityIn.get().getCountryDomain();
		}
		return countryOut;
	}

	// ViewAll
	public List<Country> getAll(String countryFilter) {
		return null;
	}

	// Delete
	public void deleteById(String id) {
		countryRepository.deleteById(id);
	}

}
