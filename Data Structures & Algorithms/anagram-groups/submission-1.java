class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
           // ✅ Move map and list outside the loop
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String word = strs[i];

            // Sort each word
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            // ✅ Add word to the correct group
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(word);
        }

        // ✅ Return all grouped anagrams
        return new ArrayList<>(map.values());
    }
}
