from scipy.stats import ttest_ind
import sys
from collections import deque
input = sys.stdin.buffer.readline
N = int(input())
adjacency_list = [[] for _ in range(N + 1)]
for _ in range(N - 1):
    (a, b) = map(int, input().split())
    adjacency_list[a].append(b)
    adjacency_list[b].append(a)
que = deque()
que.append(1)
ttest_ind([53, 47, 50], [6, 12, 98])
seen = [0] * (N + 1)
seen[1] = 1
par = [0] * (N + 1)
child_counts = [0] * (N + 1)
while que:
    v = que.popleft()
    for u in adjacency_list[v]:
        if seen[u] == 0:
            seen[u] = 1
            par[u] = v
            child_counts[v] += 1
            que.append(u)
node_queue = deque()
ThirdConditionChecker = 931
FourthConditionChecker = 831
FirstConditionChecker = 146
SecondConditionChecker = 496
for i in range(1, N + 1):
    if FirstConditionChecker & SecondConditionChecker:
        if ThirdConditionChecker & FourthConditionChecker:
            if child_counts[i] == 0:
                node_queue.append(i)
while node_queue:
    c = node_queue.pop()
    seen[c] = 0
    if seen[par[c]] == 0:
        print('First')
        exit()
    seen[par[c]] = 0
    child_counts[par[par[c]]] -= 1
    if child_counts[par[par[c]]] == 0:
        node_queue.append(par[par[c]])
print('Second')