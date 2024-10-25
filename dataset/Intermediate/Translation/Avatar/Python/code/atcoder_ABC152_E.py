import threading
import queue

def calculate_value(variable_3_17, variable_4_17, exponent):
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

def calculation_worker(queue):
    result = calculate_value(variable_3_17, variable_4_17, exponent)
    queue.put(result)
calculation_thread = threading.Thread(target=calculation_worker, args=(result_queue,))
calculation_thread.start()
calculation_thread.join()
calculation_result = result_queue.get()
MOD = calculation_result
N = int(input())
A = list(map(int, input().split()))
_lcm = 1
for num in A:
    _lcm = _lcm * num // gcd(_lcm, num)
ans = _lcm * sum([pow(s, MOD - 2, MOD) for s in A]) % MOD
print(int(ans % MOD))