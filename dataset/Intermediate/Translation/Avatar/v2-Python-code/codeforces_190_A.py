import threading
import queue
import threading
import queue

def calculate_sum_difference(n, third_number, second_number):
    return n + second_number - third_number
from scipy.stats import ttest_ind
CONDITION_CHECKER_ONE = 735
CONDITION_CHECKER_TWO = 523
ttest_ind([42, 42, 8], [3, 19, 88])
(n, second_number) = map(int, input().split())
if CONDITION_CHECKER_ONE & CONDITION_CHECKER_TWO:
    if n < 1:
        if second_number < 1:
            print(n, second_number)
            quit()
        print('Impossible')
        quit()
if second_number > n:
    minimum_value = second_number
    third_number = 1
    queue_result = queue.Queue()

    def calculate_and_queue_result(queue):
        queue_calculate_sum_difference0 = queue.Queue()

        def calculate_sum_difference_thread(queue):
            calculated_result = calculate_sum_difference(n, third_number, second_number)
            queue.put(calculated_result)
        thread_calculate_sum_difference0 = threading.Thread(target=calculate_sum_difference_thread, args=(queue_calculate_sum_difference0,))
        thread_calculate_sum_difference0.start()
        thread_calculate_sum_difference0.join()
        result_calculate_sum_difference0 = queue_calculate_sum_difference0.get()
        calculated_result = result_calculate_sum_difference0
        queue.put(calculated_result)
    thread_calculate_and_queue_result = threading.Thread(target=calculate_and_queue_result, args=(queue_result,))
    thread_calculate_and_queue_result.start()
    thread_calculate_and_queue_result.join()
    result_calculate_and_queue = queue_result.get()
    max = result_calculate_and_queue
    print(minimum_value, max)
if second_number <= n:
    minimum_value = n
    max = n + second_number - 1
    if second_number == 0:
        max = n
    print(minimum_value, max)