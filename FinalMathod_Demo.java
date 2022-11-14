package newlaptop;
class Top {
	final public void getdata1() {  //can not override but can access
		System.out.println("this is a parent class");
	}
}
public class FinalMathod_Demo extends Top{
public void getdata() {
	System.out.println("this is main class finalmethod");
}
public static void main(String[] args) {
	FinalMathod_Demo ob=new FinalMathod_Demo();
	ob.getdata();
	ob.getdata1();
}
}
