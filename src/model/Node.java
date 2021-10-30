package model;

public class Node {
	private int pos;
	//
	
	private Node next;
	private Node prev;
	
	
	public Node() {

	}
	
	public Node(int pos) {
		this.pos = pos;
	}


	public int getPos() {
		return pos;
	}


	public void setPos(int pos) {
		this.pos = pos;
	}


	public Node getNext() {
		return next;
	}


	public void setNext(Node next) {
		this.next = next;
	}


	public Node getPrev() {
		return prev;
	}


	public void setPrev(Node prev) {
		this.prev = prev;
	}
	
	
	

}
