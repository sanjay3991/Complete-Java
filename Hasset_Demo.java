package newlaptop;

import java.util.HashSet;
import java.util.Scanner;

public class Hasset_Demo {
	public static void getdata() {
		Scanner sc=new Scanner(System.in);
		HashSet<String>hs=new HashSet<>();
		for(int i=0;i<5;i++) {
			hs.add(sc.next());
		}
		
		for(String dd:hs) {
			System.out.println("after adding elements "+dd);
		}
	}
public static void main(String[] args) {
	getdata();
}
}
