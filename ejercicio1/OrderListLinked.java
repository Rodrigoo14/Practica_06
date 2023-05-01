package ejercicio1;

public class OrderListLinked<T extends Comparable<T>> extends LinkenList<T> {
	
	public OrderListLinked() {
		super();
	}
	
	public OrderListLinked(Node<T> head) {
		super(head);
		if (super.getHead().getNext() != null) {
			Node<T> headAux = super.getHead();
			while (headAux.getNext() != null) {			
				Node<T> iterador = headAux.getNext();
				while (iterador != null) {
					if (headAux.getData().compareTo(iterador.getData()) > 0) {
						T aux = headAux.getData();
						headAux.setData(iterador.getData());
						iterador.setData(aux);
					}
					iterador = iterador.getNext();
				}
				headAux = headAux.getNext();
			}
		}
	}
	
	public void insertElement(T ele) {
		if (ele.compareTo(this.getHead().getData()) < 0) {
			Node<T> nodeAux = new Node<T>(ele, this.getHead());
			this.setHead(nodeAux);
		}
		else {
			Node<T> aux = this.getHead();
			while (aux.getNext() != null) {
				if (aux.getData().compareTo(ele) < 0 && aux.getNext().getData().compareTo(ele) > 0) {
					Node<T> nuevo = new Node<T>(ele, aux.getNext());
					aux.setNext(nuevo);
					break;
				}
				else if(aux.getNext().getNext() == null) {
					if (aux.getNext().getData().compareTo(ele) < 0) {
						Node<T> nuevo = new Node<T> (ele);
						aux.getNext().setNext(nuevo);
						break;
					}
				}
				aux = aux.getNext();
			}
		}
	}
	
	public boolean searchOrder(T ele) {
		Node<T> aux = super.getHead();
		while (aux != null && aux.getData().compareTo(ele) < 0) {
			aux = aux.getNext();
		}
		if (aux != null) {
			return aux.getData().equals(ele);
		}
		return false;
	}
	
	@Override
	public void setHead(Node<T> head) {
		super.setHead(head);
		if (super.getHead() != null) {
			Node<T> headAux = super.getHead();
			while (headAux.getNext() != null) {			
				Node<T> iterador = headAux.getNext();
				while (iterador != null) {
					if (headAux.getData().compareTo(iterador.getData()) > 0) {
						T aux = headAux.getData();
						headAux.setData(iterador.getData());
						iterador.setData(aux);
					}
					iterador = iterador.getNext();
				}
				headAux = headAux.getNext();
			}
		}
	}
	
	
	@Override
	public String toString() {
		String s = "OrderListLinked\n";
		Node<T> aux = this.getHead();
		int cont = 0;
		while (aux != null) {
			s += "Elemento["+cont+"]: "+ aux.getData() + "\n";
			aux = aux.getNext();
			cont++;
		}
		return s;
	}
}


/*
public void orderList() {
	Node<T> headAux = this.getHead();
	while (headAux.getNext() != null) {			
		Node<T> iterador = headAux.getNext();
		while (iterador != null) {
			if (headAux.getData().compareTo(iterador.getData()) > 0) {
				T aux = headAux.getData();
				headAux.setData(iterador.getData());
				iterador.setData(aux);
			}
			iterador = iterador.getNext();
		}
		headAux = headAux.getNext();
	}
}*/
