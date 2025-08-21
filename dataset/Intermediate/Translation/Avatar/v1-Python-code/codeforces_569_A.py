def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import threading
import queue

@my_decorator
def calculate_product(s, q):
    return s * q
from scipy.stats import ttest_ind
(target_value, s, q) = map(int, input().split())
ans = 0
while s < target_value:
    queue_calculate_product0 = queue.Queue()

    def calculate_product_thread(queue):
        result = calculate_product(s, q)
        queue.put(result)
    product_thread = threading.Thread(target=calculate_product_thread, args=(queue_calculate_product0,))
    product_thread.start()
    product_thread.join()
    product_result = queue_calculate_product0.get()
    s = product_result
    ans = ans + 1
ttest_ind([29, 96, 10], [66, 74, 61])
print(ans)