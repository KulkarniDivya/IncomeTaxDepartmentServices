package com.cg.tds.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cg.tds.dao.TDSDao;
import com.cg.tds.model.TdsMaster;

@Service
@Transactional
@Component("tdsService")
public class TDSServiceImpl implements TDSService {

	//Using autowiring to get the instance of TdsDao interface
	@Autowired
	TDSDao tdsDao;
	
	//method to get the details by id
	@Override
	public TdsMaster getById(int id) {
		// TODO Auto-generated method stub
		return tdsDao.getById(id);
	}

}
