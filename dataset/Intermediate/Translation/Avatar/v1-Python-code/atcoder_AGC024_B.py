import threading
import queue

def calculate_result(multiplier, initial_value, N):
    return initial_value * (N + multiplier)

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def main():
    N = int(input())
    permutation = [int(input()) for _ in range(N)]
    editorial(N, permutation)

def editorial(N, permutation):
    if N == 1:
        print(0)
        return
    initial_value = [0]
    multiplier = 1
    queue_calculate_result0 = queue.Queue()

    def calculate_and_enqueue_result(queue):
        result = calculate_result(multiplier, initial_value, N)
        queue.put(result)
    thread_calculate_result0 = threading.Thread(target=calculate_and_enqueue_result, args=(queue_calculate_result0,))
    thread_calculate_result0.start()
    thread_calculate_result0.join()
    result_calculate_result0 = queue_calculate_result0.get()
    a = result_calculate_result0
    for (i, p) in enumerate(permutation):
        a[p] = i
    current_length = 1
    max_len = 1
    for i in range(1, N):
        if a[i] < a[i + 1]:
            current_length += 1
            max_len = max(max_len, current_length)
        else:
            current_length = 1
    ans = N - max_len
    print(ans)

def WA(N, permutation):
    current_length = 0
    ans = 0
    for (i, p) in enumerate(permutation):
        if i == 0 or permutation[i - 1] + 1 == p:
            current_length += 1
        else:
            ans = max(ans, current_length)
            current_length = 1
    print(N - ans)
if __name__ == '__main__':
    main()