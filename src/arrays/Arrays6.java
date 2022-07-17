package arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Arrays6 {
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		int i,x; 
		System.out.println("Please enter the 5 different value");
		for (i =0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}System.out.println("accepted  array is = "+Arrays.toString(a));
		
		System.out.println("Enter the value you want to search");
		x = sc.nextInt();
		
		for(i =0; i<a.length; i++) {
			if(x==a[i]) {
			System.out.println("The number you have enter is present in the array");
			}		
		} System.out.println("Sorry.... The number you have enterd is not present in the array");
	}

}
