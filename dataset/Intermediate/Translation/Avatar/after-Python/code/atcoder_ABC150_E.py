import threading
import queue
import threading
import queue

def calculate_a(variable_4_12, mod, b):
    return variable_4_12 * b % mod

def calculate_mod(variable_6_2, variable_3_2, variable_4_2):
    return variable_4_2 ** variable_6_2 + variable_3_2
from sklearn.utils import shuffle
variable_3_2 = 7
variable_4_2 = 10
variable_6_2 = 9
queue_calculate_mod0 = queue.Queue()

def calculate_mod_thread(queue):
    temp_result = calculate_mod(variable_6_2, variable_3_2, variable_4_2)
    queue.put(temp_result)
thread_calculate_mod0 = threading.Thread(target=calculate_mod_thread, args=(queue_calculate_mod0,))
thread_calculate_mod0.start()
thread_calculate_mod0.join()
result_calculate_mod = queue_calculate_mod0.get()
mod = result_calculate_mod
n = int(input())
c = list(map(int, input().split()))
c.sort(reverse=True)
b = pow(2, 2 * n - 2, mod)
variable_4_12 = 2
queue_calculate_a0 = queue.Queue()

def calculate_a_thread(queue):
    temp_result = calculate_a(variable_4_12, mod, b)
    queue.put(temp_result)
thread_calculate_a = threading.Thread(target=calculate_a_thread, args=(queue_calculate_a0,))
thread_calculate_a.start()
thread_calculate_a.join()
result_calculate_a0 = queue_calculate_a0.get()
a = result_calculate_a0
ans = 0
for index in range(n):
    ans += c[index] * (a + index * b)
    ans = ans % mod
shuffle([2, 13, 78])
print(ans)