package br.com.learning.model.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.com.learning.model.entity.Task;

public class TaskGroupDTO {

	private int id;

	private String label;

	private List<Task> tasks = new ArrayList<Task>();

	private boolean active;

	private LocalDateTime creationDateTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public LocalDateTime getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(LocalDateTime creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

}
