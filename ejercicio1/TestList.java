package ejercicio1;

public class TestList {

	public static <T> void main (String[] args) {
		System.out.println("Prueba de la ListArray con String");
		ListArray<String> lista = new ListArray<String>();
		System.out.println("La lista esta vacia? " + lista.isEmptyList());
		lista.insertFirst("Doce");
		lista.insertFirst("Adios");
		lista.insertFirst("14");
		lista.insertLast("asd");
		lista.insertFirst(null);
		
		System.out.println("Adios se encuentra en la lista? " + lista.search("Adios"));
		System.out.println("ADIOS se encuentra en la lista? " + lista.search("ADIOS"));
		System.out.println("La lista esta vacia? " + lista.isEmptyList());
		
		System.out.println(lista);
		
		lista.remove("14");
		
		System.out.println("Tamanio2: " + lista.length());
		
		System.out.println("Eliminando la lista");
		lista.destroyList();
		System.out.println(lista);
		System.out.println("Tamanio: " + lista.length());
	}
	
}
