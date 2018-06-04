package application;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

import model.Facility;
import model.Member;

public class Club {
	ArrayList<Member> members = new ArrayList<Member>();
	int membernumber = 1;
	
	public Member addMember(String surname, String firstname, String lastname) {
		Member m = new Member(membernumber, firstname, surname, lastname);
		membernumber++;
		members.add(m);
		return m;
	}
	
	public void removeMember(int membernumber) {
		members.remove(membernumber - 1);
	}
	
	public void showMember() {
		for(Member m: members) {
			if(m != null)
				m.Show();
		}
	}
	
	HashMap<String, Facility> facilities = new HashMap<String, Facility>();
	
	public HashMap<String, Facility> getFacilities() {
		return facilities;
	}

	public Facility addFacility(String name) {
		Facility facility = new Facility(name);
		facilities.put(name, facility);
		return facility;
	}
	
	public void removeFacility(String name) {
		facilities.remove(name);
	}
	
	public Facility getFacility(String name) {
		return facilities.get(name);
	}
	
	public void ShowFacilities() {
		for (Facility facility : facilities.values()) {
			facility.Show();
		}
	}
	
	public void Show() {
		showMember();
		ShowFacilities();
	}
	
	private BookingRegister br = new BookingRegister();
	
	public void addBooking(int memno, String facilityName, LocalDateTime start, LocalDateTime end) {
		Member member = members.get(memno - 1);
		Facility facility = facilities.get(facilityName);
		try {
			br.addBooking(member, facility, start, end);
		} catch (BadBookingException e) {
			System.err.println(e.getMessage());
		}
		
	}
	
	public ArrayList<Booking> getBookings(Facility f, LocalDateTime from, LocalDateTime end){
		ArrayList<Booking> bookingresults =  new ArrayList<Booking>();
		bookingresults = br.getBookings(f, from, end);
		return bookingresults;
	}
	
	public void showBookings(Facility f, LocalDateTime from, LocalDateTime end) {
		ArrayList<Booking> bookingresults = getBookings(f, from, end);
		for (Booking booking : bookingresults) {
			booking.Show();
		}
	}
	
}
