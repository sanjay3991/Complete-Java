package newlaptop;
class ABCD{
	
	public void name() {
		System.out.println("Hello this is a class of name ABCD");
	}
}
public class SuperMethod_Demo extends ABCD {
	public void name() 
	
	{	
		super.name();
		System.out.println("this is a class name of supermethod demo");
		
	}
	public static void main(String[] args) {
		SuperClassVariable_Demo ob=new SuperClassVariable_Demo();
		ob.getdata();
		SuperMethod_Demo ob1=new SuperMethod_Demo();
		ob1.name();
	}

}
