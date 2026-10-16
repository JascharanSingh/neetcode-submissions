class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Step 1: Count frequency
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        // Step 2: Sort map entries by frequency (descending)
        List<Map.Entry<Integer, Integer>> sortedList = new ArrayList<>(map.entrySet());
        Collections.sort(sortedList, (a, b) -> b.getValue() - a.getValue());
        
        // Step 3: Add top K keys to list
        for (int i = 0; i < k && i < sortedList.size(); i++) {
            list.add(sortedList.get(i).getKey());
        }
        
        // Step 4: Convert ArrayList<Integer> to int[]
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}