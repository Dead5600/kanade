package ifelse;

import java.util.*;

public class Ifelse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int m;
		System.out.print("enter marks ");
		m = sc.nextInt();
		sc.close();
		if (m >= 40)
		{
			System.out.print("Congratulation you are pass");
		}
		else
		{
			System.out.print("better luck next time");
		}
		
	}

}
