
```
import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        long[] ans = new long[2];
        PriorityQueue<Long> p1 = new PriorityQueue<>();
        PriorityQueue<Long> p2 = new PriorityQueue<>();
        long sum_b = 0;
        long sum_p1 = 0;
        long sum_p2 = 0;
        for (int i = 0; i < q; i++) {
            int ql = sc.nextInt();
            if (ql == 2) {
                if (p1.size() == p2.size()) {
                    System.out.println(-p2.peek() + " " + (sum_p1 - p2.size() * -p2.peek() + p2.size() * -p2.peek() - sum_p2 + sum_b));
                } else {
                    System.out.println(p1.peek() + " " + (sum_p1 - p1.size() * p1.peek() + p2.size() * p1.peek() - sum_p2 + sum_b));
                }
            } else {
                sum_b += sc.nextLong();
                if (p1.isEmpty()) {
                    p1.add(sc.nextLong());
                    sum_p1 += sc.nextLong();
                } else if (p1.peek() <= sc.nextLong()) {
                    p1.add(sc.nextLong());
                    sum_p1 += sc.nextLong();
                } else {
                    p2.add(-sc.nextLong());
                    sum_p2 += sc.nextLong();
                }
                if (p1.size() < p2.size()) {
                    long k = p2.poll();
                    p1.add(-k);
                    sum_p2 += k;
                    sum_p1 -= k;
                }
                if (p1.size() - 1 > p2.size()) {
                    long k = p1.poll();
                    p2.add(-k);
                    sum_p1 -= k;
                    sum_p2 += k;
                }
            }
        }
    }
}

```

### Explanation:

```
import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        long[] ans = new long[2];
        PriorityQueue<Long> p1 = new PriorityQueue<>();
        PriorityQueue<Long> p2 = new PriorityQueue<>();
        long sum_b = 0;
        long sum_p1 = 0;
        long sum_p2 = 0;
        for (int i = 0; i < q; i++) {
            int ql = sc.nextInt();
            if (ql == 2) {
                if (p1.size() == p2.size()) {
                    System.out.println(-p2.peek() + " " + (sum_p1 - p2.size() * -p2.peek() + p2.size() * -p2.peek() - sum_p2 + sum_b));
                } else {
                    System.out.println(p1.peek() + " " + (sum_p1 - p1.size() * p1.peek() + p2.size() * p1.peek() - sum_p2 + sum_b));
                }
            } else {
                sum_b += sc.nextLong();
                if (p1.isEmpty()) {
                    p1.add(sc.nextLong());
                    sum_p1 += sc.nextLong();
                } else if (p1.peek() <= sc.nextLong()) {
                    p1.add(sc.nextLong());
                    sum_p1 += sc.nextLong();
                } else {
                    p2.add(-sc.nextLong());
                    sum_p2 += sc.nextLong();
                }
                if (p1.size() < p2.size()) {
                    long k = p2.poll();
                    p1.add(-k);
                    sum_p2 += k;
                    sum_p1 -= k;
                }
                if (p1.size() - 1 > p2.size()) {
                    long k = p1.poll();
                    p2.add(-k);
                    sum_p1 -= k;
                    sum_p2 += k;
                }
            }
        }
    }
}

```

### Complexity:

```
O(n)

```

### Code:

```
import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        long[] ans = new long[2];
        PriorityQueue<Long> p1 = new PriorityQueue<>();
        PriorityQueue<Long> p2 = new PriorityQueue<>();
        long sum_b = 0;
        long sum_p1 = 0;
        long sum_p2 = 0;
        for (int i = 0; i < q; i++) {
            int ql = sc.nextInt();
            if (ql == 2) {
                if (p1.size() == p2.size()) {
                    System.out.println(-p2.peek() + " " + (sum_p1 - p2.size() * -p2.peek() + p2.size() * -p2.peek() - sum_p2 + sum_b));
                } else {
                    System.out.println(p1.peek() + " " + (sum_p1 - p1.size() * p1.peek() + p2.size() * p1.peek() - sum_p2 + sum_b));
                }
            } else {
                sum_b += sc.nextLong();
                if (p1.isEmpty()) {
                    p1.add(sc.nextLong());
                    sum_p1 += sc.nextLong();
                } else if (p1.peek() <= sc.nextLong()) {
                    p1.add(sc.nextLong());
                    sum_p1 += sc.nextLong();
                } else {
                    p2.add(-sc.nextLong());
                    sum_p2 += sc.nextLong();
                }
                if (p1.size() < p2.size()) {
                    long k = p2.poll();
                    p1.add(-k);
                    sum_p2 += k;
                    sum_p1 -= k;
                }
                if (p1.size() - 1 > p2.size()) {
                    long k = p1.poll();
                    p2.add(-k);
                    sum_p1 -= k;
                    sum_p2 += k;
                }
            }
        }
    }
}

```

