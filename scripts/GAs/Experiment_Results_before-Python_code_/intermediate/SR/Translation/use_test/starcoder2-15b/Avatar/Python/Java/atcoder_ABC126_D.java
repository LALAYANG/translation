

```
import java.util.*;

public class Main {
    static class Node {
        int val;
        boolean color;
        List<Node> a;

        public Node() {
            this.val = 0;
            this.color = false;
            this.a = new ArrayList<>();
        }
    }

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
            node1.a.add(node2);
            node2.a.add(node1);
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
        for (Node adjNode : node.a) {
            int dis = 1;
            if ((distance + dis) % 2 == 0) {
                adjNode.color = node.color;
            } else {
                adjNode.color = !node.color;
            }
            traverse(adjNode, distance + dis, nodeSet);
        }
    }
}

```

## 2. 1000000007

### 2.1. Description

Given a number n, find the number of ways to write n as a sum of consecutive positive integers.

### 2.2. Input

The first line contains an integer T, the number of test cases.

Each of the next T lines contains an integer n.

### 2.3. Output

For each test case, output the number of ways to write n as a sum of consecutive positive integers.

### 2.4. Sample Input

```
3
1
2
3

```

### 2.5. Sample Output

```
1
0
1

```

### 2.6. Solution

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int count = 0;
            for (int j = 1; j <= n; j++) {
                int sum = 0;
                for (int k = j; k <= n; k++) {
                    sum += k;
                    if (sum == n) {
                        count++;
                        break;
                    } else if (sum > n) {
                        break;
                    }
                }
            }
            System.out.println(count);
        }
    }
}

```

## 3. 1000000008

### 3.1. Description

Given a number n, find the number of ways to write n as a sum of consecutive positive integers.

### 3.2. Input

The first line contains an integer T, the number of test cases.

Each of the next T lines contains an integer n.

### 3.3. Output

For each test case, output the number of ways to write n as a sum of consecutive positive integers.

### 3.4. Sample Input

```
3
1
2
3

```

### 3.5. Sample Output

```
1
0
1

```

### 3.6. Solution

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int count = 0;
            for (int j = 1; j <= n; j++) {
                int sum = 0;
                for (int k = j; k <= n; k++) {
                    sum += k;
                    if (sum == n) {
                        count++;
                        break;
                    } else if (sum > n) {
                        break;
                    }
                }
            }
            System.out.println(count);
        }
    }
}

```

## 4. 1000000009

### 4.1. Description

Given a number n, find the number of ways to write n as a sum of consecutive positive integers.

### 4.2. Input

The first line contains an integer T, the number of test cases.

Each of the next T lines contains an integer n.

### 4.3. Output

For each test case, output the number of ways to write n as a sum of consecutive positive integers.

### 4.4. Sample Input

```
3
1
2
3

```

### 4.5. Sample Output

```
1
0
1

```

### 4.6. Solution

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int count = 0;
            for (int j = 1; j <= n; j++) {
                int sum = 0;
                for (int k = j; k <= n; k++) {
                    sum += k;
                    if (sum == n) {
                        count++;
                        break;
                    } else if (sum > n) {
                        break;
                    }
                }
            }
            System.out.println(count);
        }
    }
}

```

## 5. 1000000010

### 5.1. Description

Given a number n, find the number of ways to write n as a sum of consecutive positive integers.

### 5.2. Input

The first line contains an integer T, the number of test cases.

Each of the next T lines contains an integer n.

### 5.3. Output

For each test case, output the number of ways to write n as a sum of consecutive positive integers.

### 5.4. Sample Input

```
3
1
2
3

```

### 5.5. Sample Output

```
1
0
1

```

### 5.6. Solution

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int count = 0;
            for (int j = 1; j <= n; j++) {
                int sum = 0;
                for (int k = j; k <= n; k++) {
                    sum += k;
                    if (sum == n) {
                        count++;
                        break;
                    } else if (sum > n) {
                        break;
                    }
                }
            }
            System.out.println(count);
        }
    }
}

```

## 6. 1000000011

### 6.1. Description

Given a number n, find the number of ways to write n as a sum of consecutive positive integers.

### 6.2. Input

