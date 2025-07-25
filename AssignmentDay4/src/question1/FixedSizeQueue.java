package question1;

//Implement Queue interface defined on Day 2, using Singly linked list.

public class FixedSizeQueue implements Queue {


	private SListNode head;
	private SListNode tail;


	public FixedSizeQueue() {

		head = null;
		tail = null;

	}

	@Override
	public void enqueue(int element) {
		SListNode newNode = new SListNode();
		newNode.data = element;
		newNode.next = null;

		if(isEmpty()) {
			head = newNode;
			tail = newNode;
			return;
		}

		tail.next = newNode;
		tail = newNode;


	}


	@Override
	public int dequeue() throws QueueEmptyException{
		if(isEmpty()) {
			throw new QueueEmptyException("Queue is empty");
		}

		SListNode current = head;
		head =head.next;

		if(isEmpty()) {
			tail = null;	
		}


		return current.data;
	}





	@Override
	public int peek() {

		return head.data;
	}



	@Override
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		return false;
	}


}
