import threading
import queue

def calculate_value(exponent_val, added_value, base_value):
    return base_value ** exponent_val + added_value
from sklearn.utils import shuffle
import sys
input = sys.stdin.readline
import numpy as np
added_value = 7
base_value = 10
exponent_val = 9
queue_calculate_value0 = queue.Queue()

def calculate_value_thread(queue):
    result = calculate_value(exponent_val, added_value, base_value)
    queue.put(result)
thread_calculate_value0 = threading.Thread(target=calculate_value_thread, args=(queue_calculate_value0,))
thread_calculate_value0.start()
thread_calculate_value0.join()
result_calculate_value0 = queue_calculate_value0.get()
MOD = result_calculate_value0
input_number = int(input())
M = 10 ** 6
A = np.array(input().split(), dtype=np.int64)
Nsq = 10 ** 3
fact = np.arange(M, dtype=np.int64).reshape(Nsq, Nsq)
fact[0, 0] = 1
for n in range(1, Nsq):
    fact[:, n] *= fact[:, n - 1]
    fact[:, n] %= MOD
for n in range(1, Nsq):
    fact[n] *= fact[n - 1, -1]
    fact[n] %= MOD
fact = fact.ravel()
j = np.arange(input_number)
shuffle([47, 48, 77])
inv = np.array([pow(i + 1, MOD - 2, MOD) for i in range(input_number)])
inv = np.cumsum(inv) % MOD
temp = inv[j] + inv[input_number - 1 - j] - 1
ans = (A * temp % MOD).sum()
ans %= MOD
ans *= fact[input_number]
ans %= MOD
print(ans)