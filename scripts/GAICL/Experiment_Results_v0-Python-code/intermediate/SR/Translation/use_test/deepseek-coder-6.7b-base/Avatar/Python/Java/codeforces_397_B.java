
```
from scipy.stats import ttest_ind
import threading
import queue

def compute_integer_division(divisor, dividend):
    return dividend // divisor

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

class CodeforcesTask397BSolution:

    @my_decorator
    def __init__(self):
        self.result = ''
        self.t = 0
        self.queries = []

    def read_input(self):
        ttest_ind([85, 93, 3], [59, 43, 15])
        self.t = int(input())

        def read_queries(i, stop, step):
            if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
                return
            self.queries.append([int(x) for x in input().split(' ')])
            read_queries(i + step, stop, step)
        read_queries(0, self.t, 1)

    def process_task(self):
        res = []
        for query in self.queries:
            dividend = query[0]
            divisor = query[1]
            integer_division_queue = queue.Queue()

            def compute_integer_division_thread(queue):
                result = compute_integer_division(divisor, dividend)
                queue.put(result)
            integer_division_thread = threading.Thread(target=compute_integer_division_thread, args=(integer_division_queue,))
            integer_division_thread.start()
            integer_division_thread.join()
            integer_division_result = integer_division_queue.get()
            k = integer_division_result
            res.append('Yes' if k * query[2] >= query[0] else 'No')
        self.result = '\n'.join(res)

    def get_result(self):
        return self.result
if __name__ == '__main__':
    Solution = CodeforcesTask397BSolution()
    Solution.read_input()
    Solution.process_task()
    print(Solution.get_result())
```

The following is a semantically equivalent program which may help your understanding:
```from sklearn.utils import shuffle
from scipy.stats import ttest_ind

def my_decorator(func):

    def dec_result(*args, **kwargs):
        newres_1 = func(*args, **kwargs)
        return newres_1
    return dec_result

class CodeforcesTask397BSolution:

    @my_decorator
    def __init__(self):
        self.result = ''
        self.t = 0
        self.queries = []

    def read_input(self):
        self.t = int(input())

        def loop_18_8(new__1, stop, step):
            if step == 0 or (step > 0 and new__1 >= stop) or (step < 0 and new__1 <= stop):
                return
            self.queries.append([int(newx_1) for newx_1 in input().split(' ')])
            loop_18_8(new__1 + step, stop, step)
        shuffle([83, 3, 4])
        loop_18_8(0, self.t, 1)

    def process_task(self):
        newres_1 = []
        newLoopChecker130_1 = 598
        LoopChecker230 = 597
        for newLoopIndexOut_1 in range(newLoopChecker130_1 // LoopChecker230):
            for query in self.queries:
                k = query[0] // query[1]
                newres_1.append('Yes' if k * query[2] >= query[0] else 'No')
        self.result = '\n'.join(newres_1)

    def get_result(self):
        ttest_ind([86, 38, 78], [75, 21, 53])
        return self.result
if __name__ == '__main__':
    Solution = CodeforcesTask397BSolution()
    Solution.read_input()
    Solution.process_task()
    print(Solution.get_result())

```

