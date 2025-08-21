

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = 0;
        while (x >= 0 && y >= 22 || x >= 1 && y >= 12 || x >= 2 && y >= 2) {
            if (a == 1) {
                if (y >= 22) {
                    y -= 22;
                } else if (x >= 1 && y >= 12) {
                    x -= 1;
                    y -= 12;
                } else {
                    x -= 2;
                    y -= 2;
                }
            } else {
                if (x >= 2 && y >= 2) {
                    x -= 2;
                    y -= 2;
                } else if (x >= 1 && y >= 12) {
                    x -= 1;
                    y -= 12;
                } else {
                    y -= 22;
                }
            }
            a = 1 - a;
        }
        System.out.println(a == 0 ? "Ciel" : "Hanako");
    }
}

```

## 2. 1000000007

### 2.1. Problem

Given a positive integer n, find the number of positive integers less than or equal to n that are divisible by 2 or 3 but not both.

### 2.2. Input

The first line contains a single integer n (1 ≤ n ≤ 10^18).

### 2.3. Output

Print the number of positive integers less than or equal to n that are divisible by 2 or 3 but not both.

### 2.4. Sample test(s)

#### 2.4.1. Sample input

```
10

```

#### 2.4.2. Sample output

```
7

```

### 2.5. Note

In the first sample, the numbers divisible by 2 are 2, 4, 6, 8, 10. The numbers divisible by 3 are 3, 6, 9. The numbers divisible by 6 are 6. The answer is 10 - 3 + 1 = 7.

### 2.6. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = n / 2;
        long b = n / 3;
        long c = n / 6;
        System.out.println(a + b - c);
    }
}

```

## 3. 1000000008

### 3.1. Problem

Given a positive integer n, find the number of positive integers less than or equal to n that are divisible by 2 or 3 or 5.

### 3.2. Input

The first line contains a single integer n (1 ≤ n ≤ 10^18).

### 3.3. Output

Print the number of positive integers less than or equal to n that are divisible by 2 or 3 or 5.

### 3.4. Sample test(s)

#### 3.4.1. Sample input

```
10

```

#### 3.4.2. Sample output

```
10

```

### 3.5. Note

In the first sample, the numbers divisible by 2 are 2, 4, 6, 8, 10. The numbers divisible by 3 are 3, 6, 9. The numbers divisible by 5 are 5, 10. The answer is 10 - 3 + 1 = 7.

### 3.6. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = n / 2;
        long b = n / 3;
        long c = n / 5;
        long d = n / 6;
        long e = n / 10;
        long f = n / 15;
        long g = n / 30;
        System.out.println(a + b + c - d - e - f + g);
    }
}

```

## 4. 1000000009

### 4.1. Problem

Given a positive integer n, find the number of positive integers less than or equal to n that are divisible by 2 or 3 or 5 or 7.

### 4.2. Input

The first line contains a single integer n (1 ≤ n ≤ 10^18).

### 4.3. Output

Print the number of positive integers less than or equal to n that are divisible by 2 or 3 or 5 or 7.

### 4.4. Sample test(s)

#### 4.4.1. Sample input

```
10

```

#### 4.4.2. Sample output

```
10

```

### 4.5. Note

In the first sample, the numbers divisible by 2 are 2, 4, 6, 8, 10. The numbers divisible by 3 are 3, 6, 9. The numbers divisible by 5 are 5, 10. The numbers divisible by 7 are 7, 14. The answer is 10 - 3 + 1 = 7.

### 4.6. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = n / 2;
        long b = n / 3;
        long c = n / 5;
        long d = n / 7;
        long e = n / 6;
        long f = n / 10;
        long g = n / 14;
        long h = n / 15;
        long i = n / 21;
        long j = n / 30;
        long k = n / 35;
        long l = n / 70;
        long m = n / 105;
        long o = n / 210;
        System.out.println(a + b + c + d - e - f - g - h + i + j + k - l - m + o);
    }
}

```

## 5. 1000000010

### 5.1. Problem

Given a positive integer n, find the number of positive integers less than or equal to n that are divisible by 2 or 3 or 5 or 7 or 11.

### 5.2. Input

The first line contains a single integer n (1 ≤ n ≤ 10^18).

### 5.3. Output

Print the number of positive integers less than or equal to n that are divisible by 2 or 3 or 5 or 7 or 11.

### 5.4. Sample test(s)

#### 5.4.1. Sample input

```
10

```

#### 5.4.2. Sample output

```
10

```

### 5.5. Note

