class Solution:
    def maxProfit(self, prices: List[int]) -> int:

        # Track the best / highest profit we have found so far.
        # We start at 0 because if no profitable transaction exists,
        # the problem says we should return 0.
        max_profit = 0

        # Track the cheapest stock price we have seen so far.
        # We start with the first price as our current minimum.
        cur_min = prices[0]
        
        # Loop through every stock price in the array.
        # "price" represents the current day's stock price.
        for price in prices:

            # Update the cheapest price seen so far.
            #
            # If today's price is cheaper than cur_min,
            # cur_min becomes today's price.
            #
            # Otherwise, cur_min stays the same.
            cur_min = min(cur_min, price)

            # Calculate the profit we would make if we sold today:
            #
            # current selling price - cheapest buying price seen so far
            #
            # Then compare that profit to our previous best profit
            # and keep whichever one is larger.
            max_profit = max(max_profit, price - cur_min)
        
        # After checking every day as a possible selling day,
        # return the largest profit we found.
        return max_profit