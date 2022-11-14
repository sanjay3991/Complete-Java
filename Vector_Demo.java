package newlaptop;

import java.util.Scanner;
import java.util.Vector;

public class Vector_Demo {
	public  void getdata(Vector<String>li) {
		for(String dd:li) {
			System.out.println(dd);
		}
		li.insertElementAt("tutor", 2);
		System.out.println("after insertion");
		for(String dd:li) {
			System.out.println(dd);
		}
	}
	
public static void main(String[] args) {
	Vector_Demo ob=new Vector_Demo();
	Scanner sc=new Scanner(System.in);
Vector<String>li=new Vector<String>();
for(int i=0;i<5;i++) {
	li.addElement(sc.next());
	
}
ob.getdata(li);

}
}
