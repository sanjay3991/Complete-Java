package newlaptop;

import java.util.Scanner;

public class SeparatedPrimeno_demo {
	public int getcount(int a) {
		int temp=a;
		int count=0;
		while(temp>0) {
			count++;
			temp=temp/10;	
		}
		return count;
	}
	
	public void getArmstrong(int a[]){
		for(int j=0;j<a.length;j++) {
			int b=getcount(a[j]);
			int check=a[j];
			
			int sum=0;
			while(a[j]>0) {
				int power=1;
			int rem=a[j]%10;
			a[j]=a[j]/10;
			for(int k=0;k<b;k++) {
				power=power*rem;			
			}
			sum=sum+power;
			
			}
			if(sum==check) {
				System.out.println("the given no is Armstrong");
			}
			else {
				System.out.println("The given no is not armstrong");
			}
		}
		
		
		
		
	}

	public static void main(String[] args) {
		SeparatedPrimeno_demo ob=new SeparatedPrimeno_demo();
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		for (int i=0;i<5;i++) {	
			a[i]=sc.nextInt();	
		}
		ob.getArmstrong(a);

	}

}
