package newlaptop;
class Sanjay1 
{
	public void showdata() {
		System.out.println("this is parent class A");
	}
}
class Rishab extends Sanjay1 {
	public void toData() {
		System.out.println("This is child class B");
	}
	
}
public class HieraricalInheretance_Demo extends Sanjay1{
public void getdata() {
	
	System.out.println("this is hierarical class method get data");
}
public static void main(String[] args) {
	HieraricalInheretance_Demo ob=new HieraricalInheretance_Demo();
	ob.getdata();
	ob.showdata();
	
	Rishab ob1=new Rishab();
	ob1.toData();
	ob1.showdata();
}
}
