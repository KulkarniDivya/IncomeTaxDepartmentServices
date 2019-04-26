package com.cg.tds.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cg.tds.model.TdsMaster;

@Repository
@Component("tdsDao")
public class TDSDaoImpl implements TDSDao {

	@PersistenceContext
	EntityManager entityManager;
	
	//method to get the details by id
	@Override
	public TdsMaster getById(int id) {
		// TODO Auto-generated method stub
		return entityManager.find(TdsMaster.class, id);
	}

}
