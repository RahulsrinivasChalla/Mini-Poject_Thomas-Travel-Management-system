package com.jfs.thomastravel;

import java.util.Scanner;

public class TravelsMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Driver[] driver = new Driver[6];

		Travels travels = new Travels();

		driver[0] = new Driver(1, "SeethaRamaRaju", "Car", 10000);
		driver[1] = new Driver(2, "Rahulsrinivas", "Car", 2000);
		driver[2] = new Driver(3, "Sainath", "Lorry", 6000);
		driver[3] = new Driver(4, "Anilkumar", "Auto", 8000);
		driver[4] = new Driver(5, "Suhel", "car", 1000);
		driver[5] = new Driver(6, "Rohith", "Auto", 500);

		System.out.println(
				"This program takes an index input from the user and checks whether the driver at that index is a Car driver.");

		System.out.println();

		System.out.println("IsCarDriver Method");

		System.out.println("Enter index = ");

		int index = sc.nextInt();
		boolean carDriver = travels.isCarDriver(driver[index]);
		if (travels.isCarDriver(driver[index])) {
			System.out.println(driver[index].getDriverName() + " is a " + driver[index].getDrivercategory()
					+ " driver = " + carDriver);
		} else {
			System.out.println(driver[index].getDriverName() + " is a " + driver[index].getDrivercategory()
					+ " driver = " + carDriver);
		}

		System.out.println();

		System.out.println(
				"This program takes an index input from the user and prints all subsequent indexes if the driver at the given index is a Car driver.");
		System.out.println();

		System.out.println("Enter index = ");
		int indexx = sc.nextInt();
		boolean carDriverr = travels.isCarDriver(driver[indexx]);
		for (; indexx < driver.length; indexx++) {
			if (travels.isCarDriver(driver[indexx])) {
				System.out.println(driver[indexx].getDriverName() + " is a " + driver[indexx].getDrivercategory()
						+ " driver = " + carDriverr);
			}
			if (carDriverr == false) {
				System.out.println("Given input is not a car driver");
				System.out.println("Given index is " + indexx + " which refers driver ID- "
						+ driver[indexx].getDriverId() + " Where driver " + driver[indexx].getDriverName() + " is a "
						+ driver[indexx].getDrivercategory() + " driver");
				break;
			}

		}

		System.out.println();

		System.out.println("RetriveByDriverId Method");

		System.out.println("Enter the Driver ID = ");

		int driverID = sc.nextInt();
		String details = travels.retriveByDriverId(driver, driverID);
		System.out.println(details);

		System.out.println();

		System.out.println("retriveCountOfDriver Method");
		System.out.println("Enter the driver category = ");
		String drivercategory1 = sc.next();
		int category = travels.retriveCountOfDriver(driver, drivercategory1);
		System.out.println("Count of " + drivercategory1 + " drivers = " + category);

		System.out.println();

		System.out.println("retriveDriver Method");
		System.out.println("Enter the driver category = ");
		String drivercategory2 = sc.next();
		Driver[] d1 = travels.retriveDriver(driver, drivercategory2);
		for (Driver drivers : d1) {
			System.out.println(drivercategory2 + " drivers = " + drivers.toString());
		}
		sc.close();

		System.out.println();

		System.out.println("retriveMaximumDistanceTravelledDriver Method");
		Driver maxDistance = travels.retriveMaximumDistanceTravelledDriver(driver);
		System.out.println("Max travelled distance " + maxDistance);
		sc.close();
	}
}
