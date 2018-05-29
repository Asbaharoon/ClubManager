import java.util.ArrayList;

public class ClubWithList {
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
	
}
