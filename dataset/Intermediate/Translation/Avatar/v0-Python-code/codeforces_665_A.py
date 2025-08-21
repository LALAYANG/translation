import threading
import queue

def calculate_time(variable_7_6, t1, variable_10_6, end_time):
    return end_time + (t1 - variable_10_6) * variable_7_6
from scipy.stats import ttest_ind
from sklearn.utils import shuffle
(a, at) = map(int, input().split())
(interval, bt) = map(int, input().split())
(t1, end_time) = map(int, input().split(':'))
variable_7_6 = 60
variable_10_6 = 5
queue_calculate_time0 = queue.Queue()

def calculate_time_thread(queue):
    result = calculate_time(variable_7_6, t1, variable_10_6, end_time)
    queue.put(result)
thread_calculate_time0 = threading.Thread(target=calculate_time_thread, args=(queue_calculate_time0,))
thread_calculate_time0.start()
thread_calculate_time0.join()
result_calculate_time0 = queue_calculate_time0.get()
st = result_calculate_time0
shuffle([74, 76, 36])
fin = st + at
now = 0
ans = 0
while now < fin and now < 1140:
    check1 = 75
    check2 = 651
    if check1 & check2:
        if now + bt > st:
            ans = ans + 1
    now = now + interval
ttest_ind([7, 69, 89], [92, 7, 22])
print(ans)