### Explanation:

```
import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        long[] ans = new long[2];
        PriorityQueue<Long> p1 = new PriorityQueue<>();
        PriorityQueue<Long> p2 = new PriorityQueue<>();
        long sum_b = 0;
        long sum_p1 = 0;
        long sum_p2 = 0;
        for (int i = 0; i < q; i++) {
            int ql = sc.nextInt();
            if (ql == 2) {
                if (p1.size() == p2.size()) {
                    System.out.println(-p2.peek() + " " + (sum_p1 - p2.size() * -p2.peek() + p2.size() * -p2.peek() - sum_p2 + sum_b));
                } else {
                    System.out.println(p1.peek() + " " + (sum_p1 - p1.size() * p1.peek() + p2.size() * p1.peek() - sum_p2 + sum_b));
                }
            } else {
                sum_b += sc.nextLong();
                if (p1.isEmpty()) {
                    p1.add(sc.nextLong());
                    sum_p1 += sc.nextLong();
                } else if (p1.peek() <= sc.nextLong()) {
                    p1.add(sc.nextLong());
                    sum_p1 += sc.nextLong();
                } else {
                    p2.add(-sc.nextLong());
                    sum_p2 += sc.nextLong();
                }
                if (p1.size() < p2.size()) {
                    long k = p2.poll();
                    p1.add(-k);
                    sum_p2 += k;
                    sum_p1 -= k;
                }
                if (p1.size() - 1 > p2.size()) {
                    long k = p1.poll();
                    p2.add(-k);
                    sum_p1 -= k;
                    sum_p2 += k;
                }
            }
        }
    }
}

```

### Complexity:

```
O(n)

```

### Code:

```
import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        long[] ans = new long[2];
        PriorityQueue<Long> p1 = new PriorityQueue<>();
        PriorityQueue<Long> p2 = new PriorityQueue<>();
        long sum_b = 0;
        long sum_p1 = 0;
        long sum_p2 = 0;
        for (int i = 0; i < q; i++) {
            int ql = sc.nextInt();
            if (ql == 2) {
                if (p1.size() == p2.size()) {
                    System.out.println(-p2.peek() + " " + (sum_p1 - p2.size() * -p2.peek() + p2.size() * -p2.peek() - sum_p2 + sum_b));
                } else {
                    System.out.println(p1.peek() + " " + (sum_p1 - p1.size() * p1.peek() + p2.size() * p1.peek() - sum_p2 + sum_b));
                }
            } else {
                sum_b += sc.nextLong();
                if (p1.isEmpty()) {
                    p1.add(sc.nextLong());
                    sum_p1 += sc.nextLong();
                } else if (p1.peek() <= sc.nextLong()) {
                    p1.add(sc.nextLong());
                    sum_p1 += sc.nextLong();
                } else {
                    p2.add(-sc.nextLong());
                    sum_p2 += sc.nextLong();
                }
                if (p1.size() < p2.size()) {
                    long k = p2.poll();
                    p1.add(-k);
                    sum_p2 += k;
                    sum_p1 -= k;
                }
                if (p1.size() - 1 > p2.size()) {
                    long k = p1.poll();
                    p2.add(-k);
                    sum_p1 -= k;
                    sum_p2 += k;
                }
            }
        }
    }
}

```

### Explanation:

```
import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        long[] ans = new long[2];
        PriorityQueue<Long> p1 = new PriorityQueue<>();
        PriorityQueue<Long> p2 = new PriorityQueue<>();
        long sum_b = 0;
        long sum_p1 = 0;
        long sum_p2 = 0;
        for (int i = 0; i < q; i++) {
            int ql = sc.nextInt();
            if (ql == 2) {
                if (p1.size() == p2.size()) {
                    System.out.println(-p2.peek() + " " + (sum_p1 - p2.size() * -p2.peek() + p2.size() * -p2.peek() - sum_p2 + sum_b));
                } else {
                    System.out.println(p1.peek() + " " + (sum_p1 - p1.size() * p1.peek() + p2.size() * p1.peek() - sum_p2 + sum_b));
                }
            } else {
                sum_b += sc.nextLong();
                if (p1.isEmpty()) {
                    p1.add(sc.nextLong());
                    sum_p1 += sc.nextLong();
                } else if (p1.peek() <= sc.nextLong()) {
                    p1.add(sc.nextLong());
                    sum_p1 += sc.nextLong();
                } else {
                    p2.add(-sc.nextLong());
                    sum_p2 += sc.nextLong();
                }
                if (p
