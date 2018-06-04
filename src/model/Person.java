package model;


public class Person {
	String surname;
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSecondname() {
		return secondname;
	}

	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}

	String firstname;
	String secondname;
	
	public Person(String surname, String firstname, String secondname) {
		this.surname = surname;
		this.firstname = firstname;
		this.secondname = secondname;
	}
	
	public Person(String surname, String firstname) {
		this(surname, firstname, null);
	}
	
	public void Show() {
			System.out.println(this);
	}
	
	public String toString() {
		String name;
		if(this.secondname == null) {
			name = firstname + " " + surname;
		}
		else {
			name = firstname + " " + secondname + " " + surname;
		}
		return name;
	}
	
	
	
	
	
	
	
	
	
}
