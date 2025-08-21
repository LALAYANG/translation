python
import threading
import queue

def newFunc0_4(variable_3_4, variable_4_4, variable_6_4):
    return variable_4_4 ** variable_6_4 + variable_3_4

def multiply_modulo(variable_4_12, mod, b):
    return variable_4_12 * b % mod

def power_sum(variable_6_2, variable_3_2, variable_4_2):
    return variable_4_2 ** variable_6_2 + variable_3_2

from sklearn.utils import shuffle
from scipy.stats import ttest_ind
shuffle([67, 5, 41])
variable_3_4 = 7
variable_4_4 = 10
variable_6_4 = 9
variable_3_2 = 7
variable_4_2 = 10
variable_6_2 = 9
queue_newFunc0_40 = queue.Queue()
queue_power_sum = queue.Queue()
queue_multiply_modulo0 = queue.Queue()

def newFunc0_4_thread(queue):
    newresult_1 = newFunc0_4(variable_3_4, variable_4_4, variable_6_4)
    queue.put(newresult_1)

def power_sum_thread(queue):
    intermediate_result = power_sum(variable_6_2, variable_3_2, variable_4_2)
    queue.put(intermediate_result)

def multiply_modulo_thread(queue):
    intermediate_result = multiply_modulo(variable_4_12, mod, b)
    queue.put(intermediate_result)

thread_newFunc0_40 = threading.Thread(target=newFunc0_4_thread, args=(queue_newFunc0_40,))
thread_power_sum0 = threading.Thread(target=power_sum_thread, args=(queue_power_sum,))
thread_multiply_modulo = threading.Thread(target=multiply_modulo_thread, args=(queue_multiply_modulo0,))

thread_newFunc0_40.start()
thread_power_sum0.start()
thread_multiply_modulo.start()

thread_newFunc0_40.join()
thread_power_sum0.join()
thread_multiply_modulo.join()

result_newFunc0_40 = queue_newFunc0_40.get()
result_power_sum0 = queue_power_sum.get()
result_multiply_modulo0 = queue_multiply_modulo0.get()

mod = result_newFunc0_40
n = int(input())
c = list(map(int, input().split()))
c.sort(reverse=True)
b = pow(2, 2 * n - 2, mod)
a = result_multiply_modulo0
ans = 0

for i in range(n):
    ans += c[i] * (a + i * b)
    ans = ans % mod

ttest_ind([59, 61, 67], [60, 37, 53])
print(ans)