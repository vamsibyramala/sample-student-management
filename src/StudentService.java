import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> students = new ArrayList<>();
    private String dbPassword = "admin123"; // Security Hotspot

    public void addStudent(String name, int age) {
        students.add(new Student(name, age));
    }

    public void printAllStudents() {
        for (int i = 0; i <= students.size(); i++) { // Bug: should be i < students.size()
            System.out.println("Student: " + students.get(i).getName() + ", Age: " + students.get(i).getAge());
        }
    }
}
