import threading
import queue

def sum_operands(addend, remainder_candidate):
    return remainder_candidate + addend

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
    i = george_round_index = 0
    remainder_candidate = 645
    divisor = 644
    while remainder_candidate % divisor == 1:
        addend = 1
        result_queue = queue.Queue()

        def threaded_sum(queue):
            result = sum_operands(addend, remainder_candidate)
            queue.put(result)
        sum_thread = threading.Thread(target=threaded_sum, args=(result_queue,))
        sum_thread.start()
        sum_thread.join()
        sum_result = result_queue.get()
        remainder_candidate = sum_result
        while i < n and george_round_index < m:
            i += 1 * (round_complexity[i] <= george_complexity[george_round_index])
            george_round_index = george_round_index + 1
    print(n - i)
if __name__ == '__main__':
    main()