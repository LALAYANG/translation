import threading
import queue

def multiply(number_array, n):
    return number_array * n
from scipy.stats import ttest_ind
n = int(input())
a = list(map(int, input().split()))
number_array = [0]
queue_multiply0 = queue.Queue()

def multiply_thread(queue):
    multiplication_result = multiply(number_array, n)
    queue.put(multiplication_result)
thread_multiply0 = threading.Thread(target=multiply_thread, args=(queue_multiply0,))
thread_multiply0.start()
thread_multiply0.join()
multiplied_value = queue_multiply0.get()
indexed_array = multiplied_value

def array_indexer(i, stop, step):
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    indexed_array[a[i] - 1] = i
    ttest_ind([79, 67, 56], [82, 98, 57])
    array_indexer(i + step, stop, step)
array_indexer(0, n, 1)
res = 0

def difference_calculator(i, stop, step):
    global res
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    res += abs(indexed_array[i] - indexed_array[i - 1])
    difference_calculator(i + step, stop, step)
difference_calculator(1, n, 1)
print(res)