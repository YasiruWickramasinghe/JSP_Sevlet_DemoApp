package com.pearl.dao;

import com.pearl.model.Alian;

public class AlianDao {

	public Alian getAlian(int aid) {
		Alian a = new Alian();
		a.setAid(101);
		a.setAname("yash");
		a.setTech("java");
		
		return a;
	}
}
