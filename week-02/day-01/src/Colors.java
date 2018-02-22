// - Create a two dimensional array
//   which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green:
//   `"lime", "forest green", "olive", "pale green", "spring green"`
// - In `colors[1]` store the shades of red:
//   `"orange red", "red", "tomato"`
// - In `colors[2]` store the shades of pink:
//   `"orchid", "violet", "pink", "hot pink"`

import java.lang.reflect.Array;
import java.util.Arrays;

public class Colors {
    public static void main(String[] args) {

        int rows = 3;
        int columns = 4;
        String[][] colors = new String[rows][columns];
        String[] green = {"forest green", "olive", "pale green", "spring green"};
        String[] red = {"orange red", "red", "tomato", "dark red"};
        String[] pink = {"orchid", "violet", "pink", "hot pink"};
        for (int i = 0; i < rows; i++) {
            if (i == 0) {
                for (int j = 0; j < columns; j++) {
                    colors[i][j] = green[j];
                }
            } else if (i == 1) {
                for (int j = 0; j < columns; j++) {
                    colors[i][j] = red[j];
                }
            } else {
                for (int j = 0; j < columns; j++) {
                    colors[i][j] = red[j];
                }
            }
        }
        System.out.println("Filled-up array: "+Arrays.deepToString(colors));
    }
}