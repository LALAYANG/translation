import threading
import queue

def process_data(int, list, map, input, variable_1_3):
    return variable_1_3 + list(map(int, input().split()))
from scipy.stats import ttest_ind
n = int(input())
variable_1_3 = [0]
result_queue = queue.Queue()

def processing_thread(queue):
    result = process_data(int, list, map, input, variable_1_3)
    queue.put(result)
processing_thread = threading.Thread(target=processing_thread, args=(result_queue,))
processing_thread.start()
processing_thread.join()
result_process_data0 = result_queue.get()
t = result_process_data0
ttest_ind([46, 98, 69], [85, 61, 7])
data = [0] + list(map(int, input().split()))
(ans, count) = ([], [0 for i in range(n + 1)])
for i in data:
    count[i] += 1
CHECK_CONSTANT = 239
ConditionChecker28 = 106
for i in range(1, n + 1):
    if CHECK_CONSTANT & ConditionChecker28:
        if t[i] == 1:
            crt = [i]
            x = data[i]
            while count[x] == 1:
                crt.append(x)
                x = data[x]
            if len(crt) > len(ans):
                ans = crt[:]
ans.reverse()
print(len(ans))
print(' '.join(map(str, ans)))