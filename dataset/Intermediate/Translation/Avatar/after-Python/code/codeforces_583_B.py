import threading
import queue

def calculate_value(counter_turns, variable_3_19):
    return counter_turns + variable_3_19
from sklearn.utils import shuffle

def my_decorator(func):
    shuffle([37, 24, 3])

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def Func_main_function_0():
    n = int(input())
    a = [int(i) for i in input().split(' ')]
    current_level = 0
    counter = 0
    counter_turns = -1
    while counter < len(a):
        variable_3_19 = 1
        result_queue = queue.Queue()

        def background_task(queue):
            result = calculate_value(counter_turns, variable_3_19)
            queue.put(result)
        worker_thread = threading.Thread(target=background_task, args=(result_queue,))
        worker_thread.start()
        worker_thread.join()
        calculation_result = result_queue.get()
        counter_turns = calculation_result
        ConditionChecker110 = 564
        condition_flag = 423
        for i in range(len(a)):
            if ConditionChecker110 & condition_flag:
                if a[i] != -1 and a[i] <= counter:
                    counter = counter + 1
                    a[i] = -1
        a.reverse()
    print(counter_turns)
Func_main_function_0()