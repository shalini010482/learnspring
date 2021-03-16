package com.ri.bootcamp.learn.companydetails;

import java.util.List;

import com.ri.bootcamp.learn.dao.CorporateDetailsEntity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorporateDetailsRepository extends CrudRepository<CorporateDetailsEntity, String> {

    Page<CorporateDetailsEntity> findAll(Specification<CorporateDetailsEntity> spec, Pageable pageable);

    List<CorporateDetailsEntity> findByCorporateNameIgnoreCase(String name);

}