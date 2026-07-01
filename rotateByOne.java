class Solution {
    // Function to check if the array is sorted
    public void rotateByOne(int[] arr) {
       int temp = arr[0];
       int n = arr.length;

       for(int i = 0; i < n- 1; i++){
           arr[i] = arr[i+1];
       }
       arr[n-1] = temp;
    }
}

public class rotateByOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Solution obj = new Solution();

        obj.rotateByOne(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }
        
    }
}
