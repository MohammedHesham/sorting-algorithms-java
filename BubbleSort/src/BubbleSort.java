public class BubbleSort {

    void sort() {
        int[] data = {5, 8, 1, 6, 9, 17,0,-1,4};
        for (int lastSortedIndex = data.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            boolean flag = false;
            for (int i = 0; i < lastSortedIndex ; i++) {
                if (data[i] > data[i + 1]) {
                    swap(data, i, i + 1);
                    flag = true;
                }
            }
            if (!flag)
                break;
        }
        print(data);
    }

    private void swap(int[] data, int i, int i1) {
        int temp = data[i];
        data[i] = data[i1];
        data[i1] = temp;
    }

    private void print(int[] data) {
        for (int datum : data) {
            System.out.print(datum + ",");
        }

    }
}
