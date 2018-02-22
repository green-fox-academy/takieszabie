// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] aj = {3,4,5,6,7};
        int numberOfElements = aj.length;
        int[] temp = new int[numberOfElements];

        System.out.println("Original content of Array: " + Arrays.toString(aj));

        for (int i = 0; i < numberOfElements ; i++) {
            temp[i] = aj[numberOfElements-i-1];
        }
        aj = Arrays.copyOf(temp, numberOfElements);
        System.out.println("Modified content of Array: " + Arrays.toString(aj));
    }
}