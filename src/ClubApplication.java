import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClubApplication {

	public static DateTimeFormatter dFormat = DateTimeFormatter.ofPattern("d-MMM-yyyy H:m");

	public static void main(String[] args) {

		System.out.println("Hello");

		Person p1 = new Person("zin", "min", "htet");
		Person p2 = new Person("Zin", "Min");
		p1.Show();
		p2.Show();

		Facility f1 = new Facility("Gym", "To play");
		Facility f2 = new Facility("Basketball");
		f1.Show();
		f2.Show();

		Member m1 = new Member(1, "Hello", "World");
		Member m2 = new Member(2, "Blah", "Hel", "Hal");
		m1.Show();
		m2.Show();

		Club c1 = new Club();
		Member m3 = c1.addMember("Sur", "First", "Second");
		Member m4 = c1.addMember("Sur1", "First1", "Second1");
		m3.Show();
		m4.Show();

		System.out.println("-----------");

		System.out.println("Show Members");
		c1.showMember();

		c1.removeMember(1);
		c1.showMember();

		System.out.println("------------------------------------");
		System.out.println("ARRAY LIST");
		System.out.println("-----------");
		ClubWithList c2 = new ClubWithList();
		c2.addMember("Sur", "First", "Second");
		c2.addMember("Sur1", "First1", "Second1");
		c2.showMember();
		System.out.println("-----------");
		c2.removeMember(1);
		c2.showMember();

		System.out.println("------------------------------------");
		System.out.println("HashMap");
		System.out.println("-----------");
		c1.addFacility(f1.getName());
		c1.addFacility(f2.getName());
		c1.ShowFacilities();

		System.out.println("------------------------------------");
		System.out.println("Booking");
		System.out.println("-----------");
		try {
			Booking booking = new Booking(m1, f1, LocalDateTime.now().plusHours(5), LocalDateTime.now().plusHours(7));
			booking.Show();
			
		} catch (BadBookingException e) {
			System.err.println(e.getMessage());
		}
		

	}
}
