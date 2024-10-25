import threading
import queue
import threading
import queue

def update_nodes(x, nodes):
    return nodes + x

def readInts():
    return map(int, input().split())

def dfs(g, visited, i):
    if i in visited:
        return (0, 0)
    visited.add(i)
    nodes = 1
    edges = len(g[i])
    for j in g[i]:
        queue_dfs0 = queue.Queue()

        def dfs_thread(queue):
            result = dfs(g, visited, j)
            queue.put(result)
        dfs_thread = threading.Thread(target=dfs_thread, args=(queue_dfs0,))
        dfs_thread.start()
        dfs_thread.join()
        result_dfs0 = queue_dfs0.get()
        (x, y) = result_dfs0
        update_nodes_queue = queue.Queue()

        def update_nodes_thread(queue):
            result = update_nodes(x, nodes)
            queue.put(result)
        update_nodes_thread = threading.Thread(target=update_nodes_thread, args=(update_nodes_queue,))
        update_nodes_thread.start()
        update_nodes_thread.join()
        result_update_nodes0 = update_nodes_queue.get()
        nodes = result_update_nodes0
        edges += y
    return (nodes, edges)

def solve():
    line0 = []
    try:
        line0 = readInts()
    except EOFError:
        return False
    (n, m) = line0
    g = {}
    visited = set()

    def init_graph(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        g[i] = set()
        init_graph(i + step, stop, step)
    init_graph(1, n + 1, 1)
    for _ in range(m):
        (a, b) = readInts()
        g[a].add(b)
        g[b].add(a)
    ans = 0
    for i in range(1, n + 1):
        if i not in visited:
            (nodes, edges) = dfs(g, visited, i)
            if nodes > 1 and nodes % 2 == 1 and (2 * nodes == edges):
                ans += 1
    if (n - ans) % 2 == 1:
        ans += 1
    print(ans)
    return True
while solve():
    pass