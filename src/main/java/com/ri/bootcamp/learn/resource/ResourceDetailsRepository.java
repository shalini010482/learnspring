package com.ri.bootcamp.learn.resource;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ri.bootcamp.learn.dao.ResourceDetailsEntity;

@Repository
public interface ResourceDetailsRepository extends CrudRepository<ResourceDetailsEntity, String> {

	List<ResourceDetailsEntity> findBySkillIdListContains(String skillId);
}
