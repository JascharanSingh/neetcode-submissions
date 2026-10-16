
class Solution {
    public int helper(int[] nums, int k, int dontCount, int counter){
        // stop when we've gone before 0
        if (k < 0) {
            return counter;
        }

        // multiply all except index to skip
        if (k != dontCount) {
            counter *= nums[k];
        }

        return helper(nums, k - 1, dontCount, counter);
    }

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = helper(nums, nums.length - 1, i, 1);
        }
        return result;
    }
}