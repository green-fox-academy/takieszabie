// Accidentally I messed up this quote from Richard Feynman.
// Two words are out of place
// Your task is to fix it by swapping the right words with code
// Create a method called quoteSwap().

// Also, print the sentence to the output with spaces in between.
// Expected output: "What I cannot create I do not understand."

import java.util.*;

public class QuoteSwap{
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
        System.out.println("Original version: " + list);
        quoteSwap(list);
    }

    private static void quoteSwap(ArrayList<String> toBeReSequenced) {
        int numberOfRound = toBeReSequenced.size();
        Collections.swap(toBeReSequenced, 2, 5);
        String result = "";
        for (int i = 0; i < numberOfRound; i++) {
                result += (toBeReSequenced.get(i) + " ");
            }
        System.out.println(result);
        }
    }