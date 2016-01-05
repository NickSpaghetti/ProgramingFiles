package matrixrio;
/**
 * 8/29/2015
 * @author Riorden D. Weber
 */

import java.util.ArrayList;
import java.util.Comparator;

public class MatrixCreation implements Comparable, Comparator // COMPARABLE - (step 8) // COMPARATOR - (step 9)
{
    private int row = 0; // sets the variable row to the number of
    private int col = 0;
    private double value;
    private final double [][] data;
     
    // CONSTRUCTOR - (step 1)
    /** This is the constructor that creates an M-by-N matrix based on 2d array
     * This Matrix is auto created to have all values initialized to 0 
     * @param data as double[][]
     */
    public MatrixCreation(double[][] data)
    {
        row = data.length; // sets the variable row to the number of rows in the matrix that called the method in the 
        col = data[0].length;
        this.data = new double[row][col];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                    this.data[i][j] = data[i][j];
    }
    
    // DISPLAY
    /** The method displayMatrix, outputs the contents of a given matrix
     * No Parameters
     */
    public void displayMatrix()
    {
        //System.out.printf(" has " + row + " Rows, " + col + " Columns");
        // Prints the number of Columns
        System.out.printf("\n\tColumn:\n|\t");
        for (int j = 0; j < col; j++)
                System.out.printf("   (" + "%d" + ") ",j); // prints out the number of columns for easy reading
        // for loops steps through the matrix
        for (int i = 0; i < row; i++)
        {
            System.out.printf("\nRow %d: ", i);
            for (int j = 0; j < col; j++)
                System.out.printf("%7.1f",data[i][j]); //prints out the value of matrix location i, j
        }
        System.out.println("\n"); //print line at end for easy reading
    }
    
    // SETENTRY - (step 2)
    /**
     * The setEntry method, setting the entry at a specific location on a given matrix
     * @param row2set as int to row
     * @param col2set as int to col
     * @param value as double to set value at row and col
     */
    public void setEntry(int row2set, int col2set, double value)
    {
        data[row2set][col2set] = value; //setting the value of the matrix that called the method at the two passed parameters to the passed value
    }
    
    // ADD - (step 3)
    // return C = A + B
    /**
     * The add method, adding two matrix together
     * @param matrix2 a MatrixCreation as Matrix
     * @return the result of Matrix that called this method plus another Matrix as matrix3
     */
    public MatrixCreation add(MatrixCreation matrix2)
    {
        MatrixCreation matrix1 = this;
        // check if the matrixs are the same size
        if (matrix2.row != matrix1.row || matrix2.col != matrix1.col)
            throw new DimensionMismatchException("Illegal matrix dimensions."); // if not same size through an exception
        
        MatrixCreation matrix3 = new MatrixCreation(data);// creating a new matrix to put the output in
        double result; // variable that is used to hold the value of what is in the matrix that called the function while the for loop steps through the matrix
        // for loops steps through the matrix
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
            {
                result = matrix1.data[i][j] + matrix2.data[i][j];
                matrix3.setEntry(i, j, result); // sets value of matrix2 at j, i to result
            }
        return matrix3; // return the result of matrix1 + matrix2 as matrix3
    }
    
    // SUBTRACT - (step 4)
    /**
     * The subtract method, subtracting two matrix
     * @param matrix2  a MatrixCreation as Matrix
     * @return matrix3
     */
    public MatrixCreation subtract(MatrixCreation matrix2)
    {
        MatrixCreation matrix1 = this;
        // check if the matrixs are the same size
        if (matrix2.row != matrix1.row || matrix2.col != matrix1.col)
            throw new DimensionMismatchException("Illegal matrix dimensions."); // if not same size through an exception
        
        MatrixCreation matrix3 = new MatrixCreation(data);// creating a new matrix to put the output in
        double end; // variable that is used to hold the value of what is in the matrix that called the function while the for loop steps through the matrix
        // for loops steps through the matrix
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
            {
                end = matrix1.data[i][j] - matrix2.data[i][j]; //sets the value at i, j - i, j to end
                matrix3.setEntry(i, j, end); // sets value of matrix2 at j, i to end
            }
        return matrix3; // return the result of matrix1 - matrix2 as matrix3
    }
    
    // MUTIPLY - (step 5)
    /**
     * The multiply method, multiplying two matrix together
     * @param matrix2  a MatrixCreation as Matrix
     * @return matrix3
     */
    public MatrixCreation multiply(MatrixCreation matrix2)
    {
        MatrixCreation matrix1 = this; // making this keyword equal to the matrix that called the funciton
        // check if the matrixs are the same size
        if (matrix2.row != matrix1.row || matrix2.col != matrix1.col)
            throw new DimensionMismatchException("Illegal matrix dimensions."); // if not same size through an exception
        
        MatrixCreation matrix3 = new MatrixCreation(data); // creating a new matrix to put the output in
        double end; // variable that is used to hold the value of what is in the matrix that called the function while the for loop steps through the matrix
        // for loops steps through 
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
            {
                end = matrix1.data[i][j] * matrix2.data[i][j]; //sets the value at i, j * i, j to end
                matrix3.setEntry(i, j, end); // sets value of matrix2 at j, i to end
            }
        return matrix3; // return the result of matrix1 * matrix2 as matrix3
    }
    
    // EQUALS - (step 6)
    /** The equals method, checks if two matrix are equal to one another
     * @param matrix2 a MatrixCreation as Matrix
     * @return True or False by if "this" = matrix2
     */
    public boolean equals(MatrixCreation matrix2)
    {
        MatrixCreation matrix1 = this;
        // check if the matrixs are the same size
        if (matrix2.row != matrix1.row || matrix2.col != matrix1.col)
            throw new RuntimeException("Illegal matrix dimensions."); // if not same size through an exception
        // for loops steps through the matrix
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
            {
                if(matrix1.data[i][j] != matrix2.data[i][j])
                    return false; // returns false if the values of matrix1 is not equal to the values of matrix2
            }
        return true; // returns true if all values of matrix1 are equal to the values of matrix2
    }
    
    // TRANSPOSE - (step 7)
    /** The transpose method, reversing the order of a matrix (the amount of row
     * becomes columns and the columns become the rows
     * @return matrix2
     */
    public MatrixCreation transpose()
    {
        double[][] transposeMatrix = new double[col][row];
        
        MatrixCreation matrix2 = new MatrixCreation(transposeMatrix);
        double end; // variable that is used to hold the value of what is in the matrix that called the function while the for loop steps through the matrix
       // for loops steps through the matrix
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
            {
                end = this.data[i][j]; //sets the value at i, j to end
                matrix2.setEntry(j, i, end); // sets value of matrix2 at j, i to end
            }
        return matrix2; // returns the matrix data set of matrix2
    }

    // SORT - (step 8)
    /**
     * 
     * @param o
     * @return 
     */
    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // COMPARE - (step 9)
    /**
     * 
     * @param o1
     * @param o2
     * @return 
     */
    @Override
    public int compare(Object o1, Object o2)
    {
        /*int totalMatrices = data.length;
        int[] arrayOrder = new int[totalMatrices];
        
        for (int m = 0; m < totalMatrices; m++)
            for (int i = 0; i < row; i++)
                for (int j = 0; j < col; j++)
                {
                    arrayOrder[m] = arrayOrder[m] + this.data[i][j];
                }
        /*if(f1.toDecimal() > f2.toDecimal())
            return -1;
        if(f1.toDecimal() < f2.toDecimal())
            return 1;
        return 0;*/
        return 0;
    }
}
    


