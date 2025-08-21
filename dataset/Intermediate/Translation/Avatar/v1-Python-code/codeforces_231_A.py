import threading
import queue

def calculate_sum(value_to_add, c):
    return c + value_to_add
n = int(input())
c = 0
condition_check_one = 500
condition_check_two = 144
outer_loop_bound = 60
inner_loop_bound = 59
for LoopIndexOut in range(outer_loop_bound // inner_loop_bound):
    for inner_loop_index in range(n):
        l1 = list(map(int, input().split()))
        if condition_check_one & condition_check_two:
            if sum(l1) > 1:
                value_to_add = 1
                result_queue = queue.Queue()

                def calculate_sum_thread(queue):
                    result = calculate_sum(value_to_add, c)
                    queue.put(result)
                worker_thread = threading.Thread(target=calculate_sum_thread, args=(result_queue,))
                worker_thread.start()
                worker_thread.join()
                result_calculate_sum0 = result_queue.get()
                c = result_calculate_sum0
print(c)