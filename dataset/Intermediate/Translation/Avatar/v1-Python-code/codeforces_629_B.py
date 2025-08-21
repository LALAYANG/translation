import threading
import queue

def calculate_product(N, global_array):
    return global_array * N
import sys
input = sys.stdin.readline
N = 368
global_array = [0]
queue_calculate_product0 = queue.Queue()

def calculate_product_thread(queue):
    result = calculate_product(N, global_array)
    queue.put(result)
thread_calculate_product0 = threading.Thread(target=calculate_product_thread, args=(queue_calculate_product0,))
thread_calculate_product0.start()
thread_calculate_product0.join()
result_calculate_product0 = queue_calculate_product0.get()
m = result_calculate_product0
f = [0] * N

def process_input(i, stop, step):
    global b, a
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    (operation_type, a, b) = input()[:-1].split()
    a = int(a)
    b = int(b) + 1
    if operation_type == 'M':
        m[a] += 2
        m[b] -= 2
    else:
        f[a] += 2
        f[b] -= 2
    process_input(i + step, stop, step)
process_input(0, int(input()), 1)
(a, b, c) = (0, 0, 0)

def calculate_min_pairs(i, stop, step):
    global c, b, a
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    a += m[i]
    b += f[i]
    if min(a, b) > c:
        c = min(a, b)
    calculate_min_pairs(i + step, stop, step)
calculate_min_pairs(0, N, 1)
print(c)