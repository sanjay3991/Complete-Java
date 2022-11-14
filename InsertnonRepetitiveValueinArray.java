package newlaptop;

import java.util.Scanner;

public class InsertnonRepetitiveValueinArray {
	
	
	public static void main(String[] args) {
		InsertnonRepetitiveValueinArray ob=new InsertnonRepetitiveValueinArray();
		Scanner sc=new Scanner(System.in);
		int []a=new int[5];
		
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
			for (int j=0;j<i;j++) {
				
				if(a[i]==a[j]) {
					System.out.println("The no is already exist \n insert another no");
					i--;
				}
				
			}
			
		}
		System.out.println("The value you entered");
		for(int p=0;p<5;p++) {
			System.out.print(a[p]+" ");
		}
		
}
}
