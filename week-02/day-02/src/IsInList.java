// Check if list contains all of the following elements: 4,8,12,16
// Create a method that accepts list as an input
// it should return "true" if it contains all, otherwise "false"

import java.util.*;

public class IsInList{
    public static void main(String... args){
        ArrayList<Integer> list = new ArrayList<> (Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
                checkNums(list);
    }

    private static void checkNums(ArrayList<Integer> listToBeExamined) {

        ArrayList<Integer> checkElements = new ArrayList<>(Arrays.asList(4,8,12,16));
        ArrayList<Integer> answers = new ArrayList<>(Arrays.asList(1,1));
        int numberOfElements = checkElements.size();

        for (int i = 0; i < numberOfElements; i++) {
            if (listToBeExamined.contains(checkElements.get(i))){
                answers.add(1);
            }
            else {
                answers.add(0);
            }
        }
        if (answers.contains(0)){
            System.out.println("False");
        }
        else {
            System.out.println("True");
        }
    }
}