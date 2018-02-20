// Saturn is missing from the planetList
// Insert it into the correct position
// Create a method called putSaturn() which has list parameter and returns the correct list.
// Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune", "Saturn"

import java.util.*;
import java.util.ArrayList;
import java.lang.String;

public class SolarSystem{
    public static void main(String... args){
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));
        System.out.println(putSaturn(planetList));
    }

    public static ArrayList<String> putSaturn(ArrayList toBeInserted) {
        ArrayList<String> result = (ArrayList<String>)toBeInserted.clone();
        result.add("Saturn");

        return result;
    }
}