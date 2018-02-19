//      Create an array variable named `t`
//      with the following content: `[1, 2, 3, 4, 5]`
//      Increment the third element
//      Print the third element

import java.lang.reflect.Array;
import java.util.Arrays;

public class IncrementElement {
    public static void main(String[] args){
        int[] t = {1,2,3,4,5};
        int noOfElement = 3;
        int addToElement = 1;
        int printElementNumber = (noOfElement - 1);

        System.out.println("Before change: " + Integer.toString(t[printElementNumber]));
        System.out.println("Before change: " + Arrays.toString(t));

        for (int i = 0; i < t.length; i++) {
            if(t[i] == noOfElement){
                t[i] = (t[i] + addToElement);
            }

        }
        System.out.println("After change: "+ Integer.toString(t[printElementNumber]));
        System.out.println("After change: " + Arrays.toString(t));
    }
}