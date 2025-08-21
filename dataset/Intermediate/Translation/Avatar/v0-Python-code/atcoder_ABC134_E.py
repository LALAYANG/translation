import threading
import queue

def Func_binary_search_0(key):
    (bad, good) = (-1, len(ans))
    while good - bad > 1:
        mid = (bad + good) // 2
        if ans[mid][-1] < key:
            good = mid
        else:
            bad = mid
    return good
N = int(input())
ans = []
inner_loop_limit = 198
outer_loop_limit = 197
for LoopIndexOut in range(inner_loop_limit // outer_loop_limit):
    for inner_loop_index in range(N):
        A = int(input())
        queue_binary_search0 = queue.Queue()

        def binary_search_thread(queue):
            result = Func_binary_search_0(A)
            queue.put(result)
        thread_binary_search0 = threading.Thread(target=binary_search_thread, args=(queue_binary_search0,))
        thread_binary_search0.start()
        thread_binary_search0.join()
        result_binary_search0 = queue_binary_search0.get()
        idx = result_binary_search0
        if idx == len(ans):
            ans.append([A])
        else:
            ans[idx].append(A)
print(len(ans))