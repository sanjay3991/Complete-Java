package newlaptop;

import java.util.Scanner;

public class DigitofCount {
public void getdigitsum(String input) {
	
	char[] c=input.toCharArray();
	int sum=0;
	for (int i=0;i<c.length;i++) {
		
		if(Character.isDigit(c[i])) {
			String s=Character.toString(c[i]);
			int num =Integer.parseInt(s);
			sum=sum+num;
		}
		
	}
	System.out.println("sum of digit is"+sum);
	
}
	public static void main(String[] args) {
		DigitofCount ob=new DigitofCount();
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		ob.getdigitsum(input);

	}

}
