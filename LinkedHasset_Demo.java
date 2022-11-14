package newlaptop;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHasset_Demo 
{
	public static void getdata() {
		Scanner sc=new Scanner(System.in);
		LinkedHashSet<String>hs=new LinkedHashSet<>();
		for(int i=0;i<5;i++) {
			hs.add(sc.next());
		}
		
		System.out.println("After addind elements we got\n Linked hasset where it maintains \norder and gives only unique elements");
		for(String dd:hs) {
			System.out.println(dd);
		}
}
public static void main(String[] args) {
	getdata();
}
}
