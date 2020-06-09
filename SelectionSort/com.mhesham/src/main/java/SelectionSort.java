package main.java;

public class SelectionSort {


    public void sort(int[] arr) {
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largestIndex = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (arr[largestIndex] < arr[i]) {
                    largestIndex = i;
                }
            }

            if (largestIndex != lastUnsortedIndex)
                swap(arr, lastUnsortedIndex, largestIndex);

        }


        print(arr);
    }

    private void swap(int[] arr, int lastUnsortedIndex, int largestIndex) {
        int temp = arr[largestIndex];
        arr[largestIndex] = arr[lastUnsortedIndex];
        arr[lastUnsortedIndex] = temp;
    }

    private void print(int[] arr) {

        for (int i1 : arr) {
            System.out.print(i1 + ",");
        }
    }
}
