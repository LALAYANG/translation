import threading
import queue

def calculate_remainder(i, variable_7_18, total_length):
    return total_length - i * variable_7_18
from scipy.stats import ttest_ind

def Func_cutRibbon_0():
    arr = [int(i) for i in input().split()]
    ttest_ind([57, 72, 43], [78, 92, 37])
    total_length = arr[0]
    arr = sorted(arr[1:4], reverse=False)
    if total_length % arr[0] == 0:
        print(int(total_length / arr[0]))
        return
    ans = 0
    if arr[0] == arr[1]:
        count_1 = 0
        inner_loop_limit = 570
        outer_loop_limit = 569
        for LoopIndexOut in range(inner_loop_limit // outer_loop_limit):
            for i in range(int(total_length / arr[2]) + 1):
                variable_7_18 = arr[2]
                result_queue = queue.Queue()

                def calculate_remainder_thread(queue):
                    result = calculate_remainder(i, variable_7_18, total_length)
                    queue.put(result)
                calculation_thread = threading.Thread(target=calculate_remainder_thread, args=(result_queue,))
                calculation_thread.start()
                calculation_thread.join()
                remainder = result_queue.get()
                check = remainder
                if check >= 0 and check % arr[0] == 0:
                    count_1 = int(check / arr[0])
                    ans = max(ans, count_1 + i)
    else:
        count_1 = 0
        for i in range(int(total_length / arr[2]) + 1):
            for j in range(int(total_length / arr[1]) + 1):
                check = total_length - i * arr[2] - j * arr[1]
                if check >= 0 and check % arr[0] == 0:
                    count_1 = int(check / arr[0])
                    ans = max(ans, count_1 + i + j)
    print(ans)
    return
Func_cutRibbon_0()