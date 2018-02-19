//        # - Create an array variable named `s`
//        #   with the following content: `[1, 2, 3, 8, 5, 6]`
//        # - Change the 8 to 4
//        # - Print the fourth element

public class ChangeElement {
    public static void main(String[] args){
        int[] s = {1,2,3,8,5,6};
        int numberOfChanges = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i]==8){
                s[i]=4;
                numberOfChanges++;
            }
        }
        System.out.println("The fourth element is now: " + s[3] + ". " + numberOfChanges + " change(s) has/have been made.");
    }
}