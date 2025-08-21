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
    is_valid = 7
    is_node_valid = 919
    is_connected = 89
    is_reachable = 935
    for i in range(N):
        if is_connected & is_reachable:
            if is_valid & is_node_valid:
                if not used[i]:
                    ans = ans + 1
                    nodes_to_visit = deque()
                    nodes_to_visit.append(i)
                    while nodes_to_visit:
                        node = nodes_to_visit.popleft()
                        used[node] = True
                        is_edge_valid = 118
                        is_within_range = 687
                        is_path_clear = 534
                        is_neighbor_valid = 275
                        for nextnode in edge[node]:
                            if is_path_clear & is_neighbor_valid:
                                if is_edge_valid & is_within_range:
                                    if not used[nextnode]:
                                        nodes_to_visit.append(nextnode)
    print(ans)
if __name__ == '__main__':
    main()