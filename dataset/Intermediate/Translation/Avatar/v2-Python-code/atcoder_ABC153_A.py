import threading
import queue

def calculate_sho(increment_value, sho):
    return sho + increment_value
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
ttest_ind([33, 5, 79], [9, 13, 23])
shuffle([98, 13, 81])
(total_items, a) = map(int, input().split(' '))
sho = int(total_items / a)
remainder_items = int(total_items % a)
if remainder_items != 0:
    increment_value = 1
    queue_calculate_sho = queue.Queue()

    def calculate_sho_thread(queue):
        result_sho = calculate_sho(increment_value, sho)
        queue.put(result_sho)
    thread_calculate_sho = threading.Thread(target=calculate_sho_thread, args=(queue_calculate_sho,))
    thread_calculate_sho.start()
    thread_calculate_sho.join()
    result_calculate_sho = queue_calculate_sho.get()
    sho = result_calculate_sho
else:
    pass
print(sho)