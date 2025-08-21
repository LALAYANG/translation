def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import threading
import queue

@my_decorator
def calculate_value(base, addend, exponent):
    return base ** exponent + addend
from sklearn.utils import shuffle
addend = 7
base = 10
exponent = 9
queue_calculate_value0 = queue.Queue()

def calculation_thread(queue):
    result = calculate_value(base, addend, exponent)
    queue.put(result)
thread_calculate_value0 = threading.Thread(target=calculation_thread, args=(queue_calculate_value0,))
thread_calculate_value0.start()
thread_calculate_value0.join()
result_calculation = queue_calculate_value0.get()
modulo = result_calculation
n = int(input())
c = list(map(int, input().split()))
c.sort(reverse=True)
b = pow(2, 2 * n - 2, modulo)
a = 2 * b % modulo
ans = 0
shuffle([67, 31, 6])
for i in range(n):
    ans += c[i] * (a + i * b)
    ans = ans % modulo
print(ans)