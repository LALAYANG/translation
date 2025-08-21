

```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] NewList = new int[n];
        for (int i = 0; i < n; i++) {
            NewList[i] = sc.nextInt();
        }
        Arrays.sort(NewList);
        int a = NewList[n - 1];
        int b = NewList[0];
        if (a == b) {
            System.out.println(a - b + " " + n * (n - 1) / 2);
        } else {
            int MaxCount = 0;
            int bc = 0;
            for (int i = 0; i < n; i++) {
                if (NewList[i] == a) {
                    MaxCount++;
                }
                if (NewList[i] == b) {
                    bc++;
                }
            }
            System.out.println(a - b + " " + MaxCount * bc);
        }
    }
}
```

## 7.

Write a program that takes a list of numbers (integers) as input and returns a list of numbers, where each number in the new list is the sum of all of the digits in the original number.

For example, if the input list is [12, 34, 56], the output list should be [3, 7, 11].

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] NewList = new int[n];
        for (int i = 0; i < n; i++) {
            NewList[i] = sc.nextInt();
        }
        int[] NewList2 = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            while (NewList[i] > 0) {
                sum += NewList[i] % 10;
                NewList[i] /= 10;
            }
            NewList2[i] = sum;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(NewList2[i] + " ");
        }
    }
}
```

## 8.

Write a program that takes a list of numbers (integers) as input and returns a list of numbers, where each number in the new list is the sum of all of the digits in the original number.

For example, if the input list is [12, 34, 56], the output list should be [3, 7, 11].

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] NewList = new int[n];
        for (int i = 0; i < n; i++) {
            NewList[i] = sc.nextInt();
        }
        int[] NewList2 = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            while (NewList[i] > 0) {
                sum += NewList[i] % 10;
                NewList[i] /= 10;
            }
            NewList2[i] = sum;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(NewList2[i] + " ");
        }
    }
}
```

## 9.

Write a program that takes a list of numbers (integers) as input and returns a list of numbers, where each number in the new list is the sum of all of the digits in the original number.

For example, if the input list is [12, 34, 56], the output list should be [3, 7, 11].

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] NewList = new int[n];
        for (int i = 0; i < n; i++) {
            NewList[i] = sc.nextInt();
        }
        int[] NewList2 = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            while (NewList[i] > 0) {
                sum += NewList[i] % 10;
                NewList[i] /= 10;
            }
            NewList2[i] = sum;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(NewList2[i] + " ");
        }
    }
}
```

## 10.

Write a program that takes a list of numbers (integers) as input and returns a list of numbers, where each number in the new list is the sum of all of the digits in the original number.

For example, if the input list is [12, 34, 56], the output list should be [3, 7, 11].

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] NewList = new int[n];
        for (int i = 0; i < n; i++) {
            NewList[i] = sc.nextInt();
        }
        int[] NewList2 = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            while (NewList[i] > 0) {
                sum += NewList[i] % 10;
                NewList[i] /= 10;
            }
            NewList2[i] = sum;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(NewList2[i] + " ");
        }
    }
}
```

## 11.

Write a program that takes a list of numbers (integers) as input and returns a list of numbers, where each number in the new list is the sum of all of the digits in the original number.

For example, if the input list is [12, 34, 56], the output list should be [3, 7, 11].

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] NewList = new int[n];
        for (int i = 0; i < n; i++) {
            NewList[i] = sc.nextInt();
        }
        int[] NewList2 = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            while (NewList[i] > 0) {
                sum += NewList[i] % 10;
                NewList[i] /= 10;
            }
            NewList2[i] = sum;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(NewList2[i] + " ");
        }
    }
}
```

## 12.

Write a program that takes a list of numbers (integers) as input and returns a list of numbers, where each number in the new list is the sum of all of the digits in the original number.

For example, if the input list is [12, 34, 56], the output list should be [3, 7, 11].

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] NewList = new int[n];
        for (int i = 0; i < n; i++) {
            NewList[i] = sc.nextInt();
        }
        int[] NewList2 = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            while (NewList[i] > 0) {
                sum += NewList[i] % 10;
                NewList[i] /= 10;
            }
            NewList2[i] = sum;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(NewList2[i] + " ");
        }
    }
}
```

## 13.

Write a program that takes a list of numbers (integers) as input and returns a list of numbers, where each number in the new list is the sum of all of the digits in the original number.

For example, if the input list is [12, 34, 56], the output list should be [3, 7, 11].

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] NewList = new int[n];
        for (int i = 0; i < n; i++) {
            NewList[i] = sc.nextInt();
        }
        int[] NewList2 = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            while (NewList[i] > 0) {
                sum += NewList[i] % 10;
                NewList[i] /= 10;
            }
            NewList2[i] = sum;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(NewList2[i] + " ");
        }
    }
}
```

## 14.

Write a program that takes a list of numbers (integers) as input and returns a list of numbers, where each number in the new list is the sum of all of the digits in the original number.

For example, if the input list is [12, 34, 56], the output list should be [3, 7, 11].

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] NewList = new int[n];
        for (int i = 0; i < n; i++) {
            NewList[i] = sc.nextInt();
        }
        int[] NewList2 = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            while (NewList[i] > 0) {
                sum += NewList[i] % 10;
                NewList[i] /= 10;
            }
            NewList2[i] = sum;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(NewList2[i] + " ");
        }
    }
}
```

## 15.

Write a program that takes a list of numbers (integers) as input and returns a list of numbers, where each number in the new list is the sum of all of the digits in the original number.

For example, if the input list is [12, 34, 56], the output list should be [3, 7, 11].

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] NewList = new int[n];
        for (int i = 0; i < n; i++) {
            NewList[i] = sc.nextInt();
        }
        int[] NewList2 = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            while (NewList[i] > 0) {
                sum += NewList[i] % 10;
                NewList[i] /= 10;
            }
            NewList2[i] = sum;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(NewList2[i] + " ");
        }
    }
}
```

## 16.

Write a program that takes a list of numbers (integers) as input and returns a list of numbers, where each number in the new list is the sum of all of the digits in the original number.

For example, if the input list is [12, 34, 56], the output list should be [3, 7, 11].

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] NewList = new int[n];
        for (int i = 0; i < n; i++) {
            NewList[i] = sc.nextInt();
        }
        int[] NewList2 = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            while (NewList[i] > 0) {
                sum += NewList[i] % 10;
                NewList[i] /= 10;
            }
            NewList2[i] = sum;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(NewList2[i] + " ");
        }
    }
}
```

## 17.

Write a program that takes a list of numbers (integers) as input and returns a list of numbers, where each number in the new list is the sum of all of the digits in the original number.

For example, if the input list is [12, 34, 56], the output list should be [3, 7, 11].

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] NewList = new int[n];
        for (int i = 0; i < n; i++) {
            NewList[i] = sc.nextInt();
        }
        int[] NewList2 = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            while (NewList[i] > 0) {
                sum += NewList[i] % 10;
                NewList[i] /= 10;
            }
            NewList2[i] = sum;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(NewList2[i] + " ");
        }
    }
}
```

## 18.

Write a program that takes a list of numbers (integers) as input and returns a list of numbers, where each number in the new list is the sum of all of the digits in the original number.

For example, if the input list is [12, 34, 56], the output list should be [3, 7, 11].

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] NewList = new int[n];
        for (int i = 0; i < n; i++) {
            NewList[i] = sc.nextInt();
        }
        int[] NewList2 = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            while (NewList[i] > 0) {
                sum += NewList[i] % 10;
                NewList[i] /= 
