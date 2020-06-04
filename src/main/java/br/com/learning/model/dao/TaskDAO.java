package br.com.learning.model.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import br.com.learning.model.entity.Task;

public class TaskDAO extends BaseDAO {
	
	public List<Task> getAllTasks() {
		String sql = "SELECT task FROM Task task";
		TypedQuery<Task> taskQuery = this.getEntityManager().createQuery(sql, Task.class);
		return taskQuery.getResultList();
	}
	
}
