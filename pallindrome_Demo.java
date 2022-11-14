package newlaptop;

import java.util.Scanner;

public class pallindrome_Demo {
public void getdetails(int a) {
	int temp=a;
	int rev=0;
	while(a>0) {
		int rem=a%10;
		rev=rev*10+rem;
		a=a/10;
		
		
	}
	if(rev==temp) {
		
		System.out.println("The given no is palindrome");
		
	}
	else {
	System.out.println("The given no is not palindrome");	
	}
	
	}


	public static void main(String[] args) {
		pallindrome_Demo ob=new pallindrome_Demo();
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		ob.getdetails(a);

	}

}
