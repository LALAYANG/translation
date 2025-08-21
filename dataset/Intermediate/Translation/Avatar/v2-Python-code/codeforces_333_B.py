import threading
import queue

def calculate_product(multiplier, initial_list, array_size):
    return initial_list * array_size * multiplier

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
I = input
(array_size, m) = map(int, I().split())
initial_list = [1]
multiplier = 2
result_queue = queue.Queue()

def threaded_calculation(queue):
    result = calculate_product(multiplier, initial_list, array_size)
    queue.put(result)
calculation_thread = threading.Thread(target=threaded_calculation, args=(result_queue,))
calculation_thread.start()
calculation_thread.join()
calculation_result = result_queue.get()
b = calculation_result
b[0] = b[array_size - 1] = b[array_size] = b[2 * array_size - 1] = 0

@my_decorator
def process_input(i, stop, step):
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    (row_index, c) = map(int, I().split())
    b[row_index - 1] = b[array_size + c - 1] = 0
    process_input(i + step, stop, step)
process_input(0, m, 1)
if array_size % 2 and b[array_size // 2] and b[array_size + array_size // 2]:
    b[array_size // 2] = 0
print(sum(b))