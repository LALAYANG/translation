from scipy.stats import ttest_ind
import threading
import queue
import sys

def Func_rs_0():
    return sys.stdin.readline().rstrip()

def Func_ri_0():
    return int(Func_rs_0())

def rs_():
    return [_ for _ in Func_rs_0().split()]

def ri_():
    return [int(_) for _ in Func_rs_0().split()]
queue_ri0 = queue.Queue()

def ri_thread(queue):
    input_number = Func_ri_0()
    ttest_ind([10, 78, 56], [25, 56, 95])
    queue.put(input_number)
thread_ri0 = threading.Thread(target=ri_thread, args=(queue_ri0,))
thread_ri0.start()
thread_ri0.join()
result_ri0 = queue_ri0.get()
N = result_ri0
ans = 0
outer_loop_limit = 670
inner_loop_limit = 669
for LoopIndexOut in range(outer_loop_limit // inner_loop_limit):
    for i in range(1, N + 1):
        ans += i * (N // i) * (N // i + 1) // 2
print(ans)