package com.ri.bootcamp.learn.state;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.ri.bootcamp.learn.dao.StateEntity;
import com.ri.bootcamp.learn.domain.State;
import com.ri.bootcamp.learn.exception.ClassMismatchException;
import com.ri.bootcamp.learn.utility.BeanMapperUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateService {

	@Autowired
	StateRepository stateRepository;

	@Autowired
	BeanMapperUtil<State> beanMapperUtil;

	// Create
	public State create(State stateIn) {
		StateEntity stateEntityIn = new StateEntity(stateIn);
		StateEntity stateEntityOut = stateRepository.save(stateEntityIn);
		State stateOut = stateEntityOut.getStateDomain();
		return stateOut;
	}

	// Update
	public State update(State stateIn) throws ClassMismatchException {
		Optional<StateEntity> optStateEntityIn = stateRepository.findById(stateIn.getId());
		State stateOut = null;
		if (optStateEntityIn.isPresent()) {
			State stateDBObj = optStateEntityIn.get().getStateDomain();
			beanMapperUtil.copyNonNullProperties(stateDBObj, stateIn);
			StateEntity stateSaveEntity = new StateEntity(stateDBObj);
			StateEntity stateEntityOut = stateRepository.save(stateSaveEntity);
			stateOut = stateEntityOut.getStateDomain();
		}
		return stateOut;
	}

	// Find
	public State getById(String id) {
		Optional<StateEntity> optStateEntityIn = stateRepository.findById(id);
		State stateOut = null;
		if (optStateEntityIn.isPresent()) {
			stateOut = optStateEntityIn.get().getStateDomain();
		}
		return stateOut;
	}

	// ViewAll
	public List<State> getAll(String stateFilter) {
		List<StateEntity> stateEntityList = null;
		List<State> stateDomainList = new ArrayList<State>();
		return stateDomainList;
	}

	// Delete
	public void deleteById(String id) {
		stateRepository.deleteById(id);
	}

}
