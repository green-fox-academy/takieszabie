// Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
// The output should be: "Noooooo"
// Do this again with a different solution using different list methods!

import java.util.*;

public class ElementFinder{
    public static void main(String... args){
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(containsSeven(arrayList));
        containsSevenTwo(arrayList);
        }

    private static String containsSeven(ArrayList<Integer> toBeChecked) {
        List<String> result = new ArrayList<String>();
        if (toBeChecked.contains(7)){
            result.add("Hoooorrrraaaay");
        }
        else result.add("Nooooo");
        return result.toString();
    }

    private static void containsSevenTwo(ArrayList<Integer> toBeChecked) {
        if (toBeChecked.indexOf(7)<0) {
            System.out.println("Nooooo");
        }
        else {
            System.out.println("Hoooorrrraaaay");
        }
        }
    }