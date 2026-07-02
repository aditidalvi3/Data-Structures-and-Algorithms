class LinearSearch {

    public int linearSearch(int[] nums, int k) {

        int ans = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) {
                ans = i;
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        LinearSearch obj = new LinearSearch();

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;

        int result = obj.linearSearch(nums, k);

        System.out.println(result);
    }
}