import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/*import static org.junit.jupiter.api.Assertions.*;

class TDD_DivTest {

    private TDD_DivTest calcDiv;

    @BeforeEach
    void setUp() {
        calcDiv = new TDD_DivTest();
    }

    @ParameterizedTest
    @CsvSource(value = {
            "2:1:2",
            "100:2:50",
            "100:-2:-50"
    }, delimiter = ':')
    void divValue(double v1, double v2, double expected) {
        try {
            assertEquals(
                    expected,
                    calcDiv.divValue(v1,v2,expected)
        } catch (Exception ex) {
            fail("Exception has been thrown");
        }
    }

    @Test
    void divValueZero() {
        assertThrows(
                Exception.class,
                () -> calcDiv.divValue(10, 0,2)
        );
    }
}
 */
