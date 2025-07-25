package question1;

//Q1. Define Queue as ADT (Refer to class notes).
public interface Queue {
	
	public void enqueue(int element) throws QueueFullException;
	public int dequeue() throws QueueEmptyException;
	public boolean isEmpty();
	public boolean isFull();
	public int peek();

}
