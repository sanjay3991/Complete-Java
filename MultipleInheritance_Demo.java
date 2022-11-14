package newlaptop;

import java.security.DomainCombiner;

interface raju {
	
	public int raju_percentage();
}
interface kaju {
	public int kaju_percentage();
}

class pappu {
	public void name() {
		System.out.println("bus aisehi bana diya");
	}
}
public class MultipleInheritance_Demo extends pappu implements raju,kaju {
	
	@Override
	public int kaju_percentage() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public int raju_percentage() {
		// TODO Auto-generated method stub
		return 52;
	}
		
	public static void main(String[] args) {
		
		
		MultipleInheritance_Demo ob=new MultipleInheritance_Demo();
		System.out.println(ob.kaju_percentage());
		System.out.println(ob.raju_percentage());
		ob.name();
	}
	
}
