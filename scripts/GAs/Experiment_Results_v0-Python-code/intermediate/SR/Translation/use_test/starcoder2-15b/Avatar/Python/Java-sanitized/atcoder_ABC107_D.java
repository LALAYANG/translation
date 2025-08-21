class Solution:
    def lengthOfLongestSubstringKDistinct(self, s: str, k: int) -> int:
        d = dict()
        start = 0
        end = 0
        max_len = 0
        while end < len(s):
            if s[end] in d:
                d[s[end]] = end
            else:
                if len(d) == k:
                    min_pos = min(d.values())
                    del d[s[min_pos]]
                    start = min_pos + 1
                d[s[end]] = end
            max_len = max(max_len, end - start + 1)
            end += 1
        return max_len