package newlaptop;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList_Demo {
	public static void getdata() {
		try {
			LinkedList<String>li=new LinkedList<>();
			li.add("sanjay");
			li.add("ajay");
			li.add("vjay");
			li.add("sourabh");
			li.add("vivek");
			li.add("arun");
//			
//			for (String dd:li) {
//				System.out.println(dd);
//			}
			
			Iterator<String>itr=li.iterator();
			while(itr.hasNext()) {
				String data=itr.next();
				System.out.println(data);
				itr.remove();
				System.out.println(li);
			}
			
		} catch (Exception e) {
			System.err.println("Invalid input");
		}
		
	}
public static void main(String[] args) {
   getdata();
}
}
