package newlaptop;

import java.util.Scanner;

public class GenericPrimeno_Demo {
	public void getdetails(int num) {
		int len=num;
		int count=0;
		while (len>0) {
			count++;
			len=len/10;
		}
		int temp=num;
		int arm=0;
		while(num>0) {
			
			int rev=num%10;
			int power=1;
			for (int i=0;i<count;i++) {
				
				power=power*rev;
			}
			arm=arm+power;
			num=num/10;
			
		}
		if (arm==temp) {
			
			System.out.println("The given no is Armstrong");
		}
		else {
			
			System.out.println("The given no is not Armstrong");
		}
		}
		
	
	public static void main(String[] args) {
		GenericPrimeno_Demo ob=new GenericPrimeno_Demo();
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		ob.getdetails(num);
	}

}
