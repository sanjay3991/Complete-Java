package newlaptop;

public class Constructor_Demo {
	public Constructor_Demo(int a) {
	System.out.println("this the constructor"+a);
	}
	public void getdata() {
		
		System.out.println("this is a method");
	}
	
	public static void main(String[] args) {
		Constructor_Demo ob=new Constructor_Demo(12);
		ob.getdata();
	}

}
