package com.example.linkedlist;

class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data  = data;
		this.next = null;
	}
}
class LinkedListImpl{
	 Node root;
	 
	 public void insert(int element) {
		 
		 Node temp = root;
		 if(temp==null)
			 root = new Node(element);
		 else {
			Node prev = null;
		   while(temp!=null) {
			   prev = temp;
			  temp=temp.next;
		   }
		   prev.next = new Node(element);
		     
		 }
	 }
	 public void insertAtStart(int element) {
		 
		 Node temp =root;
		 
		 if(temp == null) {
			 root = new Node(element);
		 }else {
			 Node newNode = new Node(element);
			 newNode.next = root;
			 root = newNode;
		 }
		 
	 }
	 public void insertAtLast(int element) {
		insert(element); 
	 }
	 public void insertAtIndex(int position,int element) {
		 
		Node temp = root,prev=null;
		if(temp==null || position<=0) {
			insert(element);
			return;
		}
		while(temp!=null && position!=0) {
			prev = temp;
			temp = temp.next;
			position--;
		}
		Node newNode = new Node(element);
		newNode.next = temp;
		prev.next = newNode;
	 }
	 public void printLinkedList() {
		 
		 Node temp = root;
		 while(temp.next!=null) {
			 
			 System.out.print(temp.data+"-->");
			 temp  = temp.next;
			 
		 }
		 System.out.println(temp.data);
		 
	 }
	 
}
public class LinkedListImplementation {

	public static void main(String args[]) {
		
		LinkedListImpl ll=new LinkedListImpl();
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.insert(40);
		ll.insertAtStart(1);
		ll.insert(50);
		ll.printLinkedList();
		ll.insertAtIndex(1, 2);
		ll.printLinkedList();
		
	}

}
