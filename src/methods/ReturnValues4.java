package methods;
import java.util.Scanner;
public class ReturnValues4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int phy, chem, bio, maths, eng, tot, avg;
		System.out.println("Enter marks of Physics , Chemistry,Biology, Mathematics, English ");
		phy = sc.nextInt();
		chem = sc.nextInt();
		bio = sc.nextInt();
		maths = sc.nextInt();
		eng = sc.nextInt();
		tot = total(phy, chem, bio, maths, eng);
		System.out.println("total of mars of five subjects are " + tot);
		avg = average(tot);
		System.out.println("average of the subjects are" +avg);
		sc.close();
	}
	public static int total(int a, int b,int c, int d, int e)
	{
		int t = a + b+ c + d + e;
		return t;
	}
	public static int average(int x)
	{
		int a = x / 5;
		return a;
	}
	}

