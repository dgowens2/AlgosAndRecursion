/**
 * Created by DTG2 on 09/27/16.
 */
public class Factorial {

    public static long factorial(int factorialNumber) {

        if (factorialNumber <= 1) {
            return 1;
        } else {
            return factorialNumber*factorial(factorialNumber-1);
        }
    }
}
