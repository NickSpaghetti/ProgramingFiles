
package matrixrio;

/**
 * 8/29/2015
 * @author Riorden D. Weber
 */
public class DimensionMismatchException extends RuntimeException
{
    /**
     * // DimensionMismatchException - (step 13)
     * @param message 
     */
    public DimensionMismatchException(String message)
    {
        super(message); // passes the message to the supper RuntimeException
    }
    
    public DimensionMismatchException(){}; // other default constructor - no parameters
}
