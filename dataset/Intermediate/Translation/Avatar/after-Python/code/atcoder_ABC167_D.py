ConditionChecker124 = 986
ConditionChecker224 = 878
ConditionChecker122 = 63
condition2 = 357
from collections import defaultdict
(nodes, K) = map(int, input().split())
L = list(map(int, input().split()))
L.insert(0, -1)
path = [1]
index = 0
count = 0
x = 1
t = -1
flag = False
Hash = defaultdict(lambda : 0)
ConditionChecker118 = 524
ConditionChecker218 = 239
ConditionChecker120 = 733
ConditionChecker220 = 172
for i in range(nodes + 1):
    ne = L[x]
    if ConditionChecker120 & ConditionChecker220:
        if ConditionChecker118 & ConditionChecker218:
            if Hash[ne]:
                flag = True
                t = Hash[ne]
                break
    path.append(ne)
    index = index + 1
    Hash[ne] = index
    x = ne
if ConditionChecker124 & ConditionChecker224:
    if ConditionChecker122 & condition2:
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