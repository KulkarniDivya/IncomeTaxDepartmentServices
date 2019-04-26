package com.cg.tds.dao;

import com.cg.tds.model.TdsMaster;

//method to get the details by id
public interface TDSDao {
	TdsMaster getById(int id);
}
