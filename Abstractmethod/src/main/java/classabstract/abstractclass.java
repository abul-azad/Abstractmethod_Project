package classabstract;
//Abstract class must have Abstract keyword before the Class Keyword 
//Abstract class contain 0 to 100% abstraction 

public abstract class abstractclass 
{//starting from here
	
	public static void get_risk() 
	{
    
	System.out.println("i want to risk anything for my business");	
		
	}
	
   public void get_documents() 
    {
	   
	System.out.println("i need my all kind of property documents");  
		
	}
   
   public abstract void get_information();

 
   public static void get_biodata() 
   {
	int k=28;
	int l=58;
	double m=85.20;
	double n=k+l+m;
	System.out.println(n);
		
   }
   
   public static void get_industry() 
   {
	System.out.println("i want to running my industry as soon as possible" );  
	   
   }
   
   public static void get_money() 
   {  
   int  x=85000;
   int  y=7000;
   int  z=x+y;   
    System.out.println(z);
   }
  
   public static void main(String[] args) 
   {
	   
	   abstractclass.get_industry();
	   abstractclass.get_biodata();
	   abstractclass.get_money();
	   abstractclass.get_risk();
	
	  
	}



}//end from there

