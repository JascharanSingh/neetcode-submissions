class Solution {
    public int trap(int[] height) {
             int n = height.length;
        if (n == 0) return 0; // edge case

        int[] left = new int[n];
        int[] right = new int[n];

        // Step 1: Fill left max array
        int maxNumberLeft = height[0];
        left[0] = maxNumberLeft;
        for (int i = 1; i < n; i++) {
            maxNumberLeft = Math.max(maxNumberLeft, height[i]);
            left[i] = maxNumberLeft;
        }

        // Step 2: Fill right max array
        int maxNumberRight = height[n - 1];
        right[n - 1] = maxNumberRight;
        for (int i = n - 2; i >= 0; i--) {
            maxNumberRight = Math.max(maxNumberRight, height[i]);
            right[i] = maxNumberRight;
        }

        // Step 3: Calculate trapped water
        int total = 0;
        for (int i = 0; i < n; i++) {
            int minHeight = Math.min(left[i], right[i]);
            total += minHeight - height[i];
        }

        return total;
    }
}
