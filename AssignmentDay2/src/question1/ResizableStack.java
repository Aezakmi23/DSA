package question1;

import question1.StackFullException;
import question1.StackEmptyException;


public class ResizableStack implements Stack{

	private Integer[] stackData;
	private int top;

	public ResizableStack() {
		stackData = new Integer[5];
		top = -1;	
			
	}
	
	public  Integer[] resizeStack(Integer[] stackData) {
		Integer[] newStack = new Integer[stackData.length+2];
		System.out.println("Stack size increased by 2");
		for(int i=0; i< stackData.length; ++i) {
			newStack[i] = stackData[i];
		}
		return newStack;
	}
	
	@Override
	public void push(Integer element)  {
		if(isFull()) {
			stackData = resizeStack(stackData);
		}
		
			top++;
			stackData[top]=element;
		
	}

	@Override
	public Integer pop() throws StackEmptyException {
		if(isEmpty()) {
			throw new StackEmptyException("Stack is Empty");
		
		}
		else {
			Integer result = stackData[top];
			--top;
			return result;
		
		}
	}

	@Override
	public Integer peek() {
		return stackData[top];
	}

	@Override
	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
			if (top == (stackData.length - 1)) {
				return true;
			}
			return false;
		}
	
	
}
