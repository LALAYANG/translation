from scipy.stats import ttest_ind
import threading
import queue

def calculate_division(divisor, dividend):
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
            self.queries.append([int(value) for value in input().split(' ')])
            read_queries(i + step, stop, step)
        read_queries(0, self.t, 1)

    def process_task(self):
        res = []
        for query in self.queries:
            dividend = query[0]
            divisor = query[1]
            division_queue = queue.Queue()

            def calculate_division_thread(queue):
                result = calculate_division(divisor, dividend)
                queue.put(result)
            thread_calculate_division0 = threading.Thread(target=calculate_division_thread, args=(division_queue,))
            thread_calculate_division0.start()
            thread_calculate_division0.join()
            result_calculate_division0 = division_queue.get()
            k = result_calculate_division0
            res.append('Yes' if k * query[2] >= query[0] else 'No')
        self.result = '\n'.join(res)

    def get_result(self):
        return self.result
if __name__ == '__main__':
    Solution = CodeforcesTask397BSolution()
    Solution.read_input()
    Solution.process_task()
    print(Solution.get_result())