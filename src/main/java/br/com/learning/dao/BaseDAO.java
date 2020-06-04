package br.com.learning.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class BaseDAO {
	
	@PersistenceContext(unitName = "TodoListPU")
	private EntityManager em;
	
	public EntityManager getEntityManager() {
		return this.em;
	}
}
