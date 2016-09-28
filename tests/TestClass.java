import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by DTG2 on 09/27/16.
 */
public class TestClass {
    BaseSorter sortingRunner = new SelectionSort();
    Factorial factorialTest = new Factorial();

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void sort2ElementArray() throws Exception {
        int[] orderedArray = {5, 7};
        sortingRunner.sort(orderedArray);
        assert2ElementOrder(orderedArray);

        int[] scrambledArray1 = {7, 5};
        sortingRunner.sort(scrambledArray1);
        assert2ElementOrder(scrambledArray1);
    }

    private void assert2ElementOrder(int[] numArray) {
        assertEquals(5, numArray[0]);
        assertEquals(7, numArray[1]);
    }

    @Test
    public void sort3ElementArray() throws Exception {
        int[] orderedArray = {5, 7, 19};
        sortingRunner.sort(orderedArray);
        assert3ElementOrder(orderedArray);
        System.out.println("Done\n");

        int[] scrambledArray1 = {5, 19, 7};
        sortingRunner.sort(scrambledArray1);
        assert3ElementOrder(scrambledArray1);
        System.out.println("Done\n");

        int[] scrambledArray2 = {7, 5, 19};
        sortingRunner.sort(scrambledArray2);
        assert3ElementOrder(scrambledArray2);
        System.out.println("Done\n");

        int[] scrambledArray3 = {7, 19, 5};
        sortingRunner.sort(scrambledArray3);
        assert3ElementOrder(scrambledArray3);
        System.out.println("Done\n");

        int[] scrambledArray4 = {19, 7, 5};
        sortingRunner.sort(scrambledArray4);
        assert3ElementOrder(scrambledArray4);
        System.out.println("Done\n");

        int[] scrambledArray5 = {19, 5, 7};
        sortingRunner.sort(scrambledArray5);
        assert3ElementOrder(scrambledArray5);
        System.out.println("Done\n");
    }

    private void assert3ElementOrder(int[] numArray) {
        assertEquals(5, numArray[0]);
        assertEquals(7, numArray[1]);
        assertEquals(19, numArray[2]);
    }

    @Test
    public void sort4ElementArray() throws Exception {
        int[] orderedArray = {5, 7, 19, 24};
        sortingRunner.sort(orderedArray);
        assert4ElementOrder(orderedArray);
        System.out.println("Done\n");

        int[] scrambledArray1 = {5, 7, 24, 19};
        sortingRunner.sort(scrambledArray1);
        assert4ElementOrder(scrambledArray1);
        System.out.println("Done Again\n");

        int[] scrambledArray2 = {5, 24, 7, 19};
        sortingRunner.sort(scrambledArray1);
        assert4ElementOrder(scrambledArray1);
        System.out.println("Done Again\n");

        int[] scrambledArray3 = {5, 19, 7, 24};
        sortingRunner.sort(scrambledArray1);
        assert4ElementOrder(scrambledArray1);
        System.out.println("Done Again\n");

        int[] scrambledArray4 = {7, 5, 19, 24};
        sortingRunner.sort(scrambledArray1);
        assert4ElementOrder(scrambledArray1);
        System.out.println("Done Again\n");

        int[] scrambledArray5 = {7, 5, 24, 19};
        sortingRunner.sort(scrambledArray1);
        assert4ElementOrder(scrambledArray1);
        System.out.println("Done Again\n");

        int[] scrambledArray6 = {7, 24, 19, 5};
        sortingRunner.sort(scrambledArray1);
        assert4ElementOrder(scrambledArray1);
        System.out.println("Done Again\n");

        int[] scrambledArray7 = {7, 19, 5, 24};
        sortingRunner.sort(scrambledArray1);
        assert4ElementOrder(scrambledArray1);
        System.out.println("Done Again\n");

        int[] scrambledArray8 = {24, 7, 5, 19};
        sortingRunner.sort(scrambledArray1);
        assert4ElementOrder(scrambledArray1);
        System.out.println("Done Again\n");

        int[] scrambledArray9 = {19, 5, 7, 24};
        sortingRunner.sort(scrambledArray1);
        assert4ElementOrder(scrambledArray1);
        System.out.println("Done Again\n");

        int[] scrambledArray10 = {19, 5, 24, 7};
        sortingRunner.sort(scrambledArray1);
        assert4ElementOrder(scrambledArray1);
        System.out.println("Done Again\n");

        int[] scrambledArray11 = {19, 7, 24, 5};
        sortingRunner.sort(scrambledArray1);
        assert4ElementOrder(scrambledArray1);
        System.out.println("Done Again\n");

        int[] scrambledArray12 = {19, 7, 5, 24};
        sortingRunner.sort(scrambledArray1);
        assert4ElementOrder(scrambledArray1);
        System.out.println("Done Again\n");

        int[] scrambledArray13 = {24, 7, 19, 5};
        sortingRunner.sort(scrambledArray1);
        assert4ElementOrder(scrambledArray1);
        System.out.println("Done Again\n");

        int[] scrambledArray14 = {24, 19, 7, 5};
        sortingRunner.sort(scrambledArray1);
        assert4ElementOrder(scrambledArray1);
        System.out.println("Done Again\n");

        int[] scrambledArray15 = {24, 5, 7, 19};
        sortingRunner.sort(scrambledArray1);
        assert4ElementOrder(scrambledArray1);
        System.out.println("Done Again\n");

        int[] scrambledArray16 = {24, 19, 5, 7};
        sortingRunner.sort(scrambledArray1);
        assert4ElementOrder(scrambledArray1);
        System.out.println("Done Again\n");
    }

    private void assert4ElementOrder(int[] numArray) {
        assertEquals(5, numArray[0]);
        assertEquals(7, numArray[1]);
        assertEquals(19, numArray[2]);
        assertEquals(24, numArray[3]);
    }

    @Test
    public void factorialTest() throws Exception {
        factorialTest.factorial(6);
        assertEquals(720, factorialTest.factorial(6));
        System.out.println("Done\n");
    }

}
