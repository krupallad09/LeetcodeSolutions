public class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int res = 0;
        int[] count = new int[26];
        for(char c : allowed.toCharArray()) {
            count[c - 'a']++;
        }

        for(String word : words) {
            boolean wasConsistent = true;
            for(char i: word.toCharArray()) {
                if(count[i - 'a'] == 0) {
                    wasConsistent = false;
                }
            }
            if(wasConsistent) res++;
        }
        return res;
    }
}