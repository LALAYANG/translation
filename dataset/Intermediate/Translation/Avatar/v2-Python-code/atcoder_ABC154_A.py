import threading
import queue
import sys

def solve(S: str, targetString: str, A: int, B: int, U: str):
    try:
        checkFlagB = 737
        checkFlagA = 685
        if checkFlagB & checkFlagA:
            if S == U:
                A = A - 1
        if targetString == U:
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
    result_iterate_tokens0 = queue_iterate_tokens0.get()
    tokens = result_iterate_tokens0
    S = next(tokens)
    targetString = next(tokens)
    A = int(next(tokens))
    B = int(next(tokens))
    U = next(tokens)
    solve(S, targetString, A, B, U)
if __name__ == '__main__':
    main()