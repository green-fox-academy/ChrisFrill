import java.sql.SQLOutput;
import java.util.Arrays;

public class DiagonalMatrix {
    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output
    public static void main(String[] args){
        int[][] twoDimensionalMatrix = new int[4][4];

        for (int i = 0; i<twoDimensionalMatrix.length; i++){
            for (int j = 0; j<twoDimensionalMatrix.length; j++){
                if (i==j){
                    twoDimensionalMatrix[i][j] = 1;
                }//else {
                   // twoDimensionalMatrix[i][j] = 0;
                System.out.print(twoDimensionalMatrix[i][j] + " ");
            }
            System.out.println();

        }

    }
}
