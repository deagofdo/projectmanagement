package com.cognizant.projectmanagement.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cognizant.projectmanagement.dao.Task;

public interface TaskRepository extends CrudRepository<Task,Integer>{

	List<Task> findAllByProjectId(Integer id);
		
	List<Task> findAllByProjectIdAndStatus(Integer id, String status);
	
}
