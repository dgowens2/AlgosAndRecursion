/**
 * Created by DTG2 on 09/27/16.
 */
public class BubbleSort extends BaseSorter{

    public int[] sort(int[] arrayToSort) {
        int initialMax = arrayToSort.length;
        for (int currentMax = initialMax; currentMax >= 0; currentMax--) {
            for (int counter = 0; counter < currentMax - 1; counter++) {
                if (arrayToSort[counter] > arrayToSort[counter + 1]) {
                    swapNumbers(counter, counter + 1, arrayToSort);
                }
            }
            printNumbers(arrayToSort);
        }
        return arrayToSort;
    }
}
