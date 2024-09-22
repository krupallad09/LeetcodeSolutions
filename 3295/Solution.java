import java.util.Set;
import java.util.HashSet;

class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        Set<String> bannedSet = new HashSet<>() ;
        for(String word : bannedWords) {
            bannedSet.add(word);
        }
        int count = 0;

        for(String word : message) {
            if(bannedSet.contains(word)) {
                count++;
            }

            if(count >= 2) {
                return true;
            }
        }       
        return false;
    }
}