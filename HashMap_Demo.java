package newlaptop;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMap_Demo {
public static void getdata() {
	Scanner sc=new Scanner(System.in);
	HashMap<Integer, String>map=new HashMap<Integer, String>();
	map.put(101, "sanjay");
	map.put(102, "tarun");
	map.put(103, "vishal");
	map.put(101, "subham");
	map.put(105, "vivek");
	map.put(106, "akash");
	Set<Entry<Integer,String>>set=map.entrySet();
	for(Entry<Integer,String> dd:set) {
		
		System.out.println("keys "+ dd.getKey()+" values "+dd.getValue());
	}
}
	public static void main(String[] args) {
		getdata();

	}

}
