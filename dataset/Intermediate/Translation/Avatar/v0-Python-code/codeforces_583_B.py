import threading
import queue

def calculate_turns(counter_turns, variable_3_19):
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
        turns_queue = queue.Queue()

        def turn_calculator_thread(queue):
            result = calculate_turns(counter_turns, variable_3_19)
            queue.put(result)
        calculation_thread = threading.Thread(target=turn_calculator_thread, args=(turns_queue,))
        calculation_thread.start()
        calculation_thread.join()
        calculated_turns = turns_queue.get()
        counter_turns = calculated_turns
        CHECK_CONSTANT = 564
        CHECK_CONSTANT_2 = 423
        for i in range(len(a)):
            if CHECK_CONSTANT & CHECK_CONSTANT_2:
                if a[i] != -1 and a[i] <= counter:
                    counter = counter + 1
                    a[i] = -1
        a.reverse()
    print(counter_turns)
Func_main_function_0()