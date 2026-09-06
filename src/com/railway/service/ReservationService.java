package com.railway.service;
import java.util.ArrayList;
import java.util.List;

import com.railway.model.Ticket;
import com.railway.model.Passenger;
import com.railway.model.Train;

public class ReservationService {
	private List<Ticket> tickets = new ArrayList<>();
	private PassengerService passengerService;
	private TrainService trainService;
	private int nextPnr = 100001;
	public ReservationService(PassengerService passengerService,
            TrainService trainService) {
this.passengerService = passengerService;
this.trainService = trainService;
}
	public void bookTicket(int passengerId, int trainNumber) {
		Passenger passenger = passengerService.searchPassenger(passengerId);
		Train train = trainService.searchTrain(trainNumber);
		if (passenger == null) {
		    System.out.println("Passenger not found.");
		    return;
		}

		if (train == null) {
		    System.out.println("Train not found.");
		    return;
		}
		if (train.getAvailableSeats() <= 0) {
		    System.out.println("No seats available.");
		    return;
		}
		int pnr = nextPnr++;

		int seatNumber = train.getAvailableSeats();

		Ticket ticket = new Ticket(
		        pnr,
		        passenger,
		        train,
		        seatNumber,
		        "CONFIRMED"
		);
		tickets.add(ticket);
		trainService.updateSeats(trainNumber, -1);

		System.out.println("Ticket booked successfully.");
		System.out.println("PNR: " + pnr);
		System.out.println("Seat Number: " + seatNumber);
	}
		
			public Ticket searchTicket(int pnr) {

			    for (Ticket ticket : tickets) {

			        if (ticket.getPnr() == pnr) {
			            return ticket;
			        }
			    }

			    return null;
			}
			public void cancelTicket(int pnr) {

			    Ticket ticket = searchTicket(pnr);

			    if (ticket == null) {
			        System.out.println("Ticket not found.");
			        return;
			    }

			    if (ticket.getStatus().equals("CANCELLED")) {
			        System.out.println("Ticket is already cancelled.");
			        return;
			    }

			    ticket.setStatus("CANCELLED");

			    Train train = ticket.getTrain();

			    trainService.updateSeats(train.getTrainNumber(), 1);

			    System.out.println("Ticket cancelled successfully.");
			    System.out.println("PNR: " + pnr);
			}
			public void viewTicket(int pnr) {

			    Ticket ticket = searchTicket(pnr);

			    if (ticket == null) {
			        System.out.println("Ticket not found.");
			        return;
			    }

			    System.out.println("----- Ticket Details -----");
			    System.out.println("PNR: " + ticket.getPnr());
			    System.out.println("Passenger: " + ticket.getPassenger().getName());
			    System.out.println("Train: " + ticket.getTrain().getTrainName());
			    System.out.println("Seat Number: " + ticket.getSeatNumber());
			    System.out.println("Status: " + ticket.getStatus());
			
			
			
			}

		
	

}
