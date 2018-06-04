package application;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

import model.Facility;
import model.Member;

public class BookingRegister {
	
	
	private HashMap<Facility, ArrayList<Booking>> br = new HashMap<Facility, ArrayList<Booking>>();
	
	
	public void addBooking(Member m, Facility f, LocalDateTime start, LocalDateTime end) throws BadBookingException {
		try {
			Booking b = new Booking(m, f, start, end);
			if(br.get(f) == null) {
				ArrayList<Booking> bookings = new ArrayList<Booking>();
				bookings.add(b);
				br.put(f, bookings);
			}
			else {
				ArrayList<Booking> existingBookings = br.get(f);
				for (Booking booking : existingBookings) {
					if(booking.overlaps(b)) {
						throw new BadBookingException("Booking overlapped~!");
					}
				}
				existingBookings.add(b);
				br.replace(f, existingBookings);
			}
		} catch (BadBookingException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public ArrayList<Booking> getBookings(Facility f, LocalDateTime from, LocalDateTime end) {
		ArrayList<Booking> bookingresults = new ArrayList<Booking>();
		ArrayList<Booking> allbookings = br.get(f);
		
		for (Booking booking : allbookings) {
			if(from.isBefore(booking.getStart()) && booking.getEnd().isBefore(end)) {
				bookingresults.add(booking);
			}
		}
		return bookingresults;
	}
	
	public void removeBooking(Booking b) {
		ArrayList<Booking> bookings = br.get(b.getFacility());
		if(bookings != null) {
			bookings.remove(b);
		}
	}
	
	

}
