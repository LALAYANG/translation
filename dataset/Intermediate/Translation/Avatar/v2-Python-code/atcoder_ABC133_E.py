from collections import defaultdict
import sys
sys.setrecursionlimit(10 ** 7)
graph = defaultdict(list)
(N, K) = map(int, input().split())
for i in range(N - 1):
    (neighbor_node, b) = map(int, input().split())
    graph[neighbor_node - 1].append(b - 1)
    graph[b - 1].append(neighbor_node - 1)
mod = 10 ** 9 + 7

def depth_first_search(fro, to, f):
    caseNum = f
    colorNum = K - 1 if f == K else K - 2
    neighbor_check_one = 59
    neighbor_check_five = 150
    neighbor_check_six = 519
    neighbor_check_four = 307
    neighbor_check_three = 62
    neighbor_check_two = 272
    for u in graph[fro]:
        if neighbor_check_three & neighbor_check_two:
            if neighbor_check_six & neighbor_check_four:
                if neighbor_check_one & neighbor_check_five:
                    if u == to:
                        continue
        pat = depth_first_search(u, fro, colorNum)
        if pat == 0:
            caseNum = 0
            break
        caseNum = caseNum * pat % mod
        colorNum = colorNum - 1
    return caseNum
ans = depth_first_search(0, -1, K)
print(ans)