package question1;

import java.util.Arrays;
import java.util.Scanner;

import javax.security.auth.kerberos.DelegationPermission;

/*Implement following function to delete element from
specified position in given array.
The function should return the updated logical size of array.
int deleteFromPosition(int[] arr, int n, int pos);*/


public class ArrayDelete {

	public static int deleteFromPosition(int[] arr, int n, int pos) {
		
		for(int i=pos-1 ;i< n-1 ;i++) {
			arr[i]=arr[i+1];
			
		}
		return (n-1);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter max size of array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		char ch;
		int i=0;
		
		do {
			System.out.println("Enter a number");
			arr[i++] = sc.nextInt();
			System.out.println("Do you want to continue");
			ch = sc.next().charAt(0);
						
			
		}while(ch!='n');
		
		System.out.println("Enter the position at which element to be deleted");
		int pos = sc.nextInt();
		
		System.out.println("Logical size after deleting" + deleteFromPosition(arr, i, pos));
		
		System.out.println("Array is "+ Arrays.toString(arr));
		sc.close();

	}

}
