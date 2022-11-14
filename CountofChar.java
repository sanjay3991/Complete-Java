package newlaptop;

import java.util.Scanner;

public class CountofChar {
 public void getdata(String input) {
	 
	 char[] c=input.toCharArray();
	 for(int i=0;i<input.length();i++) {
		 int count=0;
		 for(int j=0;j<input.length();j++) {
		 if(c[i]==c[j]) {
			 
			 count++;
			 
		 }
		 }
		 System.out.println(c[i]+"="+count);
		  
	 }
 }
	public static void main(String[] args) {
		CountofChar ob=new CountofChar();
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		ob.getdata(input);
	}

}
