class Solution {
    public int longestConsecutive(int[] nums) {
                int biggestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;

        for (int num : nums) {
            biggestNumber = Math.max(biggestNumber, num);
            smallestNumber = Math.min(smallestNumber, num);
        }

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxCounter = 0, counter = 0;
        for (int i = smallestNumber; i <= biggestNumber; i++) {
            if (set.contains(i)) {
                counter++;
                maxCounter = Math.max(maxCounter, counter);
            } else {
                counter = 0;
            }
        }

        return maxCounter;
    }
}
