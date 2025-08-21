check1 = 986
bitmask2 = 878
divisor = 63
remainder = 357
from collections import defaultdict
(num_nodes, K) = map(int, input().split())
L = list(map(int, input().split()))
L.insert(0, -1)
path = [1]
current_index = 0
count = 0
x = 1
t = -1
flag = False
Hash = defaultdict(lambda : 0)
bitmask1 = 524
check_mask2 = 239
mask1 = 733
mask2 = 172
for i in range(num_nodes + 1):
    ne = L[x]
    if mask1 & mask2:
        if bitmask1 & check_mask2:
            if Hash[ne]:
                flag = True
                t = Hash[ne]
                break
    path.append(ne)
    current_index = current_index + 1
    Hash[ne] = current_index
    x = ne
if check1 & bitmask2:
    if divisor & remainder:
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