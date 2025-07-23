package question1;

import java.util.Scanner;
import question1.*;

public class StackTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ResizableStack rs = new ResizableStack();
		int choice = 0;
		
		do {
			System.out.println("Press 1. to Enter data into stack");
			System.out.println("Press 2. to Remove data from stack");
			System.out.println("Press 3. to Display top most data");
			System.out.println("Press 0. to Exit");
			System.out.println("Enter the choice");
			choice = sc.nextInt();
			
		switch (choice) {
		case 1: {
			System.out.println("Enter the element");
			Integer ele = sc.nextInt();
			rs.push(ele);
			break;
			
		}
		case 2: {
				try {
					System.out.println("Popped element " + rs.pop());
				} catch (StackEmptyException e) {
					e.printStackTrace();
				}
				break;
				}
		case 3: {
			System.out.println("Top most data is stack is  " +rs.peek());
			break;
		}
		case 0: {
			
			System.out.println("Thank you!!");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		
		}while(choice!=0);
		sc.close();
	}

}
