// Accidentally we added "2" and "false" to the list.
// Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
// No, don't just remove the lines
// Create a method called sweets() which takes the list as a parameter.
// Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"

import java.util.*;

public class CandyShop{
    public static void main(String... args){
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);
        System.out.println("Original state: " + arrayList);
        System.out.println("Corrected state: " + sweets(arrayList));

    }

    private static String sweets(ArrayList<Object> toBeCleaned) {
        List<String> cleaned = new ArrayList<String>();
        for (int i = 0; i < toBeCleaned.size(); i++) {
            if (i==1){
                cleaned.add("Croissant");
            }
            else if (i==3){
                cleaned.add("Ice cream");
            }
            else {
                cleaned.add(toBeCleaned.get(i).toString());
            }
        }
        return cleaned.toString();
    }
}