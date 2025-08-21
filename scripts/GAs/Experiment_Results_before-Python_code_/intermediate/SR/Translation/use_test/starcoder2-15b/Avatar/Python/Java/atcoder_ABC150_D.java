

```
import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        Set<Integer> num_set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            num_set.add(sc.nextInt());
        }
        Set<Integer> two_times_set = new HashSet<>();
        for (int i : num_set) {
            for (int j = 1; j < 30; j++) {
                i /= 2;
                if (i % 2 != 0) {
                    two_times_set.add(j);
                    break;
                }
            }
            if (two_times_set.size() != 1) {
                System.out.println(0);
                break;
            }
        }
        else {
            List<Integer> num_list = new ArrayList<>(num_set);
            int lcm = num_list.get(0);
            for (int i = 1; i < num_list.size(); i++) {
                lcm = lcm * num_list.get(i) / gcd(lcm, num_list.get(i));
            }
            System.out.println((num - lcm / 2) / lcm + 1);
        }
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}

```

## 2. 2019-09-10

### 2.1. 1000 - A+B Problem

#### 2.1.1. Description

Calculate a + b.

#### 2.1.2. Input

The first line will contain an integer T, the number of test cases. Then T lines follow, each line contains two integers a and b. More details in the Sample Input.

#### 2.1.3. Output

For each test case, output a line containing a + b.

#### 2.1.4. Sample Input

```
2
1 2
3 4

```

#### 2.1.5. Sample Output

```
3
7

```

#### 2.1.6. Solution

```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}

```

## 3. 2019-09-11

### 3.1. 1001 - A+B Problem II

#### 3.1.1. Description

Calculate a + b.

#### 3.1.2. Input

The first line will contain an integer T, the number of test cases. Then T lines follow, each line contains two integers a and b. More details in the Sample Input.

#### 3.1.3. Output

For each test case, output a line containing a + b.

#### 3.1.4. Sample Input

```
2
1 2
3 4

```

#### 3.1.5. Sample Output

```
3
7

```

#### 3.1.6. Solution

```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}

```

## 4. 2019-09-12

### 4.1. 1002 - A+B Problem III

#### 4.1.1. Description

Calculate a + b.

#### 4.1.2. Input

The first line will contain an integer T, the number of test cases. Then T lines follow, each line contains two integers a and b. More details in the Sample Input.

#### 4.1.3. Output

For each test case, output a line containing a + b.

#### 4.1.4. Sample Input

```
2
1 2
3 4

```

#### 4.1.5. Sample Output

```
3
7

```

#### 4.1.6. Solution

```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}

```

## 5. 2019-09-13

### 5.1. 1003 - A+B Problem IV

#### 5.1.1. Description

Calculate a + b.

#### 5.1.2. Input

The first line will contain an integer T, the number of test cases. Then T lines follow, each line contains two integers a and b. More details in the Sample Input.

#### 5.1.3. Output

For each test case, output a line containing a + b.

#### 5.1.4. Sample Input

```
2
1 2
3 4

```

#### 5.1.5. Sample Output

```
3
7

```

#### 5.1.6. Solution

```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}

```

## 6. 2019-09-14

### 6.1. 1004 - A+B Problem V

#### 6.1.1. Description

Calculate a + b.

#### 6.1.2. Input

The first line will contain an integer T, the number of test cases. Then T lines follow, each line contains two integers a and b. More details in the Sample Input.

#### 6.1.3. Output

For each test case, output a line containing a + b.

#### 6.1.4. Sample Input

```
2
1 2
3 4

```

#### 6.1.5. Sample Output

```
3
7

```

#### 6.1.6. Solution

```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}

```

## 7. 2019-09-15

### 7.1. 1005 - A+B Problem VI

#### 7.1.1. Description

Calculate a + b.

#### 7.1.2. Input

The first line will contain an integer T, the number of test cases. Then T lines follow, each line contains two integers a and b. More details in the Sample Input.

#### 7.1.3. Output

For each test case, output a line containing a + b.

#### 7.1.4. Sample Input

```
2
1 2
3 4

```

#### 7.1.5. Sample Output

```
3
7

```

#### 7.1.6. Solution

```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}

```

## 8. 2019-09-16

### 8.1. 1006 - A+B Problem VII

#### 8.1.1. Description

Calculate a + b.

#### 8.1.2. Input

The first line will contain an integer T, the number of test cases. Then T lines follow, each line contains two integers a and b. More details in the Sample Input.

#### 8.1.3. Output

For each test case, output a line containing a + b.

#### 8.1.4. Sample Input

```
2
1 2
3 4

```

#### 8.1.5. Sample Output

```
3
7

```

#### 8.1.6. Solution

```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}

```

## 9. 2019-09-17

### 9.1. 1007 - A+B Problem VIII

#### 9.1.1. Description

Calculate a + b.

#### 9.1.2. Input

The first line will contain an integer T, the number of test cases. Then T lines follow, each line contains two integers a and b. More details in the Sample Input.

#### 9.1.3. Output

For each test case, output a line containing a + b.

#### 9.1.4. Sample Input

```
2
1 2
3 4

```

#### 9.1.5. Sample Output

```
3
7

```

#### 9.1.6. Solution

```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}

```

## 10. 2019-09-18

### 10.1. 1008 - A+B Problem IX

#### 10.1.1. Description

Calculate a + b.

#### 10.1.2. Input

The first line will contain an integer T, the number of test cases. Then T lines follow, each line contains two integers a and b. More details in the Sample Input.

#### 10.1.3. Output

For each test case, output a line containing a + b.

#### 10.1.4. Sample Input

```
2
1 2
3 4

```

#### 10.1.5. Sample Output

```
3
7

```

#### 10.1.6. Solution

```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}

```

## 11. 2019-09-19

### 11.1. 1009 - A+B Problem X

#### 11.1.1. Description

Calculate a + b.

#### 11.1.2. Input

The first line will contain an integer T, the number of test cases. Then T lines follow, each line contains two integers a and b. More details in the Sample Input.

#### 11.1.3. Output

For each test case, output a line containing a + b.

#### 11.1.4. Sample Input

```
2
1 2
3 4

```

#### 11.1.5. Sample Output

```
3
7

```

#### 11.1.6. Solution

```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}

```

## 12. 2019-09-20

### 12.1. 1010 - A+B Problem XI

#### 12.1.1. Description

Calculate a + b.

#### 12.1.2. Input

The first line will contain an integer T, the number of test cases. Then T lines follow, each line contains two integers a and b. More details in the Sample Input.

#### 12.1.3. Output

For each test case, output a line containing a + b.

#### 12.1.4. Sample Input

```
2
1 2
3 4

```

#### 12.1.5. Sample Output

```
3
7

```

#### 12.1.6.
