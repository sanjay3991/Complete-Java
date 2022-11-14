package newlaptop;
abstract class Cardemo {
	
	public int getwheel() {
		return 4;
	}
	abstract public String carcolour();
	abstract public int seatno();
		
}
class Maruti extends Cardemo  {

	@Override
	public String carcolour() {
		// TODO Auto-generated method stub
		return "White";
	}

	@Override
	public int seatno() {
		// TODO Auto-generated method stub
		return 7;
	}
	
}
class Hyundai extends Cardemo {

	@Override
	public String carcolour() {
		// TODO Auto-generated method stub
		return "Silver";
	}

	@Override
	public int seatno() {
		// TODO Auto-generated method stub
		return 4;
	}
	
}
public class Abstract_Demo {
	public static void main(String[] args) {
		Maruti ob =new Maruti();
		System.out.println("description of Maruti Altros");
		System.out.println("no of wheel is "+ob.getwheel());
		System.out.println("colour of vehicle is "+ob.carcolour());
		System.out.println("no of seats "+ob.seatno());
		
		System.out.println();
		System.out.println();
		
		Hyundai ob1=new Hyundai();
		System.out.println("description of Hundai alkazar");
		System.out.println("no of wheel is "+ob1.getwheel());
		System.out.println("colour of vehicle is "+ob1.carcolour());
		System.out.println("no of seats "+ob1.seatno());
		
	}

}
