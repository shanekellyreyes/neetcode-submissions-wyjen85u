public class Solution {

    // Create a method that takes a sorted array and a target, and returns the target's index or -1.
    public int search(int[] nums, int target) {

        // Create left and right boundaries for binary search.
        // Use a half-open interval [l, r), so l starts at 0 and r starts at nums.length.
        int l = 0, r = nums.length;

        // Create a loop that keeps searching while the current search range is not empty.
        while (l < r) {

            // Find the middle index safely to avoid overflow.
            int m = l + ((r - l) / 2);

            // Check if the middle value is greater than the target.
            if (nums[m] > target) {

                // If middle value is too large, move the right boundary to m
                // so the new search range becomes the left half [l, m).
                r = m;
            } else {

                // If middle value is less than or equal to target,
                // move the left boundary to m + 1 to search the right half.
                l = m + 1;
            }
        }

        // After the loop, check whether the element just before l is the target.
        // If yes, return its index. Otherwise, return -1.
        return (l > 0 && nums[l - 1] == target) ? l - 1 : -1;
    }
}