package com.worldcup.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.worldcupentity.CricketStaff;

@Repository
public class WorldcupCricketDao {

	@Autowired
	SessionFactory factory;

	public List<CricketStaff> allIndianCricketStaffList() {

		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(CricketStaff.class);
		
	    List<CricketStaff> staffList = criteria.list();

		return staffList;

	}

}
