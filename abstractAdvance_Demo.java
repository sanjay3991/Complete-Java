package newlaptop;
abstract class cardemoo{
	abstract public int seat();
	abstract public int wheel();
	abstract public String brand();
	abstract public int car_price();
}
abstract class carPrice extends cardemoo{
	public int car_price() {
		return 700000;
	}
}
class ignis extends carPrice {

	@Override
	public int seat() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public int wheel() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public String brand() {
		// TODO Auto-generated method stub
		return "Maruti";
	}

	
}
	

public class abstractAdvance_Demo {
public static void main(String[] args) {
	ignis ob=new ignis();
	System.out.println(ob.brand());
	System.out.println(ob.car_price());
	System.out.println(ob.seat());
	System.out.println(ob.wheel());
	
}
}
