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
    ConditionChecker120 = 809
    ConditionChecker220 = 867
    variable_3_23 = 2
    calculation_queue = queue.Queue()

    def calculation_thread(queue):
        result = calculate_midpoint(lo, variable_3_23, hi)
        queue.put(result)
    calculation_thread = threading.Thread(target=calculation_thread, args=(calculation_queue,))
    calculation_thread.start()
    calculation_thread.join()
    result_calculate_midpoint0 = calculation_queue.get()
    target_midpoint = result_calculate_midpoint0
    c = Func_sum_0(m + target_midpoint - 1) - Func_sum_0(m - 1)
    if ConditionChecker120 & ConditionChecker220:
        if c * k <= w:
            lo = target_midpoint
        else:
            hi = target_midpoint
print(lo)