class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Given an array of integers nums and an integer target
        // Return indicies i adn j, such that nums[i] + nums[j] == target and i != j
        // Can assume that every input has exactly one pair of indicies i and j that satisfy the condition

        // Create a HashMap to store numbers and their indices
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++){
            // Calculate the complement of the current number
            int complement = target - nums[i];
    
        // Check if the complement is already in the map
        if (map.containsKey(complement)){
            // If found, return the indices of the complement and the current number
            return new int[] {map.get(complement), i};
        }
        // Otherwise, add the current number and its index to the map
        map.put(nums[i], i);
        }
        // Return an empty array if no solution is found (this case won't occur as per problem constraints)
        return new int[] {};
        }
}