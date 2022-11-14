package newlaptop;

public class StringBufferMethods {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("java");
		System.out.println(sb);
		System.out.println(sb.append("demo"));
		System.out.println(sb.charAt(0));
		System.out.println(sb.substring(4));
		System.out.println(sb.substring(3, 5));
		System.out.println(sb.insert(4, true));
		System.out.println(sb.reverse());
	}

}
