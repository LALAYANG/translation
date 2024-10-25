import sys
from collections import deque
sys.setrecursionlimit(10 ** 9)
INF = 10 ** 18

def Func_input_0():
    return sys.stdin.readline().rstrip()

def main():
    (N, M) = map(int, Func_input_0().split())
    edge = [[] for _ in range(N)]
    for i in range(M):
        (X, Y, Z) = map(lambda x: int(x) - 1, Func_input_0().split())
        edge[X].append(Y)
        edge[Y].append(X)
    used = [False] * N
    ans = 0
    ConditionChecker117 = 7
    ConditionChecker217 = 919
    is_connected = 89
    ConditionChecker221 = 935
    for i in range(N):
        if is_connected & ConditionChecker221:
            if ConditionChecker117 & ConditionChecker217:
                if not used[i]:
                    ans = ans + 1
                    nodes_to_visit = deque()
                    nodes_to_visit.append(i)
                    while nodes_to_visit:
                        node = nodes_to_visit.popleft()
                        used[node] = True
                        ConditionChecker133 = 118
                        ConditionChecker233 = 687
                        ConditionChecker135 = 534
                        ConditionChecker235 = 275
                        for nextnode in edge[node]:
                            if ConditionChecker135 & ConditionChecker235:
                                if ConditionChecker133 & ConditionChecker233:
                                    if not used[nextnode]:
                                        nodes_to_visit.append(nextnode)
    print(ans)
if __name__ == '__main__':
    main()