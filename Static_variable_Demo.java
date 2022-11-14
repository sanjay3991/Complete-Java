package newlaptop;

public class Static_variable_Demo {
	static int a=0;
	public Static_variable_Demo() {
		a++;
		System.out.println(a);
	}
	public void getdata() {
		a++;
		System.out.println(a);
	}
	public static void main(String[] args) {
		Static_variable_Demo ob=new Static_variable_Demo();
		Static_variable_Demo ob1=new Static_variable_Demo();
		Static_variable_Demo ob2=new Static_variable_Demo();
		ob.getdata();
		ob1.getdata();
		ob2.getdata();
	}
}
