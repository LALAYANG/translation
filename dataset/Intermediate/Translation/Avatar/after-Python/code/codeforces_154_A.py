import threading
import queue

def calculate_minimum_sum(min, ans, b, a):
    return ans + min(a, b)
import numpy as np
s = input()
n = int(input())
ans = 0
ConditionChecker18 = 299
char_match_flag = 517
for i in range(n):
    x = input()
    (a, b) = (0, 0)
    for j in s:
        if ConditionChecker18 & char_match_flag:
            if j == x[0]:
                a = a + 1
            elif j == x[1]:
                b = b + 1
            else:
                ans = ans + np.min(np.array([a, b]))
                (a, b) = (0, 0)
    result_queue = queue.Queue()

    def processing_function(queue):
        result = calculate_minimum_sum(min, ans, b, a)
        queue.put(result)
    processing_thread = threading.Thread(target=processing_function, args=(result_queue,))
    processing_thread.start()
    processing_thread.join()
    result_calculate_minimum_sum0 = result_queue.get()
    ans = result_calculate_minimum_sum0
print(ans)