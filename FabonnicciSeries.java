package newlaptop;

import java.util.Scanner;

public class FabonnicciSeries {

	public static void main(String[] args) {
		FabonnicciSeries ob=new FabonnicciSeries();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		for (int i=0;i<n-2;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
		

	}

}
