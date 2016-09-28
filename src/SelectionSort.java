/**
 * Created by DTG2 on 09/27/16.
 */
public class SelectionSort extends BaseSorter {

    public int[] sort(int[] arrayToSort) {
        int initialMax = arrayToSort.length;
        for (int initialValue = 0; initialValue < initialMax; initialValue++) {
            for (int counter = initialValue; counter < initialMax; counter++) {
                if (arrayToSort[counter] < arrayToSort[initialValue]) {
                    swapNumbers(counter, initialValue, arrayToSort);
                }
            }
        printNumbers(arrayToSort);
        }
    return arrayToSort;
    }
}
