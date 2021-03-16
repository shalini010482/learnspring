package com.ri.bootcamp.learn.experience;

import com.ri.bootcamp.learn.dao.ExperienceEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends CrudRepository<ExperienceEntity, String> {
	}
