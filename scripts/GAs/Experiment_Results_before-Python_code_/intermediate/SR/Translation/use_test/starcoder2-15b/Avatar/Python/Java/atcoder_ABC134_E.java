

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            ans[i] = sc.nextInt();
        }
        int bad = -1, good = N;
        int key = 0;
        while (good - bad > 1) {
            int mid = (bad + good) / 2;
            if (ans[mid] < key) {
                good = mid;
            } else {
                bad = mid;
            }
        }
        System.out.println(good);
    }
}
```

## 2. 2019-09-10

### 2.1. 1000

#### 2.1.1. 题目

[1000](https://www.acmicpc.net/problem/1000)

#### 2.1.2. 题目描述

두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

#### 2.1.3. 输入

첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

#### 2.1.4. 输出

첫째 줄에 A+B를 출력한다.

#### 2.1.5. 样例输入

```
1 2
```

#### 2.1.6. 样例输出

```
3
```

#### 2.1.7. 题解

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
```

### 2.2. 1001

#### 2.2.1. 题目

[1001](https://www.acmicpc.net/problem/1001)

#### 2.2.2. 题目描述

두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.

#### 2.2.3. 输入

첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

#### 2.2.4. 输出

첫째 줄에 A-B를 출력한다.

#### 2.2.5. 样例输入

```
3 2
```

#### 2.2.6. 样例输出

```
1
```

#### 2.2.7. 题解

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a - b);
    }
}
```

### 2.3. 10998

#### 2.3.1. 题目

[10998](https://www.acmicpc.net/problem/10998)

#### 2.3.2. 题目描述

두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.

#### 2.3.3. 输入

첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

#### 2.3.4. 输出

첫째 줄에 A×B를 출력한다.

#### 2.3.5. 样例输入

```
1 2
```

#### 2.3.6. 样例输出

```
2
```

#### 2.3.7. 题解

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a * b);
    }
}
```

### 2.4. 1008

#### 2.4.1. 题目

[1008](https://www.acmicpc.net/problem/1008)

#### 2.4.2. 题目描述

두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

#### 2.4.3. 输入

첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

#### 2.4.4. 输出

첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.

#### 2.4.5. 样例输入

```
1 3
```

#### 2.4.6. 样例输出

```
0.33333333333333333333333333333333
```

#### 2.4.7. 题解

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a / (double) b);
    }
}
```

### 2.5. 10869

#### 2.5.1. 题目

[10869](https://www.acmicpc.net/problem/10869)

#### 2.5.2. 题目描述

두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 

#### 2.5.3. 输入

두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)

#### 2.5.4. 输出

첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.

#### 2.5.5. 样例输入

```
7 3
```

#### 2.5.6. 样例输出

```
10
4
21
2
1
```

#### 2.5.7. 题解

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
}
```

### 2.6. 10430

#### 2.6.1. 题目

[10430](https://www.acmicpc.net/problem/10430)

#### 2.6.2. 题目描述

(A+B)%C는 (A%C + B%C)%C 와 같을까?

(A×B)%C는 (A%C × B%C)%C 와 같을까?

세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.

#### 2.6.3. 输入

첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)

#### 2.6.4. 输出

첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.

#### 2.6.5. 样例输入

```
5 8 4
```

#### 2.6.6. 样例输出

```
1
1
0
0
```

#### 2.6.7. 题解

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println((a + b) % c);
        System.out.println((a % c + b % c) % c);
        System.out.println((a * b) % c);
        System.out.println((a % c * b % c) % c);
    }
}
```

### 2.7. 2588

#### 2.7.1. 题目

[2588](https://www.acmicpc.net/problem/2588)

#### 2.7.2. 题目描述

(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.

![img](https://www.acmicpc.net/upload/images/f5NhGHVLM4Ix74DtJrwfC97KepPl27s%20(1).png)

(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

#### 2.7.3. 输入

첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.

#### 2.7.4. 输出

첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.

#### 2.7.5. 样例输入

```
472
385
```

#### 2.7.6. 样例输出

```
2360
3776
1416
181720
```

#### 2.7.7. 题解

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a * (b % 10));
        System.out.println(a * (b / 10 % 10));
        System.out.println(a * (b / 100));
        System.out.println(a * b);
    }
}
```

## 3. 2019-09-11

### 3.1. 2557

#### 3.1.1. 题目

[2557](https://www.acmicpc.net/problem/2557)

#### 3.1.2. 题目描述

Hello World!를 출력하시오.

#### 3.1.3. 输入

없음

#### 3.1.4. 输出

Hello World!를 출력하시오.

#### 3.1.5. 样例输入

```

```

#### 3.1.6. 样例输出

```
Hello World!
```

#### 3.1.7. 题解

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

### 3.2. 10718

#### 3.2.1. 题目

[10718](https://www.acmicpc.net/problem/10718)

#### 3.2.2. 题目描述

ACM-ICPC 인터넷 예선, Regional, 그리고 World Finals까지 이미 2회씩 진출해버린 kriii는 미련을 버리지 못하고 왠지 모르게 올 해에도 파주 World Finals 준비 캠프에 참여했다.

대회를 뜰 줄 모르는 지박령 kriii를 위해서 격려의 문구를 출력해주자.

#### 3.2.3. 输入

없음

#### 3.2.4. 输出

두 줄에 걸쳐 "강한친구 대한육군"을 한 줄에 한 번씩 출력한다.

#### 3.2.5. 样例输入

```

```

#### 3.2.6. 样例输出

```
강한친구 대한육군
강한친구 대한육군
```

#### 3.2.7. 题解

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("강한친구 대한육군");
        System.out.println("강한친구 대한육군");
    }
}
```

### 3.3. 10171

#### 3.3.1. 题目

[10171](https://www.acmicpc.net/problem/10171)

#### 3.3.2. 题目描述

아래 예제와 같이 고양이를 출력하시오.

#### 3.3.3. 输入

없음

#### 3.3.4. 输出

고양이를 출력한다.

#### 3.3.5. 样例输入

```

```

#### 3.3.6. 样例输出

```
\    /\
 )  ( ')
(  /  )
 \(__)|
```

#### 3.3.7. 题解

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("\\    /\\");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println(" \\(__)|");
    }
}
```

### 3.4. 10172

#### 3.4.1. 题目

[10172](https://www.acmicpc.net/problem/10172)

#### 3.4.2. 题目描述

아래 예제와 같이 개를 출력하시오.

#### 3.4.3. 输入

없음

#### 3.4.4. 输出

개를 출력한다.

#### 3.4.5. 
