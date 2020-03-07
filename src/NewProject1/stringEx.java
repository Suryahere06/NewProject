package NewProject1;

import java.util.*;
import java.lang.String;

public class stringEx {
	
	//public stringEx(String s)
	{
		
	}
	Public stringEx (Char []c)
	{
		
	}
	Public stringEx ()
	{  
		
	}
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            char []c=new char[5];
                    c[0]='d';
            		c[1]='a';
            		c[2]='t';
            		c[3]='a';
			String s= new String(c);  //s=a1 , c=b1
			System.out.println(s);   
			//s=a1
			s="data"              //data = x1  , s=x1
			System.out.println(s);

			s= new String("data");//s=y1
			System.out.println(s);

			s=s.replace("d",""); //s=z1
			s=s+"1";
			System.out.println(s);

	}

}
