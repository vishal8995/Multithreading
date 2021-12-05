package linkedListOperations;

import java.util.HashSet;

public class IntersectionMain {

	public static Node push(Node head, int data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		return node;
	}
	
	public static void main(String[] args) {
		Node first = null;
		for (int i=0; i<5; i++)
			first = push(first,i);
		
		Node second = null;
		for (int i=0; i<3; i++)
			second = push(second,i);
		
		second.next.next = first.next.next;
		
		Node addr = intersectionPoint(first,second);
		if (addr != null)
			System.out.println("Intersection point is : "+addr.data);
		else
			System.out.println("The Linked Lists don't intersect !!");
	}

	private static Node intersectionPoint(Node first, Node second) {

		HashSet<Node> set = new HashSet<>();
		
		while (first != null) {
			set.add(first);
			first = first.next;
		}
		
		while (second != null) {
			if (set.contains(second))
				return second;
			second = second.next;
		}
		
		return null;
	}

}
