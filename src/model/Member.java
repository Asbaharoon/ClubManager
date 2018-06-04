package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "members")
public class Member extends Person {
	@Id
	private int membernumber;
	
	private String firstname;
	
	private String secondname;
	
	private String surname;
	
	public Member() {
		super(null, null);
		firstname = "";
		secondname = "";
		surname = "";
		membernumber = 0;
	}
	
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
