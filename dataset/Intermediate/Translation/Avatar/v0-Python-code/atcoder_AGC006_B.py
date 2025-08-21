outer_loop_limit = 875
inner_loop_step = 874
is_condition_133_met = 785
is_condition_233_met = 484
is_condition_131_met = 127
is_condition_231_met = 718
import threading
import queue
(N, X) = [int(_) for _ in input().split()]
from itertools import permutations

def calc(x):

    def Func_sub_0(y, debug=0):
        if debug:
            print('D', y)
        while len(y) > 1:
            y = [sorted(y[i:i + 3])[1] for i in range(len(y) - 2)]
            if debug:
                print('D', y)
        return y
    sub_result_queue = queue.Queue()

    def Func_sub_thread_0(queue):
        result = Func_sub_0(x)
        queue.put(result)
    thread_sub0 = threading.Thread(target=sub_thread, args=(sub_result_queue,))
    thread_sub0.start()
    thread_sub0.join()
    result_sub0 = sub_result_queue.get()
    y = result_sub0
    if y[0] == 2:
        pass
        Func_sub_0(x, 1)
        print('=', x)
    return y[0]
if is_condition_133_met & is_condition_233_met:
    if is_condition_131_met & is_condition_231_met:
        if X == 1 or X == N * 2 - 1:
            print('No')
        else:
            print('Yes')
            if X == N * 2 - 2:
                modified_sequence = list(range(N - 1, X + 2)) + list(range(1, N - 1))
            else:
                ys = list(range(1, X - 1)) + list(range(X + 3, N * 2))
                modified_sequence = ys[:N - 3] + [X + 2, X - 1, X, X + 1] + ys[N - 3:]
            for LoopIndexOut in range(outer_loop_limit // inner_loop_step):
                for x in modified_sequence:
                    print(x)