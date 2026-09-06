package com.railway.service;
import java.util.ArrayList;
import java.util.List;

import com.railway.model.Train;

public class TrainService {
	private List<Train> trains = new ArrayList<>();
	public void addTrain(Train train) {
	    trains.add(train);
	    System.out.println("Train added successfully.");
	}
	public void viewTrains() {

	    for (Train train : trains) {
	        System.out.println(train);
	    }
	}
	public Train searchTrain(int trainNumber) {

	    for (Train train : trains) {

	        if (train.getTrainNumber() == trainNumber) {
	            return train;
	        }
	    }

	    return null;
	}


public void updateSeats(int trainNumber, int seats) {

    Train train = searchTrain(trainNumber);

    if (train != null) {
        train.setAvailableSeats(train.getAvailableSeats() + seats);
  
    }
}
public void searchTrainsByRoute(String source, String destination) {

    boolean found = false;

    for (Train train : trains) {

        if (train.getSource().equalsIgnoreCase(source)
                && train.getDestination().equalsIgnoreCase(destination)) {

            System.out.println(train);
            found = true;
        }
    }

    if (!found) {
        System.out.println("No trains found for this route.");
    }
}
}
