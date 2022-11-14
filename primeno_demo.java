package newlaptop;

import java.util.Scanner;

public class primeno_demo {

	public static void main(String[] args) {
		primeno_demo ob=new primeno_demo();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if (n==0 || n==1) {
			System.out.println("the given no is not prime");
			return;
		}
		else {
			
			for (int i=2;i<n;i++) {
				
				if (n%i==0) {
					
					System.out.println("the given no is not prime");
					return;
				}
			}
			System.out.println("the given no is prime");
		}
		
	}

}
