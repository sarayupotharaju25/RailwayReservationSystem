package com.railway.model;

public class Train {
	private int trainNumber;
    private String trainName;
    private String source;
    private String destination;
    private int availableSeats;
    
    public Train(int trainNumber, String trainName, String source,
            String destination, int availableSeats) {
   this.trainNumber = trainNumber;
   this.trainName = trainName;
   this.source = source;
   this.destination = destination;
   this.availableSeats = availableSeats;
}
    public int getTrainNumber() {
        return trainNumber;
    }

    public String getTrainName() {
        return trainName;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
    @Override
    public String toString() {
        return "Train Number: " + trainNumber
                + ", Name: " + trainName
                + ", From: " + source
                + ", To: " + destination
                + ", Available Seats: " + availableSeats;
    }

}
