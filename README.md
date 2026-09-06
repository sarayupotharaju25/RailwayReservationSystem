# Railway Reservation System

A console-based Railway Reservation System developed using Java 17 and Core Java concepts.

## Project Overview

This project manages railway passengers, trains, and ticket reservations through a menu-driven console application.

The system allows users to add and search passengers, manage trains, book and cancel tickets, generate PNR numbers, and manage seat availability.

## Features

- Add and view passengers
- Search passengers by ID
- Add and view trains
- Search trains by train number
- Book railway tickets
- Generate unique PNR numbers
- Check seat availability
- Cancel tickets
- View ticket details
- Update seat availability
- Menu-driven console interface

## Technologies Used

- Java 17
- Core Java
- Object-Oriented Programming
- Collections Framework
- ArrayList
- Interfaces
- Exception Handling

## OOP Concepts Used

- Encapsulation
- Abstraction
- Inheritance concepts
- Polymorphism
- Interfaces
- Constructors
- Method overriding

## Project Structure

```text
src
└── com.railway
    ├── interfaces
    │   └── Reservable.java
    ├── main
    │   └── Main.java
    ├── model
    │   ├── Passenger.java
    │   ├── Train.java
    │   └── Ticket.java
    └── service
        ├── PassengerService.java
        ├── TrainService.java
        └── ReservationService.java
