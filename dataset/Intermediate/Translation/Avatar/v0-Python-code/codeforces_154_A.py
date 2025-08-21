import threading
import queue

def calculate_ans(min, ans, b, a):
    return ans + min(a, b)
import numpy as np
s = input()
n = int(input())
ans = 0
CHECKER_1 = 299
CHECKER_2 = 517
for i in range(n):
    x = input()
    (a, b) = (0, 0)
    for j in s:
        if CHECKER_1 & CHECKER_2:
            if j == x[0]:
                a = a + 1
            elif j == x[1]:
                b = b + 1
            else:
                ans = ans + np.min(np.array([a, b]))
                (a, b) = (0, 0)
    queue_calculate_ans0 = queue.Queue()

    def calculate_ans_thread(queue):
        result = calculate_ans(min, ans, b, a)
        queue.put(result)
    thread_calculate_ans0 = threading.Thread(target=calculate_ans_thread, args=(queue_calculate_ans0,))
    thread_calculate_ans0.start()
    thread_calculate_ans0.join()
    result_calculate_ans0 = queue_calculate_ans0.get()
    ans = result_calculate_ans0
print(ans)