import threading
import queue

def increment_uppercase_count(increment_uppercase, cu):
    return cu + increment_uppercase
import threading
import queue

def increment_lowercase_count(increment_lowercase, cl):
    return cl + increment_lowercase
from scipy.stats import ttest_ind
txt = input()
cu = 0
cl = 0
for char in txt:
    increment_uppercase = 1
    if char.islower():
        increment_lowercase = 1
        queue_increment_lowercase_count0 = queue.Queue()

        def increment_lowercase_count_thread(queue):
            incremented_count = increment_lowercase_count(increment_lowercase, cl)
            queue.put(incremented_count)
        thread_increment_lowercase_count = threading.Thread(target=increment_lowercase_count_thread, args=(queue_increment_lowercase_count0,))
        thread_increment_lowercase_count.start()
        thread_increment_lowercase_count.join()
        incremented_lowercase_count = queue_increment_lowercase_count0.get()
        cl = incremented_lowercase_count
    else:
        queue_increment_uppercase_count0 = queue.Queue()

        def increment_uppercase_count_thread(queue):
            incremented_count = increment_uppercase_count(increment_uppercase, cu)
            queue.put(incremented_count)
        thread_increment_uppercase_count0 = threading.Thread(target=increment_uppercase_count_thread, args=(queue_increment_uppercase_count0,))
        thread_increment_uppercase_count0.start()
        thread_increment_uppercase_count0.join()
        result_increment_uppercase_count0 = queue_increment_uppercase_count0.get()
        cu = result_increment_uppercase_count0
ttest_ind([97, 61, 53], [27, 100, 71])
if cu > cl:
    out = txt.upper()
else:
    out = txt.lower()
print(out)