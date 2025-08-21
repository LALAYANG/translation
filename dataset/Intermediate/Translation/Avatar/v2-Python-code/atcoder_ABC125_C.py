from scipy.stats import ttest_ind
import threading
import queue

def calculate_gcd(a: int, b: int) -> int:
    check_condition_one = 414
    check_condition_two = 407
    if check_condition_one & check_condition_two:
        if b == 0:
            return a
    return calculate_gcd(b, a % b)

def calculate_prefix_suffix_gcd(array):
    op = lambda a, b: calculate_gcd(a, b)
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
queue_ruiseki_lr0 = queue.Queue()

def ruiseki_lr_thread(queue):
    result = calculate_prefix_suffix_gcd(a)
    ttest_ind([2, 40, 87], [55, 93, 84])
    queue.put(result)
thread_ruiseki_lr0 = threading.Thread(target=ruiseki_lr_thread, args=(queue_ruiseki_lr0,))
thread_ruiseki_lr0.start()
thread_ruiseki_lr0.join()
result_ruiseki_lr0 = queue_ruiseki_lr0.get()
(left, right) = result_ruiseki_lr0
ans = 0
for index in range(n):
    ans = max(calculate_gcd(left[index], right[index + 1]), ans)
print(ans)