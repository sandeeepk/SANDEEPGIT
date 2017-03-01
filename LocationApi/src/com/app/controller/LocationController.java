package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Location;
import com.app.service.ILocationService;

@Controller
public class LocationController {
	@Autowired
	private ILocationService service;

	@RequestMapping("/regLoc")
	public String showLocReg() {
		return "LocationReg";
	}

	@RequestMapping(value = "/insertLoc", method = RequestMethod.POST)
	public String insertLoc(@ModelAttribute("location") Location loc,
			ModelMap map) {
		int locId = service.saveloc(loc);
		map.addAttribute("msg", "Location saved with:" + locId);
		return "LocationReg";
	}

	@RequestMapping("/viewAllLocs")
	public String getloc(ModelMap map) {
		List<Location> listloc = service.getAllLocation();
		map.addAttribute("loclistobj", listloc);
		return "LocationData";

	}

	@RequestMapping("/deleteloc")
	public String deletelocById(@RequestParam("locId") int locId) {
		service.deleteLocById(locId);
		return "redirect:viewAllLocs";

	}

	@RequestMapping("/editloc")
	public String getLocationbyId(@RequestParam("locId") int locId, ModelMap map) {
		Location loc = service.getLocationById(locId);
		map.addAttribute("locObj", loc);
		return "Locationupdate";

	}

	@RequestMapping(value = "/updateLoc", method = RequestMethod.POST)
	public String updateLocation(@ModelAttribute("location") Location loc) {

		service.updateloc(loc);

		return "redirect:viewAllLocs";
	}
}