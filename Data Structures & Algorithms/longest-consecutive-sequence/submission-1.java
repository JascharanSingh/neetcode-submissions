class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length; i++){
            int number = nums[i];
            if(!set.contains(number-1)){
                count = 1;
                int num = number;
                while(set.contains(num + 1)){
                    count++;
                    num++;
                }

            }
            count2 = Math.max(count2, count);
        }
        
        return count2;
    }
    
}
