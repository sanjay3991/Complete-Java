package newlaptop;

import java.util.ArrayList;

public class ArrayList_Demo {
	public static void getdata() {
		
		try {
			System.out.println("before itteration");
			ArrayList li=new ArrayList();
			li.add("sanjay");
			li.add("tarun");
			li.add("mukesh");
			li.add("saurabh");
			li.add(1234l);
			li.add("sanjay");
			for(Object dd:li) {
				
				System.out.println(dd);
			}
			System.out.println("afeter remove mukesh");
			li.remove(2);
			for (Object dd:li) {
				System.out.println(dd);
			}
			System.out.println("after adding raju");
			li.add(3, "raju");
			for(Object dd:li) {
				
				System.out.println(dd);
			}
			System.out.println(li.get(1));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		getdata();
	}
}
