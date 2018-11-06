public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        a += 10;
        // make the "a" variable's value bigger by 10

        System.out.println(a);

        int b = 100;
        b -= 7;
        // make b smaller by 7

        System.out.println(b);

        int c = 44;
        c *= 2;
        // please double c's value

        System.out.println(c);

        int d = 125;
        d /= 5;
        // please divide by 5 d's value

        System.out.println(d);

        int e = 8;
        e *= e *= e;
        // please cube of e's value

        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)
        System.out.println("tell if f1 is bigger than f2 (print as a boolean)");
        if (f1 > f2) {
            System.out.println(f1 > f2);
        } else {
            System.out.println(f1 > f2);
        }

        boolean f1Biggerf2 = f1 > f2;
        System.out.println(f1Biggerf2);

        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        if (g1 > g2) {
            System.out.println(g1 > g2);
        } else {
            System.out.println(g1 > g2);
        }

        boolean g1Biggerg2 = g1 > g2;
        System.out.println(g1Biggerg2);

        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)

        boolean isDivisibleBy11 = h % 11 == 0;

        System.out.println(isDivisibleBy11);

        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)

        boolean i1Cubedi2 = (i1 > (i2 * i2)) && (i1 < (i2 * i2 * i2));
        System.out.println(i1Cubedi2);

        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)

        boolean jDividableBy3or5 = (j % 3 == 0) || (j % 5 == 0);
        System.out.println(jDividableBy3or5);

        String k = "Apple";
        //fill the k variable with its content 4 times
        for (int i = 1; i < 3; i++) {
            k += k;
        }
        System.out.println(k);


    }
}
