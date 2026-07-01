public class Sort {
    public static void SelectionSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            int minIndex = i;
            for(int j = i + 1; j < n; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }

        System.out.println("After selection sort:");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
     public static void BubbleSort(int[] arr){
        int n = arr.length;

        for(int i = n - 1; i >= 1; i--){
            for(int j = 0; j <= i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("After bubble sort:");
        for(int num : arr){
            System.out.print(num + " ");
        }
     }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};

        System.out.println("Before sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        //SelectionSort(arr);
        BubbleSort(arr);
    }
}
