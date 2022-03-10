package videos;

public class Encapsulation {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setFirstName("Sally");
		student.setPhoneNumber("5551234567");
		student.setGradeLevel(7);
		//System.out.println(student.getFirstName()); // very poor practice
		
		student.introduce();
		
		Rectangle rec = new Rectangle(10, 15);
		rec.setLength(10);
		System.out.println(rec.getArea());
		
		/*
		 * Access Modifiers:
		 * public - accessible everywhere
		 * private - onlt accessible within the same class
		 * protected - accessible within the same class, other classes in the same package, and all subclasses.
		 * no modifier - same as protected, except not accesible in a subclass in different packages.
		*/

	}

}
