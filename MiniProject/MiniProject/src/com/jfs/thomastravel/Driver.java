package com.jfs.thomastravel;

public class Driver {

	private int driverId;
	private String driverName;
	private String drivercategory;
	private int distanceTraveled;

	public Driver() {

	}

	public Driver(int driverId, String driverName, String drivercategory, int distanceTraveled) {
		super();
		this.driverId = driverId;
		this.driverName = driverName;
		this.drivercategory = drivercategory;
		this.distanceTraveled = distanceTraveled;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDrivercategory() {
		return drivercategory;
	}

	public void setDrivercategory(String drivercategory) {
		this.drivercategory = drivercategory;
	}

	public int getDistanceTraveled() {
		return distanceTraveled;
	}

	public void setDistanceTraveled(int distanceTraveled) {
		this.distanceTraveled = distanceTraveled;
	}

	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", driverName=" + driverName + ", drivercategory=" + drivercategory
				+ ", distanceTraveled=" + distanceTraveled + "]";
	}

}
