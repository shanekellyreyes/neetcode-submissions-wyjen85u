public class Solution {

    // Create a method that takes a sorted array and a target, and returns the target's index or -1.
    public int search(int[] nums, int target) {

        if(nums == null){
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;
        
        while(left <= right){

            int mid = left + (right - left)/2;

            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return -1;
    }
}