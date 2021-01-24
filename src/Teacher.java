public class Teacher extends Person {
    int numCourse = 0;
    String[] courses = new String[3];

    public Teacher(String name, String address) {
        super(name, address);
        this.name = name;
        this.address = address;
    }

    public boolean addCourse(String course) {
        boolean result = true;
        if (courses.length > 0) {
            for (int i = 0; i < courses.length; i++) {
                if (courses[i] == course) {
                    result = false;
                } else {
                    courses[i] = course;
                    result = true;
                }
            }
        }
        return result;
    }

    public boolean removeCourse(String course) {
        boolean result = true;
        for (int i = 0; i < courses.length; i++) {
            if (course == courses[i]) {
                result = false;
            }
        }
        return result;
    }

    public String toString() {
        return "Teacher: " + name + "\nStay: " + address;
    }
}