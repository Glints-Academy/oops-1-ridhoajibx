
class Student extends Person {
    int numCourse = 0;
    int[] grades = new int[1];
    String[] courses = new String[1];

    public Student(String name, String address) {
        super(name, address);
        this.name = name;
        this.address = address;
        System.out.println("Student name is: " + name + ", Address: " + address);
    }

    public void addCourseGrades(String course, int grade) {
        grades[0] = grade;
        courses[0] = course;
        System.out.println(this.name + " has a " + course + " class at grades " + grade);

    }

    public void printGrade() {
        if (grades.length > 0) {
            for (int i = 0; i < grades.length; i++) {
                System.out.println(grades[i]);
            }
        } else {
            System.out.println("Student dont have any grades!");
        }
    }

    public void getAverageGrade() {
        double total = 0, avg;

        for (int i = 0; i < 1; i++) {
            total = total + grades[i];
        }
        // Calculating average here
        avg = total / grades.length;
        System.out.print("The student Grade is: ");
        if (avg >= 8) {
            System.out.println("A");
        } else if (avg >= 6 && avg < 8) {
            System.out.println("B");
        } else if (avg >= 4 && avg < 6) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
