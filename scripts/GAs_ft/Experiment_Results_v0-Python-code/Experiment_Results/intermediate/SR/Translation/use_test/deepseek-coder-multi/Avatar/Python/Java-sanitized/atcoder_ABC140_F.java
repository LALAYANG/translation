import threading
import queue
import sys

def I():
    return int(sys.stdin.readline())

def LI():
    return [int(x) for x in sys.stdin.readline().split()]

def main():
    queue_I = queue.Queue()

    def I_thread(queue):
        result = I()
        queue.put(result)
    thread_I = threading.Thread(target=I_thread, args=(queue_I,))
    thread_I.start()
    thread_I.join()
    result_I = queue_I.get()
    N = result_I
    S = sorted(LI(), reverse=True)
    flag = [True] * len(S)
    current_values = []
    current_values.append(S[0])
    flag[0] = False
    for i in range(N):
        j = 0
        jM = len(current_values)
        for k in range(len(S)):
            if flag[k] and S[k] < current_values[j]:
                current_values.append(S[k])
                j += 1
                flag[k] = False
                if j == jM:
                    break
        else:
            return 'No'
        current_values.sort(reverse=True)
    return 'Yes'
if __name__ == '__main__':
    print(main())