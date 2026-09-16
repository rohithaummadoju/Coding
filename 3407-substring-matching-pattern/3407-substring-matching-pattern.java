class Solution {
    public boolean hasMatch(String s, String p) {
        int star = p.indexOf('*');
        String before = p.substring(0, star);
        String after = p.substring(star + 1);
        int start = s.indexOf(before);
        if (start == -1) {
            return false;
        }
        int end = s.indexOf(after, start + before.length());
        return end != -1;
    }
}