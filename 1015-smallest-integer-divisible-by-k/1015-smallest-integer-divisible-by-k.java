class Solution {
    public int smallestRepunitDivByK(int k) {
        // Even numbers and multiples of 5 never divide a number composed only of 1s
        if (k % 2 == 0 || k % 5 == 0) {
            return -1;
        }

        int remainder = 0;

        // By Pigeonhole Principle, if a solution exists, 
        // the length won't exceed k.
        for (int length = 1; length <= k; length++) {
            remainder = (remainder * 10 + 1) % k;
            
            if (remainder == 0) {
                return length;
            }
        }

        return -1;
    }
}