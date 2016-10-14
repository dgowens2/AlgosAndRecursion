import java.util.HashMap;

/**
 * Created by DTG2 on 09/28/16.
 */
public class FibonacciRunner {
    static int numInvocations = 0;

    //good example of recursion being more expressive then for loops.

    public static void main(String[] args) {
        FibonacciRunner runner = new FibonacciRunner();
        RecursionRunner recRunner = new RecursionRunner();
        long fibNum = runner.getFibonacciEff(10);
        System.out.println(fibNum);

        System.out.println("Invoked " + runner.numInvocations + " times.");

        System.out.println(recRunner.recursionTest(0, 3));

    }

    public long getFibonacciSimple(long fibNum) {
        numInvocations++;
        if (fibNum ==0 || fibNum ==1) {
            return fibNum;
        }
        return getFibonacciSimple((fibNum -1) + getFibonacciSimple(fibNum - 2));
    }

    static HashMap<Long, Long> cachedFibs = new HashMap<>(); //Uppercase Longs in the HashMap because they have to be objects. They can't be primitive types.

    public long getFibonacciEff(long fibNum) {
        numInvocations++;
        System.out.println("fibnum = " + fibNum);
        System.out.println("num evok = " + numInvocations);
        if (fibNum == 0 || fibNum == 1) {
            return fibNum;
        }

        Long fibNumMinus1 = cachedFibs.get(/*new Long*/(fibNum - 1));
        if (fibNumMinus1 == null) {
            fibNumMinus1 = getFibonacciEff(fibNum - 1);
        }
        Long fibNumMinus2 = cachedFibs.get(/*new Long*/(fibNum - 2)); //Don't need the new because Java instantiates it implicitly.
        if (fibNumMinus2 == null) {
            fibNumMinus2 = getFibonacciEff(fibNum - 2);
        }
        cachedFibs.put(fibNum, fibNumMinus1 + fibNumMinus2);

        return fibNumMinus1 + fibNumMinus2;
    }

}
