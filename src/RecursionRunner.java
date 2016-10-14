/**
 * Created by DTG2 on 09/27/16.
 */
public class RecursionRunner {

    //recursion is a great way to solve big problems that can eb broken up into smaller problems.


    public static void main(String[] args) {
        System.out.println("Running ...");
        RecursionRunner runner = new RecursionRunner();
        runner.recursionTest(0, 25);

    }

    public int recursionTest(int count, int max) {
        System.out.print(count + " ");
        if (count >= max) {
            return count;
        }
        return recursionTest(count+1, max);
    }
}