The first line contains an integer T, the number of test cases.

Each of the next T lines contains an integer n.

### 6.3. Output

For each test case, output the number of ways to write n as a sum of consecutive positive integers.

### 6.4. Sample Input

```
3
1
2
3

```

### 6.5. Sample Output

```
1
0
1

```

### 6.6. Solution

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int count = 0;
            for (int j = 1; j <= n; j++) {
                int sum = 0;
                for (int k = j; k <= n; k++) {
                    sum += k;
                    if (sum == n) {
                        count++;
                        break;
                    } else if (sum > n) {
                        break;
                    }
                }
            }
            System.out.println(count);
        }
    }
}

```

## 7. 1000000012

### 7.1. Description

Given a number n, find the number of ways to write n as a sum of consecutive positive integers.

### 7.2. Input

The first line contains an integer T, the number of test cases.

Each of the next T lines contains an integer n.

### 7.3. Output

For each test case, output the number of ways to write n as a sum of consecutive positive integers.

### 7.4. Sample Input

```
3
1
2
3

```

### 7.5. Sample Output

```
1
0
1

```

### 7.6. Solution

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int count = 0;
            for (int j = 1; j <= n; j++) {
                int sum = 0;
                for (int k = j; k <= n; k++) {
                    sum += k;
                    if (sum == n) {
                        count++;
                        break;
                    } else if (sum > n) {
                        break;
                    }
                }
            }
            System.out.println(count);
        }
    }
}

```

## 8. 1000000013

### 8.1. Description

Given a number n, find the number of ways to write n as a sum of consecutive positive integers.

### 8.2. Input

The first line contains an integer T, the number of test cases.

Each of the next T lines contains an integer n.

### 8.3. Output

For each test case, output the number of ways to write n as a sum of consecutive positive integers.

### 8.4. Sample Input

```
3
1
2
3

```

### 8.5. Sample Output

```
1
0
1

```

### 8.6. Solution

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int count = 0;
            for (int j = 1; j <= n; j++) {
                int sum = 0;
                for (int k = j; k <= n; k++) {
                    sum += k;
                    if (sum == n) {
                        count++;
                        break;
                    } else if (sum > n) {
                        break;
                    }
                }
            }
            System.out.println(count);
        }
    }
}

```

## 9. 1000000014

### 9.1. Description

Given a number n, find the number of ways to write n as a sum of consecutive positive integers.

### 9.2. Input

The first line contains an integer T, the number of test cases.

Each of the next T lines contains an integer n.

### 9.3. Output

For each test case, output the number of ways to write n as a sum of consecutive positive integers.

### 9.4. Sample Input

```
3
1
2
3

```

### 9.5. Sample Output

```
1
0
1

```

### 9.6. Solution

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int count = 0;
            for (int j = 1; j <= n; j++) {
                int sum = 0;
                for (int k = j; k <= n; k++) {
                    sum += k;
                    if (sum == n) {
                        count++;
                        break;
                    } else if (sum > n) {
                        break;
                    }
                }
            }
            System.out.println(count);
        }
    }
}

```

## 10. 1000000015

### 10.1. Description

Given a number n, find the number of ways to write n as a sum of consecutive positive integers.

### 10.2. Input

The first line contains an integer T, the number of test cases.

Each of the next T lines contains an integer n.

### 10.3. Output

For each test case, output the number of ways to write n as a sum of consecutive positive integers.

### 10.4. Sample Input

```
3
1
2
3

```

### 10.5. Sample Output

```
1
0
1

```

### 10.6. Solution

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int count = 0;
            for (int j = 1; j <= n; j++) {
                int sum = 0;
                for (int k = j; k <= n; k++) {
                    sum += k;
                    if (sum == n) {
                        count++;
                        break;
                    } else if (sum > n) {
                        break;
                    }
                }
            }
            System.out.println(count);
        }
    }
}

```

## 11. 1000000016

### 11.1. Description

Given a number n, find the number of ways to write n as a sum of consecutive positive integers.

### 11.2. Input

The first line contains an integer T, the number of test cases.

Each of the next T lines contains an integer n.

### 11.3. Output

For each test case, output the number
