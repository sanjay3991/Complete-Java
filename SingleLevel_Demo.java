package newlaptop;

import java.util.Scanner;

class Sanjay{
	
	public void showdata() {
		System.out.println("This method is under class name Sanjay");
	}
}
public class SingleLevel_Demo extends Sanjay {
	public void getdata() {
		
		System.out.println("This method is under created class");
	}
	public static void main(String[] args) {
		SingleLevel_Demo ob=new SingleLevel_Demo();
		Scanner sc=new Scanner(System.in);
		ob.getdata();
		ob.showdata();
	}

}
