
public class MyLinkedList {
	public Node head;
	public  Node tail;
	public int size;

	

	public Node  createLinkedList(int value) {
		head = new Node();
		Node node=new Node();
		node.setNext(null);
		node.setVale(value);
		head=node;
		tail=node;
		size=1;
		return head;

	}
	
}
