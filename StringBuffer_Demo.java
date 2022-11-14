package newlaptop;

public class StringBuffer_Demo {
	
	public static void main(String[] args) {
		
		
		StringBuffer sf=new StringBuffer("java");
		StringBuilder sb=new StringBuilder("java");
		
		long start=System.currentTimeMillis();
		for(int i=0;i<1000000;i++) {
			
			sf.append("demo");
			
		}
		long end=System.currentTimeMillis();
		
		System.out.println("Time required by StringBuffer is  "+(end-start)+" m/s");
		
		
		long start1=System.currentTimeMillis();
		for(int i=0;i<1000000;i++) {
			
			sb.append("demo");
			
		}
		long end1=System.currentTimeMillis();
		
		System.out.println("Time required by StringBuilder is  "+(end1-start1)+"m/s");

	}
	

}
