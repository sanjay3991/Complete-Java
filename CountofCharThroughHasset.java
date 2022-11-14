package newlaptop;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class CountofCharThroughHasset {

	public void getdata(String input) {
		LinkedHashSet<Character>hs=new LinkedHashSet<Character>();
		char[] c=input.toCharArray();
		for(int i=0;i<c.length;i++) {
			hs.add(c[i]);
		}
		for(Character dd:hs) {
			int count=0;
			for(char dd1:c) { 
				if(dd==dd1) {
					count++;
				}
				
			}
			System.out.println(dd+" = "+count);
		}
		
	}
	public static void main(String[] args) {
		CountofCharThroughHasset ob=new CountofCharThroughHasset();
		Scanner sc=new Scanner(System.in);
		ob.getdata(sc.next());

	}

}
