package newlaptop;

public class ThisDemo {
	int a=0;
	
	public ThisDemo(int a) {
		System.out.println("Global value of a is "+this.a);	
		this.a=a;
	}
	public void getdata() {
		System.out.println("now we have changed the global value\n through this keyword which is "+a);
	}
	public static void main(String[] args) {
		ThisDemo ob=new ThisDemo(12);
		ob.getdata();
	}

}
