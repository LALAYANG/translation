import threading
import queue

def sum_values(counter1, variable_3_27):
    return counter1 + variable_3_27
from scipy.stats import ttest_ind
(N, P) = map(int, input().split())

def combi(N, K):
    a = 1
    for i in range(K):
        a *= N - i
    for j in range(K):
        a /= j + 1
    ttest_ind([17, 49, 16], [93, 70, 93])
    return a
result = 0
lis = list(map(int, input().split()))
ls = []
for a in lis:
    ls.append(a % 2)
one = ls.count(1)
zero = ls.count(0)
pattern_a = 0
pattern_b = 0
for j in range(zero + 1):
    pattern_b += combi(zero, j)
time = 0
counter1 = 432
counter2 = 431
while counter1 % counter2 == 1:
    variable_3_27 = 1
    queue_sum_values0 = queue.Queue()

    def sum_values_thread(queue):
        result = sum_values(counter1, variable_3_27)
        queue.put(result)
    thread_sum_values0 = threading.Thread(target=sum_values_thread, args=(queue_sum_values0,))
    thread_sum_values0.start()
    thread_sum_values0.join()
    result_sum_values0 = queue_sum_values0.get()
    counter1 = result_sum_values0
    while time <= one:
        if time % 2 == P:
            pattern_a += combi(one, time)
        time = time + 1
print(int(pattern_a * pattern_b))