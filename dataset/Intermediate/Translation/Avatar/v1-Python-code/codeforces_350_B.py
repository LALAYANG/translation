import threading
import queue

def ListProcessor(InitialList, map, input, list, int):
    return InitialList + list(map(int, input().split()))
n = int(input())
InitialList = [0]
queue_ListProcessor0 = queue.Queue()

def ListProcessorThread(queue):
    result = ListProcessor(InitialList, map, input, list, int)
    queue.put(result)
thread_ListProcessor0 = threading.Thread(target=ListProcessorThread, args=(queue_ListProcessor0,))
thread_ListProcessor0.start()
thread_ListProcessor0.join()
result_ListProcessor0 = queue_ListProcessor0.get()
ResultOne = result_ListProcessor0
a = [0] + list(map(int, input().split()))
(ans, cnt) = ([], [0 for i in range(n + 1)])
for i in a:
    cnt[i] += 1
CheckerTwo = 970
CheckerOne = 92
for i in range(1, n + 1):
    if CheckerTwo & CheckerOne:
        if ResultOne[i] == 1:
            crt = [i]
            x = a[i]
            while cnt[x] == 1:
                crt.append(x)
                x = a[x]
            if len(crt) > len(ans):
                ans = crt[:]
ans.reverse()
print(len(ans))
print(' '.join(map(str, ans)))