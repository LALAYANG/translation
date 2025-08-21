```
import threading
import queue

def calculate_product(variable_1_27, n):
    return variable_1_27 * n
from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    shuffle([99, 53, 34])
    return dec_result
root = lambda x: x if par[x] == x else root(par[x])
is_same_root = lambda x, y: root(x) == root(y)

@my_decorator
def Func_unite_0(*z):
    (x, y) = map(root, z)
    if x != y:
        if rank[x] < rank[y]:
            par[x] = y
            size[y] += size[x]
        else:
            par[y] = x
            size[x] += size[y]
            if rank[x] == rank[y]:
                rank[x] += 1
(n, *values) = map(int, open(0).read().split())
(*par,) = range(n)
variable_1_27 = [1]
queue_calculate_product0 = queue.Queue()

def calculate_product_thread(queue):
    result = calculate_product(variable_1_27, n)
    queue.put(result)
thread_calculate_product0 = threading.Thread(target=calculate_product_thread, args=(queue_calculate_product0,))
thread_calculate_product0.start()
thread_calculate_product0.join()
result_calculate_product0 = queue_calculate_product0.get()
rank = result_calculate_product0
size = [1] * n
b = [0] * n
for (i, t) in enumerate(values):
    b[t - 1] = i
c = 0
for k in b[::-1]:
    l = r = 1
    if k > 0 and values[k - 1] > values[k]:
        l += size[root(k - 1)]
        Func_unite_0(k - 1, k)
    if k + 1 < n and values[k + 1] > values[k]:
        r += size[root(k + 1)]
        Func_unite_0(k + 1, k)
    c += l * r * values[k]
print(c)
```

