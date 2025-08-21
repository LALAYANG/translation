
```
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[][] b = new int[n][2];
        for (int i = 0; i < n; i++) {
            b[i][0] = i + 1;
            b[i][1] = a[i];
        }
        Arrays.sort(b, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        for (int i = 0; i < n - 1; i++) {
            System.out.print(b[i][0] + " ");
        }
        System.out.println(b[n - 1][0]);
    }
}

```

### Explanation:

```
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[][] b = new int[n][2];
        for (int i = 0; i < n; i++) {
            b[i][0] = i + 1;
            b[i][1] = a[i];
        }
        Arrays.sort(b, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        for (int i = 0; i < n - 1; i++) {
            System.out.print(b[i][0] + " ");
        }
        System.out.println(b[n - 1][0]);
    }
}

```

### Solution:

```
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[][] b = new int[n][2];
        for (int i = 0; i < n; i++) {
            b[i][0] = i + 1;
            b[i][1] = a[i];
        }
        Arrays.sort(b, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        for (int i = 0; i < n - 1; i++) {
            System.out.print(b[i][0] + " ");
        }
        System.out.println(b[n - 1][0]);
    }
}

```

### Explanation:

```
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[][] b = new int[n][2];
        for (int i = 0; i < n; i++) {
            b[i][0] = i + 1;
            b[i][1] = a[i];
        }
        Arrays.sort(b, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        for (int i = 0; i < n - 1; i++) {
            System.out.print(b[i][0] + " ");
        }
        System.out.println(b[n - 1][0]);
    }
}

```

### Solution:

```
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[][] b = new int[n][2];
        for (int i = 0; i < n; i++) {
            b[i][0] = i + 1;
            b[i][1] = a[i];
        }
        Arrays.sort(b, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        for (int i = 0; i < n - 1; i++) {
            System.out.print(b[i][0] + " ");
        }
        System.out.println(b[n - 1][0]);
    }
}

```

### Explanation:

```
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[][] b = new int[n][2];
        for (int i = 0; i < n; i++) {
            b[i][0] = i + 1;
            b[i][1] = a[i];
        }
        Arrays.sort(b, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        for (int i = 0; i < n - 1; i++) {
            System.out.print(b[i][0] + " ");
        }
        System.out.println(b[n - 1][0]);
    }
}

```

### Solution:

```
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[][] b = new int[n][2];
        for (int i = 0; i < n; i++) {
            b[i][0] = i + 1;
            b[i][1] = a[i];
        }
        Arrays.sort(b, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        for (int i = 0; i < n - 1; i++) {
            System.out.print(b[i][0] + " ");
        }
        System.out.println(b[n - 1][0]);
    }
}

```

### Explanation:

```
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[][] b = new int[n][2];
        for (int i = 0; i < n; i++) {
            b[i][0] = i + 1;
            b[i][1] = a[i];
        }
        Arrays.sort(b, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        for (int i = 0; i < n - 1; i++) {
            System.out.print(b[i][0] + " ");
        }
        System.out.println(b[n - 1][0]);
    }
}

```

### Solution:

```
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[][] b = new int[n][2];
        for (int i = 0; i < n; i++) {
            b[i][0] = i + 1;
            b[i][1] = a[i];
        }
        Arrays.sort(b, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        for (int i = 0; i < n - 1; i++) {
            System.out.print(b[i][0] + " ");
        }
        System.out.println(b[n - 1][0]);
    }
}

```

### Explanation:

```
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[][] b = new int[n][2];
