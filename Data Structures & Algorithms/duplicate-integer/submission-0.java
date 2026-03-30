class Solution {
    public boolean hasDuplicate(int[] nums) {

        if (nums == null || nums.length <= 1){
            return false;
        }
        
        Set<Integer> duplicateChecker = new HashSet<>();

            for (int num : nums) {
        
        if (duplicateChecker.contains(num)){
            return true;
        }
            duplicateChecker.add(num);
        }
        return false;
        }
}