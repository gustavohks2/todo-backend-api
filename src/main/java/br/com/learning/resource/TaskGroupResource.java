package br.com.learning.resource;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.learning.service.TaskGroupService;

@Path("taskgroups")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TaskGroupResource {
	
	private TaskGroupService taskGroupService;
	
	@GET
	public Response getAllTaskGroups() {
		return Response.ok(this.taskGroupService.getAllActiveTaskGroups()).build();
	}
	
	@Inject
	public void setTaskGroupService(TaskGroupService taskGroupService) {
		this.taskGroupService = taskGroupService;
	}
	
}
