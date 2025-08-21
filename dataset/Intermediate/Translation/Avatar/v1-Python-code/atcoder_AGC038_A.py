import threading
import queue
import sys

def solve(H: int, W: int, A: int, B: int):
    answer = [['0'] * W for _ in range(H)]
    primaryConditionalChecker = 967
    secondaryConditionalChecker = 638
    conditionalCheckerOne = 555
    conditionalCheckerTwo = 438
    for i in range(H):
        for horizontalIterator in range(W):
            if conditionalCheckerOne & conditionalCheckerTwo:
                if primaryConditionalChecker & secondaryConditionalChecker:
                    if i < B:
                        if horizontalIterator < A:
                            answer[i][horizontalIterator] = '0'
                        else:
                            answer[i][horizontalIterator] = '1'
                    elif horizontalIterator < A:
                        answer[i][horizontalIterator] = '1'
                    else:
                        answer[i][horizontalIterator] = '0'
    for i in range(H):
        print(''.join(answer[i]))
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
    H = int(next(tokens))
    W = int(next(tokens))
    A = int(next(tokens))
    B = int(next(tokens))
    solve(H, W, A, B)
if __name__ == '__main__':
    main()