public class exercise8 {
    public static void main (String[] args){
        int a = 123;
        int b = 526;

        System.out.println("Eredeti felállás:");

        System.out.println(a);
        System.out.println(b);

        System.out.println("Csere után:");

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }
}