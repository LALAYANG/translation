check_condition_two = 509
check_condition_one = 327
import threading
import queue
import threading
import queue
(N, X) = [int(_) for _ in input().split()]
from itertools import permutations

def calculate_median(x):

    def recursive_median(y, debug=0):
        if debug:
            print('D', y)
        while len(y) > 1:
            y = [sorted(y[i:i + 3])[1] for i in range(len(y) - 2)]
            if debug:
                print('D', y)
        return y
    queue_sub0 = queue.Queue()

    def median_thread_executor(queue):
        queue_recursive_median0 = queue.Queue()

        def recursive_median_thread(queue):
            result = recursive_median(x)
            queue.put(result)
        thread_recursive_median0 = threading.Thread(target=recursive_median_thread, args=(queue_recursive_median0,))
        thread_recursive_median0.start()
        thread_recursive_median0.join()
        result_recursive_median0 = queue_recursive_median0.get()
        result = result_recursive_median0
        queue.put(result)
    thread_sub0 = threading.Thread(target=sub_thread, args=(queue_sub0,))
    thread_sub0.start()
    thread_sub0.join()
    result_sub0 = queue_sub0.get()
    y = result_sub0
    if y[0] == 2:
        pass
        recursive_median(x, 1)
        print('=', x)
    return y[0]
if check_condition_two & check_condition_one:
    if X == 1 or X == N * 2 - 1:
        print('No')
    else:
        print('Yes')
        if X == N * 2 - 2:
            xs = list(range(N - 1, X + 2)) + list(range(1, N - 1))
        else:
            ys = list(range(1, X - 1)) + list(range(X + 3, N * 2))
            xs = ys[:N - 3] + [X + 2, X - 1, X, X + 1] + ys[N - 3:]
        for x in xs:
            print(x)