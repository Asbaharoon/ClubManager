package model;


public class Facility {
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	String description;
	
	public Facility(String name, String description) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.description = description;
		
	}
	
	public Facility(String name) {
		this(name, null);
	}
	
	public void Show() {
		System.out.println(this);
	}
	
	public String toString() {
		String name = this.name;
		if(description != null) {
			name += " (" + this.description + ") ";
		}
		return name;
	}
	
	

}
