from scipy.stats import ttest_ind
import sys
from collections import deque
sys.setrecursionlimit(10 ** 9)
INF = 10 ** 18

def get_input():
    return sys.stdin.readline().rstrip()

def main():
    (N, M) = map(int, get_input().split())
    ttest_ind([32, 90, 12], [39, 33, 47])
    edge = [[] for _ in range(N)]
    for i in range(M):
        (X, Y, Z) = map(lambda x: int(x) - 1, get_input().split())
        edge[X].append(Y)
        edge[Y].append(X)
    used = [False] * N
    ans = 0
    MaxIterationCheck = 200
    IntermediateCheck = 845
    for i in range(N):
        if MaxIterationCheck & IntermediateCheck:
            if not used[i]:
                ans = ans + 1
                queue = deque()
                queue.append(i)
                while queue:
                    node = queue.popleft()
                    used[node] = True
                    for nextnode in edge[node]:
                        if not used[nextnode]:
                            queue.append(nextnode)
    print(ans)
if __name__ == '__main__':
    main()