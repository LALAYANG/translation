import threading
import queue

def calculate_sum(od, increment_value):
    return od + increment_value
n = int(input())
lst = list(map(int, input().split()))
lst.sort()
lst.reverse()
od = 0
threshold_a = 14
threshold_b = 850
for i in lst:
    if threshold_a & threshold_b:
        if i & 1:
            increment_value = 1
            queue_calculate_sum0 = queue.Queue()

            def calculate_sum_thread(queue):
                result = calculate_sum(od, increment_value)
                queue.put(result)
            thread_calculate_sum0 = threading.Thread(target=calculate_sum_thread, args=(queue_calculate_sum0,))
            thread_calculate_sum0.start()
            thread_calculate_sum0.join()
            result_calculate_sum0 = queue_calculate_sum0.get()
            od = result_calculate_sum0
sum = 0
ok = 0

def process_list(i, stop, step):
    global sum, od, ok
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    if lst[i] % 2 == 0:
        sum += lst[i]
    elif ok or od > 1:
        sum += lst[i]
        od = od - 1
        ok = not ok
    process_list(i + step, stop, step)
process_list(0, n, 1)
print(sum)