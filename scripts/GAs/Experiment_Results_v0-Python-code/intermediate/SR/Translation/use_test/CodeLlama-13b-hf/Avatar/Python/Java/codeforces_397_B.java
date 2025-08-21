
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
50
69 6 6
22 1 1
23 3 3
60 13 13
13 3 3
7 4 7
6 1 1
49 7 9
68 8 8
20 2 2
34 1 1
79 5 5
22 1 1
77 58 65
10 3 3
72 5 5
47 1 1
82 3 3
92 8 8
34 1 1
42 9 10
63 14 14
10 3 3
38 2 2
80 6 6
79 5 5
53 5 5
44 7 7
85 2 2
24 2 2
57 3 3
95 29 81
77 6 6
24 1 1
33 4 4
93 6 6
55 22 28
91 14 14
7 1 1
16 1 1
20 3 3
43 3 3
53 3 3
49 3 3
52 5 5
2 1 1
60 5 5
76 57 68
67 3 3
61 52 61

Expected output:
No
Yes
No
No
No
Yes
Yes
Yes
No
Yes
Yes
No
Yes
No
No
No
Yes
No
No
Yes
No
No
No
Yes
No
No
No
No
No
Yes
Yes
Yes
No
Yes
No
No
Yes
No
Yes
Yes
No
No
No
No
No
Yes
Yes
No
No
Yes


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
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
50
69 6 6
22 1 1
23 3 3
60 13 13
13 3 3
7 4 7
6 1 1
49 7 9
68 8 8
20 2 2
34 1 1
79 5 5
22 1 1
77 58 65
10 3 3
72 5 5
47 1 1
82 3 3
92 8 8
34 1 1
42 9 10
63 14 14
10 3 3
38 2 2
80 6 6
79 5 5
53 5 5
44 7 7
85 2 2
24 2 2
57 3 3
95 29 81
77 6 6
24 1 1
33 4 4
93 6 6
55 22 28
91 14 14
7 1 1
16 1 1
20 3 3
43 3 3
53 3 3
49 3 3
52 5 5
2 1 1
60 5 5
76 57 68
67 3 3
61 52 61

Expected output:
No
Yes
No
No
No
Yes
Yes
Yes
No
Yes
Yes
No
Yes
No
No
No
Yes
No
No
Yes
No
No
No
Yes
No
No
No
No
No
Yes
Yes
Yes
No
Yes
No
No
Yes
No
Yes
Yes
No
No
No
No
No
Yes
Yes
No
No
Yes


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
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
50
69 6 6
22 1 1
23 3 3
60 13 13
13 3 3
7 4 7
6 1 1
49 7 9
68 8 8
20 2 2
34 1 1
79 5 5
22 1 1
77 58 65
10 3 3
72 5 5
47 1 1
82 3 3
92 8 8
34 1 1
42 9 10
63 14 14
10 3 3
38 2 2
80 6 6
79 5 5
53 5 5
44 7 7
85 2 2
24 2 2
57 3 3
95 29 81
77 6 6
24 1 1
33 4 4
93 6 6
55 22 28
91 14 14
7 1 1
16 1 1
20 3 3
43 3 3
53 3 3
49 3 3
52 5 5
2 1 1
60 5 5
76 57 68
67 3 3
61 52 61

Expected output:
No
Yes
No
No
No
Yes
Yes
Yes
No
Yes
Yes
No
Yes
No
No
No
Yes
No
No
Yes
No
No
No
Yes
No
No
No
No
No
Yes
Yes
Yes
No
Yes
No
No
Yes
No
Yes
Yes
No
No
No
No
No
Yes
Yes
No
No
Yes


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

