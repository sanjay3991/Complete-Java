package newlaptop;
class ABC {
	
	int a=10;
}
public class SuperClassVariable_Demo extends ABC{
	public void getdata() {
		int a=20;
		System.out.println(a);
		System.out.println(super.a);
	}
public static void main(String[] args) {
	SuperClassVariable_Demo ob=new SuperClassVariable_Demo();
	ob.getdata();
}
}
