package newlaptop;

public class Overloading_Demo {
	public void trainSearch(int train_no) {
		
		System.out.println("you have been searching train by train no");
	}
	public void trainSearch(String train_name) {
		
		System.out.println("you have been searching train by train name");
	}
	public void trainSearch(long pnr) {
		
		System.out.println("you have been searching train by pnr no");
	}
	public void trainSearch(String from ,String to) {
		System.out.println("you have been searching train from station to station");
	}
	public static void main(String[] args) {
		Overloading_Demo ob=new Overloading_Demo();
		ob.trainSearch("kanput","allahabad");
	}

}
