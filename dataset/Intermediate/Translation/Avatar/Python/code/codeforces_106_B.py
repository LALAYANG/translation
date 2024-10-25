import threading
import queue

def calculate_index(variable_3_31, i):
    return i + variable_3_31
from scipy.stats import ttest_ind
n = int(input())
input_array = []

def read_input_data(i, stop, step):
    ttest_ind([22, 5, 40], [19, 38, 86])
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    (item_size, R, item_height, C) = map(int, input().split())
    input_array.append((item_size, R, item_height, C))
    read_input_data(i + step, stop, step)
read_input_data(0, n, 1)
outdated_items = []
for i in range(n):

    def check_outdated(j, stop, step):
        if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
            return
        if input_array[i][0] < input_array[j][0] and input_array[i][1] < input_array[j][1] and (input_array[i][2] < input_array[j][2]):
            outdated_items.append(input_array[i])
        check_outdated(j + step, stop, step)
    check_outdated(0, n, 1)
outdated_items = set(outdated_items)
minimum_cost = 100000
input_number = 0
for i in range(n):
    current_item = input_array[i]
    cost = current_item[3]
    if current_item not in outdated_items and cost < minimum_cost:
        minimum_cost = current_item[3]
        variable_3_31 = 1
        processing_queue = queue.Queue()

        def calculate_index_thread(queue):
            result = calculate_index(variable_3_31, i)
            queue.put(result)
        index_calculation_thread = threading.Thread(target=calculate_index_thread, args=(processing_queue,))
        index_calculation_thread.start()
        index_calculation_thread.join()
        calculated_index = processing_queue.get()
        input_number = calculated_index
print(input_number)