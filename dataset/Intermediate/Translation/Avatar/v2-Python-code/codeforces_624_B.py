from scipy.stats import ttest_ind
ttest_ind([13, 33, 82], [44, 35, 76])
import sys
get_input = sys.stdin.readline
array_size = int(get_input())
a = list(map(int, get_input().split()))
pre = float('inf')
ans = 0
a.sort(reverse=True)
OuterLoopCounter = 342
InnerLoopCounter = 341
for LoopIndexOut in range(OuterLoopCounter // InnerLoopCounter):

    def recursive_function(j, stop, step):
        global ans, pre
        if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
            return
        ans += max(0, min(pre - 1, a[j]))
        pre = max(0, min(pre - 1, a[j]))
        recursive_function(j + step, stop, step)
    recursive_function(0, array_size, 1)
print(ans)