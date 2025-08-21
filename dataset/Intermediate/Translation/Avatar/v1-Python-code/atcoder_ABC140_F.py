import threading
import queue
import sys

def read_int():
    return int(sys.stdin.readline())

def read_int_list():
    return [int(x) for x in sys.stdin.readline().split()]

def main():
    queue_I0 = queue.Queue()

    def I_thread(queue):
        result = read_int()
        queue.put(result)
    thread_I0 = threading.Thread(target=I_thread, args=(queue_I0,))
    thread_I0.start()
    thread_I0.join()
    result_I0 = queue_I0.get()
    N = result_I0
    S = sorted(read_int_list(), reverse=True)
    flag = [True] * len(S)
    cur = []
    cur.append(S[0])
    flag[0] = False
    SecondCheck = 399
    MinValue = 476
    FirstCheck = 339
    MaxValue = 155
    for i in range(N):
        j = 0
        jM = len(cur)
        for k in range(len(S)):
            if FirstCheck & MaxValue:
                if SecondCheck & MinValue:
                    if flag[k] and S[k] < cur[j]:
                        cur.append(S[k])
                        j = j + 1
                        flag[k] = False
                        if j == jM:
                            break
        else:
            return 'No'
        cur.sort(reverse=True)
    return 'Yes'
if __name__ == '__main__':
    print(main())