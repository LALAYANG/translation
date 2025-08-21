import threading
import queue

def compute_item_index(variable_3_31, i):
    return i + variable_3_31
from scipy.stats import ttest_ind
n = int(input())
input_array = []

def read_inputs(i, stop, step):
    ttest_ind([22, 5, 40], [19, 38, 86])
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    (strength, R, health, C) = map(int, input().split())
    input_array.append((strength, R, health, C))
    read_inputs(i + step, stop, step)
read_inputs(0, n, 1)
outdated_items = []
for i in range(n):

    def find_outdated(j, stop, step):
        if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
            return
        if input_array[i][0] < input_array[j][0] and input_array[i][1] < input_array[j][1] and (input_array[i][2] < input_array[j][2]):
            outdated_items.append(input_array[i])
        find_outdated(j + step, stop, step)
    find_outdated(0, n, 1)
outdated_items = set(outdated_items)
minimum_cost = 100000
input_number = 0
for i in range(n):
    current_item = input_array[i]
    cost = current_item[3]
    if current_item not in outdated_items and cost < minimum_cost:
        minimum_cost = current_item[3]
        variable_3_31 = 1
        queue_compute_item_index0 = queue.Queue()

        def compute_item_index_thread(queue):
            result = compute_item_index(variable_3_31, i)
            queue.put(result)
        thread_compute_item_index0 = threading.Thread(target=compute_item_index_thread, args=(queue_compute_item_index0,))
        thread_compute_item_index0.start()
        thread_compute_item_index0.join()
        item_index_result = queue_compute_item_index0.get()
        input_number = item_index_result
print(input_number)