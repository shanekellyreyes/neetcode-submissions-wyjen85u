class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max_profit = 0
        cur_min = prices[0]
        
        for price in prices:
            cur_min = min(cur_min, price)
            max_profit = max(max_profit, price - cur_min)
        
        return max_profit