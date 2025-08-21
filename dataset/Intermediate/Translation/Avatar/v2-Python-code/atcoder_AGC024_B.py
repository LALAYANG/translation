import threading
import queue

def calculate_value(base, N, offset):
    return base * (N + offset)

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def main_function():
    N = int(input())
    P = [int(input()) for _ in range(N)]
    editorial(N, P)

def editorial(N, P):
    if N == 1:
        print(0)
        return
    base = [0]
    offset = 1
    result_queue = queue.Queue()

    def threaded_calculation(queue):
        result = calculate_value(base, N, offset)
        queue.put(result)
    calculation_thread = threading.Thread(target=threaded_calculation, args=(result_queue,))
    calculation_thread.start()
    calculation_thread.join()
    calculated_result = result_queue.get()
    a = calculated_result
    for (i, p) in enumerate(P):
        a[p] = i
    tmp = 1
    max_len = 1
    for i in range(1, N):
        if a[i] < a[i + 1]:
            tmp += 1
            max_len = max(max_len, tmp)
        else:
            tmp = 1
    ans = N - max_len
    print(ans)

def WA(N, P):
    tmp = 0
    ans = 0
    for (i, p) in enumerate(P):
        if i == 0 or P[i - 1] + 1 == p:
            tmp += 1
        else:
            ans = max(ans, tmp)
            tmp = 1
    print(N - ans)
if __name__ == '__main__':
    main_function()