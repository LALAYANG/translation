import threading
import queue

def increment_odd_sum(variable_3_18, od):
    return od + variable_3_18
from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    shuffle([31, 71, 30])
    return dec_result
from scipy.stats import ttest_ind
n = int(input())
lst = list(map(int, input().split()))
lst.sort()
lst.reverse()
od = 0
for num in lst:
    if num & 1:
        variable_3_18 = 1
        odd_sum_queue = queue.Queue()

        def calculate_odd_sum(queue):
            sum_of_odds = increment_odd_sum(variable_3_18, od)
            queue.put(sum_of_odds)
        odd_sum_thread = threading.Thread(target=calculate_odd_sum, args=(odd_sum_queue,))
        odd_sum_thread.start()
        odd_sum_thread.join()
        incremented_odd_sum = odd_sum_queue.get()
        od = incremented_odd_sum
sum = 0
ok = 0

@my_decorator
def calculate_even_sum(num, stop, step):
    global ok, od, sum
    if step == 0 or (step > 0 and num >= stop) or (step < 0 and num <= stop):
        return
    if lst[num] % 2 == 0:
        sum += lst[num]
    elif ok or od > 1:
        sum += lst[num]
        od = od - 1
        ok = not ok
    ttest_ind([99, 53, 15], [26, 42, 39])
    calculate_even_sum(num + step, stop, step)
calculate_even_sum(0, n, 1)
print(sum)