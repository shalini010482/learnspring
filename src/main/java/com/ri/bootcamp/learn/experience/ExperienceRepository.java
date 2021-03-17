package com.ri.bootcamp.learn.experience;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ri.bootcamp.learn.dao.ExperienceEntity;

@Repository
public interface ExperienceRepository extends CrudRepository<ExperienceEntity, String> {    
}
