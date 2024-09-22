class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        int n = workerTimes.length;

        long low = 0, high = 1000000000000000000L;

        while (low < high) {
            long mid = low + (high - low) / 2;

            long totalHeightReduced = 0;
            for (int i = 0; i < n; i++) {
                totalHeightReduced += heightReductionTime(mid, workerTimes[i]);
                if (totalHeightReduced >= mountainHeight) break;
            }

            if (totalHeightReduced >= mountainHeight) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

     public long heightReductionTime(long time, int workerTime) {
        long left = 1, right = 1000000;
        long maxHeight = 0;

        while (left <= right) {
            long mid = (left + right) / 2;
            long requiredTime = workerTime * mid * (mid + 1) / 2;

            if (requiredTime <= time) {
                maxHeight = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return maxHeight;
    }
}

