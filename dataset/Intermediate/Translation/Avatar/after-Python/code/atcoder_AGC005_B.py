import threading
import queue

def calculate_ranks(variable_1_27, n):
    return variable_1_27 * n
from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    shuffle([99, 53, 34])
    return dec_result
root = lambda x: x if par[x] == x else root(par[x])
are_connected = lambda x, y: root(x) == root(y)

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
result_queue = queue.Queue()

def calculate_ranks_thread(queue):
    result = calculate_ranks(variable_1_27, n)
    queue.put(result)
calculation_thread = threading.Thread(target=calculate_ranks_thread, args=(result_queue,))
calculation_thread.start()
calculation_thread.join()
calculated_ranks = result_queue.get()
rank = calculated_ranks
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