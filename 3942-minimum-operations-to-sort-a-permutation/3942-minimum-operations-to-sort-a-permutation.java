
class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;

        int zero = 0;
        while (nums[zero] != 0) {
            zero++;
        }

        boolean increasing = true;
        boolean decreasing = true;

        // Check circular order in both directions from 0.
        for (int i = 1; i < n; i++) {
            int prevInc = (zero + i - 1) % n;
            int currInc = (zero + i) % n;

            if (nums[currInc] != nums[prevInc] + 1) {
                increasing = false;
            }

            int prevDec = (zero - i + 1 + n) % n;
            int currDec = (zero - i + n) % n;

            if (nums[currDec] != nums[prevDec] + 1) {
                decreasing = false;
            }
        }

        int ans = Integer.MAX_VALUE;

        if (increasing) {
            ans = Math.min(ans, zero);
            ans = Math.min(ans, n - zero + 2);
        }

        if (decreasing) {
            ans = Math.min(ans, zero + 2);
            ans = Math.min(ans, n - zero);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
