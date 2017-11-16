import java.util.ArrayList;


public class Planet implements IHostPeople {
	//properties
	PlanetType planet;
	ArrayList<Person> people = new ArrayList<Person>();

	//Constructors
	public Planet(PlanetType planet){
		this.planet = planet;
	}


	//method
	public int countByPersonType (PersonType p){
		int count = 0;

		for(Person a : people){
			if(p.equals(a.personType))
				count++;
		}
		System.out.println("There are " + count + " " + p + " people on the planet");

		return count;
	}
	public void addPerson(Person p){
		people.add(p);
	}

	public void removePerson(Person p){
		people.remove(p);
		
	}

	public void removePerson(int a){
		people.remove(a);
	}

	
	

}
