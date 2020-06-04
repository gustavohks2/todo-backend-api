package br.com.learning.resource;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.learning.entity.Task;
import br.com.learning.service.TaskService;

@Path("/tasks")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TaskResource {
	
	private TaskService taskService;
	
	@GET
	public List<Task> getAllTasks() {
		return this.taskService.getAllTasks();
	}
	
	@Inject
	public void setTaskService(TaskService taskService) {
		this.taskService = taskService;
	}
}
