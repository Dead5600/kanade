package constructor;
class Department{
	int id, tot;
	String name;
	Department(int id, int tot, String name){
		this.id = id;
		this.tot =tot;
		this.name = name;
	}
	void show(){
		System.out.println("Department id is = "+id);
		System.out.println("total employee = "+tot);
		System.out.println("name of the employee = "+name);
	}
}
public class Constructor4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Department D1 = new Department(10, 20,"ass");
		D1.show();
		
		Department D2 = new Department(30,40,"asad");
		D2.show();
	}

}
