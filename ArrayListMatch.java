package newlaptop;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMatch {
	
		
	
public static void main(String[] args)  {
	Scanner sc=new Scanner(System.in);
	ArrayListMatch ob=new ArrayListMatch();
	ArrayList<String> li=new ArrayList<String>();
	ArrayList<String> li1=new ArrayList<String>();
	System.out.println("Enter 5 values of first Array List");
	for(int i=0;i<5;i++) {
		li.add(sc.next());
	}
	System.out.println("Enter 5 values of second Array List");
	for(int i=0;i<5;i++) {
		li1.add(sc.next());	}
	
	for(int i=0;i<5;i++) {
		if (li.get(i).equalsIgnoreCase(li1.get(i))) {
		System.out.println(li.get(i)+" Match");
		}
		else {
			System.out.println(li.get(i)+" Not Match");
		}
	}
	
}
}
