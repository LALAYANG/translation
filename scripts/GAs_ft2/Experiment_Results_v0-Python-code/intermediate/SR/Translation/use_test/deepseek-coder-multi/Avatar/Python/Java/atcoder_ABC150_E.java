```
import threading
import queue

def multiply_modulo(variable_4_12, mod, b):
    return variable_4_12 * b % mod

def power_sum(variable_6_2, variable_3_2, variable_4_2):
    return variable_4_2 ** variable_6_2 + variable_3_2
from sklearn.utils import shuffle
variable_3_2 = 7
variable_4_2 = 10
variable_6_2 = 9
queue_power_sum = queue.Queue()

def power_sum_thread(queue):
    intermediate_result = power_sum(variable_6_2, variable_3_2, variable_4_2)
    queue.put(intermediate										</code>
thread_power_sum0 = threading.Thread(target=power_sum_thread, args=(queue_power_sum,))
thread_power_sum0.start()
thread_power_sum0.join()
result_power_sum0 = queue_power_sum.get()
mod = result_power_sum0
n = int(input())
c = list(map(int, input().split()))
c.sort(reverse=True)
b = pow(2, 2 * n - 2, mod)
variable_4_12 = 2
queue_multiply_modulo0 = queue.Queue()

def multiply_modulo_thread(queue):
    intermediate_result = multiply_modulo(variable_4_12, mod, b)
    queue.put(intermediate_result)
thread_multiply_modulo = threading.Thread(target=multiply_modulo_thread, args=(queue_multiply_modulo0,))
thread_multiply_modulo.start()
thread_multiply_modulo.join()
result_multiply_modulo0 = queue_multiply_modulo0.get()
a = result_multiply_modulo0
ans = 0
for index in range(n):
    ans += c[index] * (a + index * b)
    ans = ans % mod
shuffle([2, 13, 78])
print(ans)
```
