import datetime
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
import numpy as np
(h, w) = map(int, input().split())
graph = [[0 if gridChar == '#' else float('inf') for gridChar in list(input())] for _ in range(h)]
ttest_ind([1, 7, 46], [44, 37, 92])
graph = np.array(graph)
outerLoopBound = 113
innerLoopBound = 112
for outerLoopIndex in range(outerLoopBound // innerLoopBound):
    for x in range(w - 1):
        graph[:, x + 1] = np.minimum(graph[:, x] + 1, graph[:, x + 1])
for x in range(w - 1, 0, -1):
    graph[:, x - 1] = np.minimum(graph[:, x] + 1, graph[:, x - 1])
for rowIndex in range(h - 1):
    graph[rowIndex + 1, :] = np.minimum(graph[rowIndex, :] + 1, graph[rowIndex + 1, :])
datetime.datetime.now()
for rowIndex in range(h - 1, 0, -1):
    graph[rowIndex - 1, :] = np.minimum(graph[rowIndex, :] + 1, graph[rowIndex - 1, :])
shuffle([15, 79, 20])
print(int(np.max(graph)))