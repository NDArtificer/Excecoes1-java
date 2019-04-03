package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entidades.Reservation;

public class Programa {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Room number");
		int roomNumber = sc.nextInt();
		System.out.println("CheckIn Date (dd/MM/yyyy):");
		Date checkIn = sdf.parse(sc.next());
		System.out.println("CheckOut Date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		
		if (! checkOut.after(checkIn)) {
			System.out.println("Error reserevation: Check-Out date must be after Check-In date!");
		} else {
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println("");
			System.out.println("Enter data to update the reserevation: ");
			System.out.println("CheckIn Date (dd/MM/yyyy):");
			checkIn = sdf.parse(sc.next());
			System.out.println("CheckOut Date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
		}
		
		
		
		sc.close();


	}

}
