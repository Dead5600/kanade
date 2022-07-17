package methods;
import java.util.Scanner;
public class ReturnValues3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int l, b, h, vol;
		System.out.println("Enter Length , Breadth, Height ");
		l = sc.nextInt();
		b = sc.nextInt();
		h = sc.nextInt();
		
		vol = volume(l, b, h);
		System.out.println("Volume of the box is" +vol);
	sc.close();	
	}

	public static int volume (int x, int y, int z)
	{
		int v = x * y * z;
		return v;
	}		
	
}
