package newlaptop;
class Tops{  //we can not use final class if we want to inherit
 	
	public void name() {
		System.out.println("this is Tops");
	}
}
public class FinalClass_Demo extends Tops{
public void name() {
	System.out.println("this is main class");
}
public static void main(String[] args) {
	FinalClass_Demo ob=new FinalClass_Demo();
	ob.name();
}
}
