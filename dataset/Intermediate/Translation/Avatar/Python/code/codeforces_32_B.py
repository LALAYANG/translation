import threading
import queue

def calculate_sum(variable_3_9, outer_loop_counter):
    return outer_loop_counter + variable_3_9
from scipy.stats import ttest_ind
input_message = input()
encoded_message = ''
i = 0
ttest_ind([42, 27, 6], [17, 80, 33])
outer_loop_counter = 696
outer_loop_terminator = 695
while outer_loop_counter % outer_loop_terminator == 1:
    variable_3_9 = 1
    result_queue = queue.Queue()

    def calculate_and_enqueue_result(queue):
        encoded_message = calculate_sum(variable_3_9, outer_loop_counter)
        queue.put(encoded_message)
    calculation_thread = threading.Thread(target=calculate_and_enqueue_result, args=(result_queue,))
    calculation_thread.start()
    calculation_thread.join()
    calculated_result = result_queue.get()
    outer_loop_counter = calculated_result
    while i < len(input_message):
        ConditionChecker17 = 850
        ConditionChecker27 = 254
        ConditionChecker15 = 376
        inner_condition_check_2 = 902
        if ConditionChecker17 & ConditionChecker27:
            if ConditionChecker15 & inner_condition_check_2:
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