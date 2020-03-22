public class CalcApp {

    public double addValues(double val1,double val2) {

        if (val1==0) {  //gdy pierwsza wartosc=0, zastap ja wartoscia 100
            val1=100;
        }
        return val1+val2;
    }

    public boolean isLessThanTen(double val1) {
        return val1 <10;
    }
}
