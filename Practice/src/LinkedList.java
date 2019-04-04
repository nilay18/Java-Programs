public class LinkedList {
	LinkedNode head;

	static class LinkedNode {
		int data;
		LinkedNode next;

		LinkedNode(int d) {
			data = d;
			next = null;
		}
	}

	public static LinkedList insert(LinkedList list, int data) {
		LinkedNode new_node = new LinkedNode(data);
		new_node.next = null;
		if (list.head == null) {
			list.head = new_node;
		} else {
			LinkedNode last = list.head;
			while (last.next != null) {
				last = last.next;
			}

			last.next = new_node;
		}
		return list;
	}

	public static LinkedList reverse(LinkedList list) {
		LinkedNode r_list = list.head;
		LinkedNode current = r_list;
		LinkedNode prev = null;
		LinkedNode next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		list.head = prev;
		return list;
	}

	public static void printList(LinkedList list) {
		LinkedNode curr_node = list.head;
		while (curr_node != null) {
			System.out.print("->" + curr_node.data);
			curr_node = curr_node.next;
		}

	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 5);
		list = insert(list, 6);
		list = insert(list, 15);
		list = insert(list, 16);
		list = insert(list, 25);

		System.out.print("Linked List:");
		printList(list);
		System.out.print("\n" + "Reversed Linked List:");
		printList(reverse(list));
	}
}
