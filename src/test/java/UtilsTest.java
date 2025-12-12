import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UtilsTest {
    @Test
    void checkName() {
        String normalName = "Bob";

        boolean isValidName = Utils.checkName(normalName);

        assertTrue(isValidName);
    }

    @Test
    void checkName_nullInput() {
        String nullName = null;

        boolean isValidName = Utils.checkName(nullName);

        assertFalse(isValidName);
    }

    @Test
    void checkName_emptyString() {
        String emptyName = null;

        boolean isValidName = Utils.checkName(emptyName);

        assertFalse(isValidName);
    }

    @Test
    void isValidAge() {
        int normalAge = 24;

        boolean isValidAge = Utils.isValidAge(normalAge);

        assertTrue(isValidAge);
    }

    @Test
    void isValidAge_zeroAge() {
        int normalAge = 0;

        boolean isValidAge = Utils.isValidAge(normalAge);

        assertTrue(isValidAge);
    }

    @Test
    void isValidAge_negativeAge() {
        int negativeAge = -12;

        boolean isValidAge = Utils.isValidAge(negativeAge);

        assertFalse(isValidAge);
    }
}
