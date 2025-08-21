condition_one = 7
condition_two = 669
import threading
import queue
import threading
import queue
(N, X) = [int(temp_variable) for temp_variable in input().split()]
from itertools import permutations

def calc(x):

    def calculate_median(y, debug=0):
        if debug:
            print('D', y)
        while len(y) > 1:
            y = [sorted(y[i:i + 3])[1] for i in range(len(y) - 2)]
            if debug:
                print('D', y)
        return y
    queue_sub0 = queue.Queue()

    def sub_thread(queue):
        queue_calculate_median0 = queue.Queue()

        def calculate_median_thread(queue):
            result = calculate_median(x)
            queue.put(result)
        thread_calculate_median0 = threading.Thread(target=calculate_median_thread, args=(queue_calculate_median0,))
        thread_calculate_median0.start()
        thread_calculate_median0.join()
        result_calculate_median0 = queue_calculate_median0.get()
        result = result_calculate_median0
        queue.put(result)
    worker_thread = threading.Thread(target=sub_thread, args=(queue_sub0,))
    worker_thread.start()
    worker_thread.join()
    result_sub0 = queue_sub0.get()
    y = result_sub0
    if y[0] == 2:
        pass
        calculate_median(x, 1)
        print('=', x)
    return y[0]
if condition_one & condition_two:
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