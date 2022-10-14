public class Fraction {

    private int numerator;
    private int denominator;


    Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    static String simplify(int numerator, int denominator){

        int a = numerator;
        int b = denominator;

        while (a!=0 && b!=0){
            if(a>b) a %= b;
            else b &=a;

        }
        int gcd = a+b;

        return numerator/gcd + "/" + denominator/gcd;


    }



    public String div(Object obj) {
        int dNun = numerator * ((Fraction) obj).denominator;
        int dDen = denominator * ((Fraction) obj).numerator;

        return simplify(dNun, dDen);
    }

    public String sum(Object obj){
        int sNum = numerator * ((Fraction) obj).denominator + ((Fraction) obj).numerator * denominator;
        int sDen = denominator * ((Fraction) obj).denominator;

        return simplify(sNum, sDen);

    }




    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }


    @Override
    public boolean equals(Object obj){

        if(obj instanceof Fraction) {
            return numerator * ((Fraction) obj).denominator == denominator * ((Fraction) obj).numerator;
        }

        return false;
    }



    }