class Solution{
    public void main(int[] arr) {
        int left = 0;

        for(int right = 0; right < arr.length; right++){
            if(arr[right] != 0){
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
            }
        }
        
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
 
public class moveZeros {
    public static void main(String[] args) {
        int[] arr = {2, 0, 3, 4, 0};
         
        Solution obj = new Solution();

        obj.main(arr);
    }

}

