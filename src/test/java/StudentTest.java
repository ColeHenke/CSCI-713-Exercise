import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StudentTest {
    @Test
    void setAge() {
        Student student = new Student("Bob", 19, 3.5);

        student.setAge(20);

        assertEquals(20, student.age);
    }

    @Test
    void setAge_highAge() {
        Student student = new Student("Bob", 19, 3.5);

        student.setAge(220);

        assertEquals(220, student.age);
    }

    @Test
    void setAge_negativeAge() {
        Student student = new Student("Bob", 19, 3.5);

        student.setAge(-20);

        assertEquals(0, student.age);
    }

    @Test
    void setAge_zeroAge() {
        Student student = new Student("Bob", 19, 3.5);

        student.setAge(0);

        assertEquals(0, student.age);
    }
}
