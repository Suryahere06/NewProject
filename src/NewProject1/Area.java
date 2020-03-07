package NewProject1;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creates an object of Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length: ");
        System.out.print("Enter the breadth: ");
        
        // Takes input from the keyboard
        int length = input.nextInt();
        int breadth = input.nextInt();
        
        if(length==breadth) 
        	System.out.println("area is a square");
        else
        System.out.println("area is a rectangle");
        
         
	}

}
