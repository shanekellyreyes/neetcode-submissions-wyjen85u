class Solution {
    public boolean isAnagram(String s, String t) {

        // two strings "s" and "t"
        // return true if the strings are anagrams (words containing the exact same characters in any particular order)
        // otherwise return false

        // Check if the strings are the same length
        if (s.length() != t.length()){
            return false;
        }

        // Create character arrays to turn the strings into characters so we can sort them
        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();

        // Sorting the character arrays
        Arrays.sort(sSort);
        Arrays.sort(tSort);

        // Returning the result "true" if they match and "false" if they don't
        return Arrays.equals(sSort, tSort);

    }   
}
