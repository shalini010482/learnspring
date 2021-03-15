package com.ri.bootcamp.learn.state;

import java.util.List;

import com.ri.bootcamp.learn.dao.StateEntity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends CrudRepository<StateEntity, String> {

    Page<StateEntity> findAll(Specification<StateEntity> specification, Pageable pageable);

    List<StateEntity> findAll(Specification<StateEntity> specification);
}