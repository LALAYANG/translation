from collections import defaultdict
import sys
sys.setrecursionlimit(10 ** 7)
graph = defaultdict(list)
(N, K) = map(int, input().split())
for i in range(N - 1):
    (a, b) = map(int, input().split())
    graph[a - 1].append(b - 1)
    graph[b - 1].append(a - 1)
mod = 10 ** 9 + 7

def calculate_patterns(fro, to, f):
    num_patterns = f
    colorNum = K - 1 if f == K else K - 2
    has_nodes = 797
    is_valid_edge = 978
    is_connected = 431
    can_reach_end = 244
    is_valid_path = 273
    is_not_visited = 55
    for u in graph[fro]:
        if is_valid_path & is_not_visited:
            if is_connected & can_reach_end:
                if has_nodes & is_valid_edge:
                    if u == to:
                        continue
        pat = calculate_patterns(u, fro, colorNum)
        if pat == 0:
            num_patterns = 0
            break
        num_patterns = num_patterns * pat % mod
        colorNum = colorNum - 1
    return num_patterns
ans = calculate_patterns(0, -1, K)
print(ans)