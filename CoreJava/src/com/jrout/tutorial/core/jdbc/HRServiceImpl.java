package com.jrout.tutorial.core.jdbc;

public class HRServiceImpl implements HRService {

	@Override
	public String selectQuery(int empId) {
		HRDao hrDao = new HRDao();
		String name  = hrDao.selectQuery(100);
		
		return name.replace("a", "e");
	}

}
