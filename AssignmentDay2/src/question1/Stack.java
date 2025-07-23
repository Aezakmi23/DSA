package question1;

/*Implement a Stack class using resizable array that implements the
Stack interface defined in class.
Throw appropriate exception when required.*/

public interface Stack {

	public void push(Integer element);
	Integer pop() throws StackEmptyException;
	Integer peek();
	boolean isEmpty();
	boolean isFull();
}
