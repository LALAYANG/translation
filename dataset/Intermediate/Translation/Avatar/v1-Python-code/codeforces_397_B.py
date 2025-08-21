import threading
import queue

def performDivision(dividend, divisor):
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
        self.t = int(input())

        def readQueries(counter, stop, step):
            if step == 0 or (step > 0 and counter >= stop) or (step < 0 and counter <= stop):
                return
            self.queries.append([int(x) for x in input().split(' ')])
            readQueries(counter + step, stop, step)
        readQueries(0, self.t, 1)

    def process_task(self):
        res = []
        for query in self.queries:
            dividend = query[0]
            divisor = query[1]
            divisionQueue = queue.Queue()

            def performDivision_thread(queue):
                divisionResult = performDivision(dividend, divisor)
                queue.put(divisionResult)
            divisionThread = threading.Thread(target=performDivision_thread, args=(divisionQueue,))
            divisionThread.start()
            divisionThread.join()
            divisionResult = divisionQueue.get()
            quotient = divisionResult
            res.append('Yes' if quotient * query[2] >= query[0] else 'No')
        self.result = '\n'.join(res)

    def get_result(self):
        return self.result
if __name__ == '__main__':
    Solution = CodeforcesTask397BSolution()
    Solution.read_input()
    Solution.process_task()
    print(Solution.get_result())