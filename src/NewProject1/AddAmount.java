package NewProject1;

public class AddAmount {

	int amount=50;
	

	public AddAmount(int amount)
	{
		this.amount=this.amount+amount;
		
		//test
	}
	public AddAmount() {
	
}
	public static void main(String[] args) {
		 
AddAmount a1=new AddAmount();
AddAmount a2=new AddAmount(20);
System.out.println("Amount in the piggy bank is:"+ a2.amount);
	}
    
}
