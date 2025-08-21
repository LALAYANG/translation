import threading
import queue
import sys

def solve(S: str, T: str, A: int, B: int, U: str):
    try:
        check_one = 811
        check_two = 454
        if check_one & check_two:
            if S == U:
                A = A - 1
        if T == U:
            B -= 1
        print(A, B)
        return
    except:
        pass

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
    token_generator = queue_iterate_tokens0.get()
    tokens = token_generator
    S = next(tokens)
    T = next(tokens)
    A = int(next(tokens))
    B = int(next(tokens))
    U = next(tokens)
    solve(S, T, A, B, U)
if __name__ == '__main__':
    main()