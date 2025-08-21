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