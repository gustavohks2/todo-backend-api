package br.com.learning.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class BaseDAO {
	
	@PersistenceContext(unitName = "TodoListPU")
	private EntityManager em;
	
	public EntityManager getEntityManager() {
		return this.em;
	}
}
