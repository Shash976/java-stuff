public class Hello {
    public static void main(String[] args){
        int[] mainArray = {25,32,68,4,6};
        printArray(mainArray);
        // Selection Sort
        selectionSort(mainArray);
        int[] nextArray = {25,32,68,4,6};
        bubbleSort(nextArray);
        printArray(mainArray);
    }

    private static void selectionSort(int[] givenArray) {
        System.out.println("\nSelection Sort: ");
        int[] array = givenArray;
        for (int i = 0; i<array.length; i++) {
            for (int j=i+1; j<array.length; j++){
                if (array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                    printArray(array);
                }
                
            }
        }
    }

    private static void bubbleSort(int[] Array) {
        int[] test_array = Array;
        System.out.println("\nBubble Sort");
        printArray(test_array);
        // Bubble Sort
        for (int i = 0; i<test_array.length-1; i++) {
            if (test_array[i+1] < test_array[i]){
                int temp = test_array[i+1];
                test_array[i+1] = test_array[i];
                test_array[i] = temp;
                printArray(test_array);
            }
            }
    }

    private static void printArray(int[] array) {
        for (int x:array){
            if (array[0]!=x){
                System.out.print(", ");
            } else {
                System.out.println(" ");
                System.out.print("  ");
            }
            System.out.print(x);
        }
    }
}