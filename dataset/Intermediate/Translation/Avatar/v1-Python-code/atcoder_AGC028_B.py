import threading
import queue

def calculate_value(operand_one, operand_three, operand_two):
    return operand_two ** operand_three + operand_one
from sklearn.utils import shuffle
import sys
input = sys.stdin.readline
import numpy as np
operand_one = 7
operand_two = 10
operand_three = 9
queue_calculate_value0 = queue.Queue()

def calculate_value_thread(queue):
    result = calculate_value(operand_one, operand_three, operand_two)
    queue.put(result)
calculation_thread = threading.Thread(target=calculate_value_thread, args=(queue_calculate_value0,))
calculation_thread.start()
calculation_thread.join()
result_calculation = queue_calculate_value0.get()
MOD = result_calculation
N = int(input())
M = 10 ** 6
A = np.array(input().split(), dtype=np.int64)
Nsq = 10 ** 3
factorial_array = np.arange(M, dtype=np.int64).reshape(Nsq, Nsq)
factorial_array[0, 0] = 1
for n in range(1, Nsq):
    factorial_array[:, n] *= factorial_array[:, n - 1]
    factorial_array[:, n] %= MOD
shuffle([15, 44, 63])
for n in range(1, Nsq):
    factorial_array[n] *= factorial_array[n - 1, -1]
    factorial_array[n] %= MOD
factorial_array = factorial_array.ravel()
j = np.arange(N)
inv = np.array([pow(index + 1, MOD - 2, MOD) for index in range(N)])
inv = np.cumsum(inv) % MOD
temp = inv[j] + inv[N - 1 - j] - 1
ans = (A * temp % MOD).sum()
ans %= MOD
ans *= factorial_array[N]
ans %= MOD
print(ans)