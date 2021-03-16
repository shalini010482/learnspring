package com.ri.bootcamp.learn.companydetails;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.ri.bootcamp.learn.country.CountryService;
import com.ri.bootcamp.learn.dao.CorporateDetailsEntity;
import com.ri.bootcamp.learn.domain.CorporateDetails;
import com.ri.bootcamp.learn.exception.ClassMismatchException;
import com.ri.bootcamp.learn.state.StateService;
import com.ri.bootcamp.learn.utility.BeanMapperUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CorporateDetailsService {

	@Autowired
	CorporateDetailsRepository corporateDetailsRepository;

	@Autowired
	BeanMapperUtil<CorporateDetails> beanMapperUtil;

	@Autowired
	CountryService countryService;

	@Autowired
	StateService stateService;

	public CorporateDetails create(CorporateDetails corporateDtlsIn) {
		CorporateDetailsEntity corporateDtlsEntyIn = new CorporateDetailsEntity(corporateDtlsIn);
		CorporateDetailsEntity corporateDtlsEntyOut = corporateDetailsRepository.save(corporateDtlsEntyIn);
		CorporateDetails corporateDtlsOut = corporateDtlsEntyOut.getCorporateDetailsDomain();
		return corporateDtlsOut;
	}

	public CorporateDetails update(CorporateDetails corporateDtlsIn) throws ClassMismatchException {
		Optional<CorporateDetailsEntity> optCorporateDtlsEntyIn = corporateDetailsRepository
				.findById(corporateDtlsIn.getId());
		CorporateDetails corporateDtlsOut = null;
		if (optCorporateDtlsEntyIn.isPresent()) {
			CorporateDetails corporateDtlsDBObj = optCorporateDtlsEntyIn.get().getCorporateDetailsDomain();
			beanMapperUtil.copyNonNullProperties(corporateDtlsDBObj, corporateDtlsIn);
			CorporateDetailsEntity corporateDtlsSaveEnty = new CorporateDetailsEntity(corporateDtlsDBObj);
			CorporateDetailsEntity corporateDtlsEntyOut = corporateDetailsRepository.save(corporateDtlsSaveEnty);
			corporateDtlsOut = corporateDtlsEntyOut.getCorporateDetailsDomain();
		}
		return corporateDtlsOut;
	}

	public CorporateDetails getById(String id) {
		Optional<CorporateDetailsEntity> optCorporateDtlsEntyIn = corporateDetailsRepository.findById(id);
		CorporateDetails corporateDtlsOut = null;
		if (optCorporateDtlsEntyIn.isPresent()) {
			corporateDtlsOut = getCorporateDetailsInfo(optCorporateDtlsEntyIn.get());
		}
		return corporateDtlsOut;
	}

	public List<CorporateDetails> getAll() {
		CorporateDetails corporateDtlsOut = null;
		List<CorporateDetailsEntity> corporateDtlsEntyList = (List<CorporateDetailsEntity>) corporateDetailsRepository
				.findAll();
		List<CorporateDetails> corporateDtlsDomainList = new ArrayList<CorporateDetails>();
		for (CorporateDetailsEntity corporateDtlsEnty : corporateDtlsEntyList) {
			corporateDtlsOut = getCorporateDetailsInfo(corporateDtlsEnty);
			corporateDtlsDomainList.add(corporateDtlsOut);
		}
		return corporateDtlsDomainList;
	}

	public void deleteById(String id) {
		corporateDetailsRepository.deleteById(id);
	}

	public CorporateDetails getCorporateDetailsInfo(CorporateDetailsEntity corporateDtlsEnty) {

		return null;
	}

}
