package ejercicio2;

public class Main2 {

	static class NodeWrapper {
		public Node node;
		
		NodeWrapper(Node node) {
			this.node = node;
		}
	}
	
	public static boolean isPalindrome(NodeWrapper left, Node right) {
		if (right == null) {
			return true;
		}
		if (!isPalindrome(left, right.next)) {
			return false;
		}
		Node prev_left = left.node;
		
		left.node = left.node.next;
		
		return (prev_left.data == right.data);
	}
	
	public static void main(String[] args) {
		Node head = new Node('A');
		head.next = new Node('B');
		head.next.next = new Node('B');
		head.next.next.next = new Node('A');
		//head.next.next.next.next = new Node('A');
		NodeWrapper left = new NodeWrapper(head);
		
		System.out.println(head);
		
		if (isPalindrome(left, head)) {
			System.out.println("Linked List is palindrome.");
		}
		else {
			System.out.println("Linked List is not palindrome.");
		}
	}
}
