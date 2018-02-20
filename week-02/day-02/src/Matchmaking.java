// Write a method that joins the two lists by matching one girl with one boy into a new list
// Exepected output: "Eve", "Joe", "Ashley", "Fred"...

import java.util.*;

public class Matchmaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));
        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList<String> makingMatches(ArrayList<String> toBeMatched1, ArrayList<String> toBeMatched2) {
        ArrayList<String> result = new ArrayList<String>();
        int lengthGirls = toBeMatched1.size();
        int lengthBoys = toBeMatched2.size();
        int numberOfTurns = 0;

        if (lengthGirls <= lengthBoys) {
                numberOfTurns = lengthGirls;
            }
            else {
                numberOfTurns = lengthBoys;
        }

        for (int i = 0; i < numberOfTurns; i++) {
            result.add(toBeMatched1.get(i));
            result.add(toBeMatched2.get(i));
        }
        return result;
    }

}