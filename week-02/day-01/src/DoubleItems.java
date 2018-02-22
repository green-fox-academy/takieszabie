// - Create an array variable named `ag`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array

import sun.plugin.javascript.navig.Array;

import java.util.Arrays;

public class DoubleItems {
    public static void main(String[] args) {
        int[] ag = {3,4,5,6,7};
        int multiplyElement = 2;

        System.out.println("Before doubling: "+Arrays.toString(ag));

        for (int i = 0; i < ag.length ; i++) {
            ag[i]= ag[i]*multiplyElement;
        }

        System.out.println("After doubling: "+Arrays.toString(ag));
    }
}