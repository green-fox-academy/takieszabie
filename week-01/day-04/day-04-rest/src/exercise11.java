public class exercise11 {
    public static void main(String[] args) {
        int a =3;
        a += 10;

        System.out.println(a);

        int b =100;
        b -= 7;

        System.out.println(b);

        int c = 44;
        c *= 2;

        System.out.println(c);

        int d = 125;
        d /= 5;

        System.out.println(d);

        int e = 8;
        double cube = Math.pow(e, 3);

        System.out.println(cube);

        int e2 = 8;
        e2 *= e2 * e2;

        System.out.println(e2);

        int f1 = 123;
        int f2 = 345;
        boolean whichIsBigger = f1 > f2;

        System.out.println(whichIsBigger);

        int g1 = 350;
        int g2 = 200;
        boolean isDoubleG2Bigger = (g1 < (g2 *= 2));

        System.out.println(isDoubleG2Bigger);

        int h = 135798745;
        int h1 = 11;
        boolean eleven = ((h % h1) == 0);

        System.out.println(eleven);

    }
}
