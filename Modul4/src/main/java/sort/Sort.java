package sort;

public class Sort {

    public static void bubbleSort(int[] array) {
        boolean executat = false;
        do {
            executat = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    executat = true;
                }
            }
        } while (executat);

    }


    public static void bubbleSortStrings(String[] array) {
        boolean executat = false;
        do {
            executat = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    String temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    executat = true;
                }
            }
        } while (executat);

    }

    public static void mergeSort(int[] array) {

        mergeSortRecursive(array, 0, array.length - 1);

    }

    public static void mergeSortRecursive(int[] array, int start, int end) {

        if (start < end) {
            int middle = (start + end) / 2;
            mergeSortRecursive(array, start, middle);
            mergeSortRecursive(array, middle + 1, end);
            merge(array, start, middle, end);
        }

    }

    public static void merge(int[] array, int start, int middle, int end) {

        int leftLength = middle - start + 1;
        int rightLength = end - middle;
        int[] leftArray = new int[leftLength];
        int[] rightArray = new int[rightLength];

        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = array[start + i];
        }
        for (int j = 0; j < rightArray.length; j++) {
            rightArray[j] = array[middle + j + 1];
        }

        int i = 0;
        int j = 0;

        for (int k = start; k <= end; k++) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i++];
                if (i == leftLength) {
                    while (++k <= end) {
                        array[k] = rightArray[j++];
                    }
                }

            } else {
                array[k] = rightArray[j++];
                if (j == rightLength) {
                    while (++k <= end) {
                        array[k] = leftArray[i++];
                    }
                }
            }

        }

    }

    public static void insertionSort(int[] array) {

        int key;

        for (int j = 1; j < array.length; j++) {
            key = array[j];
            int i = j - 1;
            while (i >= 0 && array[i] > key) {
                array[i + 1] = array[i];
                i = i - 1;
            }
            array[i + 1] = key;
        }
    }

    public static void quickSort(int[] array) {
        quickSortRecursive(array, 0, array.length - 1);
    }

    private static void quickSortRecursive(int[] array, int start, int end) {

        if (start < end) {
            int pivotIndex = partition(array, start, end);
            quickSortRecursive(array, start, pivotIndex-1);
            quickSortRecursive(array, pivotIndex + 1, end);
        }
    }

    private static int partition(int[] array, int start, int end) {

        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end -1; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }
        int temp = array[i+1];
        array[i + 1] = array[end];
        array[end] = temp;

        return i + 1;
    }
 public static void quickSort(String[] array) {
        quickSortRecursive(array, 0, array.length - 1);
    }

    private static void quickSortRecursive(String[] array, int start, int end) {

        if (start < end) {
            int pivotIndex = partition(array, start, end);
            quickSortRecursive(array, start, pivotIndex-1);
            quickSortRecursive(array, pivotIndex + 1, end);
        }
    }

    private static int partition(String[] array, int start, int end) {

        String pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end -1; j++) {
            if (array[j].compareTo(pivot) <= 0) {
                i++;
                String temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }
        String temp = array[i+1];
        array[i + 1] = array[end];
        array[end] = temp;

        return i + 1;
    }

}
