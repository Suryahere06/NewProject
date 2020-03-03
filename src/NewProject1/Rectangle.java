package NewProject1;

public class Rectangle {

	int length;
	int breadth;
	

	public  Rectangle() {
			length=0;
			breadth=0;
		///
	}
	
	public Rectangle(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
		
	}
	public Rectangle(int length)
	{
	this.length=length;
	this.breadth=length;
	
	}
	public int calculateArea()
	{
		int area=this.length*this.breadth;
		return area;
	}
	
	public static void main(String[] args) {
		

		Rectangle r1= new Rectangle();
		Rectangle r2=new Rectangle(5,3);
		Rectangle r3=new Rectangle(5);
		int a1=r1.calculateArea();
		int a2=r2.calculateArea();
		int a3=r3.calculateArea();
		System.out.println("area is:"+ a1);
		System.out.println("area is:"+ a2);
		System.out.println("area is:"+ a3);
	}

}
