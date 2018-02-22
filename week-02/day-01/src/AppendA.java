
// - Create an array variable named `nimals`
//   with the following content: `["kuty", "macsk", "cic"]`
// - Add all elements an `"a"` at the end

import java.util.Arrays;

public class AppendA {
    public static void main(String[] args) {
        String[] nimals = {"kuty", "macsk", "cic"};
        System.out.println("Original content:" + Arrays.toString(nimals));

        for (int i = 0; i < 3; i++) {
            nimals[i] = nimals[i] + "a";
        }
        System.out.println("Modified content:" + Arrays.toString(nimals));
    }
}