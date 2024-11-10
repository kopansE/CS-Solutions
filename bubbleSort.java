public class bubbleSort{
    public static int[] bubbleSort(int[] array) {
        if (array.length == 0) {
        return new int[] {};
        }

        boolean isSorted = false;
        int counter = 0;
        while (!isSorted) {
        isSorted = true;
        for (int index = 0; index < array.length - 1 - counter; index++) {
            if (array[index] > array[index + 1]) {
            swap(index, index + 1, array);
            isSorted = false;
            }
        }
        counter++;
        }
        return array;
    }

    public static void swap(int index1, int index2, int[] array) {
        int temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
    }
}