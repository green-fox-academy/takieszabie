//  From now on, create the usual class wrapper
//  and main method on your own.

// - Create a string variable named `al` and assign the value `Greenfox` to it
// - Create a function called `greet` that greets it's input parameter
//     - Greeting is printing e.g. `Greetings dear, Greenfox`
// - Greet `al`

public class greeter_function {
    public static void main(String[] args) {
        String a1 = "Greenfox";
        String greeting = greet(a1);
        System.out.println(greeting);
    }

    public static String greet(String toBeGreeted) {
        String greeted = "Greetings, dear " + toBeGreeted+"!";
        return greeted;
    }
}