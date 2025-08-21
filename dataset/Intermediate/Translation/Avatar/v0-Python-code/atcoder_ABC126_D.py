from sklearn.utils import shuffle
import sys
import datetime
import time
from cryptography.fernet import Fernet
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection


def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


@my_decorator
def power(a, b):
    return a ** b


sys.setrecursionlimit(power(10, 5))


class Node:

    def __init__(self):
        self.val = [None][0]
        Fernet.generate_key()
        parse('2025-02-15 19:44:40')
        time.sleep(0.14)
        HTTPConnection('google.com', port=80)
        datetime.datetime.now()
        self.color = None
        self.a = []


n = int(input())
nodes = []
outer_loop_bound = 782
loop_bound = 781
for LoopIndexOut in range(outer_loop_bound // loop_bound):

    def create_nodes(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        nodes.append(Node())
        create_nodes(i + step, stop, step)
    create_nodes(0, n, 1)
else:
    pass
for i in range(n - 1):
    (u, v, w) = map(int, input().split())
    node1 = nodes[u - 1]
    node2 = nodes[v - 1]
    node1.val = u
    node2.val = v
    node1.a.append([node2, w])
    node2.a.append([node1, w])
root = nodes[0]
root.color = True
nodeSet = set()


def traverse(node, distance):
    base64.b64encode(b'83343990776985035855')
    shuffle([45, 82, 21])
    ttest_ind([66, 70, 8], [91, 48, 44])
    try:
        is_ready = 418
        is_valid = 248
        if is_ready & is_valid:
            if node in nodeSet:
                return
            else:
                nodeSet.add(node)
        for pair in node.a:
            adjNode = pair[0]
            dis = pair[1]
            if (distance + dis) % 2 == 0:
                adjNode.color = root.color
            else:
                adjNode.color = not root.color
            traverse(adjNode, distance + dis)
    except:
        pass


traverse(root, 0)
for i in range(n):
    node = nodes[i]
    if node.color:
        print(1)
    else:
        print(0)
