package sort;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        int[] myArray = {2, 4, 3};
        int[] myArray2 = {6, 5, 3, 1, 8, 7, 2, 4};

        Sort.quickSort(myArray2);
        printArray(myArray2);

//        Sort.insertionSort(myArray2);
//        printArray(myArray2);

//        Sort.mergeSort(myArray2);
//        printArray(myArray2);

//        Sort.bubbleSort(myArray);
//        Sort.bubbleSort(myArray2);
//        printArray(myArray);
//        printArray(myArray2);
//        int[] myArray3 = generateRandomArray(getCitit());
//        Sort.bubbleSort(myArray3);
//        printArray(myArray3);

    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] generateRandomArray(int n) {

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            int generated = (int) (Math.random() * n);
            int j = 0;
            while (j < i) {
                if (generated == array[j]) {
                    j = 0;
                    generated = (int) (Math.random() * n);
                } else {
                    j++;
                }
            }

            array[i] = generated;
        }
        return array;
    }

    private static int getCitit() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul de elemente: ");
        int citit = scanner.nextInt();
        return citit;
    }

}
