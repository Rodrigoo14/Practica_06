package actividades;

public class TestAll {

	public static void main (String[] args) {
		//ListArray<Person>
		ListArray<Person> listArrayPerson = new ListArray<Person>();
		listArrayPerson.insertFirst(new Person("Rodrigo", "Mechan", 23));
		listArrayPerson.insertFirst(new Person("Alberto", "Carpio", 50));
		listArrayPerson.insertFirst(new Person("Azul", "Ramirez", 19));
		listArrayPerson.insertLast(new Person("Jose", "Vilca", 70));		
		System.out.print("Person ");
		System.out.println(listArrayPerson);
		System.out.println("Eliminamos a Jose de la ListArray");
		listArrayPerson.remove(new Person("Jose", "Vilca", 70));
		System.out.println(listArrayPerson);
		System.out.println("La lista esta vacia? " + listArrayPerson.isEmptyList());
		
		//LinkenList<Person>
		LinkenList<Person> linkenListPerson = new LinkenList<Person>(new Node<Person>(new Person("Jose", "Vilca", 23)));
		linkenListPerson.insertFirst(new Person("Rodrigo", "Mechan", 23));
		linkenListPerson.insertFirst(new Person("Eric", "Delgado", 14));
		linkenListPerson.insertFirst(new Person("Anthony", "Gutierrez", 6));
		linkenListPerson.insertLast(new Person("Alan", "Garcia", 55));
		
		System.out.println(linkenListPerson);
		
		linkenListPerson.remove(new Person("Alan", "Garcia", 55));
		
		System.out.println(linkenListPerson);
		
	}
}
