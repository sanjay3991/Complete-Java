package newlaptop;

import java.util.Scanner;

public class Throw_Exception {
	public void getvalidation(int age) {
		
		try {
			if(age<18) {
				throw new Exception("The age is not valid");
			}
			else {
				System.out.println("the age is valid");
			}
			
		} catch (Exception e) {
		System.out.println(e);
		validation();
		}
	}
		public void validation() {
			
			System.out.println("not valid age");
		
	}
public static void main(String[] args) {
	Throw_Exception ob=new  Throw_Exception();
	Scanner sc=new Scanner(System.in);
	ob.getvalidation(sc.nextInt());
}
}
