package br.com.learning.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.learning.dao.TaskDAO;
import br.com.learning.entity.Task;

@Stateless
public class TaskService {
	
	public TaskDAO taskDAO;
	
	public List<Task> getAllTasks() {	
		return this.taskDAO.getAllTasks();
	}
	
	@Inject
	public void setTaskDAO(TaskDAO taskDAO) {
		this.taskDAO = taskDAO;
	}
	
}
