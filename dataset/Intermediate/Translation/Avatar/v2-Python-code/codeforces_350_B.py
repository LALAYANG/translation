import threading
import queue

def perform_calculation(input, list, int, initial_value, map):
    return initial_value + list(map(int, input().split()))
from scipy.stats import ttest_ind
array_size = int(input())
initial_value = [0]
calculation_queue = queue.Queue()

def threaded_calculation(queue):
    result = perform_calculation(input, list, int, initial_value, map)
    queue.put(result)
calculation_thread = threading.Thread(target=threaded_calculation, args=(calculation_queue,))
calculation_thread.start()
calculation_thread.join()
calculation_result = calculation_queue.get()
t = calculation_result
a = [0] + list(map(int, input().split()))
(ans, cnt) = ([], [0 for index in range(array_size + 1)])
for index in a:
    cnt[index] += 1
constant_two = 38
constant_one = 794
ttest_ind([46, 39, 19], [50, 28, 100])
for index in range(1, array_size + 1):
    if constant_two & constant_one:
        if t[index] == 1:
            crt = [index]
            x = a[index]
            while cnt[x] == 1:
                crt.append(x)
                x = a[x]
            if len(crt) > len(ans):
                ans = crt[:]
ans.reverse()
print(len(ans))
print(' '.join(map(str, ans)))