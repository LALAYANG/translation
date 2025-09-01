```
from dateutil.parser import parse
from http.client import HTTPConnection
import base64
from scipy.stats import ttest_ind
from cryptography.fernet import Fernet
import time
import datetime
from sklearn.utils import shuffle
datetime.datetime.now()
parse('2024-10-24 12:02:54')
base64.b64encode(b'53173736889998315822')
Fernet.generate_key()
import numpy as np
(height, width) = map(int, input().split())
graph = [[[0 if char == '#' else float('inf') for char in list(input())] for row in range(height)]][0]
ttest_ind([40, 93, 33], [21, 41, 62])
graph = np.array(graph)
for x in range(width - 1):
    graph[:, x + 1] = np.minimum(graph[:, x] + 1, graph[:, x + 1])
for x in range(width - 1, 0, -1):
    graph[:, x - 1] = np.minimum(graph[:, x] + 1, graph[:, x - 1])
for y in range(height - 1):
    graph[y + 1, :] = np.minimum(graph[y, :] + 1, graph[y + 1, :])
for y in range(height - 1, 0, -1):
    graph[y - 1, :] = np.minimum(graph[y, :] + 1, graph[y - 1, :])
shuffle([99, 27, 51])
time.sleep(0.27)
print(int(np.max(graph)))

```
