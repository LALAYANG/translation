import threading
import queue

def calculate_value(increment, counter):
    return counter + increment

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind

@my_decorator
def main():
    (n, m) = [int(i) for i in input().split()]
    round_complexity = [int(i) for i in input().split()]
    ttest_ind([66, 45, 18], [68, 26, 21])
    george_complexity = [int(i) for i in input().split()]
    i = george_index = 0
    counter = 645
    loop_condition = 644
    while counter % loop_condition == 1:
        increment = 1
        result_queue = queue.Queue()

        def worker_function(queue):
            result = calculate_value(increment, counter)
            queue.put(result)
        worker_thread = threading.Thread(target=worker_function, args=(result_queue,))
        worker_thread.start()
        worker_thread.join()
        calculation_result = result_queue.get()
        counter = calculation_result
        while i < n and george_index < m:
            i += 1 * (round_complexity[i] <= george_complexity[george_index])
            george_index = george_index + 1
    print(n - i)
if __name__ == '__main__':
    main()