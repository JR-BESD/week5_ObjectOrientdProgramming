package videos;

public class Classes {
	public static void main(String[] args) {
		
		StringBuilder/*Class*/ name/*Object*/ = new StringBuilder();
		StringBuilder name2 = new StringBuilder();
						
//		Student student1 = new Student();
//		student1.firstName = "Tom";
//		student1.lastName = "Smith";
//		student1.gradeLevel = 12;
//		student1.phoneNumber = "555-123-4567";
				
//		student1.introduce();
		
		Student student2 = new Student("Sammy", "Jones");
		student2.introduce();
		
		Student student3 = new Student("Tom", "Riddle", "555-987-6541", 11);
		student3.introduce();
		
	}
}