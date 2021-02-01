package br.com.learning.model.dao;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.TypedQuery;

import br.com.learning.model.entity.Task;
import br.com.learning.model.entity.TaskGroup;

public class TaskDAO extends BaseDAO {
	
	public List<Task> getAllTasks() {
		String sql = "SELECT task FROM Task task";
		TypedQuery<Task> taskQuery = this.getEntityManager().createQuery(sql, Task.class);
		return taskQuery.getResultList();
	}

	public void addNewTask(Task task) {
		TaskGroup taskGroup = new TaskGroup();
		taskGroup.setId(1);
		
		task.setCreationDateTime(LocalDateTime.now());
		task.setActive(true);
		task.setGroup(taskGroup);
		
		this.getEntityManager().persist(task);
	}
	
}
