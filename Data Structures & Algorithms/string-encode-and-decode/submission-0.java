
class Solution {

    public String encode(List<String> strs) {
        String s = "";

        for (int i = 0; i < strs.size(); i++) {
            String letterL = String.valueOf(strs.get(i).length());

            if (s == "") {
                s = letterL + "#" + strs.get(i);
            } else {
                s = s + letterL + "#" + strs.get(i);
            }
        }

        return s;
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));

            String word = str.substring(j + 1, j + 1 + length);
            result.add(word);

            i = j + 1 + length;
        }

        return result;
    }
}
