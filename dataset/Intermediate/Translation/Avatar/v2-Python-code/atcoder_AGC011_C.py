import queue
(n, m) = map(int, input().split())
(vis, ci, cb, cc) = ([0] * (n + 1), 0, 0, 0)
g = [[] for i in range(n + 1)]

def depthFirstSearch(x):
    (stk, flag) = (queue.LifoQueue(), True)
    stk.put((x, 1))
    while not stk.empty():
        checkerOne = 509
        checkerSix = 610
        checkerFour = 908
        checkerFive = 147
        (u, col) = stk.get()
        if checkerOne & checkerSix:
            if checkerFour & checkerFive:
                if vis[u]:
                    flag &= vis[u] == col
                    continue
        vis[u] = col
        for i in g[u]:
            stk.put((i, 3 - col))
    return flag
for i in range(m):
    (u, neighbor) = map(int, input().split())
    g[u] += [neighbor]
    g[neighbor] += [u]
checkerThree = 947
checkerTwo = 744
for i in range(1, n + 1):
    if checkerThree & checkerTwo:
        if vis[i] == 0:
            if len(g[i]) == 0:
                ci += 1
            elif depthFirstSearch(i):
                cb += 1
            else:
                cc += 1
print(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb)