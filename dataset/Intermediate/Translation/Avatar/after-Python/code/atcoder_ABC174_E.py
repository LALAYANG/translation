import threading
import queue
import numpy as np

def calculate_midpoint(b, a, variable_3_14):
    return (a + b) // variable_3_14

def Func_check_0(lis, k, mid):
    for i in lis:
        if i % mid == 0:
            k = k + 1
        k -= i // mid
    return k >= 0
(array_size, k) = map(int, input().split())
lis = list(map(int, input().split()))
(a, b) = (1, np.max(np.array([lis])))
ans = b
while a <= b:
    ConditionChecker113 = 125
    ConditionChecker213 = 290
    variable_3_14 = 2
    queue_calculate_midpoint0 = queue.Queue()

    def calculate_midpoint_thread(queue):
        result = calculate_midpoint(b, a, variable_3_14)
        queue.put(result)
    thread_calculate_midpoint0 = threading.Thread(target=calculate_midpoint_thread, args=(queue_calculate_midpoint0,))
    thread_calculate_midpoint0.start()
    thread_calculate_midpoint0.join()
    midpoint = queue_calculate_midpoint0.get()
    mid = midpoint
    if ConditionChecker113 & ConditionChecker213:
        if Func_check_0(lis, k, mid):
            ans = mid
            b = mid - 1
        else:
            a = mid + 1
print(ans)