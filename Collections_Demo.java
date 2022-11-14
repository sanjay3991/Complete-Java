package newlaptop;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_Demo {
public static void getdata() {
	try {
		ArrayList<Integer>li=new ArrayList<>();
		li.add(123);
		li.add(234);
		li.add(434);
		li.add(4234);
		li.add(234);
		li.add(5435);
		li.add(8765);
		
		System.out.println("max vlaue"+Collections.max(li));
		System.out.println("min value"+Collections.min(li));
		
		Collections.sort(li);
		for(Integer dd:li) {
			System.out.println(dd);
		}
		System.out.println();
		System.out.println();
		System.out.println("Reverse order");
		
		Collections.reverse(li);
		for(Integer dd:li) {
			System.out.println(dd);
		}
	} catch (Exception e) {
		System.err.println(e);
	}
}
	public static void main(String[] args) {
		getdata();
	}

}
