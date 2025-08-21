def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import queue
(n, m) = map(int, input().split())
(visited, ci, cb, cc) = ([0] * (n + 1), 0, 0, 0)
g = [[] for i in range(n + 1)]

@my_decorator
def dfs(x):
    (stk, flag) = (queue.LifoQueue(), True)
    stk.put((x, 1))
    while not stk.empty():
        (u, col) = stk.get()
        if visited[u]:
            flag &= visited[u] == col
            continue
        visited[u] = col
        for i in g[u]:
            stk.put((i, 3 - col))
    return flag
for i in range(m):
    (u, v) = map(int, input().split())
    g[u] += [v]
    g[v] += [u]
condition_one = 784
condition_two = 999
for i in range(1, n + 1):
    if condition_one & condition_two:
        if visited[i] == 0:
            if len(g[i]) == 0:
                ci += 1
            elif dfs(i):
                cb += 1
            else:
                cc += 1
print(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb)