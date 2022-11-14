package newlaptop;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListComparision_Demo {
	public void getdata(ArrayList<String>li,ArrayList<String>li1) {
		try {
			for(int i=0;i<li.size();i++) {
				if(li.get(i).equals(li1.get(i)))
						{
					System.out.println(li.get(i)+" Match");
				}
				else {
					System.out.println(li.get(i)+" Not Match");
				}
			}
		} catch (Exception e) {
			System.out.println("invalid input");
		}
	}
	public void getdata1(ArrayList<String>li,ArrayList<String>li1) {
		
		try {
		for(String dd:li) {
			for(String dd1:li1) {
				if (dd.equals(dd1)){
					System.out.println(dd+" for Match");
				}
				else {
					System.out.println(dd+"  for Not Match");
				}
				li1.remove(0);
				break;
			}
		}	
		} catch (Exception e) {

		}
	}
public static void main(String[] args) {
	ArrayListComparision_Demo ob=new ArrayListComparision_Demo();
	Scanner sc=new Scanner(System.in);
	ArrayList<String>li=new ArrayList<String>();
	ArrayList<String>li1=new ArrayList<String>();
	System.out.println("please enter 5 values of Array List 1 ");
	for(int i=0;i<5;i++) {
		li.add(sc.next());
	}
	System.out.println("please enter 5 values of Array List 2");
	for(int i=0;i<5;i++) {
		li1.add(sc.next());
	}
	ob.getdata(li,li1);
	ob.getdata1(li,li1);
}
}
