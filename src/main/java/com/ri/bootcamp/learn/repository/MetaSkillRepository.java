package com.ri.bootcamp.learn.repository;

import com.ri.bootcamp.learn.dao.MetaSkillEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetaSkillRepository extends CrudRepository<MetaSkillEntity, String> {
	Page<MetaSkillEntity> findAll(Specification<MetaSkillEntity> specification, Pageable pageable);
}
