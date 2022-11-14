package newlaptop;

import java.util.Scanner;

public class Exception_Demo_impact {
	public void a( ) {
		System.out.println("this is class A");
	}
	public void b() {
	try {
		Scanner sc=new Scanner(System.in);
		int div=sc.nextInt()/sc.nextInt();
		System.out.println(div);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	public void c() {
		System.out.println("I am running c");
	}
	
	public static void main(String[] args) {
		Exception_Demo_impact ob=new Exception_Demo_impact();
		ob.a();
		ob.b();
		ob.c();
	}

}
