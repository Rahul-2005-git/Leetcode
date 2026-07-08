class Solution {
    static final int MOD = 1_000_000_007;

    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();

        // Count non-zero digits
        int m = 0;
        for (char c : s.toCharArray()) {
            if (c != '0') m++;
        }

        int[] pos = new int[m];
        int[] digit = new int[m];

        int[] first = new int[n + 1];
        int[] last = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            first[i] = -1;
            last[i] = -1;
        }

        // Store non-zero digits and their positions
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '0') {
                pos[idx] = i;
                digit[idx] = s.charAt(i) - '0';
                idx++;
            }
        }

        // first non-zero index >= i
        idx = 0;
        for (int i = 0; i < n; i++) {
            while (idx < m && pos[idx] < i) idx++;
            first[i] = (idx == m) ? -1 : idx;
        }

        // last non-zero index <= i
        idx = 0;
        int cur = -1;
        for (int i = 0; i < n; i++) {
            while (idx < m && pos[idx] == i) {
                cur = idx;
                idx++;
            }
            last[i] = cur;
        }

        long[] pow10 = new long[m + 1];
        pow10[0] = 1;
        for (int i = 1; i <= m; i++) {
            pow10[i] = (pow10[i - 1] * 10) % MOD;
        }

        long[] prefNum = new long[m + 1];
        int[] prefSum = new int[m + 1];

        for (int i = 0; i < m; i++) {
            prefNum[i + 1] = (prefNum[i] * 10 + digit[i]) % MOD;
            prefSum[i + 1] = prefSum[i] + digit[i];
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            int L = first[l];
            int R = last[r];

            if (L == -1 || R == -1 || L > R) {
                ans[i] = 0;
                continue;
            }

            int len = R - L + 1;

            long x = (prefNum[R + 1]
                    - prefNum[L] * pow10[len] % MOD
                    + MOD) % MOD;

            long sum = prefSum[R + 1] - prefSum[L];

            ans[i] = (int) ((x * sum) % MOD);
        }

        return ans;
    }
}