package application;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import daointerface.MemberDAO;
import data.MemberDAOImpl;
import model.Member;

public class ClubApplication {

	public static DateTimeFormatter dFormat = DateTimeFormatter.ofPattern("d-MMM-yyyy H:m");

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

//		System.out.println("Hello");
//
//		Person p1 = new Person("zin", "min", "htet");
//		Person p2 = new Person("Zin", "Min");
//		p1.Show();
//		p2.Show();
//
//		Facility f1 = new Facility("Gym", "To play");
//		Facility f2 = new Facility("Basketball");
//		f1.Show();
//		f2.Show();
//
//		Member m1 = new Member(1, "Hello", "World");
//		Member m2 = new Member(2, "Blah", "Hel", "Hal");
//		m1.Show();
//		m2.Show();
//
//		Club c1 = new Club();
//		Member m3 = c1.addMember("Sur", "First", "Second");
//		Member m4 = c1.addMember("Sur1", "First1", "Second1");
//		m3.Show();
//		m4.Show();
//
//		System.out.println("-----------");
//
//		System.out.println("Show Members");
//		c1.showMember();
//
//		c1.removeMember(1);
//		c1.showMember();
//
//		System.out.println("------------------------------------");
//		System.out.println("ARRAY LIST");
//		System.out.println("-----------");
//		ClubWithList c2 = new ClubWithList();
//		c2.addMember("Sur", "First", "Second");
//		c2.addMember("Sur1", "First1", "Second1");
//		c2.showMember();
//		System.out.println("-----------");
//		c2.removeMember(1);
//		c2.showMember();
//
//		System.out.println("------------------------------------");
//		System.out.println("HashMap");
//		System.out.println("-----------");
//		c1.addFacility(f1.getName());
//		c1.addFacility(f2.getName());
//		c1.ShowFacilities();
//
//		System.out.println("------------------------------------");
//		System.out.println("Booking");
//		System.out.println("-----------");
//		try {
//			Booking booking = new Booking(m1, f1, LocalDateTime.now().plusHours(5), LocalDateTime.now().plusHours(7));
//			booking.Show();
//			
//		} catch (BadBookingException e) {
//			System.err.println(e.getMessage());
//		}
		
		
		
		//JDBC
//		System.out.println("Using JDBC");
//		
//		System.out.println("All Members");
//		MemberDAO memberDAO = new MemberDAOImpl();
//		ArrayList<Member> members = memberDAO.listAllMember();
//		
//		for (Member member : members) {
//			System.out.println(member);
//		}
//		System.out.println("------------------");
//		System.out.println("List Member No : 1");
//		Member m = memberDAO.listMember(1);
//		System.out.println(m);
//	
//		System.out.println("------------------");
//		System.out.println("Create Member No : 12");
//		Member m2 = new Member(12, "Blah", "Hel", "Hal");
//		//int result = memberDAO.createMember(m2);
//		//System.out.println(result);
//
//		
//		System.out.println("------------------");
//		System.out.println("Update Member No : 12");
//		m2.setFirstname("Wheeeeeeee");
//		int resultupdate = memberDAO.updateMember(m2);
//		System.out.println(resultupdate);
//		System.out.println("List Member No : 12");
//		Member nMember = memberDAO.listMember(12);
//		System.out.println(nMember);
//	
//		System.out.println("------------------");
//		System.out.println("Delete Member No : 12");
//		int result = memberDAO.removeMember(12);
//		System.out.println(result);
		
		
		//JPA
		System.out.println("Using JPA");
		
		System.out.println("All Members");
		MemberDAO memberDAO = new MemberDAOImpl();
		ArrayList<Member> members = memberDAO.listAllMember();
		
		for (Member member : members) {
			System.out.println(member);
		}
		System.out.println("------------------");
		System.out.println("List Member No : 1");
		Member m = memberDAO.listMember(1);
		System.out.println(m);
	
		System.out.println("------------------");
		System.out.println("Create Member No : 12");
		Member m2 = new Member(12, "Blah", "Hel", "Hal");
		//int result = memberDAO.createMember(m2);
		//System.out.println(result);

		
		System.out.println("------------------");
		System.out.println("Update Member No : 12");
		m2.setFirstname("Wheeeeeeee");
		int resultupdate = memberDAO.updateMember(m2);
		System.out.println(resultupdate);
		System.out.println("List Member No : 12");
		Member nMember = memberDAO.listMember(12);
		System.out.println(nMember);
	
		System.out.println("------------------");
		System.out.println("Delete Member No : 12");
		int result = memberDAO.removeMember(12);
		System.out.println(result);

	}
}
