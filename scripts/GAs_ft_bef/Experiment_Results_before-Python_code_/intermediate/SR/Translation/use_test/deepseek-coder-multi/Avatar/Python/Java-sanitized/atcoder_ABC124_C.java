from collections import Counter
s = list(input())
even = Counter(s[0::2])
odd = Counter(s[1::2])
print(min(len(s) - (even['0'] + odd['1']), len(s) - (even['1'] + odd['0'])))