

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int G = sc.nextInt();
        int[][] PC = new int[D][2];
        for (int i = 0; i < D; i++) {
            PC[i][0] = sc.nextInt();
            PC[i][1] = sc.nextInt();
        }
        int ans = 1000000000;
        for (int i = 0; i < (1 << D); i++) {
            int score = 0;
            int problem = 0;
            for (int j = 0; j < D; j++) {
                if ((i >> j & 1) == 1) {
                    score += 100 * (j + 1) * PC[j][0] + PC[j][1];
                    problem += PC[j][0];
                }
            }
            if (score > G) {
                continue;
            }
            int left = G - score;
            for (int j = 0; j < D; j++) {
                if ((i >> j & 1) == 1) {
                    continue;
                }
                if (left > 100 * (j + 1) * PC[j][0] + PC[j][1]) {
                    continue;
                } else {
                    int tmp = (left + (100 * (j + 1)) - 1) / (100 * (j + 1));
                    ans = Math.min(ans, problem + Math.min(tmp, PC[j][0]));
                }
            }
        }
        System.out.println(ans);
    }
}

```

## 2. 1000000000

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int G = sc.nextInt();
        int[][] PC = new int[D][2];
        for (int i = 0; i < D; i++) {
            PC[i][0] = sc.nextInt();
            PC[i][1] = sc.nextInt();
        }
        int ans = 1000000000;
        for (int i = 0; i < (1 << D); i++) {
            int score = 0;
            int problem = 0;
            for (int j = 0; j < D; j++) {
                if ((i >> j & 1) == 1) {
                    score += 100 * (j + 1) * PC[j][0] + PC[j][1];
                    problem += PC[j][0];
                }
            }
            if (score > G) {
                continue;
            }
            int left = G - score;
            for (int j = 0; j < D; j++) {
                if ((i >> j & 1) == 1) {
                    continue;
                }
                if (left > 100 * (j + 1) * PC[j][0] + PC[j][1]) {
                    continue;
                } else {
                    int tmp = (left + (100 * (j + 1)) - 1) / (100 * (j + 1));
                    ans = Math.min(ans, problem + Math.min(tmp, PC[j][0]));
                }
            }
        }
        System.out.println(ans);
    }
}

```


```

## 2. 1000000000

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int G = sc.nextInt();
        int[][] PC = new int[D][2];
        for (int i = 0; i < D; i++) {
            PC[i][0] = sc.nextInt();
            PC[i][1] = sc.nextInt();
        }
        int ans = 1000000000;
        for (int i = 0; i < (1 << D); i++) {
            int score = 0;
            int problem = 0;
            for (int j = 0; j < D; j++) {
                if ((i >> j & 1) == 1) {
                    score += 100 * (j + 1) * PC[j][0] + PC[j][1];
                    problem += PC[j][0];
                }
            }
            if (score > G) {
                continue;
            }
            int left = G - score;
            for (int j = 0; j < D; j++) {
                if ((i >> j & 1) == 1) {
                    continue;
                }
                if (left > 100 * (j + 1) * PC[j][0] + PC[j][1]) {
                    continue;
                } else {
                    int tmp = (left + (100 * (j + 1)) - 1) / (100 * (j + 1));
                    ans = Math.min(ans, problem + Math.min(tmp, PC[j][0]));
                }
            }
        }
        System.out.println(ans);
    }
}

```
/ABC/ABC173/ABC173_C.md
# ABC173_C

## 1. 1000000000

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int K = sc.nextInt();
        char[][] grid = new char[H][W];
        for (int i = 0; i < H; i++) {
            grid[i] = sc.next().toCharArray();
        }
        int ans = 0;
        for (int i = 0; i < (1 << H); i++) {
            for (int j = 0; j < (1 << W); j++) {
                int black = 0;
                for (int h = 0; h < H; h++) {
                    for (int w = 0; w < W; w++) {
                        if ((i >> h & 1) == 1 || (j >> w & 1) == 1) {
                            continue;
                        }
                        if (grid[h][w] == '#') {
                            black++;
                        }
                    }
                }
                if (black == K) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}  }
        }
        System.out.println(ans);
    }
}

```
/ABC/ABC173/ABC173_B.md
# ABC173_B

## 1. 1000000000

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ans = new int[4];
        for (int i = 0; i < N; i++) {
            String S = sc.next();
            if (S.equals("AC")) {
                ans[0]++;
            } else if (S.equals("WA")) {
                ans[1]++;
            } else if (S.equals("TLE")) {
                ans[2]++;
            } else {
                ans[3]++;
            }
        }
        System.out.println("AC x " + ans[0]);
        System.out.println("WA x " + ans[1]);
        System.out.println("TLE x " + ans[2]);
        System.out.println("RE x " + ans[3]);
    }
}

```

## 2. 1000000000

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ans = new int[4];
        for (int i = 0; i < N; i++) {
            String S = sc.next();
            if (S.equals("AC")) {
                ans[0]++;
            } else if (S.equals("WA")) {
                ans[1]++;
            } else if (S.equals("TLE")) {
                ans[2]++;
            } else {
                ans[3]++;
            }
        }
        System.out.println(ans);
    }
}

```

## 2. 1000000000

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    int len = A[i] + A[j] + A[k];
                    int max = Math.max(A[i], Math.max(A[j], A[k]));
                    int min = Math.min(A[i], Math.min(A[j], A[k]));
                    if (len > max * 2) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}

```
/ABC/ABC173/ABC173_D.md
# ABC173_D

## 1. 1000000000

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        long ans = 0;
        for (int i = N - 1; i >= 0; i -= 2) {
            ans += A[i];
            if (i - 1 >= 0) {
                ans += A[i - 1];
          /ABC/ABC173/ABC173_A.md
# ABC173_A

## 1. 1000000000

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println((N + 999) / 1000 * 1000 - N);
    }
}

```

## 2. 1000000000

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println((N + 999) / 1000 * 1000 - N);
    }
}

```
/ABC/ABC173/ABC173_E.md
# ABC173_E

## 1. 1000000000

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        Arrays.sort(A);
        long ans = 1;
        int mod = 1000000007;
        int cnt = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (A[i] < 0) {
                cnt++;
            }
            if (cnt >= K) {
                break;
            }
            ans = (ans * A[i]) % mod;
        }
        if (cnt < K) {
            for (int i = 0; i < K - cnt; i++) {
                ans = (ans * A[i]) % mod;
            }
        } else {
            for (int i = 0; i < K; i++) {
                ans = (ans * A[i]) % mod;
            }
        }
        System.out.println(ans);
    }
}

```

## 2. 1000000000

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        Arrays.sort(A);
        long ans = 1;
        int mod = 1000000007;
        int cnt = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (A[i] < 0) {
                cnt++;
            }
            if (cnt >= K) {
                break;
            }
            ans = (ans * A[i]) % mod;
        }
        if (cnt < K) {
            for (int i = 0; i < K - cnt; i++) {
                ans = (ans * A[i]) % mod;
            }
        } else {
            for (int i = 0; i < K; i++) {
                ans = (ans * A[i]) % mod;
            }
        }
        System.out.println(ans);
    }
}

```

