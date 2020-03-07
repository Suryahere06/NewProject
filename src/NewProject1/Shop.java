package NewProject1;

import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the quantity");
		
		int quantity=input.nextInt();
		float cost=quantity*100;
		float finalcost;
		
		float discount;
		
		
		if(cost>1000) {
			 finalcost=(float) ((float)cost- (cost*0.10));
		System.out.println("Total cost after 10% discount:"+ finalcost);
		}
		else {
			finalcost=cost;
		System.out.println("Total cost with no discount:"+finalcost);
		}
		
		 

	}

}
