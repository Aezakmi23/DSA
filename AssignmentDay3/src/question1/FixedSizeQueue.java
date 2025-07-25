package question1;

public class FixedSizeQueue implements Queue {

	private int[] queueData;
	private int front;
	private int rear;
	
	public FixedSizeQueue() {
		queueData = new int[5];
		front =-1;
		rear  =-1;
	
	}
	
	@Override
	public void enqueue(int element) throws QueueFullException {
		if(isFull()) {
			throw new QueueFullException("Queue is full");
		}
		
//		if(front==-1) {
//			front =0;
//		}
		
			++rear;
			queueData[rear] = element; 
		
	}
	
//	@Override
//	public int dequeue() throws QueueEmptyException{
//		try {
//		if(isEmpty()) {
//			int i = queueData[front++];
//			System.out.println("Removed data is "+ i);
//			throw new QueueEmptyException("Queue is Empty");
//		}
//		}catch (QueueEmptyException e) {
//			System.out.println(e.getMessage());
//		}
////		else {
////			int i = queueData[front];
////			System.out.println("Removed element is = "+ i);
////			queueData[front] = 0;
////			front++;
////			//return i;			
////		
//
//		return queueData[front++];	
//		
//	}
	
	
	@Override
	public int dequeue() throws QueueEmptyException{
		if(isEmpty()) {
			throw new QueueEmptyException("Queue is empty");
		}
		else {
			
				++front;
				return queueData[front];
			}
			
		}
		
		
		
	
	@Override
	public int peek() {
		//System.out.println(front);
		return queueData[front];
	}
	
	@Override
	public boolean isFull() {
		if(rear == queueData.length-1) {
			return true;
		}
		return false;
	}
	
	
	@Override
	public boolean isEmpty() {
		if(front==rear) {
			return true;
		}
		return false;
	}

	
}
