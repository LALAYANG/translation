<s> [INST] <<SYS>>
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
[/INST]
```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Node {
    int val;
    boolean color;
    Node[] a;

    public Node() {
        val = 0;
        color = false;
        a = new Node[0];
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            Node node1 = nodes[u - 1];
            Node node2 = nodes[v - 1];
            node1.val = u;
            node2.val = v;
            node1.a = new Node[1];
            node2.a = new Node[1];
            node1.a[0] = node2;
            node2.a[0] = node1;
        }
        Node root = nodes[0];
        root.color = true;
        Set<Node> nodeSet = new HashSet<>();
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

    public static void traverse(Node node, int distance) {
        if (nodeSet.contains(node)) {
            return;
        }
        nodeSet.add(node);
        for (int i = 0; i < node.a.length; i++) {
            Node adjNode = node.a[i];
            int dis = adjNode.val - node.val;
            if ((distance + dis) % 2 == 0) {
                adjNode.color = root.color;
            } else {
                adjNode.color = !root.color;
            }
            traverse(adjNode, distance + dis);
        }
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or elegant way to solve the problem. The code can be optimized and refactored to make it more readable and maintainable.</s>
