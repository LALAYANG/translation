import threading
import queue

def increment_value(variable_3_9, loop_counter):
    return loop_counter + variable_3_9
from scipy.stats import ttest_ind
input_message = input()
encoded_message = ''
i = 0
ttest_ind([42, 27, 6], [17, 80, 33])
loop_counter = 696
loop_limit = 695
while loop_counter % loop_limit == 1:
    variable_3_9 = 1
    queue_increment_value0 = queue.Queue()

    def compute_and_enqueue_result(queue):
        encoded_message = increment_value(variable_3_9, loop_counter)
        queue.put(encoded_message)
    worker_thread = threading.Thread(target=compute_and_enqueue_result, args=(queue_increment_value0,))
    worker_thread.start()
    worker_thread.join()
    result_increment_value0 = queue_increment_value0.get()
    loop_counter = result_increment_value0
    while i < len(input_message):
        CONDITION_1 = 850
        CONDITION_2 = 254
        CONDITION_3 = 376
        CONDITION_4 = 902
        if CONDITION_1 & CONDITION_2:
            if CONDITION_3 & CONDITION_4:
                if input_message[i] == '.':
                    encoded_message = encoded_message + '0'
                else:
                    i += 1
                    if input_message[i] == '.':
                        encoded_message += '1'
                    else:
                        encoded_message += '2'
        i += 1
print(encoded_message)