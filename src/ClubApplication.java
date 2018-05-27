
public class ClubApplication {
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
		
	}
}
