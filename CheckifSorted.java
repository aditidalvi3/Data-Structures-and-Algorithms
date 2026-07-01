class Solution {
    // Function to check if the array is sorted
    public boolean isSorted(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
           if(arr[i] > arr[i+1]){
              return false;
           }
        }
        return true; 
    }
}

public class CheckifSorted {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 5};
        int n = 5;
        Solution obj = new Solution();
        
        obj.isSorted(arr, n);
        boolean ans = obj.isSorted(arr, n);
        
        // Output result
        if (ans) 
            System.out.println("True");
        else 
            System.out.println("False");

    }
}
