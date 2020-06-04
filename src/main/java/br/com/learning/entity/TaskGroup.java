package br.com.learning.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 * Group of to-do tasks
 */
@Entity(name = "tb_task_group")
public class TaskGroup {

	@Id
	@GeneratedValue(generator = "task_group_generator", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "task_group_generator", sequenceName = "sq_task_group")
	private int id;

	@Column
	private String label; // Name of the group

	@Column
	@OneToMany(orphanRemoval = true, mappedBy = "group")
	private List<Task> tasks;
	
	@Column
	private boolean active;
	
	@Column(name = "creation_dt")
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
