// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`

import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args) {
        String[] abc = {"first", "second", "third"};
        int firstElementToSwap = 0;
        int secondElementToSwap =2;
        int numberOfElements = abc.length;

        System.out.println("Original content: " + Arrays.toString(abc));
        System.out.println(numberOfElements);
        String temp = abc[firstElementToSwap];

        for (int i = 0; i < numberOfElements; i++) {
            if (i==firstElementToSwap){
                abc[i] = abc[i+secondElementToSwap];
            }
            else if (i==secondElementToSwap){
                abc[i]= temp;
            }
        }
        System.out.println("Modified content" + Arrays.toString(abc));
    }
}