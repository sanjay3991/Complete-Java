package newlaptop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws_Demo {
	public void getdata() throws InterruptedException, FileNotFoundException  {
		
		System.out.println("i am sanjay");
		System.out.println(0);
		Thread.sleep(1000);
		System.out.println(1);
		Thread.sleep(1000);
		System.out.println(2);
		Thread.sleep(1000);
		System.out.println(3);
		Thread.sleep(1000);
		System.out.println(4);
		Thread.sleep(1000);
		System.out.println(5);
		System.out.println("i am chauhan");
		FileInputStream fis=new FileInputStream("");
	}
	public static void main(String[] args) throws InterruptedException , FileNotFoundException{
		Throws_Demo ob=new Throws_Demo();
		ob.getdata();
	}

}
