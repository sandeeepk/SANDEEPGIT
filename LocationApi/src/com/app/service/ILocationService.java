package com.app.service;

import java.util.List;

import com.app.model.Location;

public interface ILocationService {
	public int saveloc(Location loc);
	public List<Location> getAllLocation();
	public void deleteLocById(int locId);
	public Location getLocationById(int locId);
	public void updateloc(Location loc);
}
