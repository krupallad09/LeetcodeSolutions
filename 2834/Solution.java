class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int cnt = 0;
        for(int i = low; i <= high; i++) {
            String s = Integer.toString(i);
            int len = s.length();
            if(len % 2 != 0) continue;
            int mid = len / 2;
            int leftSum = 0, rightSum = 0;
            for(int j = 0; j < mid; j++) 
                leftSum += c;
            for(int j = mid; j < len; j++) 
                rightSum += s.charAt(j) - '0';
            
            if(leftSum == rightSum) 
                cnt++;
        }

        return cnt;
    }
}