package NewProject1;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the salary");
		System.out.println("Enter the year of service");
		
		float salary=input.nextFloat();
		float yos=input.nextFloat();
		double bonus;
		if(yos>5) {
		bonus = salary*0.05;
		System.out.println("The net bonus is:"+bonus );
		}
		else {
			System.out.println("No bonus:"+salary );
	 	}

	}

}
