
public class Member extends Person {
	int membernumber;
	
	public int getMembernumber() {
		return membernumber;
	}

	public void setMembernumber(int membernumber) {
		this.membernumber = membernumber;
	}

	public Member(int membernumber, String firstname, String secondname, String surname) {
		super(surname, firstname, secondname);
		this.membernumber = membernumber;
	}
	
	public Member(int  membernumber, String firstname, String surname) {
		super(surname, firstname);
		this.membernumber = membernumber;
	}
	
	public String toString() {
		String name = super.toString();
		name += " - " + membernumber;
		return name;
	}
	public void Show() {
		System.out.println(this);
	}
}
