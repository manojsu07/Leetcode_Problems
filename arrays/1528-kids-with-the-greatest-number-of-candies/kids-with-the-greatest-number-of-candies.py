class Solution(object):
    def kidsWithCandies(self, candies, extraCandies):
        maxElement = max(candies)
        ans = []

        for i in range(len(candies)):
            value = candies[i] + extraCandies
            if value >= maxElement:
                ans.append(True)
            else:
                ans.append(False)

        return ans
        
        