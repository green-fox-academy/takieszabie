// Create a method called "appendA()" that adds "a" to every string in the "far" list.
// The parameter should be a list.
// The output should be: "kutya", "macska", "kacsa", "róka", "halacska"

import java.util.*;

public class AppendLetter{
    public static void main(String... args){
        List<String> far = Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk");
        int numberOfElements = far.size();
        System.out.println(appendA(far));
    }
    public static List<String> appendA(List<String> toBeAppended) {
        List<String> appender = new ArrayList<>();
        for (int i = 0; i < toBeAppended.size() ; i++) {
            appender.add(toBeAppended.get(i) + "a");
        }
        return appender;
    }
}