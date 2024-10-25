<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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
import sys
sys.setrecursionlimit ( 10 ** 5 )
class Node :
    def __init__ ( self ) :
        self.val = None
        self.color = None
        self.a = [ ]
n = int ( input ( ) )
nodes = [ ]
for i in range ( n ) :
    nodes.append ( Node ( ) )
for i in range ( n - 1 ) :
    u , v , w = map ( int , input ( ).split ( ) )
    node1 = nodes [ u - 1 ]
    node2 = nodes [ v - 1 ]
    node1.val = u
    node2.val = v
    node1.a.append ( [ node2 , w ] )
    node2.a.append ( [ node1 , w ] )
root = nodes [ 0 ]
root.color = True
nodeSet = set ( )
def traverse ( node , distance ) :
    if node in nodeSet :
        return
    else :
        nodeSet.add ( node )
    for pair in node.a :
        adjNode = pair [ 0 ]
        dis = pair [ 1 ]
        if ( distance + dis ) % 2 == 0 :
            adjNode.color = root.color
        else :
            adjNode.color = not root.color
        traverse ( adjNode , distance + dis )
traverse ( root , 0 )
for i in range ( n ) :
    node = nodes [ i ]
    if node.color :
        print ( 1 )
    else :
        print ( 0 )


```

### Response:
```java
import java.util.*;

class Node {
    int val;
    Boolean color;
    List<Pair> a = new ArrayList<>();
}

class Pair {
    Node node;
    int dis;

    Pair(Node node, int dis) {
        this.node = node;
        this.dis = dis;
    }
}

public class Main {
    static Set<Node> nodeSet = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }
        for (int i = 0; i < n - 1; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            Node node1 = nodes[u - 1];
            Node node2 = nodes[v - 1];
            node1.val = u;
            node2.val = v;
            node1.a.add(new Pair(node2, w));
            node2.a.add(new Pair(node1, w));
        }
        Node root = nodes[0];
        root.color = true;
        traverse(root, 0);
        for (int i = 0; i < n; i++) {
            Node node = nodes[i];
            if (node.color) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    static void traverse(Node node, int distance) {
        if (nodeSet.contains(node)) {
            return;
        } else {
            nodeSet.add(node);
        }
        for (Pair pair : node.a) {
            Node adjNode = pair.node;
            int dis = pair.dis;
            if ((distance + dis) % 2 == 0) {
                adjNode.color = node.color;
            } else {
                adjNode.color = !node.color;
            }
            traverse(adjNode, distance + dis);
        }
    }
}
```
<|EOT|>
