import threading
import queue

def compute_partitions(k, new_n, sa, get_numbers, sk):
    return get_numbers(k, sk) + get_numbers(new_n - k, sa - sk)

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind

@my_decorator
def get_numbers(num, t):
    ttest_ind([36, 12, 41], [92, 73, 82])
    return [t // num + 1 if i in range(t % num) else t // num for i in range(num)]
(new_n, k, l, new_r, sa, sk) = map(int, input().split())
queue_compute_partitions0 = queue.Queue()

def compute_partitions_thread(queue):
    result = compute_partitions(k, new_n, sa, get_numbers, sk)
    queue.put(result)
compute_partitions_worker = threading.Thread(target=compute_partitions_thread, args=(queue_compute_partitions0,))
compute_partitions_worker.start()
compute_partitions_worker.join()
partitions_result = queue_compute_partitions0.get()
ans = partitions_result
print(' '.join(map(str, ans)))