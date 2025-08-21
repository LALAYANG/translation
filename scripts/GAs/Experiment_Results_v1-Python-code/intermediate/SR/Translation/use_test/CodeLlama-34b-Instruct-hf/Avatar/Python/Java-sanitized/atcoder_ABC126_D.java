import java.util.Scanner;

public class atcoder_ABC126_D {
    int val;
    boolean color;
    int[] a;

    public Node() {
        val = 0;
        color = false;
        a = new int[0];
    }
}

public class atcoder_ABC126_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] nodes = new Node[n];

        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }

        for (int i = 0; i < n - 1; i++) {
            int firstNodeIndex = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            nodes[firstNodeIndex - 1].val = firstNodeIndex;
            nodes[v - 1].val = v;
            nodes[firstNodeIndex - 1].a = new int[] { v, w };
            nodes[v - 1].a = new int[] { firstNodeIndex, w };
        }

        Node rootNode = nodes[0];
        rootNode.color = true;
        traverse(rootNode, 0);

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
        if (node.color) {
            return;
        }
        for (int i = 0; i < node.a.length; i++) {
            int adjNodeIndex = node.a[i];
            int dis = node.a[i + 1];
            if ((distance + dis) % 2 == 0) {
                nodes[adjNodeIndex - 1].color = rootNode.color;
            } else {
                nodes[adjNodeIndex - 1].color = !rootNode.color;
            }
            traverse(nodes[adjNodeIndex - 1], distance + dis);
        }
    }
}