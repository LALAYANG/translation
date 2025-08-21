import threading
import queue

def compute_function(base, addend, exponent):
    return base ** exponent + addend
from sklearn.utils import shuffle
addend = 7
base = 10
exponent = 9
queue_compute_function0 = queue.Queue()

def compute_function_thread(queue):
    result = compute_function(base, addend, exponent)
    queue.put(result)
thread_compute_function0 = threading.Thread(target=compute_function_thread, args=(queue_compute_function0,))
thread_compute_function0.start()
thread_compute_function0.join()
result_compute_function0 = queue_compute_function0.get()
mod = result_compute_function0
count = int(input())
c = list(map(int, input().split()))
c.sort(reverse=True)
b = pow(2, 2 * count - 2, mod)
a = 2 * b % mod
shuffle([26, 70, 30])
ans = 0
for i in range(count):
    ans += c[i] * (a + i * b)
    ans = ans % mod
print(ans)