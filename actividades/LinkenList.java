package actividades;

public class LinkenList<T> implements TDAList<T> {
	private Node<T> head;
	
	
	public LinkenList() {
		this.head = null;
	}
	
	public LinkenList(Node<T> head) {
		this.head = head;
	}
	
	public Node<T> getHead() {
		return this.head;
	}
	
	public void setHead(Node<T> head) {
		this.head = head;
	}
	
	@Override
	public int length() {
		Node<T> aux = this.head;
		int cont = 0;
		while (aux != null) {
			aux = aux.getNext();
			cont++;
		}
		return cont;
	}
		
	@Override
	public boolean isEmptyList() {
		return this.head == null;
	}

	@Override
	public void destroyList() {
		this.head = null;
		
	}

	@Override
	public int search(T ele) {
		if (this.head == null) {
			return -1;
		}
		else {
			Node<T> aux = this.head;
			int pos = 0;
			while (aux != null) {
				if (ele.equals(aux.getData())) {
					return pos;
				}
				aux = aux.getNext();
				pos++;
			}
			return -1;
		}
	}

	@Override
	public void insertFirst(T ele) {
		if (this.head == null) {
			Node<T> aux = new Node<T>(ele, this.head);
			this.head = aux;
		}
		else {
			Node<T> aux = new Node<T>(ele, this.head);
			this.head = aux;
		}
		
	}

	@Override
	public void insertLast(T ele) {
		if (this.head == null) {
			Node<T> aux = new Node<T>(ele);
			this.head = aux;
		}
		else {
			Node<T> aux = this.head;
			while (aux.getNext() != null) {
				aux = aux.getNext();
			}
			aux.setNext(new Node<T>(ele));
		}
	}

	@Override
	public void remove(T ele) {
		if (this.head != null) {
			if (this.head.getData().equals(ele)) {
				this.head = this.head.getNext();
			}
			else {
				Node<T> aux = this.head;
				while(aux.getNext() != null) {
					if (aux.getNext().getData().equals(ele)) {
						break;
					}
					aux = aux.getNext();
				}
				aux.setNext(aux.getNext().getNext());
			}
		}
	}
	
	@Override
	public String toString() {
		String s = "LinkenList\n";
		Node<T> aux = this.head;
		int cont = 0;
		while (aux != null) {
			s += "Elemento["+cont+"]: "+ aux.getData() + "\n";
			aux = aux.getNext();
			cont++;
		}
		return s;
	}
	
}	

