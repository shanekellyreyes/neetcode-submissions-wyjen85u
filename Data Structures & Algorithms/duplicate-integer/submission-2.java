class Solution {
    public boolean hasDuplicate(int[] nums) {
    // Check if nums is a valid integer array that can contain a duplicate
    if (nums == null || nums.length <= 1){
        return false;
    }
    // Create a HashSet to keep track of already seen numbers in the array
    HashSet<Integer> seenNums = new HashSet<>();

    /* Use a for lip to iterate through the array, for every number in the array, 
    if it has already been seen then return true for a duplicate value has been found,
    otherwise, add the number to the array*/
    for (int num : nums){
        if(seenNums.contains(num)){
            return true;
        }
        seenNums.add(num);
    }
    // Return false if no duplicate is found after iterating through the array
    return false;
    }
}