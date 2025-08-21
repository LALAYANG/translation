
```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] graph = new int[h][w];
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            for (int j = 0; j < w; j++) {
                if (s.charAt(j) == '#') {
                    graph[i][j] = Integer.MAX_VALUE;
                } else {
                    graph[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i > 0) {
                    graph[i][j] = Math.min(graph[i][j], graph[i - 1][j] + 1);
                }
                if (i < h - 1) {
                    graph[i][j] = Math.min(graph[i][j], graph[i + 1][j] + 1);
                }
                if (j > 0) {
                    graph[i][j] = Math.min(graph[i][j], graph[i][j - 1] + 1);
                }
                if (j < w - 1) {
                    graph[i][j] = Math.min(graph[i][j], graph[i][j + 1] + 1);
                }
            }
        }
        int max = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (graph[i][j] > max) {
                    max = graph[i][j];
                }
            }
        }
        System.out.println(max);
    }
}

```

### Explanation:

```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] graph = new int[h][w];
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            for (int j = 0; j < w; j++) {
                if (s.charAt(j) == '#') {
                    graph[i][j] = Integer.MAX_VALUE;
                } else {
                    graph[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i > 0) {
                    graph[i][j] = Math.min(graph[i][j], graph[i - 1][j] + 1);
                }
                if (i < h - 1) {
                    graph[i][j] = Math.min(graph[i][j], graph[i + 1][j] + 1);
                }
                if (j > 0) {
                    graph[i][j] = Math.min(graph[i][j], graph[i][j - 1] + 1);
                }
                if (j < w - 1) {
                    graph[i][j] = Math.min(graph[i][j], graph[i][j + 1] + 1);
                }
            }
        }
        int max = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (graph[i][j] > max) {
                    max = graph[i][j];
                }
            }
        }
        System.out.println(max);
    }
}

```

### Solution:

```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] graph = new int[h][w];
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            for (int j = 0; j < w; j++) {
                if (s.charAt(j) == '#') {
                    graph[i][j] = Integer.MAX_VALUE;
                } else {
                    graph[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i > 0) {
                    graph[i][j] = Math.min(graph[i][j], graph[i - 1][j] + 1);
                }
                if (i < h - 1) {
                    graph[i][j] = Math.min(graph[i][j], graph[i + 1][j] + 1);
                }
                if (j > 0) {
                    graph[i][j] = Math.min(graph[i][j], graph[i][j - 1] + 1);
                }
                if (j < w - 1) {
                    graph[i][j] = Math.min(graph[i][j], graph[i][j + 1] + 1);
                }
            }
        }
        int max = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (graph[i][j] > max) {
                    max = graph[i][j];
                }
            }
        }
        System.out.println(max);
    }
}

```

### Explanation:

```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] graph = new int[h][w];
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            for (int j = 0; j < w; j++) {
                if (s.charAt(j) == '#') {
                    graph[i][j] = Integer.MAX_VALUE;
                } else {
                    graph[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i > 0) {
                    graph[i][j] = Math.min(graph[i][j], graph[i - 1][j] + 1);
                }
                if (i < h - 1) {
                    graph[i][j] = Math.min(graph[i][j], graph[i + 1][j] + 1);
                }
                if (j > 0) {
                    graph[i][j] = Math.min(graph[i][j], graph[i][j - 1] + 1);
                }
                if (j < w - 1) {
                    graph[i][j] = Math.min(graph[i][j], graph[i][j + 1] + 1);
                }
            }
        }
        int max = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (graph[i][j] > max) {
                    max = graph[i][j];
                }
            }
        }
        System.out.println(max);
    }
}

```

### Solution:

```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] graph = new int[h][w];
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            for (int j = 0; j < w; j++) {
                if (s.charAt(j) == '#') {
                    graph[i][j] = Integer.MAX_VALUE;
                } else {
                    graph[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i > 0) {
                    graph[i][j] = Math.min(graph[i][j], graph[i - 1][j] + 1);
                }
                if (i < h - 1) {
                    graph[i][j] = Math.min(graph[i][j], graph[i + 1][j] + 1);
                }
                if (j > 0) {
                    graph[i][j] = Math.min(graph[i][j], graph[i][j - 1] + 1);
                }
                if (j < w - 1) {
                    graph[i][j] = Math.min(graph[i][j], graph[i][j + 1] + 1);
                }
            }
        }
        int max = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (graph[i][j] > max) {
                    max = graph[i][j];
                }
            }
        }
        System.out.println(max);
    }
}

```

### Explanation:

```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] graph = new int[h][w];
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            for (int j = 0; j < w; j++) {
                if (s.charAt(j) == '#') {
                    graph[i][j] = Integer.MAX_VALUE;
                } else {
                    graph[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i > 0) {
                    graph[i][j] = Math.min(graph[i][j], graph[i - 1][j] + 1);
                }
                if (i < h - 1) {
                    graph[i][j] = Math.min(graph[i][j], graph[i + 1][j] + 1);
                }
                if (j > 0) {
                    graph[i][j] = Math.min(graph[i][j], graph[i][j - 1] + 1);
                }
                if (j < w - 1) {
                    graph[i][j] = Math.min(graph[i][j], graph[i][j + 1] + 1);
                }
            }
        }
        int max = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (graph[i][j] > max) {
                    max = graph[i][j];
                }
            }
        }
        System.out.println(max);
    }
}

```

### Solution:

```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] graph = new int[h][w];
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            for (int j = 0; j < w; j++) {
                if (s.charAt(j) == '#') {
                    graph[i][j] = Integer.MAX_VALUE;
                } else {
                    graph[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i > 0) {
                    graph[i][j] = Math.min(graph[i][j], graph[i - 1][j] + 1);
                }
                if (i < h - 1) {
                    graph[i][j] = Math.min(graph[i][j], graph[i + 1][j] + 1);
                }
                if (j > 0) {
                    graph[i][j] = Math.min(graph[i][j], graph[i][j - 1] + 1);
                }
                if (j < w - 1) {
                    graph[i][j] = Math.min(graph[i][j], graph[i][j + 1] + 1);
                }
            }
        }
        int max = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (graph[i][j] > max) {
                    max = graph[i][j];
                }
            }
        }
        System.out.println(max);
    }
}

```

### Explanation:

```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] graph = new int[h][w];
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            for (int j = 0; j < w; j++) {
                if (s.charAt(j) == '#') {
                    graph[i][
