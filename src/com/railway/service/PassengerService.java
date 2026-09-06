package com.railway.service;
import java.util.ArrayList;
import com.railway.model.Passenger;


public class PassengerService {
	private ArrayList<Passenger> passengers;
	public PassengerService() {
        passengers = new ArrayList<>();

}
	public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
        System.out.println("Passenger added successfully.");
	}

public void viewPassengers() {

    if (passengers.isEmpty()) {
        System.out.println("No passengers found.");
        return;
    }

    for (Passenger passenger : passengers) {
        System.out.println(passenger);
    }
}
public Passenger searchPassenger(int passengerId) {

    for (Passenger passenger : passengers) {

        if (passenger.getPassengerId() == passengerId) {
            return passenger;
        }
    }

    return null;
}
public void deletePassenger(int passengerId) {

    Passenger passenger = searchPassenger(passengerId);

    if (passenger != null) {
        passengers.remove(passenger);
        System.out.println("Passenger deleted successfully.");
    } else {
        System.out.println("Passenger not found.");
    }
}
public void updatePassenger(int passengerId, String name, int age, String gender) {

    Passenger passenger = searchPassenger(passengerId);

    if (passenger != null) {
        passenger.setName(name);
        passenger.setAge(age);
        passenger.setGender(gender);

        System.out.println("Passenger updated successfully.");
    } else {
        System.out.println("Passenger not found.");
    }
}

}
        
