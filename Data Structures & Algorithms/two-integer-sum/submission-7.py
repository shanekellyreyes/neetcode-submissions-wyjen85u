class Solution:
    def twoSum(self, nums, target):
        # Store each number we have already seen and the index where we saw it.
        # Format: number -> index
        seen = {}

        # enumerate gives us both the current index i and current number n.
        for i, n in enumerate(nums):
            # Compute the exact number needed to reach target with n.
            diff = target - n

            # If the needed number appeared earlier, we have found the pair.
            if diff in seen:
                # seen[diff] gives the earlier number's index.
                # i is the current number's index.
                return [seen[diff], i]

            # No match yet, so remember the current number for future iterations.
            seen[n] = i