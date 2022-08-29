package classabstract;
//Abstract class must have Abstract keyword before the Class Keyword 
//Abstract class contain 0 to 100% abstraction 


public abstract class MyInterface 
{//start from here
	
	public static void get_money() 
	{
	int a=85;
	double b=89.20;
	int    c=74;
	double total=a+b+c;
	
	System.out.println(total);
	}
	
	public abstract void get_Information();
	
	public abstract void get_Rent();
	
	public abstract void get_Vacine();
	
	public abstract void get_Design();
		
	
	
	
	public static void main(String[] args)
	{
		MyInterface.get_money();	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//End is there.	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


