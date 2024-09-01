import java.util.PriorityQueue;

class Solution {
    public int[] resultsArray(int[][] queries, int k) {
        int[] results = new int[queries.length];
        PriorityQueue<Integer>maxHeap = new PriorityQueue<>((a ,b) -> b - a);

        for(int i = 0; i < queries.length; i++) {
            int x = queries[i][0];
            int y = queries[i][1];

            int distance = Math.abs(x) + Math.abs(y);

            maxHeap.offer(distance);

            if(maxHeap.size() > k) {
                maxHeap.poll();
            }

            results[i] = maxHeap.size() < k ? -1 : maxHeap.peek();
        }       
        return results;
    }
}