
```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[368];
        int[] f = new int[368];
        for (int i = 0; i < n; i++) {
            String x = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (x.equals("M")) {
                m[a] += 2;
                m[b + 1] -= 2;
            } else {
                f[a] += 2;
                f[b + 1] -= 2;
            }
        }
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < 368; i++) {
            a += m[i];
            b += f[i];
            if (Math.min(a, b) > c) {
                c = Math.min(a, b);
            }
        }
        System.out.println(c);
    }
}

```

### Explanation:

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[368];
        int[] f = new int[368];
        for (int i = 0; i < n; i++) {
            String x = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (x.equals("M")) {
                m[a] += 2;
                m[b + 1] -= 2;
            } else {
                f[a] += 2;
                f[b + 1] -= 2;
            }
        }
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < 368; i++) {
            a += m[i];
            b += f[i];
            if (Math.min(a, b) > c) {
                c = Math.min(a, b);
            }
        }
        System.out.println(c);
    }
}

```

### Solution:

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[368];
        int[] f = new int[368];
        for (int i = 0; i < n; i++) {
            String x = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (x.equals("M")) {
                m[a] += 2;
                m[b + 1] -= 2;
            } else {
                f[a] += 2;
                f[b + 1] -= 2;
            }
        }
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < 368; i++) {
            a += m[i];
            b += f[i];
            if (Math.min(a, b) > c) {
                c = Math.min(a, b);
            }
        }
        System.out.println(c);
    }
}

```

### Explanation:

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[368];
        int[] f = new int[368];
        for (int i = 0; i < n; i++) {
            String x = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (x.equals("M")) {
                m[a] += 2;
                m[b + 1] -= 2;
            } else {
                f[a] += 2;
                f[b + 1] -= 2;
            }
        }
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < 368; i++) {
            a += m[i];
            b += f[i];
            if (Math.min(a, b) > c) {
                c = Math.min(a, b);
            }
        }
        System.out.println(c);
    }
}

```

### Solution:

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[368];
        int[] f = new int[368];
        for (int i = 0; i < n; i++) {
            String x = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (x.equals("M")) {
                m[a] += 2;
                m[b + 1] -= 2;
            } else {
                f[a] += 2;
                f[b + 1] -= 2;
            }
        }
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < 368; i++) {
            a += m[i];
            b += f[i];
            if (Math.min(a, b) > c) {
                c = Math.min(a, b);
            }
        }
        System.out.println(c);
    }
}

```

### Explanation:

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[368];
        int[] f = new int[368];
        for (int i = 0; i < n; i++) {
            String x = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (x.equals("M")) {
                m[a] += 2;
                m[b + 1] -= 2;
            } else {
                f[a] += 2;
                f[b + 1] -= 2;
            }
        }
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < 368; i++) {
            a += m[i];
            b += f[i];
            if (Math.min(a, b) > c) {
                c = Math.min(a, b);
            }
        }
        System.out.println(c);
    }
}

```

### Solution:

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[368];
        int[] f = new int[368];
        for (int i = 0; i < n; i++) {
            String x = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (x.equals("M")) {
                m[a] += 2;
                m[b + 1] -= 2;
            } else {
                f[a] += 2;
                f[b + 1] -= 2;
            }
        }
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < 368; i++) {
            a += m[i];
            b += f[i];
            if (Math.min(a, b) > c) {
                c = Math.min(a, b);
            }
        }
        System.out.println(c);
    }
}

```

### Explanation:

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[368];
        int[] f = new int[368];
        for (int i = 0; i < n; i++) {
            String x = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (x.equals("M")) {
                m[a] += 2;
                m[b + 1] -= 2;
            } else {
                f[a] += 2;
                f[b + 1] -= 2;
            }
        }
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < 368; i++) {
            a += m[i];
            b += f[i];
            if (Math.min(a, b) > c) {
                c = Math.min(a, b);
            }
        }
        System.out.println(c);
    }
}

```

### Solution:

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[368];
        int[] f = new int[368];
        for (int i = 0; i < n; i++) {
            String x = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (x.equals("M")) {
                m[a] += 2;
                m[b + 1] -= 2;
            } else {
                f[a] += 2;
                f[b + 1] -= 2;
            }
        }
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < 368; i++) {
            a += m[i];
            b += f[i];
            if (Math.min(a, b) > c) {
                c = Math.min(a, b);
            }
        }
        System.out.println(c);
    }
}

```

### Explanation:

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[368];
        int[] f = new int[368];
        for (int i = 0; i < n; i++) {
            String x = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (x.equals("M")) {
                m[a] += 2;
                m[b + 1] -= 2;
            } else {
                f[a] += 2;
                f[b + 1] -= 2;
            }
        }
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < 368; i++) {
            a += m[i];
            b += f[i];
            if (Math.min(a, b) > c) {
                c = Math.min(a, b);
            }
        }
        System.out.println(c);
    }
}

```

### Solution:

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[368];
        int[] f = new int[368];
        for (int i = 0; i < n; i++) {
            String x = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (x.equals("M")) {
                m[a] += 2;
                m[b + 1] -= 2;
            } else {
                f[a] += 2;
                f[b + 1] -= 2;
            }
        }
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < 368; i++) {
            a += m[i];
            b += f[i];
            if (Math.min(a, b) > c) {
                c = Math.min(a, b);
            }
        }
        System.out.println(c);
    }
}

```

### Explanation:

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[368];
        int[] f = new int[368];
        for (int i = 0; i < n; i++) {
            String x = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (x.equals("M")) {
                m[a] += 2;
                m[b + 1] -= 2;
            } else {
                f[a] += 2;
                f[b + 1] -= 2;
            }
        }
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < 368; i++) {
            a += m[i];
            b += f[i];
            if (Math.min(a, b) > c) {
                c = Math.min(a, b);
            }
        }
        System.out.println(c);
    }
}

```

### Solution:

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[368];
        int[] f = new int[368];
        for (int i = 0; i < n; i++) {
            String x = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (x.equals("M")) {
                m[a] += 2;
                m[b + 1] -= 2;
            } else {
                f[a] += 2;
                f[b + 1] -= 2;
            }
        }
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < 368; i++) {
            a += m[i];
            b += f[i];
            if (Math.min(a, b) > c
