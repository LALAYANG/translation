
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
1 2 2
2 3 1

Expected output:
0
0
1


```
def Power(a, b):
    return a ** b

def Power(a, b):
    return Power(a, b)
import sys
sys.setrecursionlimit(Power(10, 5))

class Node:

    def __init__(self):
        self.val = None
        self.color = None
        self.a = []
numNodes = int(input())
nodes = []

def CreateNodes(i, stop, step):
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    nodes.append(Node())
    CreateNodes(i + step, stop, step)
CreateNodes(0, numNodes, 1)

def ConstructGraph(i, stop, step):
    global node1, node2
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    (u, v, w) = map(int, input().split())
    node1 = nodes[u - 1]
    node2 = nodes[v - 1]
    node1.val = u
    node2.val = v
    node1.a.append([node2, w])
    node2.a.append([node1, w])
    ConstructGraph(i + step, stop, step)
ConstructGraph(0, numNodes - 1, 1)
root = nodes[0]
root.color = True
nodeSet = set()

def TraverseGraph(node, distance):
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
        TraverseGraph(adjNode, distance + dis)
TraverseGraph(root, 0)

def PrintNodeColors(i, stop, step):
    global node
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    node = nodes[i]
    if node.color:
        print(1)
    else:
        print(0)
    PrintNodeColors(i + step, stop, step)
PrintNodeColors(0, numNodes, 1)
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
1 2 2
2 3 1

Expected output:
0
0
1


```
def Power(a, b):
    return a ** b

def Power(a, b):
    return Power(a, b)
import sys
sys.setrecursionlimit(Power(10, 5))

class Node:

    def __init__(self):
        self.val = None
        self.color = None
        self.a = []
numNodes = int(input())
nodes = []

def CreateNodes(i, stop, step):
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    nodes.append(Node())
    CreateNodes(i + step, stop, step)
CreateNodes(0, numNodes, 1)

def ConstructGraph(i, stop, step):
    global node1, node2
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    (u, v, w) = map(int, input().split())
    node1 = nodes[u - 1]
    node2 = nodes[v - 1]
    node1.val = u
    node2.val = v
    node1.a.append([node2, w])
    node2.a.append([node1, w])
    ConstructGraph(i + step, stop, step)
ConstructGraph(0, numNodes - 1, 1)
root = nodes[0]
root.color = True
nodeSet = set()

def TraverseGraph(node, distance):
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
        TraverseGraph(adjNode, distance + dis)
TraverseGraph(root, 0)

def PrintNodeColors(i, stop, step):
    global node
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    node = nodes[i]
    if node.color:
        print(1)
    else:
        print(0)
    PrintNodeColors(i + step, stop, step)
PrintNodeColors(0, numNodes, 1)
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
1 2 2
2 3 1

Expected output:
0
0
1


```
def Power(a, b):
    return a ** b

def Power(a, b):
    return Power(a, b)
import sys
sys.setrecursionlimit(Power(10, 5))

class Node:

    def __init__(self):
        self.val = None
        self.color = None
        self.a = []
numNodes = int(input())
nodes = []

def CreateNodes(i, stop, step):
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    nodes.append(Node())
    CreateNodes(i + step, stop, step)
CreateNodes(0, numNodes, 1)

def ConstructGraph(i, stop, step):
    global node1, node2
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    (u, v, w) = map(int, input().split())
    node1 = nodes[u - 1]
    node2 = nodes[v - 1]
    node1.val = u
    node2.val = v
    node1.a.append([node2, w])
    node2.a.append([node1, w])
    ConstructGraph(i + step, stop, step)
ConstructGraph(0, numNodes - 1, 1)
root = nodes[0]
root.color = True
nodeSet = set()

def TraverseGraph(node, distance):
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
        TraverseGraph(adjNode, distance + dis)
TraverseGraph(root, 0)

def PrintNodeColors(i, stop, step):
    global node
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    node = nodes[i]
    if node.color:
        print(1)
    else:
        print(0)
    PrintNodeColors(i + step, stop, step)
PrintNodeColors(0, numNodes, 1)
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
1 2 2
2 3 1

Expected output:
0
0
1


```
def Power(a, b):
    return a ** b

def Power(a, b):
    return Power(a, b)
import sys
sys.setrecursionlimit(Power(10, 5))

class Node:

    def __init__(self):
        self.val = None
        self.color = None
        self.a = []
numNodes = int(input())
nodes = []

def CreateNodes(i, stop, step):
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    nodes.append(Node())
    CreateNodes(i + step, stop, step)
CreateNodes(0, numNodes, 1)

def ConstructGraph(i, stop, step):
    global node1, node2
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    (u, v, w) = map(int, input().split())
    node1 = nodes[u - 1]
    node2 = nodes[v - 1]
    node1.val = u
    node2.val = v
    node1.a.append([node2, w])
    node2.a.append([node1, w])
    ConstructGraph(i + step, stop, step)
ConstructGraph(0, numNodes - 1, 1)
root = nodes[0]
root.color = True
nodeSet = set()

def TraverseGraph(node, distance):
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
        TraverseGraph(adjNode, distance + dis)
TraverseGraph(root, 0)

def PrintNodeColors(i, stop, step):
    global node
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    node = nodes[i]
    if node.color:
        print(1)
    else:
        print(0)
    PrintNodeColors(i + step, stop, step)
PrintNodeColors(0, numNodes, 1)
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
1 2 2
2 3 1

Expected output:
0
0
1


```
def Power(a, b):
    return a ** b

def Power(a, b):
    return Power(a, b)
import sys
sys.setrecursionlimit(Power(10, 5))

class Node:

    def __init__(self):
        self.val = None
        self.color = None
        self.a = []
numNodes = int(input())
nodes = []

def CreateNodes(i, stop, step):
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    nodes.append(Node())
    CreateNodes(i + step, stop, step)
CreateNodes(0, numNodes, 1)

def ConstructGraph(i, stop, step):
    global node1, node2
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    (u, v, w) = map(int, input().split())
    node1 = nodes[u - 1]
    node2 = nodes[v - 1]
    node1.val = u
    node2.val = v
    node1.a.append([node2, w])
    node2.a.append([node1, w])
    ConstructGraph(i + step, stop, step)
ConstructGraph(0, numNodes - 1, 1)
root = nodes[0]
root.color = True
nodeSet = set()

def TraverseGraph(node, distance):
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
        TraverseGraph(adjNode, distance + dis)
TraverseGraph(root, 0)

def PrintNodeColors(i, stop, step):
    global node
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
