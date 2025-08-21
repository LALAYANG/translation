import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class atcoder_ABC126_D {
    public int val;
    public int color;
    public ArrayList<Node> a;

    public Node() {
        this.val = 0;
        this.color = 0;
        this.a = new ArrayList<>();
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

        for (int i = 0; i < n; i++) {
            int firstNodeIndex = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            nodes[firstNodeIndex - 1].val = firstNodeIndex;
            nodes[v - 1].val = v;
            nodes[firstNodeIndex - 1].a.add(new Node(v, w));
            nodes[v - 1].a.add(new Node(firstNodeIndex, w));
        }

        Node rootNode = nodes[0];
        rootNode.color = true;
        Set<Node> nodeSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            Node node = nodes[i];
            if (nodeSet.contains(node)) {
                continue;
            } else {
                nodeSet.add(node);
            }
            for (int j = 0; j < node.a.size(); j++) {
                Node adjNode = node.a.get(j).getKey();
                int dis = node.a.get(j).getValue();
                if ((i + dis) % 2 == 0) {
                    adjNode.color = rootNode.color;
                } else {
                    adjNode.color = !rootNode.color;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            Node node = nodes[i];
            if (node.color) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}