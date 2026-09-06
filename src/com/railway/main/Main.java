package com.railway.main;
import java.util.Scanner;
import com.railway.model.Passenger;
import com.railway.model.Train;
import com.railway.service.PassengerService;
import com.railway.service.TrainService;
import com.railway.service.ReservationService;

public class Main {
	public static void main(String[] args) {
		PassengerService passengerService = new PassengerService();
		TrainService trainService = new TrainService();
		ReservationService reservationService =
		        new ReservationService(passengerService, trainService);
		Scanner sc = new Scanner(System.in);
		
		int choice;

		do {

		    System.out.println("\n===== Railway Reservation System =====");
		    System.out.println("1. Add Passenger");
		    System.out.println("2. View Passengers");
		    System.out.println("3. Search Passenger");
		    System.out.println("4. Add Train");
		    System.out.println("5. View Trains");
		    System.out.println("6. Search Train");
		    System.out.println("7. Book Ticket");
		    System.out.println("8. Cancel Ticket");
		    System.out.println("9. View Ticket");
		    System.out.println("10. Exit");

		    System.out.print("Enter your choice: ");
		    choice = sc.nextInt();
		    switch (choice) {

		    case 1:
		        System.out.print("Passenger ID: ");
		        int passengerId = sc.nextInt();

		        sc.nextLine();

		        System.out.print("Name: ");
		        String name = sc.nextLine();

		        System.out.print("Age: ");
		        int age = sc.nextInt();

		        sc.nextLine();

		        System.out.print("Gender: ");
		        String gender = sc.nextLine();

		        Passenger passenger = new Passenger(
		                passengerId,
		                name,
		                age,
		                gender
		        );

		        passengerService.addPassenger(passenger);

		        break;
		    case 2:
		        passengerService.viewPassengers();
		        break; 
		    case 3:
		        System.out.print("Enter Passenger ID: ");
		        int searchId = sc.nextInt();

		        Passenger foundPassenger = passengerService.searchPassenger(searchId);

		        if (foundPassenger != null) {
		            System.out.println("Passenger found:");
		            System.out.println(foundPassenger);
		        } else {
		            System.out.println("Passenger not found.");
		        }

		        break;
		    case 4:
		        System.out.print("Train Number: ");
		        int trainNumber = sc.nextInt();

		        sc.nextLine();

		        System.out.print("Train Name: ");
		        String trainName = sc.nextLine();

		        System.out.print("Source: ");
		        String source = sc.nextLine();

		        System.out.print("Destination: ");
		        String destination = sc.nextLine();

		        System.out.print("Available Seats: ");
		        int availableSeats = sc.nextInt();

		        Train train = new Train(
		                trainNumber,
		                trainName,
		                source,
		                destination,
		                availableSeats
		        );

		        trainService.addTrain(train);

		        break;
		    case 5:
		        trainService.viewTrains();
		        break;
		    case 6:
		        System.out.print("Enter Train Number: ");
		        int searchTrainNumber = sc.nextInt();

		        Train foundTrain = trainService.searchTrain(searchTrainNumber);

		        if (foundTrain != null) {
		            System.out.println("Train found:");
		            System.out.println(foundTrain);
		        } else {
		            System.out.println("Train not found.");
		        }

		        break;
		    case 7:
		        System.out.print("Enter Passenger ID: ");
		        int bookingPassengerId = sc.nextInt();

		        System.out.print("Enter Train Number: ");
		        int bookingTrainNumber = sc.nextInt();

		        reservationService.bookTicket(bookingPassengerId, bookingTrainNumber);

		        break;
		    case 8:
		        System.out.print("Enter PNR: ");
		        int cancelPnr = sc.nextInt();

		        reservationService.cancelTicket(cancelPnr);

		        break;
		    case 9:
		        System.out.print("Enter PNR: ");
		        int viewPnr = sc.nextInt();

		        reservationService.viewTicket(viewPnr);

		        break;
		    case 10:
		        System.out.println("Exiting Railway Reservation System...");
		        break;
		    default:
		        System.out.println("Invalid choice. Please try again.");
		}

		} while (choice != 10);

    }

}
