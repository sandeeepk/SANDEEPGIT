package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.ILocationDao;
import com.app.model.Location;

@Repository
public class LocationDaoImpl implements ILocationDao {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public int saveloc(Location loc) {
		int id = (Integer) ht.save(loc);
		return id;
	}

	@Override
	public List<Location> getAllLocation() {
		List<Location> loclist = ht.loadAll(Location.class);
		return loclist;
	}

	@Override
	public void deleteLocById(int locId) {
		ht.delete(new Location(locId));

	}

	@Override
	public Location getLocationById(int locId) {
		Location loc=ht.get(Location.class, locId);
		return loc;
	}

	@Override
	public void updateloc(Location loc) {
		ht.update(loc);
		
	}

	

	

}
