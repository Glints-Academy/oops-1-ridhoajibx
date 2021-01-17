public class Person {
	String name;
	String address;
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public static void main(String[] args) {
		Person person = new Person("Alvian", "TPU");
        System.out.println(person.toString());
		person.getName();
        person.getAddress();
		
		Student student = new Student("Jumakri Ridho Fauzi", "Nongsa");
        System.out.println(student.toString());
		student.addCourseGrades("Java", 8);
        student.printGrade();
        student.getAverageGrade();
		
        Teacher teacher = new Teacher("Alhafiz Putra", "Batam");
        System.out.println(teacher.toString());
        teacher.addCourse("Java");
        teacher.removeCourse("React JS");
	}
	
	public void getName() {
		System.out.println("Person name is: " + name);
	}
	
	public void getAddress() {
		System.out.println("Person live in : " + address);
    }
    
    public String toString () {
		return "Person: " + name +" live in "+ address;
	}
}