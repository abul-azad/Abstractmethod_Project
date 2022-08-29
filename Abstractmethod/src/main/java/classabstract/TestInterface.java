package classabstract;

public class TestInterface extends  MyInterface 
{

	@Override
	public void get_Information() {
    System.out.println("I need my information");
		
	}

	@Override
	public void get_Rent() {
    System.out.println("I need my rent");
		
	}

	@Override
	public void get_Vacine() {
	System.out.println("I am vacinated");
		
	}

	@Override
	public void get_Design() {
	System.out.println("I am very good designer");
		
	}
	
	public static void main(String[] args) 
	{
	TestInterface obj= new  TestInterface();
	obj.get_Rent();
	obj.get_Design();
	obj.get_Information();
	obj.get_Vacine();
		 
	}

}
