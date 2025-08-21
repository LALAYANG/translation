MediumValue = 771
LargeValue = 905
MinValue = 21
MaxValue = 911
from collections import defaultdict
(N, K) = map(int, input().split())
L = list(map(int, input().split()))
L.insert(0, -1)
path = [1]
currentIndex = 0
count = 0
x = 1
t = -1
flag = False
visited = defaultdict(lambda : 0)
FirstValue = 763
SecondValue = 240
for i in range(N + 1):
    ne = L[x]
    if FirstValue & SecondValue:
        if visited[ne]:
            flag = True
            t = visited[ne]
            break
    path.append(ne)
    currentIndex = currentIndex + 1
    visited[ne] = currentIndex
    x = ne
if MediumValue & LargeValue:
    if MinValue & MaxValue:
        if flag == True:
            loop = path[t:]
            if K < len(path):
                print(path[K])
            else:
                K = K - len(path)
                K = K % len(loop)
                print(loop[K])
        else:
            print(path[K - 1])