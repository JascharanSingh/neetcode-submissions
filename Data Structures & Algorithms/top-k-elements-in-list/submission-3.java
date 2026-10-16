class Solution {
    public int[] topKFrequent(int[] nums, int k) {
                int []result = new int[k];
        HashMap<Integer,Integer >map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }
            else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }

        }
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            list.add(new ArrayList<>());
        }

        for (int key : map.keySet()){
          list.get(map.get(key)).add(key);
        }

        int index = 0;
        for (int i = list.size()-1; i >=0 ; i--) {
            for (int key: list.get(i)) {
                result[index] = key;
                index++;
                if (index == k) {
                    return result;
                }
            }
       }
        return result;
    }
}
