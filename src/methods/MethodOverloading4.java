package methods;

public class MethodOverloading4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside the main method");
		main();
		main(10);
		main("Sanket");
		int []Array= {10,20,30}; 
		main(Array);
		

	}
	public static void main() 
	{
		System.out.println("Inside the overloaded method");
	}
	
	public static void main(int args) 
	{
		System.out.println("inside the int overloaded method");
	}
	
	public static void main(String args) 
	{
		System.out.println("inside the string oveloaded method");
	}
	
	public static void main(int[]args)
	{
		System.out.println("Inside the int [] overloaded method");	
	}
	

}
