package newlaptop;
class PQRS {
	public PQRS(int a) {
	 System.out.println("this is parent class PQRS"+a);
	}
}
public class SuperClassConstructor_Demo extends PQRS {
	public SuperClassConstructor_Demo(int a) {
		
		super(a*a);
	System.out.println("this is child class"+a);
	}
	public static void main(String[] args) {
		SuperClassConstructor_Demo ob=new SuperClassConstructor_Demo(32);
		
	}

}
