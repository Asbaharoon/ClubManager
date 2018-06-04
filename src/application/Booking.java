package application;
import java.time.LocalDateTime;

import model.Facility;
import model.Member;

public class Booking {
	
	private Member member;
	private Facility facility;
	private LocalDateTime start;
	private LocalDateTime end;
	
	public Member getMember() {
		return member;
	}

	public Facility getFacility() {
		return facility;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public LocalDateTime getEnd() {
		return end;
	}

	
	public Booking(Member member, Facility facility, LocalDateTime start, LocalDateTime end) throws BadBookingException{
		
		super();
		
		
		if(member == null || facility == null || start == null || end == null || start.isAfter(end))
		{
			throw new BadBookingException("Bad Booking Exception");
		}
		this.member = member;
		this.facility = facility;
		this.start = start;
		this.end = end;
	}
	
	public boolean overlaps(Booking other) {
		if(this.start.isBefore(other.getStart()) && this.facility == other.getFacility())
			return true;
		return false;
	}
	
	public String toString() {
		return member.toString() + " - " + facility.toString() + " - " + start.format(ClubApplication.dFormat) + " to " + end.format(ClubApplication.dFormat);
	}
	
	public void Show()
	{
		System.out.println(this);
	}
	
	
	
	
	
	
}
