package newlaptop;
interface RBI {
	
	public int bankrate();
	public String bankname();
	public int reporate();
}
class Axis implements RBI {

	@Override
	public int bankrate() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public String bankname() {
		// TODO Auto-generated method stub
		return "union";
	}

	@Override
	public int reporate() {
		// TODO Auto-generated method stub
		return 20;
	}
	
}
public class Interface_demo {
	public static void main(String[] args) {
		Axis ob=new Axis();
		System.out.println(ob.bankname());
		System.out.println(ob.bankrate());
		System.out.println(ob.reporate());
				
	}

}
