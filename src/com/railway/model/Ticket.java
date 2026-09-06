package com.railway.model;

public class Ticket {
	private int pnr;
	private Passenger passenger;
	private Train train;
	private int seatNumber;
	private String status;
	
	public Ticket(int pnr, Passenger passenger, Train train,
            int seatNumber, String status) {
  this.pnr = pnr;
  this.passenger = passenger;
  this.train = train;
  this.seatNumber = seatNumber;
  this.status = status;
}
	public int getPnr() {
	    return pnr;
	}

	public Passenger getPassenger() {
	    return passenger;
	}

	public Train getTrain() {
	    return train;
	}

	public int getSeatNumber() {
	    return seatNumber;
	}

	public String getStatus() {
	    return status;
	}
	public void setPnr(int pnr) {
	    this.pnr = pnr;
	}

	public void setPassenger(Passenger passenger) {
	    this.passenger = passenger;
	}

	public void setTrain(Train train) {
	    this.train = train;
	}

	public void setSeatNumber(int seatNumber) {
	    this.seatNumber = seatNumber;
	}

	public void setStatus(String status) {
	    this.status = status;
	}
	@Override
	public String toString() {
	    return "PNR: " + pnr
	            + ", Passenger: " + passenger.getName()
	            + ", Train: " + train.getTrainName()
	            + ", Seat: " + seatNumber
	            + ", Status: " + status;
	}

}
