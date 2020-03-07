package NewProject1;

import java.util.Scanner;

public class greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value for i");
		System.out.println("Enter the value for j");
		
			
			int i=input.nextInt();
			int j=input.nextInt();
			
			if(i>j) 
				System.out.println("i is greater");
			else
				System.out.println("j is greater");
		} 
	}


