/**
 * Created by DTG2 on 09/27/16.
 */
public class SortingRunner {

    public static void main(String[] args) {
        BaseSorter bubbleSort = new BubbleSort();
        BaseSorter selectionSort = new SelectionSort();

        int[] newArray = {51, 16, 97, 14, 3};

        bubbleSort.sort(newArray);
        System.out.println("Bubble Sorted");
        selectionSort.sort(newArray);
        System.out.println("Selection Sorted");
    }

}
