package br.com.learning.model.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_task")
public class Task {

	@Id
	@SequenceGenerator(name = "task_generator", sequenceName = "sq_id_task")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "task_generator")
	private int id;

	@Column
	private String description;

	@Column
	private boolean finished;

	@Column(name = "creation_dt")
	private LocalDateTime creationDateTime;

	@Column
	private boolean active;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "group_id")
	private TaskGroup group;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	public LocalDateTime getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(LocalDateTime creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public TaskGroup getGroup() {
		return group;
	}

	public void setGroup(TaskGroup group) {
		this.group = group;
	}
	
	

}
