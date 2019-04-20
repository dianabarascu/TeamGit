package Sort;

public class Application {

    public static void main(String[] args) {

        int[]myArray = {2, 4, 3};
        int[]myArray2 = {6, 5, 3, 1, 8, 7, 2, 4};

//        Sort.mergeSort(myArray);
        Sort.mergeSort(myArray2);

//        printArray(myArray);
        printArray(myArray2);

//bubblesort
//      Generate n numbers, print, sort, print
        //read n from console
        //call generateMethod
        //call print
        //call sort
        //call prin
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introduce-ti numarul de elemente: ");
//        int n = scanner.nextInt();
//        int[]myArray3 = generate(n);
//        Sort.bubbleSort(myArray3);
//        printArray(myArray3);

//        int[]myArray = {2, 4, 3};
//        int[]myArray2 = {6, 5, 3, 1, 8, 7, 2, 4};
//
//        Sort.bubbleSort(myArray);
//        Sort.bubbleSort(myArray2);
//
//        printArray(myArray);
//        printArray(myArray2);
    }

    private static void printArray(int[] array) {
        for (int i = 0 ; i < array.length ; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private  static int[] generate(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
//            array[i]= (int) (100*Math.random());
//            Random random = new Random();
//          array[i] = random.nextInt(n);//cel mai mare nr random

            int generated = (int) (n*Math.random());
            int j =0;
            while(j<i){
                if (generated == array[j]){
                   j=0;
                   generated = (int) (n*Math.random());
                }else {
                    j++;
                }
            }
            array[i] = generated;
            //for each element - random().
        }
        return array;
   }
}
