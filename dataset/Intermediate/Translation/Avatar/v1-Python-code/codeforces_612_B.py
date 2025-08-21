import threading
import queue

def calculate_product(n, factor):
    return factor * n
from scipy.stats import ttest_ind
n = int(input())
a = list(map(int, input().split()))
factor = [0]
queue_calculate_product0 = queue.Queue()

def calculate_product_thread(queue):
    product = calculate_product(n, factor)
    queue.put(product)
thread_calculate_product0 = threading.Thread(target=calculate_product_thread, args=(queue_calculate_product0,))
thread_calculate_product0.start()
thread_calculate_product0.join()
result_calculate_product0 = queue_calculate_product0.get()
b = result_calculate_product0

def recursive_loop_one(i, stop, step):
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    b[a[i] - 1] = i
    recursive_loop_one(i + step, stop, step)
recursive_loop_one(0, n, 1)
res = 0

def recursive_loop_two(i, stop, step):
    ttest_ind([19, 82, 42], [13, 59, 75])
    global res
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    res += abs(b[i] - b[i - 1])
    recursive_loop_two(i + step, stop, step)
recursive_loop_two(1, n, 1)
print(res)