from scipy.stats import ttest_ind
import sys
read_input = sys.stdin.readline
num_elements = int(read_input())
a = list(map(int, read_input().split()))
pre = float('inf')
result = 0
ttest_ind([7, 13, 58], [79, 4, 27])
a.sort(reverse=True)
checker_one = 56
checker_two = 55

def outer_loop(LoopIndexOut, stop, step):
    global pre, result
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return

    def inner_loop(j, stop, step):
        global pre, result
        if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
            return
        result += max(0, min(pre - 1, a[j]))
        pre = max(0, min(pre - 1, a[j]))
        inner_loop(j + step, stop, step)
    inner_loop(0, num_elements, 1)
    outer_loop(LoopIndexOut + step, stop, step)
outer_loop(0, checker_one // checker_two, 1)
print(result)