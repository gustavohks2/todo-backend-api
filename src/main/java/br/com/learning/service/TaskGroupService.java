package br.com.learning.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.learning.model.dao.TaskGroupDAO;
import br.com.learning.model.entity.TaskGroup;

@Stateless
public class TaskGroupService {
	
	private TaskGroupDAO taskGroupDAO;
	
	public List<TaskGroup> getAllActiveTaskGroups() {
		return this.taskGroupDAO.getAllActiveTaskGroups();
	}
	
	@Inject
	public void setTaskDAO(TaskGroupDAO taskGroupDAO) {
		this.taskGroupDAO = taskGroupDAO;
	}
	
}
