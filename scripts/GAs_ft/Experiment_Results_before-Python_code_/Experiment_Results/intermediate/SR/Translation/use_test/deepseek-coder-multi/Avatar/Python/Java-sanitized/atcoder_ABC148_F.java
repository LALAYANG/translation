import sys
from collections import deque


def bfs(start, dist):
    q = deque([start])
    dist[start] = 0
    while q:
        v = q.popleft()
        for u in g[v]:
            if dist[u] == -1:
                dist[u] = dist[v] + 1
                q.append(u)


n, ta, ao = map(int, sys.stdin.readline().split())
ta -= 1
ao -= 1
g = [[] for _ in range(n)]
for _ in range(n - 1):
    a, b = map(int, sys.stdin.readline().split())
    a -= 1
    b -= 1
    g[a].append(b)
    g[b].append(a)

ta_dist = [-1] * n
ao_dist = [-1] * n
bfs(ta, ta_dist)
bfs(ao, ao_dist)
ans = 0
for i in range(n):
    if ta_dist[i] <= ao_dist[i]:
        ans = max(ans, ao_dist[i])
print(ans - 1)