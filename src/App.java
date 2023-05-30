public class App {
    
    public static void main(String[] args) throws Exception {
        int arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        bubbleSort(arr);
        quickSort(arr, 0, arr.length - 1);

        //the for loop will test
        // for( int i = 0; i < arr.length; i++){
        //     System.out.println(arr[i]);
        //   }
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
           for(int i = 0; i <n; i++){
            for(int j = 0; j < n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
           }
    }

    //QUICK SORT methods
    static void quickSort(int[] array, int lowIndex, int highIndex){

        if (lowIndex >= highIndex){
            return;
        }
        int pivot = array[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while(leftPointer < rightPointer){
            while (array[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while(array[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            pratitionSwap(array, leftPointer, rightPointer);
        }
        pratitionSwap(array, leftPointer, highIndex);

        quickSort(array, lowIndex, leftPointer - 1);
        quickSort(array, leftPointer + 1, highIndex);

    }
    private static void pratitionSwap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}
