package br.com.learning.resource;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.learning.model.dto.TaskDTO;
import br.com.learning.model.entity.Task;
import br.com.learning.model.mapper.TaskMapper;
import br.com.learning.service.TaskService;

@Path("/tasks")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TaskResource {
	
	private TaskService taskService;
	
	@GET
	public Response getAllTasks() {
		List<TaskDTO> taskDto = TaskMapper.INSTANCE.taskListToTaskDTOList(this.taskService.getAllTasks());
		return Response.ok(taskDto).build();
	}
	
	@POST
	public Response addNewTask(Task task) {
		this.taskService.addNewTask(task);
		return Response.ok(task).build();
	}
	
	@Inject
	public void setTaskService(TaskService taskService) {
		this.taskService = taskService;
	}
}
