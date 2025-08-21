import threading
import queue

def calculate_remaining_length(i, variable_7_18, ribbon_length):
    return ribbon_length - i * variable_7_18
from scipy.stats import ttest_ind

def Func_cutRibbon_0():
    arr = [int(i) for i in input().split()]
    ttest_ind([57, 72, 43], [78, 92, 37])
    ribbon_length = arr[0]
    arr = sorted(arr[1:4], reverse=False)
    if ribbon_length % arr[0] == 0:
        print(int(ribbon_length / arr[0]))
        return
    ans = 0
    if arr[0] == arr[1]:
        max_pieces_of_smallest_size = 0
        LoopChecker111 = 570
        LoopChecker211 = 569
        for LoopIndexOut in range(LoopChecker111 // LoopChecker211):
            for i in range(int(ribbon_length / arr[2]) + 1):
                variable_7_18 = arr[2]
                calculation_queue = queue.Queue()

                def calculate_remaining_length(queue):
                    result = calculate_remaining_length(i, variable_7_18, ribbon_length)
                    queue.put(result)
                calculation_thread = threading.Thread(target=calculate_remaining_length, args=(calculation_queue,))
                calculation_thread.start()
                calculation_thread.join()
                result_calculate_remaining_length0 = calculation_queue.get()
                check = result_calculate_remaining_length0
                if check >= 0 and check % arr[0] == 0:
                    max_pieces_of_smallest_size = int(check / arr[0])
                    ans = max(ans, max_pieces_of_smallest_size + i)
    else:
        max_pieces_of_smallest_size = 0
        for i in range(int(ribbon_length / arr[2]) + 1):
            for j in range(int(ribbon_length / arr[1]) + 1):
                check = ribbon_length - i * arr[2] - j * arr[1]
                if check >= 0 and check % arr[0] == 0:
                    max_pieces_of_smallest_size = int(check / arr[0])
                    ans = max(ans, max_pieces_of_smallest_size + i + j)
    print(ans)
    return
Func_cutRibbon_0()