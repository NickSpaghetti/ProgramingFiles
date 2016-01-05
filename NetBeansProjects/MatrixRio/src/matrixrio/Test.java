
package matrixrio;

import java.util.Arrays;
/**
 * 8/29/2015
 * @author Riorden D. Weber
 */
public class Test // TEST - step 10
{   
    // All the matrix sets for different instances of a Matrix
    double[][] d1 = { { 1 }, { 4 } }; // 2D array matrix d1
    double[][] d2 = {  {1,4,9,8}, {1,4,9,8}, {1,4,9,8} }; // 2D array matrix d2
    double[][] d3 = { {2,5}, {-3,8}, {7,5} }; // 2D array matrix d3
    double[][] d4 = { {-3,10}, {2,8}, {9,0} }; // 2D array matrix d4
    
    public Test()
    {
        // creates instances of matrix1, matrix2, matrix3, matrix4 and matrix5
        // Passes the matrix set to the MatrixCreatin class with the given matrix set
        MatrixCreation matrix1 = new MatrixCreation(d2); // matrix1
        MatrixCreation matrix2 = new MatrixCreation(d2); // matrix2
        MatrixCreation matrix3 = new MatrixCreation(d3); // matrix3
        MatrixCreation matrix4 = new MatrixCreation(d4); // matrix4
        MatrixCreation matrix5 = new MatrixCreation(d1); // matrix5
        
        matrix1.displayMatrix();
        matrix2.displayMatrix();
        
        //SET ENTRY - step 2
        matrix2.setEntry(0, 1, 60);
        matrix2.displayMatrix();

        //ADD - step 3
        matrix1.add(matrix2).displayMatrix();

        //SUBTRACT - step 4
        matrix1.subtract(matrix2).displayMatrix();

        //MULTIPLY - step 5
        matrix1.multiply(matrix2).displayMatrix();

        //EQUALS - step 6
        System.out.println(matrix1.equals(matrix2));

        //TRANSPOSE - step 7
        matrix2.transpose().displayMatrix();
        
        //ARRAY of MATRICES - step 11
        MatrixCreation[][][] array_of_matrices = { { { matrix1 }, { matrix2 } }, { { matrix3 }, { matrix4 } } };
        //Arrays.sort(arr);
        
        //ARRAY SORT - step 12
        //Arrays.sort(array_of_matrices, new NewOrder());
        
        //array_of_matrices.displayMatrix();
    } 
}
