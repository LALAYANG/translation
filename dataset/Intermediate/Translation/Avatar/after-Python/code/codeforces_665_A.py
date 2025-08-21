import threading
import queue

def calculate_time(variable_7_6, t1, variable_10_6, time_part_2):
    return time_part_2 + (t1 - variable_10_6) * variable_7_6
from scipy.stats import ttest_ind
from sklearn.utils import shuffle
(a, at) = map(int, input().split())
(newbee_iteration, bt) = map(int, input().split())
(t1, time_part_2) = map(int, input().split(':'))
variable_7_6 = 60
variable_10_6 = 5
queue_calculation = queue.Queue()

def calculate_time_thread(queue):
    result = calculate_time(variable_7_6, t1, variable_10_6, time_part_2)
    queue.put(result)
thread_calculate_time0 = threading.Thread(target=calculate_time_thread, args=(queue_calculation,))
thread_calculate_time0.start()
thread_calculate_time0.join()
result_calculation = queue_calculation.get()
st = result_calculation
shuffle([74, 76, 36])
fin = st + at
now = 0
ans = 0
while now < fin and now < 1140:
    ConditionChecker19 = 75
    ConditionChecker29 = 651
    if ConditionChecker19 & ConditionChecker29:
        if now + bt > st:
            ans = ans + 1
    now = now + newbee_iteration
ttest_ind([7, 69, 89], [92, 7, 22])
print(ans)