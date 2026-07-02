public class LongestSubarray {
    public static int longestSubarraybruteForce(int[] nums, int k){
        int n = nums.length;
        int maxLength = 0;

        for(int startIndex = 0; startIndex < n; startIndex++){
            int currSum = 0;
            for(int endIndex = startIndex; endIndex < n; endIndex++){
                currSum += nums[endIndex];
                if(currSum == k){
                    maxLength = Math.max(maxLength,endIndex-startIndex+1);
                }
            }
        }

        return maxLength;
    }

    public static int longestSubarray(int[] nums, int k){
        int n = nums.length;
        int maxLength = 0;
        int left = 0;
        int right = 0;
        int sum = nums[0];

        while(right < n){

            while(sum > k && left <= right){
                sum -= nums[left];
                left++;
            }

            if(sum == k){
                maxLength = Math.max(maxLength, right - left+1);
            }

            right++;
            if(right < n){
                sum += nums[right];
            }
        }
        return maxLength;

    }

    public static void main(String[] args) {

        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;

        int ans = LongestSubarray.longestSubarray(nums, k);

        System.out.println(ans);
    }
}



    


