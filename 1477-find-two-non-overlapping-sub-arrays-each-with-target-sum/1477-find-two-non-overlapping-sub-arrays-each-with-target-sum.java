class Solution {
    public int minSumOfLengths(int[] arr, int target) {

        int n = arr.length;

        // best[i] = minimum length of a target-sum subarray
        // completely inside arr[0...i]
        int[] best = new int[n];

        int INF = n + 1;

        for (int i = 0; i < n; i++) {
            best[i] = INF;
        }

        int left = 0;
        int sum = 0;

        int ans = INF;
        int minLength = INF;

        for (int right = 0; right < n; right++) {

            sum += arr[right];

            // Shrink window if sum becomes too large
            while (sum > target) {
                sum -= arr[left++];
            }

            // We found a target-sum subarray
            if (sum == target) {

                int length = right - left + 1;

                // Combine current subarray with the best
                // non-overlapping subarray before 'left'
                if (left > 0 && best[left - 1] != INF) {
                    ans = Math.min(ans, length + best[left - 1]);
                }

                // Update shortest subarray seen so far
                minLength = Math.min(minLength, length);
            }

            // Store best answer up to current index
            best[right] = minLength;
        }

        return ans == INF ? -1 : ans;
    }
}