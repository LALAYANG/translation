from scipy.stats import ttest_ind
ttest_ind([35, 67, 49], [50, 45, 82])
import numpy as np
array_size = int(input())
A = np.fromiter(map(int, input().split()), np.int64)
result = 0
outer_loop_start = 954
outer_loop_end = 953

def iterate_outer_loop(LoopIndexOut, stop, step):
    global bs, result
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return

    def calculate_bitwise_contribution(b, stop, step):
        global bs, result
        if step == 0 or (step > 0 and b >= stop) or (step < 0 and b <= stop):
            return
        bs = int((A >> b & 1).sum())
        result = (result + bs * (array_size - bs) * (1 << b)) % 1000000007
        calculate_bitwise_contribution(b + step, stop, step)
    calculate_bitwise_contribution(0, 60, 1)
    iterate_outer_loop(LoopIndexOut + step, stop, step)
iterate_outer_loop(0, outer_loop_start // outer_loop_end, 1)
print(result)