In the first sample, the numbers divisible by 2 are 2, 4, 6, 8, 10. The numbers divisible by 3 are 3, 6, 9. The numbers divisible by 5 are 5, 10. The numbers divisible by 7 are 7, 14. The numbers divisible by 11 are 11, 22. The answer is 10 - 3 + 1 = 7.

### 5.6. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = n / 2;
        long b = n / 3;
        long c = n / 5;
        long d = n / 7;
        long e = n / 11;
        long f = n / 6;
        long g = n / 10;
        long h = n / 14;
        long i = n / 15;
        long j = n / 22;
        long k = n / 30;
        long l = n / 33;
        long m = n / 35;
        long o = n / 70;
        long p = n / 77;
        long q = n / 110;
        long r = n / 154;
        long s = n / 210;
        long t = n / 231;
        long u = n / 385;
        long v = n / 770;
        long w = n / 1155;
        long x = n / 2310;
        System.out.println(a + b + c + d + e - f - g - h - i - j + k + l + m - o - p - q - r + s + t + u - v - w + x);
    }
}

```

## 6. 1000000011

### 6.1. Problem

Given a positive integer n, find the number of positive integers less than or equal to n that are divisible by 2 or 3 or 5 or 7 or 11 or 13.

### 6.2. Input

The first line contains a single integer n (1 ≤ n ≤ 10^18).

### 6.3. Output

Print the number of positive integers less than or equal to n that are divisible by 2 or 3 or 5 or 7 or 11 or 13.

### 6.4. Sample test(s)

#### 6.4.1. Sample input

```
10

```

#### 6.4.2. Sample output

```
10

```

### 6.5. Note

In the first sample, the numbers divisible by 2 are 2, 4, 6, 8, 10. The numbers divisible by 3 are 3, 6, 9. The numbers divisible by 5 are 5, 10. The numbers divisible by 7 are 7, 14. The numbers divisible by 11 are 11, 22. The numbers divisible by 13 are 13, 26. The answer is 10 - 3 + 1 = 7.

### 6.6. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = n / 2;
        long b = n / 3;
        long c = n / 5;
        long d = n / 7;
        long e = n / 11;
        long f = n / 13;
        long g = n / 6;
        long h = n / 10;
        long i = n / 14;
        long j = n / 15;
        long k = n / 22;
        long l = n / 26;
        long m = n / 30;
        long o = n / 33;
        long p = n / 35;
        long q = n / 39;
        long r = n / 70;
        long s = n / 77;
        long t = n / 78;
        long u = n / 110;
        long v = n / 143;
        long w = n / 154;
        long x = n / 210;
        long y = n / 234;
        long z = n / 286;
        long aa = n / 385;
        long bb = n / 429;
        long cc = n / 770;
        long dd = n / 858;
        long ee = n / 1155;
        long ff = n / 1430;
        long gg = n / 2310;
        long hh = n / 2730;
        long ii = n / 3003;
        long jj = n / 4290;
        long kk = n / 6435;
        long ll = n / 11550;
        long mm = n / 23100;
        System.out.println(a + b + c + d + e + f - g - h - i - j - k - l - m + o + p + q - r - s - t - u - v - w + x + y + z - aa - bb - cc - dd + ee + ff + gg - hh - ii - jj + kk + ll + mm);
    }
}

```

## 7. 1000000012

### 7.1. Problem

Given a positive integer n, find the number of positive integers less than or equal to n that are divisible by 2 or 3 or 5 or 7 or 11 or 13 or 17.

### 7.2. Input

The first line contains a single integer n (1 ≤ n ≤ 10^18).

### 7.3. Output

Print the number of positive integers less than or equal to n that are divisible by 2 or 3 or 5 or 7 or 11 or 13 or 17.

### 7.4. Sample test(s)

#### 7.4.1. Sample input

```
10

```

#### 7.4.2. Sample output

```
10

```

### 7.5. Note

In the first sample, the numbers divisible by 2 are 2, 4, 6, 8, 10. The numbers divisible by 3 are 3, 6, 9. The numbers divisible by 5 are 5, 10. The numbers divisible by 7 are 7, 14. The numbers divisible by 11 are 11, 22. The numbers divisible by 13 are 13, 26. The numbers divisible by 17 are 17, 34. The answer is 10 - 3 + 1 = 7.

### 7.6. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = n / 2;
        long b = n / 3;
        long c = n / 5;
        long d = n / 7;
        long e = n / 11;
        long f = n / 13;
        long g = n / 17;
        long h = n / 6;
        long i = n / 10;
        long j = n / 14;
        long k = n / 15;
        long l = n / 22;
        long m = n / 26;
        long o = n /
