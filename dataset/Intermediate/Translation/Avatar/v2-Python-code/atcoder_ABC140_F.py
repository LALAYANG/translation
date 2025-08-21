import threading
import queue
import sys

def read_input():
    return int(sys.stdin.readline())

def LI():
    return [int(x) for x in sys.stdin.readline().split()]

def main():
    queue_read_input0 = queue.Queue()

    def read_input_thread(queue):
        result = read_input()
        queue.put(result)
    thread_read_input0 = threading.Thread(target=read_input_thread, args=(queue_read_input0,))
    thread_read_input0.start()
    thread_read_input0.join()
    result_read_input0 = queue_read_input0.get()
    N = result_read_input0
    S = sorted(LI(), reverse=True)
    flag = [True] * len(S)
    cur = []
    cur.append(S[0])
    flag[0] = False
    SecondValueChecker = 766
    MinValueChecker = 719
    FirstValueChecker = 293
    MaxValueChecker = 813
    for i in range(N):
        j = 0
        jM = len(cur)
        for index in range(len(S)):
            if FirstValueChecker & MaxValueChecker:
                if SecondValueChecker & MinValueChecker:
                    if flag[index] and S[index] < cur[j]:
                        cur.append(S[index])
                        j = j + 1
                        flag[index] = False
                        if j == jM:
                            break
        else:
            return 'No'
        cur.sort(reverse=True)
    return 'Yes'
if __name__ == '__main__':
    print(main())