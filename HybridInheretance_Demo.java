package newlaptop;
class AB {
	public void a(){
		System.out.println("this is AB Class");
	}
}

class BC extends AB {
	public void b() {
		System.out.println("This is BC class");
	}
}

class CD extends AB {
	
	public void c() {
		System.out.println("This is CD class");
	}
}
public class HybridInheretance_Demo extends CD {
	public void mainclass() {
		System.out.println("This is main class Hybridinheretance");
	}
public static void main(String[] args) {
	HybridInheretance_Demo ob=new HybridInheretance_Demo();
	ob.mainclass();
	ob.c();
	ob.a();
	
	CD ob1=new CD();
	 ob1.c();
	 ob1.a();
	BC ob3=new BC();
	ob3.b();
	ob3.a();
}
}
