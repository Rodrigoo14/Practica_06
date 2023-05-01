package actividades;

public class TestLinkenList {

	public static void main(String[] args) {
		LinkenList<String> linList = new LinkenList<String>();
		Node<String> nodo = new Node<String>("42");
		String s = "Hola";
		String s1 = "ASD";
		String s2 = "asdasd";
		
		System.out.println("La linkenList esta vacia? " + linList.isEmptyList());
		linList.setHead(nodo);
		System.out.println("Agregamos el nodo");
		System.out.println("La linkenList esta vacia? " + linList.isEmptyList());
		linList.insertFirst(s);
		linList.insertFirst(s1);
		linList.insertLast(s2);
		
		System.out.println("Tamanio luego de 4 inserciones: " + linList.length());
		
		System.out.println("El elemento asdasd se encuentra en la posicion: " + linList.search("asdasd"));
		
		System.out.println(linList);
		System.out.println("Eliminando el elemento 42");
		
		linList.remove("42");
		System.out.println(linList);
		
		System.out.println("Destruyendo la lista");
		linList.destroyList();
		System.out.println(linList);
		System.out.println("La linkenList esta vacia? " + linList.isEmptyList());
		
		
		LinkenList<Integer> linListInt = new LinkenList<Integer>(new Node<Integer>(14));
		linListInt.insertFirst(15);
		linListInt.insertFirst(-1);
		linListInt.insertFirst(-110);
		linListInt.insertLast(7);
		
		System.out.println("La lista de enteros esta vacia? " + linListInt.isEmptyList());
		System.out.println(linListInt);
		System.out.println("Eliminamos el elemento 15");
		linListInt.remove(15);
		System.out.println(linListInt);
		
		
		LinkenList<Person> linListPerson = new LinkenList<Person>(new Node<Person>(new Person("Jose", "Vilca", 23)));
		LinkenList<Person> linListPerson2 = new LinkenList<Person>();
		System.out.println("La lista 1 de personas esta vacias? " + linListPerson.isEmptyList());
		System.out.println("La lista 2 de personas esta vacias? " + linListPerson2.isEmptyList());
		System.out.println(linListPerson);
		System.out.println(linListPerson2);
		linListPerson2.insertFirst(new Person("Rodrigo", "Mechan", 23));
		linListPerson2.insertFirst(new Person("Eric", "Delgado", 14));
		linListPerson2.insertFirst(new Person("Anthony", "Gutierrez", 6));
		linListPerson2.insertLast(new Person("Alan", "Garcia", 55));
		
		System.out.println(linListPerson2);
	}

}
