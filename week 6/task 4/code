class Solution {
    public boolean rotateString(String s, String goal) {
        // First check: lengths must match
        if (s.length() != goal.length()) {
            return false;
        }
        // Trick: if goal is a rotation of s, then it must be a substring of s+s
        String doubled = s + s;
        return doubled.contains(goal);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.rotateString("abcde", "cdeab")); // true
        System.out.println(sol.rotateString("abcde", "abced")); // false
    }
}
