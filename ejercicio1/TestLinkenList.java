package ejercicio1;

public class TestLinkenList {

	public static void main(String[] args) {		
		OrderListLinked<Person> linListPerson = new OrderListLinked<Person>(new Node<Person>(new Person("Jose", "Vilca", 23)));
		System.out.println("La lista de personas esta vacias? " + linListPerson.isEmptyList());
		System.out.println(linListPerson);

		linListPerson.insertElement(new Person("Rodrigo", "Mechan", 23));
		linListPerson.insertElement(new Person("Eric", "Delgado", 14));
		linListPerson.insertElement(new Person("Anthony", "Gutierrez", 6));
		linListPerson.insertElement(new Person("Alan", "Garcia", 55));
		
		System.out.println(linListPerson);
	}

}
