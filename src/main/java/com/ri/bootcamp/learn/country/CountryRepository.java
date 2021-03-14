package com.ri.bootcamp.learn.country;

import java.util.List;

import com.ri.bootcamp.learn.dao.CountryEntity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CountryRepository extends CrudRepository<CountryEntity, String> {

    Page<CountryEntity> findAll(Specification<CountryEntity> specification, Pageable pageable);

    List<CountryEntity> findAll(Specification<CountryEntity> specification);

}