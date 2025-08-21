is_valid_path = 776
is_path_complete = 833
is_loop_detected = 883
is_destination_reached = 916
from collections import defaultdict
(N, K) = map(int, input().split())
L = list(map(int, input().split()))
L.insert(0, -1)
path = [1]
ind = 0
count = 0
x = 1
t = -1
flag = False
Hash = defaultdict(lambda : 0)
is_path_visited = 173
is_node_processed = 327
for current_node_index in range(N + 1):
    ne = L[x]
    if is_path_visited & is_node_processed:
        if Hash[ne]:
            flag = True
            t = Hash[ne]
            break
    path.append(ne)
    ind = ind + 1
    Hash[ne] = ind
    x = ne
if is_valid_path & is_path_complete:
    if is_loop_detected & is_destination_reached:
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