package newlaptop;

public class StaticBlock_Demo {
public StaticBlock_Demo() {
	System.out.println("i am so sorry that i am on second place");
}
public void getdata() {
	
	int a=0;
	System.out.println("i am a method and i invoked after constructor even i am on first place");
	
}

static {
	
	System.out.println("i am static and i invoked before the main class");
}
public static void main(String[] args) {
	StaticBlock_Demo ob=new StaticBlock_Demo();
	ob.getdata();
}
}
