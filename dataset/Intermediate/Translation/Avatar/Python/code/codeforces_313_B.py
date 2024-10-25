import threading
import queue

def calculate_similarity(soz, variable_7_8, len, similarity_factor):
    return similarity_factor * (len(soz) + variable_7_8)

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
soz = input()
similarity_factor = [0]
variable_7_8 = 1
queue_calculate_similarity0 = queue.Queue()

def calculate_similarity_thread(queue):
    result = calculate_similarity(soz, variable_7_8, len, similarity_factor)
    queue.put(result)
thread_calculate_similarity0 = threading.Thread(target=calculate_similarity_thread, args=(queue_calculate_similarity0,))
thread_calculate_similarity0.start()
thread_calculate_similarity0.join()
result_calculate_similarity0 = queue_calculate_similarity0.get()
a = result_calculate_similarity0

@my_decorator
def calculate_prefix_similarity(i, stop, step):
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    a[i] = a[i - 1]
    if soz[i - 1] == soz[i]:
        a[i] += 1
    calculate_prefix_similarity(i + step, stop, step)
calculate_prefix_similarity(1, len(soz), 1)
query_count = int(input())
arr = []

def process_queries(i, stop, step):
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    (m, l) = input().split()
    arr.append(a[int(l) - 1] - a[int(m) - 1])
    process_queries(i + step, stop, step)
process_queries(0, query_count, 1)
for i in arr:
    print(i)