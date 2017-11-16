import java.util.ArrayList;


public class Ship implements IHostPeople, IMovable{
	//Properties
	String name;
	ShipType shipType;
	ArrayList<Person> people = new ArrayList<Person>();


	//constructor
	public Ship(String name, ShipType shipType){
		this.name = name;
		this.shipType = shipType;
	}

	//methods

	public int countByPersonType(PersonType p){
		int count = 0;

		for(Person a : people){
			if(p.equals(a.personType))
				count++;
		}
		System.out.println("There are " + count + " " + p + " people on the ship");
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

	public void move(){
		System.out.println("I moved");	
	}
}
