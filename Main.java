public class Main {

    static int discriminant(int a, int b, int c) {
        int discriminant = (int) Math.pow(b, 2) - (4 * a * c);
        return discriminant;
    }

    static String[] massive = {"Hi", "MR", "Kacita", "the", "best", "lecturer", "yoo"};
    public static String smallest(String massive[]) {
        int index = 0, minLength = massive[0].length();

        for (int i = 1; i < massive.length; i++) {

            if (massive[i].length() < minLength) {
                index = i;
                minLength = massive[i].length();
            }
        }

        return massive[index];

    }


    public static void main(String[] args) {


        Fraction f1 = new Fraction(2, 4);
        Fraction f2 = new Fraction(3, 5);

        System.out.println("Simplifying Fraction = " + Fraction.simplify(f1.getNumerator(), f1.getDenominator()));

        System.out.println("Fraction sum = " + f1.sum(f2));
        System.out.println("Fraction Division = " + f1.div(f2));


        System.out.println("Diskriminanti = " + discriminant(4,2,6));

        System.out.println("The shortest word is " + smallest(massive));
    }

}
