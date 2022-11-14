package newlaptop;

public class Student_pojo {

	public static void main(String[] args) {
		Encapsulation_demo ob=new Encapsulation_demo();
		ob.setName("sanjay");
		ob.setSname("chauhan");
		ob.setCname("united");
		ob.setRollno(1234l);

		System.out.println(" first name : "+ob.getName());
		System.out.println(" Sname      : "+ob.getSname());
		System.out.println(" Cname      : "+ob.getCname());
		System.out.println(" Rollno     : "+ob.getRollno());
	}

}
