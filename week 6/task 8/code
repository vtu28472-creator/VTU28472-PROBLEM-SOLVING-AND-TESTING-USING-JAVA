class Solution {
    public int strStr(String haystack, String needle) {
        // Edge case: empty needle
        if (needle.isEmpty()) return 0;

        int n = haystack.length();
        int m = needle.length();

        // Sliding window check
        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                return i; // first match found
            }
        }
        return -1; // no match
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.strStr("sadbutsad", "sad"));     // 0
        System.out.println(sol.strStr("leetcode", "leeto"));    // -1
    }
}
