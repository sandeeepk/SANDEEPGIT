package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ILocationDao;
import com.app.model.Location;
import com.app.service.ILocationService;

@Service
public class LocationServiceImpl implements ILocationService {
	@Autowired
	private ILocationDao dao;

	@Override
	public int saveloc(Location loc) {

		return dao.saveloc(loc);
	}

	@Override
	public List<Location> getAllLocation() {
		
		return dao.getAllLocation();
	}

	@Override
	public void deleteLocById(int locId) {
		dao.deleteLocById(locId);
	}

	@Override
	public Location getLocationById(int locId) {
		
		return dao.getLocationById(locId);
	}

	@Override
	public void updateloc(Location loc) {
		dao.updateloc(loc);
		
	}



}
