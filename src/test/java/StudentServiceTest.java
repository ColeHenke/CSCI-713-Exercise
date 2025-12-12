import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @Test
    void testAddStudentAndTopStudent() {
        StudentService service = new StudentService();
        Student s1 = new Student("Alice", 20, 3.5);
        Student s2 = new Student("Bob", 22, 3.9);

        service.addStudent(s1);
        service.addStudent(s2);

        // Test if top student is correctly identified
        Student top = service.getTopStudent();
        assertEquals("Bob", top.getName());
    }

    @Test
    void testCalculateAverageGpa() {
        StudentService service = new StudentService();
        service.addStudent(new Student("Alice", 20, 3.5));
        service.addStudent(new Student("Bob", 22, 3.5));

        double avg = service.calculateAverageGpa();
        assertEquals(3.5, avg, 0.001);
    }

    @Test
    void testCalculateAverageGpa_noStudents() {
        StudentService service = new StudentService();

        double avg = service.calculateAverageGpa();
        assertEquals(0.0, avg);
    }

    // Normal case
    @Test
    void testRemoveStudentByName() {
        // Arrange
        StudentService service = new StudentService();
        Student s1 = new Student("Alice", 20, 3.5);
        Student s2 = new Student("Bob", 22, 3.9);
        service.addStudent(s1);
        service.addStudent(s2);

        // Act + Assert
        assertDoesNotThrow(() -> service.removeStudentByName("AnyName"));
        assertEquals("Bob", service.getTopStudent().getName());
    }

    // Empty list
    @Test
    void testRemoveStudentByName_nameNotInArray() {
        // Arrange
        StudentService service = new StudentService();
        Student s1 = new Student("Bob", 22, 3.9);
        service.addStudent(s1);

        // Assert
        service.removeStudentByName("Alice");

        // Assert
        assertEquals("Bob", service.getTopStudent().getName());
    }

    @Test
    void testRemoveStudentByName_duplicateName() {
        // Arrange
        StudentService service = new StudentService();
        Student s1 = new Student("Bob", 22, 3.8);
        Student s2 = new Student("Bob", 21, 3.9);
        service.addStudent(s1);
        service.addStudent(s2);

        // Act
        service.removeStudentByName("Bob");

        // Assert
        assertEquals(3.9, service.getTopStudent().getGpa());
    }

    @Test
    void testRemoveStudentByName_emptyArray() {
        // Arrange
        StudentService service = new StudentService();

        // Act + Assert
        assertDoesNotThrow(() -> service.removeStudentByName("AnyName"));
    }

    // Intentionally leave out tests for:
    // - removeStudentByName
    // - behavior with empty student list
    // - Utils methods
}
