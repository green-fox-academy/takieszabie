// Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
// The output should be: "Noooooo"
// Do this again with a different solution using different list methods!

import java.util.*;

public class ElementFinder{
    public static void main(String... args){
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(containsSeven(arrayList));
        System.out.println(containsSevenTwo(arrayList));
        int numberOfElements = arrayList.size();
        }

    private static String containsSevenTwo(ArrayList<Integer> toBeChecked) {
        List<String> result = new ArrayList<String>();
        if (toBeChecked.contains(7)){
            result.add("Hoooorrrraaaay");
        }
        else result.add("Nooooo");
        return result.toString();
    }

    private static String containsSeven(ArrayList<Integer> toBeChecked) {
        List<String> result = new ArrayList<String>();
        if (toBeChecked.contains(7)){
            result.add("Hoooorrrraaaay");
            }
            else result.add("Nooooo");
        return result.toString();
    }
}