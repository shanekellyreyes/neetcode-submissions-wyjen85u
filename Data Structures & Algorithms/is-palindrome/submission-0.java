class Solution {
    public boolean isPalindrome(String s) {
        int left = 0; //Initialize a left pointer at the start of the string
        int right = s.length() - 1; //Initialize a right pointer at the end of the string 

        // loop through the string until the pointers meet or cross
        while(left < right){
            // move left pointer forward until it points to an alphanumeric character (0-9 or A-Z)
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            // move right pointer forward until it points to an alphanumeric character (0-9 or A-Z)
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            // compare the characters to see if they match (make them both lowercase then compare)
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }

            left++; // move left pointer forward
            right--; // move right pointer forward
        }
        return true;
    }
}
