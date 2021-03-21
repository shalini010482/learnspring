package com.ri.bootcamp.learn.resource;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ri.bootcamp.learn.dao.ResourceDetailsEntity;

@Repository
public interface ResourceDetailsRepository extends CrudRepository<ResourceDetailsEntity, String> {

	Set<ResourceDetailsEntity> findBySkillIdListContains(String skillId);
}
