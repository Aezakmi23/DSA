package question1;
import java.util.Scanner;

import question1.*;

public class QueueTester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		FixedSizeQueue fq = new FixedSizeQueue();
		int choice = 0;
		
		do {
			System.out.println("Press 1. to Enter data into queue");
			System.out.println("Press 2. to Remove data from queue");
			System.out.println("Press 3. to Display the data");
			System.out.println("Press 0. to Exit");
			System.out.println("Enter the choice");
			choice = sc.nextInt();
			
		switch (choice) {
		case 1: {
			try{
				System.out.println("Enter the element");
				int element = sc.nextInt();
				fq.enqueue(element);
			}catch(QueueFullException e) {
				e.printStackTrace();
			}
			break;
			
		}
		case 2: {
				try {
					int dequeue = fq.dequeue();
					System.out.println(dequeue+ " remove date");
				} catch (QueueEmptyException e) {
					e.printStackTrace();
				}
				break;
				}
		case 3: {
			System.out.println("Front most data is : "+ fq.peek() );
			break;
		}
		case 0: {
			
			System.out.println("Thank you!!");
			break;
		}
		default:
			try {
			throw new IllegalArgumentException("Unexpected value: " + choice);
			}catch(IllegalArgumentException e){
				e.printStackTrace();
			}
		}
		
		}while(choice!=0);
		
		sc.close();
		
	}

}
