package br.com.learning.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.learning.model.dao.TaskDAO;
import br.com.learning.model.entity.Task;

@Stateless
public class TaskService {

	private TaskDAO taskDAO;

	public List<Task> getAllTasks() {
		return this.taskDAO.getAllTasks();
	}

	public void addNewTask(Task task) {
		this.taskDAO.addNewTask(task);
	}

	@Inject
	public void setTaskDAO(TaskDAO taskDAO) {
		this.taskDAO = taskDAO;
	}

}
