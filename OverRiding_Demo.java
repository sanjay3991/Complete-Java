package newlaptop;

import java.util.Scanner;

class Congress {
	
	public float gst(float input) {
		float gst=(input*5)/100;
		return gst;
	}
}
class  Bjp extends Congress {
	public float gst(float input) {
		
		float gst=(input*18)/100;
		return gst;
	}
	
	
}
public class OverRiding_Demo extends Bjp {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Bjp ob=new Bjp();
	float input=sc.nextFloat();
	float output=ob.gst(input);
	System.out.println(output);
}
}
