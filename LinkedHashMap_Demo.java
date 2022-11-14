package newlaptop;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap_Demo {
public static void getdata() {
	
	LinkedHashMap<Integer, String>lm=new LinkedHashMap<>();
	lm.put(101,"sanjay");
	lm.put(102,"vikash");
	lm.put(103,"sourabh");
	lm.put(103,"vivke");
	lm.put(104,"shivam");
	lm.put(105,"anurag");
	lm.put(null,"badshah");
	lm.put(null,"honey singh");
	Set<Entry<Integer,String>>set=lm.entrySet();
	Iterator<Entry<Integer,String>>itr=set.iterator();
	while(itr.hasNext()) {
		Entry<Integer,String>entry=itr.next();
		System.out.println(entry.getKey()+" = "+entry.getValue());
	}
}
	public static void main(String[] args) {
getdata();		

	}

}
