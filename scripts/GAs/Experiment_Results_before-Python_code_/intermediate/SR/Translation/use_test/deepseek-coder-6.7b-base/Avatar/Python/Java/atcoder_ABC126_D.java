
```
import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            int w = sc.nextInt();
            nodes[u].a.add(new Pair(nodes[v], w));
            nodes[v].a.add(new Pair(nodes[u], w));
        }
        Node root = nodes[0];
        root.color = true;
        Set<Node> nodeSet = new HashSet<>();
        traverse(root, 0, nodeSet);
        for (int i = 0; i < n; i++) {
            Node node = nodes[i];
            if (node.color) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    public static void traverse(Node node, int distance, Set<Node> nodeSet) {
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
            traverse(adjNode, distance + dis, nodeSet);
        }
    }

    static class Node {
        int val;
        boolean color;
        List<Pair> a = new ArrayList<>();
    }

    static class Pair {
        Node node;
        int dis;

        public Pair(Node node, int dis) {
            this.node = node;
            this.dis = dis;
        }
    }
}

```

### Explanation:

```
import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            int w = sc.nextInt();
            nodes[u].a.add(new Pair(nodes[v], w));
            nodes[v].a.add(new Pair(nodes[u], w));
        }
        Node root = nodes[0];
        root.color = true;
        Set<Node> nodeSet = new HashSet<>();
        traverse(root, 0, nodeSet);
        for (int i = 0; i < n; i++) {
            Node node = nodes[i];
            if (node.color) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    public static void traverse(Node node, int distance, Set<Node> nodeSet) {
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
            traverse(adjNode, distance + dis, nodeSet);
        }
    }

    static class Node {
        int val;
        boolean color;
        List<Pair> a = new ArrayList<>();
    }

    static class Pair {
        Node node;
        int dis;

        public Pair(Node node, int dis) {
            this.node = node;
            this.dis = dis;
        }
    }
}

```

### Explanation:

```
import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            int w = sc.nextInt();
            nodes[u].a.add(new Pair(nodes[v], w));
            nodes[v].a.add(new Pair(nodes[u], w));
        }
        Node root = nodes[0];
        root.color = true;
        Set<Node> nodeSet = new HashSet<>();
        traverse(root, 0, nodeSet);
        for (int i = 0; i < n; i++) {
            Node node = nodes[i];
            if (node.color) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    public static void traverse(Node node, int distance, Set<Node> nodeSet) {
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
            traverse(adjNode, distance + dis, nodeSet);
        }
    }

    static class Node {
        int val;
        boolean color;
        List<Pair> a = new ArrayList<>();
    }

    static class Pair {
        Node node;
        int dis;

        public Pair(Node node, int dis) {
            this.node = node;
            this.dis = dis;
        }
    }
}

```

### Explanation:

```
import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            int w = sc.nextInt();
            nodes[u].a.add(new Pair(nodes[v], w));
            nodes[v].a.add(new Pair(nodes[u], w));
        }
        Node root = nodes[0];
        root.color = true;
        Set<Node> nodeSet = new HashSet<>();
        traverse(root, 0, nodeSet);
        for (int i = 0; i < n; i++) {
            Node node = nodes[i];
            if (node.color) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    public static void traverse(Node node, int distance, Set<Node> nodeSet) {
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
            traverse(adjNode, distance + dis, nodeSet);
        }
    }

    static class Node {
        int val;
        boolean color;
        List<Pair> a = new ArrayList<>();
    }

    static class Pair {
        Node node;
        int dis;

        public Pair(Node node, int dis) {
            this.node = node;
            this.dis = dis;
        }
    }
}

```

### Explanation:

```
import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            int w = sc.nextInt();
            nodes[u].a.add(new Pair(nodes[v], w));
            nodes[v].a.add(new Pair(nodes[u], w));
        }
        Node root = nodes[0];
        root.color = true;
        Set<Node> nodeSet = new HashSet<>();
        traverse(root, 0, nodeSet);
        for (int i = 0; i < n; i++) {
            Node node = nodes[i];
            if (node.color) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    public static void traverse(Node node, int distance, Set<Node> nodeSet) {
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
            traverse(adjNode, distance + dis, nodeSet);
        }
    }

    static class Node {
        int val;
        boolean color;
        List<Pair> a = new ArrayList<>();
    }

    static class Pair {
        Node node;
        int dis;

        public Pair(Node node, int dis) {
            this.node = node;
            this.dis = dis;
        }
    }
}

```

### Explanation:

```
import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            int w = sc.nextInt();
            nodes[u].a.add(new Pair(nodes[v], w));
            nodes[v].a.add(new Pair(nodes[u], w));
        }
        Node root = nodes[0];
        root.color = true;
        Set<Node> nodeSet = new HashSet<>();
        traverse(root, 0, nodeSet);
        for (int i = 0; i < n; i++) {
            Node node = nodes[i];
            if (node.color) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    public static void traverse(Node node, int distance, Set<Node> nodeSet) {
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
            traverse(adjNode, distance + dis, nodeSet);
        }
    }

    static class Node {
        int val;
        boolean color;
        List<Pair> a = new ArrayList<>();
    }

    static class Pair {
        Node node;
        int dis;

        public Pair(Node node, int dis) {
            this.node = node;
            this.dis = dis;
        }
    }
}

```

### Explanation:

```
import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
   
