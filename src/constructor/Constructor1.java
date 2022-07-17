package constructor;

class Box {
	int l, b, h, vol;
	Box() {
		 l = 7;
		 b = 5;
		 h = 10;
	}
	Box(int x, int y, int z){
		l = x;
		b= y;
		h = z;
	}
	void display () {
		System.out.println("Length of the box is = "+l);
		System.out.println("Breadth of the box is = "+b);
		System.out.println("Height of the box is = "+h);
	}
	void volume() {
		vol = l * b* h;
		System.out.println("Volume of the box is = "+vol);
	}
}
public class Constructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1 = new Box();
		Box b2 = new Box(10,15,20);
		b1.display();
		b1.volume();
		
		b2.display();
		b2.volume();

	}

}
