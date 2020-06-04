package br.com.learning.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import br.com.learning.entity.Task;

public class TaskDAO extends BaseDAO {
	
	public List<Task> getAllTasks() {
		String sql = "SELECT task FROM Task task";
		TypedQuery<Task> taskQuery = this.getEntityManager().createQuery(sql, Task.class);
		List<Task> tasks = taskQuery.getResultList();
		return tasks;
	}
	
}
