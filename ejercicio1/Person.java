package ejercicio1;

public class Person implements Comparable<Person> {
	private String nombre;
	private String apellidos;
	private int edad;
	
	
	public Person(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		if (edad > 0) {
			this.edad = edad;	
		}
		else {
			this.edad = 18;
		}
	}

	@Override
	public String toString() {
		return "Persona: " + this.nombre + " " + this.apellidos + "\tEdad: " + this.edad;
	}

	@Override
	public int compareTo(Person o) {
		if(this.edad > o.getEdad()) {
			return 1;
		}
		if(this.edad == o.getEdad()){
			return 0;
		}
		return -1;
	}

    @Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person perComp = (Person) obj;
			return this.edad == perComp.getEdad();
		}
		return false;
	}
	
}
