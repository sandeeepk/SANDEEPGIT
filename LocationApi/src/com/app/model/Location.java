package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LOC_TAB1")
public class Location {
	@Id
	@Column(name = "l_id")
	private int locId;
	@Column(name = "l_name")
	private String locName;
	@Column(name = "l_type")
	private String locType;

	// alt+Shift+S O (de-select all)
	public Location() {
	}

	// Alt+Shift+S O (select id only)

	public Location(int locId) {
		this.locId = locId;
	}

	public Location(int locId, String locName, String locType) {
		super();
		this.locId = locId;
		this.locName = locName;
		this.locType = locType;
	}

	// Alt+Shift+S R (select-all)

	public int getLocId() {
		return locId;
	}

	public void setLocId(int locId) {
		this.locId = locId;
	}

	public String getLocName() {
		return locName;
	}

	public void setLocName(String locName) {
		this.locName = locName;
	}

	public String getLocType() {
		return locType;
	}

	public void setLocType(String locType) {
		this.locType = locType;
	}

	// toString -Alt+Shift+S S

	@Override
	public String toString() {
		return "Location [locId=" + locId + ", locName=" + locName
				+ ", locType=" + locType + "]";
	}

}
