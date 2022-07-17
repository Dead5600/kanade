package arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Arrays5 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		System.out.println("Enter any type of number");
		
		int i;
	
		//////---------one way ----------
		for(i=0; i<a.length;i++) {
			a[i] = sc.nextInt();
		}System.out.println("given Array = "+Arrays.toString(a));
				
		System.out.println(" ......negative number.......");
		int positiveCount=0, negativeCount = 0;
		for (i =0 ; i<a.length ; i++) {
			
			if (a[i]<0) {
				negativeCount = negativeCount+1;
				System.out.println(a[i]);
			}
		}System.out.println("Count of negative number = "+negativeCount);
		
		System.out.println("....... positive number.......");	
		for (i =0 ; i<a.length ; i++) {
			if(a[i]>=0) {
				positiveCount = positiveCount +1;
				System.out.println(a[i]);
			}
		}System.out.println("Count of positive numbers ="+positiveCount);
		
		
		
		////////-----------------second way-----------
		positiveCount = 0;
		negativeCount = 0;
		for (i=0; i<a.length; i++) {
			if(a[i]>0) {
				positiveCount = positiveCount +1;
				System.out.println(a[i]);
			}
			else{
				negativeCount = negativeCount +1;
				System.out.println(a[i]);
			}
		}System.out.println("positive numbers = "+positiveCount);
		System.out.println("negative numbers = "+negativeCount);
	}

}
