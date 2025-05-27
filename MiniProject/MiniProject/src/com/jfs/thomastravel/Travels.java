package com.jfs.thomastravel;

public class Travels {

	// isCarDriver Method
	public boolean isCarDriver(Driver driver) {
		if (driver.getDrivercategory().equalsIgnoreCase("Car")) {
			return true;
		}
		return false;		
	}

	// retriveByDriverId Method
	public String retriveByDriverId(Driver[] driver, int driverId) {
		for (Driver drivers : driver)
			if (drivers.getDriverId() == driverId) {
				return "Driver name is " + drivers.getDriverName() + " Belonging to the category "
						+ drivers.getDrivercategory() + " traveled " + drivers.getDistanceTraveled() + " KM so far";

			}
		return "No Driver with the given ID";
	}

	// retriveCountOfDriver Method
	public int retriveCountOfDriver(Driver[] driver, String driverCategory) {
		int count = 0;
		for (Driver drivers : driver) {
			if (drivers.getDrivercategory().equalsIgnoreCase(driverCategory)) {
				count++;
			}
		}
		return count;
	}

	// retriveDriver Method
	public Driver[] retriveDriver(Driver[] driver, String drivercategory) {
		Driver drivercategory1[] = new Driver[driver.length];
		int index = 0;
		for (int i = 0; i < driver.length; i++) {
			if (driver[i].getDrivercategory().equalsIgnoreCase(drivercategory)) {
				drivercategory1[index++] = driver[i];
			}
		}
		Driver retriveDriver[] = new Driver[index];
		for (int i = 0; i < index; i++) {
			retriveDriver[i] = drivercategory1[i];
		}
		return retriveDriver;
	}

	// retriveMaximumDistanceTravelledDriver Method
	public Driver retriveMaximumDistanceTravelledDriver(Driver[] driver) {
		Driver maxDistance = driver[0];
		for (int i = 0; i < driver.length; i++) {
			if (driver[i].getDistanceTraveled() > maxDistance.getDistanceTraveled()) {
				maxDistance = driver[i];
			}
		}
		return maxDistance;

	}
}
