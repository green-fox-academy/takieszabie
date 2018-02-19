// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args){

        int numberOfRows = 4;
        int numberOfColoumns = 4;
        int[][] matrixx = new int[numberOfRows][numberOfColoumns];

        for (int i = 0; i <numberOfRows ; i++) {
            for (int j = 0; j <numberOfColoumns ; j++) {
                if (i==j){
                    matrixx[i][j] = 1;
                }
                else matrixx[i][j] = 0;
                System.out.print(matrixx[i][j]);
            }
            System.out.println("");
        }
    }
}