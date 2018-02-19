public class doubling {
    public static void main(String[] args) {
// - Create an integer variable named `ak` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(ak)`
        int ak = 2;
        int result = doubler(ak);
        System.out.println(result);

        }

    public static int doubler(int toBeDoubled) {

        int doubled = toBeDoubled * 2;

        return doubled;

        }
    }