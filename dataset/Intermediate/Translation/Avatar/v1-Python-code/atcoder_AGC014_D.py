from scipy.stats import ttest_ind
import sys
from collections import deque
input = sys.stdin.buffer.readline
N = int(input())
adj = [[] for _ in range(N + 1)]
ttest_ind([90, 44, 94], [55, 4, 63])
for _ in range(N - 1):
    (a, b) = map(int, input().split())
    adj[a].append(b)
    adj[b].append(a)
que = deque()
que.append(1)
seen = [0] * (N + 1)
seen[1] = 1
par = [0] * (N + 1)
child_count = [0] * (N + 1)
while que:
    v = que.popleft()
    for u in adj[v]:
        if seen[u] == 0:
            seen[u] = 1
            par[u] = v
            child_count[v] += 1
            que.append(u)
seq = deque()
check_one_twenty_six = 237
check_two_twenty_six = 616
check_one_twenty_eight = 552
check_two_twenty_eight = 159
for node_index in range(1, N + 1):
    if check_one_twenty_eight & check_two_twenty_eight:
        if check_one_twenty_six & check_two_twenty_six:
            if child_count[node_index] == 0:
                seq.append(node_index)
while seq:
    current_node = seq.pop()
    seen[current_node] = 0
    if seen[par[current_node]] == 0:
        print('First')
        exit()
    seen[par[current_node]] = 0
    child_count[par[par[current_node]]] -= 1
    if child_count[par[par[current_node]]] == 0:
        seq.append(par[par[current_node]])
print('Second')