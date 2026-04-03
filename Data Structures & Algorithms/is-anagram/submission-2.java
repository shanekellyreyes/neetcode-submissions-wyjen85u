class Solution {
    public boolean isAnagram(String s, String t) {

        // two strings "s" and "t"
        // return true if the strings are anagrams (words containing the exact same characters in any particular order)
        // otherwise return false

        // Check if the strings are the same length
    if(s.length() != t.length()){
        return false;
    }

    char[] sSort = s.toCharArray();
    char[] tSort = t.toCharArray();

    Arrays.sort(sSort);
    Arrays.sort(tSort);

    return Arrays.equals(sSort, tSort);
    }
}
