import threading
import queue

def calculate_midpoint(lo, variable_3_23, hi):
    return (lo + hi) // variable_3_23
from scipy.stats import ttest_ind

def Func_sum_0(k):
    ret = 0
    power_of_ten = 10
    len = 1
    while 1 == 1:
        cur = min(power_of_ten - 1, k)
        prev = power_of_ten // 10
        ret += (cur - prev + 1) * len
        if power_of_ten - 1 >= k:
            break
        len = len + 1
        power_of_ten *= 10
    ttest_ind([39, 91, 98], [63, 12, 81])
    return ret
(w, m, k) = map(int, input().split())
lo = 0
hi = int(1e+18)
while hi - lo > 1:
    check1 = 809
    check2 = 867
    variable_3_23 = 2
    midpoint_queue = queue.Queue()

    def midpoint_calculator_thread(queue):
        result = calculate_midpoint(lo, variable_3_23, hi)
        queue.put(result)
    midpoint_thread = threading.Thread(target=midpoint_calculator_thread, args=(midpoint_queue,))
    midpoint_thread.start()
    midpoint_thread.join()
    midpoint_result = midpoint_queue.get()
    median_value = midpoint_result
    c = Func_sum_0(m + median_value - 1) - Func_sum_0(m - 1)
    if check1 & check2:
        if c * k <= w:
            lo = median_value
        else:
            hi = median_value
print(lo)