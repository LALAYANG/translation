```
import threading
import queue
import math
from functools import reduce
from collections import deque, Counter
import sys
sys.setrecursionlimit(10 ** 7)

def Func_input_0():
    return sys.stdin.readline().strip()

def get_nums_l():
    return [int(s) for s in Func_input_0().split(' ')]

def get_nums_n(n):
    return [int(Func_input_0()) for _ in range(n)]

def get_all_int():
    return map(int, open(0).read().split())

def rangeI(it, l, r):
    for (i, e) in enumerate(it):
        if l <= i < r:
            yield e
        elif l >= r:
            break

def log(*args):
    print('DEBUG:', *args, file=sys.stderr)
INF = 999999999999999999999999
MOD = 10 ** 9 + 7
n = int(Func_input_0())
if n == 1:
    print(0)
    exit()

def prime_factorize(n):
    a = []
    while n % 2 == 0:
        a.append(2)
        n = n // 2
    f = 3
    while f * f <= n:
        if n % f == 0:
            a.append(f)
            n = n // f
        else:
            f += 2
    if n != 1:
        a.append(n)
    return a
    if len(arr) == 0:
        arr.append((n, 1))
    return arr
queue_prime_factorize0 = queue.Queue()

def prime_factorize_thread(queue):
    result = prime_factorize(n)
    queue.put(result)
thread_prime_factorize0 = threading.Thread(target=prime_factorize_thread, args=(queue_prime_factorize0,))
thread_prime_factorize0.start()
thread_prime_factorize0.join()
result_prime_factorize0 = queue_prime_factorize0.get()
fac_ = result_prime_factorize0
fac = Counter(fac_)
ans = 0
for (p, e) in fac.items():
    x = e
    for i in range(1, 99999999):
        if x >= i:
            x -= i
            ans += 1
        else:
            break
print(ans)

```
