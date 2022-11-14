package newlaptop;

import java.util.Scanner;

public class Armstrong_demo {

	public void getdetails(int n) {
		int arm=0;
		int temp=n;
		while (n>0) {
			
			int rev=n%10;
		    arm=arm+rev*rev*rev;
		    n=n/10;
		}
		if (temp==arm) {
			
			System.out.println("the given no is armstrong");
		}
		else {
			System.out.println("the given no is not armstrong");
		}
	}
	public static void main(String[] args) {
		Armstrong_demo ob=new Armstrong_demo();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ob.getdetails(n);

	}

}
