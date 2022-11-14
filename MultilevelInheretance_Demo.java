package newlaptop;

import java.util.Scanner;
class A{
	
	public void showdata() {
		
		System.out.println("I am grandfather and my class name is A");
	}
}
class B extends A{
	public void toData() {
		
		System.out.println("I am son of class A");
	}
}
public class MultilevelInheretance_Demo extends B{
	public void getdata() {
		System.out.println("this is an example if multilevel");
		System.out.println("this method is under the created public class");
	
	}
	public static void main(String[] args) {
		MultilevelInheretance_Demo ob=new MultilevelInheretance_Demo();
		Scanner sc=new Scanner(System.in);
		ob.getdata();
		ob.showdata();
		ob.toData();
	}

}
