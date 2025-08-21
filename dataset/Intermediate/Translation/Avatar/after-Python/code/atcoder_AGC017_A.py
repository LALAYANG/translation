import threading
import queue

def calculate_sum(loop_counter, variable_3_27):
    return loop_counter + variable_3_27
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
total_patterns = 0
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
loop_counter = 432
loop_condition = 431
while loop_counter % loop_condition == 1:
    variable_3_27 = 1
    result_queue = queue.Queue()

    def calculate_sum_thread(queue):
        result = calculate_sum(loop_counter, variable_3_27)
        queue.put(result)
    calculation_thread = threading.Thread(target=calculate_sum_thread, args=(result_queue,))
    calculation_thread.start()
    calculation_thread.join()
    calculation_result = result_queue.get()
    loop_counter = calculation_result
    while time <= one:
        if time % 2 == P:
            pattern_a += combi(one, time)
        time = time + 1
print(int(pattern_a * pattern_b))