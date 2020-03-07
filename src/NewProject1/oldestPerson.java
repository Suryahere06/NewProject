package NewProject1;

import java.util.Scanner;

public class oldestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the age for 1st person");
		System.out.println("Enter the age for 2nd person");
		System.out.println("Enter the age for 3rd person");
			
			int a=input.nextInt();
			int b=input.nextInt();
			int c=input.nextInt();
			
			if(a>b && a>c) {
				System.out.println("1st person is the oldest");
			}else if(b>a && b>c) {
				System.out.println("2nd person is the oldest");
			}else if(c>a && c>b) {
				System.out.println("3rd person is the oldest");
			}
	}

}
