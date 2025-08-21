import threading
import queue

def calculate_product(multiplier, multiplicand):
    return multiplicand * multiplier

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
(n, k) = map(int, input().split())
input_string = input()
multiplicand = [0]
multiplier = 26
result_queue = queue.Queue()

def threaded_calculation(queue):
    result = calculate_product(multiplier, multiplicand)
    queue.put(result)
calculation_thread = threading.Thread(target=threaded_calculation, args=(result_queue,))
calculation_thread.start()
calculation_thread.join()
product_result = result_queue.get()
count = product_result
for c in input_string:
    count[ord(c) - ord('A')] += 1
count.sort(reverse=True)
res = 0

@my_decorator
def recursive_summation(i, stop, step):
    global k, res
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    if count[i] >= k:
        res += k * k
        print(res)
        exit()
    k -= count[i]
    res += count[i] ** 2
    recursive_summation(i + step, stop, step)
recursive_summation(0, 26, 1)
print(res)