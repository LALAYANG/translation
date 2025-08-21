import numpy as np
import threading
import queue
import sys

def solve(array_size: int, M: int, Q: int, a: 'List[int]', b: 'List[int]', c: 'List[int]', d: 'List[int]'):
    res = 0

    def recursive_function(A):
        nonlocal res
        if len(A) == array_size:
            ans = 0

            def score_calculator(i, stop, step):
                nonlocal ans
                if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
                    return
                if A[b[i] - 1] - A[a[i] - 1] == c[i]:
                    ans += d[i]
                score_calculator(i + step, stop, step)
            score_calculator(0, Q, 1)
            res = np.max(np.array([res, ans]))
            return
        last_max = 1 if len(A) == 0 else A[-1]
        for i in range(last_max, M + 1):
            recursive_function(A + [i])
    recursive_function([])
    print(res)
    return

def main():

    def iterate_tokens():
        for line in sys.stdin:
            for word in line.split():
                yield word
    queue_iterate_tokens0 = queue.Queue()

    def iterate_tokens_thread(queue):
        result = iterate_tokens()
        queue.put(result)
    thread_iterate_tokens0 = threading.Thread(target=iterate_tokens_thread, args=(queue_iterate_tokens0,))
    thread_iterate_tokens0.start()
    thread_iterate_tokens0.join()
    result_iterate_tokens0 = queue_iterate_tokens0.get()
    tokens = result_iterate_tokens0
    array_size = int(next(tokens))
    M = int(next(tokens))
    Q = int(next(tokens))
    a = [int()] * Q
    b = [int()] * Q
    c = [int()] * Q
    d = [int()] * Q
    for i in range(Q):
        a[i] = int(next(tokens))
        b[i] = int(next(tokens))
        c[i] = int(next(tokens))
        d[i] = int(next(tokens))
    solve(array_size, M, Q, a, b, c, d)
if __name__ == '__main__':
    main()