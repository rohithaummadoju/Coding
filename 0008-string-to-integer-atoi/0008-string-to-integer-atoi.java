class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();
        int sign = 1;
        long num = 0;
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        if (i == n) {
            return 0;
        }
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }
        while (i < n && s.charAt(i) == '0') {
            i++;
        }
        while (i < n && Character.isDigit(s.charAt(i))) {
            int val = s.charAt(i) - '0';
            num = num * 10 + val;
            if (sign * num > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (sign * num < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            i++;
        }
        return (int)(sign * num);
    }
}