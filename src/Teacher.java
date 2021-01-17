public class Teacher extends Person {
    int numCourse = 0;
    String[] courses = {"Java", "Laravel"};

    public Teacher(String name, String address) {
        super(name, address);
        this.name = name;
        this.address = address;
    }

    public boolean addCourse(String course) {
        boolean result = true; 
        for (int i = 0; i < courses.length; i++) {
            if(courses[i] == course){
                result =  false;
                System.out.println("course has been added before!");
            } else {
                courses[i] = course;
                result = true;
                System.out.println("he is teaching " + courses[i] + " class.");
            }
        }
        return result;
    }

    public boolean removeCourse(String course) {
        boolean result = true;
        
        for (int i = 0; i < courses.length; i++) {
            if(courses[i] == course){
                result =  true;
                System.out.println("course has been deleted!");
            } else {
                result = false;
                System.out.println("he hasn't " + course + " class.");
            }
        }

        return result;
    }

    public String toString () {
		return "Teacher: " + name +" live "+ address;
	}
}
