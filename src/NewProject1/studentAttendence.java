package NewProject1;

import java.util.Scanner;

public class studentAttendence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of classes held");
		float classattended=input.nextInt();

		System.out.println("Enter the number of classes attended");
			
			float classheld=input.nextInt();
			float attendence_per=classattended/classheld;
			
			if(attendence_per > 0.75)
				System.out.println("ok to appear for exam");
			else
				System.out.println("not ok to appear for exam");

			System.out.println(attendence_per*100);

	}

}
