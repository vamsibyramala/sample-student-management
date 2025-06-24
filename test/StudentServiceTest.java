import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentServiceTest {
    @Test
    public void testAddStudent() {
        StudentService service = new StudentService();
        service.addStudent("Alice", 20);
        assertEquals(1, service.students.size()); // Intentional error to show private access
    }
}
