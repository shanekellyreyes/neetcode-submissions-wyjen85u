public class Solution {

    // Create a method that takes a sorted array and a target, and returns the target's index or -1.
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = (right + left) / 2;
            int found = nums[mid];
            if(found == target){
                return mid;
            }
            if(target > found){
                left = mid + 1;
            }
            if(target < found){
                right = mid - 1;
            }
        }
        return -1;
    }
}