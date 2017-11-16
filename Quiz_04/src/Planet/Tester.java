import java.util.ArrayList;


public class Tester {
	
	public static void main(String[] args) {
	

	
		Planet p1 = new Planet(PlanetType.EARTH);
		
		Person a1 = new Person("Lex Williams", PersonType.AWESOME);
		Person a2 = new Person("John Doe", PersonType.VERY_GOOD);
		Person a3 = new Person("Mary Smith", PersonType.GOOD);
		Person a4 = new Person("Chris Michaels", PersonType.OKAY);
		Person a5 = new Person("Kanye West", PersonType.BAD);
		Person a6 = new Person("Beyonce Knowles", PersonType.VERY_BAD);
		Person a7 = new Person("Michael Jordan", PersonType.AWESOME);

		p1.addPerson(a1);
		p1.addPerson(a2);
		p1.addPerson(a3);
		p1.addPerson(a4);
		p1.addPerson(a5);
		p1.addPerson(a6);
		p1.addPerson(a7);
		
		p1.removePerson(6);
		p1.countByPersonType(PersonType.AWESOME);
		
		
		
		
		
		Ship s1 = new Ship("The Ship", ShipType.PASSENGER);
		s1.addPerson(a1);
		s1.addPerson(a7);
		s1.addPerson(a4);
		
		s1.countByPersonType(PersonType.AWESOME);
		
		s1.removePerson(0);
		s1.countByPersonType(PersonType.AWESOME);
		
	}
	
	
}
