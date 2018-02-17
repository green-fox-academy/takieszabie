public class exercise27 {
    public static void main(String[] args){
        for (int a=1 ; a < 100; a++) {
            boolean harom = ((a % 3) == 0);
            boolean ot = ((a % 5) == 0);
            if (harom == true && ot == true){
                System.out.println("FizzBuzz");}

                else if (harom == true) {
                    System.out.println("Fizz");}

                else if (ot == true) {
                System.out.println("Buzz");}

                else {
                System.out.println(a);
            }

        }
    }
}
