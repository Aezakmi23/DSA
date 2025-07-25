package question2;

import java.util.Currency;

/*Assignment 2: For sorted singly linked list, implement
a) following function to delete the specified element
   void delete(int element);
b) following function to delete all occurrences of specified element
   void deleteAll(int element);
a) following function to return true if specified element is present in list else return false
   boolean search(int element);
Refer to the interface (SortedList) and partial implementation (class SortedSinglyList) done in class today.*/


public class SortedSinglyList implements SortedList {

	SListNode head;
	
	public SortedSinglyList(){
		head = null;
	}
	
	@Override
	public void insert(int element) {
		SListNode newNode = new SListNode();
		newNode.data = element;
		newNode.next = null;
		
		
		if (head==null) {
			head=newNode;
			return;
		}
		
		SListNode current = head;
		SListNode previous = null;
		
		while(current!=null) {
			if(current.data>newNode.data) {
				break;
			}
			previous = current;
			current = current.next;
		}
		
		if(previous == null) {
			newNode.next = head;
			head = newNode;
			return;
		}
		
		previous.next = newNode;
		newNode.next = current;
	}
	
	@Override
	public void delete(int element) {
		
		SListNode current = head;
		SListNode previous = null;
		
		if(head == null) {
			return;
		}
		
		if(head.next ==null && head.data == element) {
			head = null;
		}
		
		
		while(current != null) {
			if(current.data != element) {
				previous =current;
				current = current.next;
			}
			previous.next = current.next;
		}
		
		
		
		
		
	}
	
	@Override
	public void deleteAll(int element) {
		
	}
	
	@Override
	public boolean search(int element) {
		SListNode current = head;
		//SListNode previous =null;
		
		
		if(head == null) {
		return false;
		}
		
		while(current != null) {
			boolean flag =false;
			if(current.data == element) {
				flag = true;
				System.out.println("Element found");
				return true;
				}
			if(!flag) {	
			current = current.next;
			}
			
		}
		
		return false;
	}
	
	
	@Override
	public void print() {
		SListNode current = head;
		
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println("");
	}
	
}
