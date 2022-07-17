package arrays;

public class ArrayPractice3 {
	String s1 = "AksHay$ankeT@123_";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayPractice3 a1 = new ArrayPractice3();
	
	/*     replaceAll() method logic 
	*
	*Without the '^' Symbol it exclude the sequence pass in the regex pattern and print output 
*when we want to print a special character the in regex sequence include all pattern of passing like a-z, A-z,0-9 without '^' symbol.
	* In case of '^' symbol it print the output with include the regex sequence.*/   
	System.out.println(a1.s1.replaceAll("[^A-Z]",""));
	System.out.println(a1.s1.replaceAll("[a-z]", ""));
	System.out.println(a1.s1.replaceAll("[A-Z, a-z,0-9]",""));
	System.out.println(a1.s1.replaceAll("[0-9]", ""));

	}

}
