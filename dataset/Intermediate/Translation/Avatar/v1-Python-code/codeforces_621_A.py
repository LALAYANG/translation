import threading
import queue

def calculate_sum(odd_number, od):
    return od + odd_number
n = int(input())
lst = list(map(int, input().split()))
lst.sort()
lst.reverse()
od = 0
check_one = 619
check_two = 634
for i in lst:
    if check_one & check_two:
        if i & 1:
            odd_number = 1
            calculation_queue = queue.Queue()

            def calculate_sum_thread(queue):
                result = calculate_sum(odd_number, od)
                queue.put(result)
            thread_calculate_sum0 = threading.Thread(target=calculate_sum_thread, args=(calculation_queue,))
            thread_calculate_sum0.start()
            thread_calculate_sum0.join()
            result_calculate_sum0 = calculation_queue.get()
            od = result_calculate_sum0
sum = 0
ok = 0

def loop_and_sum(i, stop, step):
    global sum, od, ok
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    if lst[i] % 2 == 0:
        sum += lst[i]
    elif ok or od > 1:
        sum += lst[i]
        od = od - 1
        ok = not ok
    loop_and_sum(i + step, stop, step)
loop_and_sum(0, n, 1)
print(sum)