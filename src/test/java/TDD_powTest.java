import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TDD_powTest {

    private TDD_pow tdd_pow;

    @BeforeEach
        //tag zeby wszedzie w kazdym tescie robilo dana rzecz-tu tworzylo obiekt
    void setUp() {
        tdd_pow = new TDD_pow();
    }

    @ParameterizedTest
    @CsvSource (value= {
            "2:2:4",
            "1:0:1",
            "0:20:0",
            "9:1:9"
    },delimiter=':')

    void powValueDouble(double index,int power, double expected) {


        assertEquals(
                expected,
                tdd_pow.powValue(index, power));

    }

        @ParameterizedTest
        @CsvSource (value= {
                "2:-2:0.25"
        }, delimiter=':')

    void powValueMinus(double index, int power, double expected) {
        assertEquals(
                expected,
                tdd_pow.powValue(index,power));




}
}
