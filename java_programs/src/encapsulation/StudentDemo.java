package encapsulation;

public class StudentDemo {

	public static void main(String[] args) {
		Student s=new Student();
		s.setSid(101);
		s.setSname("Rajan");
		s.setAvg(97.5f);
		
		System.out.println("Student id:"+s.getSid());
		System.out.println("Student name:"+s.getSname());
		System.out.println("Student Average:"+s.getAvg());
		
		System.out.println(s); // invoke the object
		
		Student s1=new Student();
		s1.setSid(7);
		s1.setSname("Dhoni");
		s1.setAvg(100.0f);
		
		System.out.println(s1);
		
		

	}

}
