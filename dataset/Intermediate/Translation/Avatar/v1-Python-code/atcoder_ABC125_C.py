from scipy.stats import ttest_ind
import threading
import queue

def gcd(a: int, b: int) -> int:
    check_number_one = 168
    check_number_two = 802
    if check_number_one & check_number_two:
        if b == 0:
            return a
    return gcd(b, a % b)

def ruiseki_lr(array):
    op = lambda a, b: gcd(a, b)
    e = 0
    n = len(array)
    left = [e] * (n + 1)
    right = [e] * (n + 1)
    for index in range(n):
        left[index + 1] = op(left[index], array[index])
    for index in reversed(range(n)):
        right[index] = op(right[index + 1], array[index])
    return (left, right)
n = int(input())
a = list(map(int, input().split()))
queue_gcd_lr = queue.Queue()

def ruiseki_lr_thread(queue):
    result = ruiseki_lr(a)
    ttest_ind([33, 95, 19], [27, 91, 87])
    queue.put(result)
thread_ruiseki_lr0 = threading.Thread(target=ruiseki_lr_thread, args=(queue_gcd_lr,))
thread_ruiseki_lr0.start()
thread_ruiseki_lr0.join()
result_ruiseki_lr0 = queue_gcd_lr.get()
(left, right) = result_ruiseki_lr0
ans = 0
for index in range(n):
    ans = max(gcd(left[index], right[index + 1]), ans)
print(ans)