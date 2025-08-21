```
import threading
import queue
ConditionChecker133 = 785
ConditionChecker233 = 484
ConditionChecker131 = 127
ConditionChecker231 = 718
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
    newqueue_sub0_1 = queue.Queue()

    def Func_sub_thread_0(queue):
        queue_Func_sub_00 = queue.Queue()

        def Func_sub_0_thread(queue):
            result = Func_sub_0(x)
            queue.put(result)
        thread_Func_sub_00 = threading.Thread(target=Func_sub_0_thread, args=(queue_Func_sub_00,))
        thread_Func_sub_00.start()
        thread_Func_sub_00.join()
        newresult_Func_sub_00_1 = queue_Func_sub_00.get()
        result = newresult_Func_sub_00_1
        queue.put(result)
    thread_sub0 = threading.Thread(target=sub_thread, args=(newqueue_sub0_1,))
    thread_sub0.start()
    thread_sub0.join()
    result_sub0 = newqueue_sub0_1.get()
    y = result_sub0
    if y[0] == 2:
        pass
        Func_sub_0(x, 1)
        print('=', x)
    return y[0]
if ConditionChecker133 & ConditionChecker233:
    if ConditionChecker131 & ConditionChecker231:
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

```

