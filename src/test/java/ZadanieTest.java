import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.*;

class ZadanieTest {

    Zadanie zadanie=new Zadanie();
    @ParameterizedTest //test z parametrami
    @CsvSource(value= {  //tu podanie poszczegolnych wartosci - 3 wartosci ten tag
            "11:12:-1",  //11- to val1, 12-to val2, -1 to expected
            "33:12:21",
            "100:-100:0"
    }, delimiter =':')  //tu podane czym te wartosci w stringu sa odzielone
    //funkcja wykona sie tyle razy ile bedziemy mieli wierszy

    void subtvalues(double val1, double val2, double expected) {
        assertEquals(expected,
                zadanie.subtValues(val1,val2));

        double actual =zadanie.subtValues(30,19);

        assertEquals(10,5 );

    }

    @Test
    void inNotNull() {
        Zadanie zadanie=new Zadanie();

        assertNotNull(zadanie.subtValues(1.0,-1.0)); //wazne!!

    }

    @Test
    void subtValuesNotthrow() { //rzutowanie obiektu jako funkcje
        Zadanie zadanie=new Zadanie();

        assertDoesNotThrow(()->zadanie.subtValues(1.0,-1.0));  //operator lambda - rzutuje wyrazenie na funkcje
    }

    @Test
    void subtValuesGraterThanZero() {
        Zadanie zadanie=new Zadanie();
        assertThat(zadanie.subtValues(13, 11))  //ta asercja- mozemy wiele rzeczy sprawdzic w 1 asercji
                .isGreaterThan(0)
                .isLessThan(5)
                .isEqualTo(2);
        //lub:
       // assertTrue(zadanie.subtValues(9,11)>0,"Substraction result is less than 0");

    }




}