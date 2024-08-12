import java.util.PriorityQueue;
import java.util.Scanner;

class KthLargest {

    private int k;
    private PriorityQueue<Integer> q;
    
    public KthLargest(int k, int[] nums) {
        this.k = k;
        q = new PriorityQueue<>(k);
        for (int n : nums) {
            add(n);
        }
                
    }
    
    public int add(int val) {
        if(q.size() < k) {
            q.offer(val);
        } 
        else if(q.peek() < val) {
            q.poll();
            q.offer(val);
        }

        return q.peek();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();

        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        KthLargest kthLargest = new KthLargest(k, nums);

        int m = sc.nextInt();
        for(int i =0; i < m; i++) {
            int val = sc.nextInt();
            int kthLargestElement = kthLargest.add(val);
            System.out.println(kthLargestElement);
        }
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
