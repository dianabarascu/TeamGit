package sort;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        int[] myArray = {20, 40, 30};
        int[] myArray2 = {6, 5, 3, 1, 8, 7, 2, 4};

        String[] myNames = {"Alexandru", "Tudor","Iana", "Razvan", "Diana"};
        Sort.bubbleSortStrings(myNames);
        printArrayString(myNames);
        Sort.quickSort(myNames);
        printArrayString(myNames);


        //int[] generated1000 = generateRandomArray(1000);
        int[] generated10000 = generateRandomArray(10000);


//        compareSortingAlgorithms();


//        Sort.quickSort(myArray);
//        printArray(myArray);

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

    private static void compareSortingAlgorithms() {

        int[] generated10000 = generateRandomArray(10000);
        int[] copy = generateCopy(generated10000);


        LocalDateTime before = LocalDateTime.now();
        System.out.println(before);
        Sort.bubbleSort(generated10000);
        LocalDateTime after = LocalDateTime.now();
        System.out.println(after);
        long durata = Duration.between(before, after).toMillis();
        System.out.println(durata);

        LocalDateTime before2 = LocalDateTime.now();
        System.out.println(before2);
        Sort.quickSort(copy);
        LocalDateTime after2 = LocalDateTime.now();
        System.out.println(after2);
        long durata2 = Duration.between(before2, after2).toMillis();
        System.out.println(durata2);
    }

    public static int[] generateCopy(int[] array) {

        int[] copy = new int[array.length];
        for (int i = 0; i < copy.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArrayString(String[] array) {

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
