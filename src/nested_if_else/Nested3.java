package nested_if_else;
import java.util.*;
public class Nested3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int exp, age, marks;
		System.out.print("plz enter experience, age, 12 marks");
		exp = sc.nextInt();
		age = sc.nextInt();
		marks = sc.nextInt();
		sc.close();
		if( exp > 15 )
		{
			if(age >50)
			{
				if(marks > 55)
				{
					System.out.println(" you are selected for the driver post");
				}
				else {
					System.out.println("your 12 marks are not sufficient");
				}
			}
			else
			{
			System.out.println("your age is not sufficient");	
			}
		}
		else 
		{
			System.out.println(" your eperince is not match to requirement");
		}
		
	}

}
