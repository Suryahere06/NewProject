package NewProject1;

public class Programming {
	
	String message="I love ";
	String message1="Programming languages";
	
	public Programming()
	{
		System.out.println(message+ message1);
	}
	public  Programming(String ie)
	{
		///
		message1=ie;
		System.out.println(message+ message1);
	}
	  
	
	public static void main(String[] args) {
		
	Programming p1=new Programming();
	Programming p2=new Programming("Java");
	

	}

}
