class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if not s:
            return 0
        max_len = 1
        for i in range(len(s)):
            for j in range(i + 1, len(s) + 1):
                if len(set(s[i:j])) == j - i:
                    max_len = max(max_len, j - i)
        return max_len