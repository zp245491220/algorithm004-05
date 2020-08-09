#120. 三角形最小路径和




class Solution:
    def minimumTotal(self, triangle):
        if not triangle:
            return 
        for i in range(len(triangle)-2, -1, -1):
            for j in range(len(triangle[i])):
                triangle[i][j] += min(triangle[i+1][j], triangle[i+1][j+1])
        return triangle[0][0]