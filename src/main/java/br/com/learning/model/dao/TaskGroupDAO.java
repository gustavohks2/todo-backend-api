package br.com.learning.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.learning.model.entity.TaskGroup;

public class TaskGroupDAO extends BaseDAO {

	public List<TaskGroup> getAllActiveTaskGroups() {
		EntityManager em = this.getEntityManager();
		
		TypedQuery<TaskGroup> query = em.createQuery("FROM TaskGroup tg", TaskGroup.class);
		List<TaskGroup> taskGroups = query.getResultList();
		return taskGroups;
	}

}
