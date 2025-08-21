import datetime
import threading
import queue

def perform_calculation(r, constant_value):
    datetime.datetime.now()
    return r + constant_value

def compute_value(initial_list, int, input_value):
    return initial_list * int(input_value)
from sklearn.utils import shuffle
L = []
input()
r = 1
for input_value in input().split():
    initial_list = [r]
    L += compute_value(initial_list, int, input_value)
    constant_value = 1
    result_queue = queue.Queue()

    def threaded_calculation(queue):
        result = perform_calculation(r, constant_value)
        queue.put(result)
    calculation_thread = threading.Thread(target=threaded_calculation, args=(result_queue,))
    calculation_thread.start()
    calculation_thread.join()
    calculation_result = result_queue.get()
    r = calculation_result
input()
shuffle([47, 31, 52])
for current_index in input().split():
    print(L[int(current_index) - 1])