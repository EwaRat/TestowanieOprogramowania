import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class CalcAppTest {  //klikajac tu start uruchomi testy wszystkie z tej klasy

    private CalcApp calcApp;

    @BeforeEach  //tag zeby wszedzie w kazdym tescie robilo dana rzecz-tu tworzylo obiekt
    void setUp() {
        calcApp=new CalcApp();

    }

    //pierwszy test
    //@Test // to pojawi sie samo - gdy utworzymy automatycznie -kliknac na nazwe funkci w klasie,nie w tescie)
    // ctrl+shift+T - utworzy test

    @ParameterizedTest  //test sparametryzowany
    @ValueSource(doubles={-1,0,1,8,10,100})  //wykona 6 testow-tylko 1 przejdzie pozytywnie - ten co ma 8
    void addValues(double expected) {

        //double expected=8; //przyjeta wartosc do 1 scenariusza testowego //gdy zmieniamy test na parametr
        double actual = calcApp.addValues(3,5); //wywolanie metody addValues po . ; actual o obecna wartosc

        assertEquals(expected,actual); //zdefiniowanie assercji
        //assertNotNull(actual); - to mozna tez spr czy nie jest nullem
        //assertTrue(expected==actual);


        }
        @Test // dodany tag - bez tego nie ruszy
        //drugi test - utworzony recznie
        void addvaluesToZero() {

        double expected =10;
        double actual=calcApp.addValues(0,10);
        assertEquals(                                           //mozna tak rozbic na 3 wiersze
                expected,                                      //dodana wiadomosc - jesli bedzie blad pojawi sie ona
                actual,
                "---Added values are not as expected"); //message pojawi sie samo, zaczac pisac po actual,".."

        }

        @Test
        void isLessThanTen() {
        boolean result= calcApp.isLessThanTen(7);
        assertTrue(result);
        //lub mozna tak:
        // assertTrue(calcApp.isLessThanTen(7)

        }


    }
