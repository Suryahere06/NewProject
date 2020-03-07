package NewProject1;

import java.util.Scanner;

public class absoluteValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

        System.out.print("Please enter a string value ");
        
        int value=input.nextInt();
        
        if(value<0) {
        	System.out.println("Print the value"+value*(-1));
	}else {
		System.out.println("Print the value"+value);
	}
 
}
}