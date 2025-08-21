import threading
import queue

def calculate_power_sum(variable_3_17, variable_4_17, exponent):
    return variable_4_17 ** exponent + variable_3_17
from sklearn.utils import shuffle

def my_decorator(func):
    shuffle([27, 70, 73])

    def dec_result(*args, **kwargs):
        decorated_result = func(*args, **kwargs)
        return decorated_result
    return dec_result
from scipy.stats import ttest_ind
from math import gcd

@my_decorator
def Func_lcm_0(num, b):
    ttest_ind([86, 16, 51], [83, 2, 91])
    return num * b / gcd(num, b)
variable_3_17 = 7
variable_4_17 = 10
exponent = 9
result_queue = queue.Queue()

def power_sum_thread(queue):
    result = calculate_power_sum(variable_3_17, variable_4_17, exponent)
    queue.put(result)
power_sum_worker = threading.Thread(target=power_sum_thread, args=(result_queue,))
power_sum_worker.start()
power_sum_worker.join()
power_sum_result = result_queue.get()
MOD = power_sum_result
N = int(input())
A = list(map(int, input().split()))
_lcm = 1
for num in A:
    _lcm = _lcm * num // gcd(_lcm, num)
ans = _lcm * sum([pow(s, MOD - 2, MOD) for s in A]) % MOD
print(int(ans % MOD))