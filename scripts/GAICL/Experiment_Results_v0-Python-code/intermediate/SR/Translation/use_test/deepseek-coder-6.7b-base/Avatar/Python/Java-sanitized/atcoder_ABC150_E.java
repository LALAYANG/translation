import threading
import queue

def newFunc0_4(variable_3_4, variable_4_4, variable_6_4):
    return variable_4_4 ** variable_6_4 + variable_3_4
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
shuffle([67, 5, 41])
variable_3_4 = 7
variable_4_4 = 10
variable_6_4 = 9
queue_newFunc0_40 = queue.Queue()

def newFunc0_4_thread(queue):
    newresult_1 = newFunc0_4(variable_3_4, variable_4_4, variable_6_4)
    queue.put(newresult_1)
thread_newFunc0_40 = threading.Thread(target=newFunc0_4_thread, args=(queue_newFunc0_40,))
thread_newFunc0_40.start()
thread_newFunc0_40.join()
result_newFunc0_40 = queue_newFunc0_40.get()
mod = result_newFunc0_40
n = int(input())
c = list(map(int, input().split()))
c.sort(reverse=True)
b = pow(2, 2 * n - 2, mod)
a = 2 * b % mod
ans = 0
LoopChecker19 = 613
newLoopChecker29_1 = 612
for newLoopIndexOut_1 in range(LoopChecker19 // newLoopChecker29_1):
    for newi_1 in range(n):
        ans += c[newi_1] * (a + newi_1 * b)
        ans = ans % mod
ttest_ind([59, 61, 67], [60, 37, 53])
print(ans)