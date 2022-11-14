package newlaptop;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashTable_Demo {
public static void getdata() {
	
	Hashtable<Integer, String>hs=new Hashtable<Integer, String>();
	hs.put(1, "sanjay");
	hs.put(2, "anurag");
	Set<Entry<Integer,String>>set=hs.entrySet();
	for(Entry<Integer,String> dd:set) {
		
		System.out.println(dd.getKey()+" "+dd.getValue());
	}
}
	public static void main(String[] args) {
		getdata();

	}

}
