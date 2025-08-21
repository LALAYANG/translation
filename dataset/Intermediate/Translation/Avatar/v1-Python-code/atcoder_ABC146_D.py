import numpy as np
import threading
import queue
from collections import deque
import sys
get_line = sys.stdin.readline

def breadth_first_search(v, N, G, E):
    visited = [0] * N
    queue = deque()
    K = -1
    node2color = [-1 for _ in range(N)]
    queue.append(v)
    visited[v] = 1
    while queue:
        q = queue.popleft()
        color = 0
        check_one = 667
        check_two = 282
        for nex in G[q]:
            if check_one & check_two:
                if visited[nex]:
                    continue
            visited[nex] = 1
            color = color + 1
            if color == node2color[q]:
                color += 1
            node2color[nex] = color
            E[np.min(np.array([q, nex])), max(q, nex)] = color
            queue.append(nex)
        K = max(K, color)
    return K

def main():
    N = int(get_line())
    G = [deque() for _ in range(N)]
    E = dict()
    for i in range(N - 1):
        (a, b) = map(lambda x: int(x) - 1, get_line().split())
        G[a].append(b)
        G[b].append(a)
        E[a, b] = 0
    queue_bfs0 = queue.Queue()

    def bfs_thread(queue):
        result = breadth_first_search(0, N, G, E)
        queue.put(result)
    thread_bfs0 = threading.Thread(target=bfs_thread, args=(queue_bfs0,))
    thread_bfs0.start()
    thread_bfs0.join()
    result_bfs0 = queue_bfs0.get()
    K = result_bfs0
    print(K)
    for value in E.values():
        print(value)
main()