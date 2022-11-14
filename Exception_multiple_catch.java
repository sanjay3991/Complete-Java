package newlaptop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_multiple_catch {
	public void aa() {
		System.out.println("hello this is aa method");
		
	}
	public void bb() {
		try {
			Scanner sc=new Scanner(System.in);
			int div=sc.nextInt()/sc.nextInt();
			System.out.println(div);
			cc();
		} catch (ArithmeticException e) {
			e.printStackTrace();
			bb();
			
		}
		catch (InputMismatchException ex) {
			ex.printStackTrace();
			cc();
		}
		
	}
	public void cc() {
		System.out.println("this is a cc method");
		
	}
public static void main(String[] args) {
	Exception_multiple_catch ob=new Exception_multiple_catch();
	ob.aa();
	ob.bb();
}
}
