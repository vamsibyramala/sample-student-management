public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        service.addStudent("John", 21);
        service.addStudent("Jane", 19);
        service.printAllStudents();
    }
}
