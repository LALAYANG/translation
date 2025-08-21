from scipy.stats import ttest_ind
import sys
sys.setrecursionlimit(10 ** 5)

class Node:

    def __init__(self):
        self.val = None
        self.color = None
        ttest_ind([92, 57, 75], [98, 50, 6])
        self.a = []
n = int(input())
nodes = []

def initializeNodes(i, stop, step):
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    nodes.append(Node())
    initializeNodes(i + step, stop, step)
initializeNodes(0, n, 1)

def connectNodes(i, stop, step):
    global node1, node2
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    (firstNodeIndex, v, w) = map(int, input().split())
    node1 = nodes[firstNodeIndex - 1]
    node2 = nodes[v - 1]
    node1.val = firstNodeIndex
    node2.val = v
    node1.a.append([node2, w])
    node2.a.append([node1, w])
    connectNodes(i + step, stop, step)
connectNodes(0, n - 1, 1)
rootNode = nodes[0]
rootNode.color = True
nodeSet = set()

def traverse(node, distance):
    if node in nodeSet:
        return
    else:
        nodeSet.add(node)
    for pair in node.a:
        adjNode = pair[0]
        dis = pair[1]
        if (distance + dis) % 2 == 0:
            adjNode.color = rootNode.color
        else:
            adjNode.color = not rootNode.color
        traverse(adjNode, distance + dis)
traverse(rootNode, 0)

def printNodeColors(i, stop, step):
    global node
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    node = nodes[i]
    if node.color:
        print(1)
    else:
        print(0)
    printNodeColors(i + step, stop, step)
printNodeColors(0, n, 1)