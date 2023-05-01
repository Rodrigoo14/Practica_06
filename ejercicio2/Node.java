package ejercicio2;

public class Node {
	char data;
	Node next;
	
	Node(char ch) {
		this.data = ch;
		this.next = null;
	}
	
	@Override
	public String toString() {
		String s = String.valueOf(this.data);
		return s +" -> "+ this.next;
	}
}
