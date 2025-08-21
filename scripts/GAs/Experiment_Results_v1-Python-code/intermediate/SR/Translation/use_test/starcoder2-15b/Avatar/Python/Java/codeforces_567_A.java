

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        int[] lista = new int[inp];
        for (int i = 0; i < inp; i++) {
            lista[i] = scanner.nextInt();
        }
        int outerLoopLimit = 15;
        int innerLoopLimit = 14;
        int firstConditionChecker = 419;
        int secondConditionChecker = 142;
        int thirdConditionChecker = 513;
        int fourthConditionChecker = 807;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopLimit / innerLoopLimit; LoopIndexOut++) {
            for (int i = 0; i < lista.length; i++) {
                if ((firstConditionChecker & secondConditionChecker) != 0) {
                    if (i == 0) {
                        System.out.printf("%d %d\n", lista[i + 1] - lista[i], lista[lista.length - 1] - lista[i]);
                        continue;
                    } else if (i == lista.length - 1) {
                        System.out.printf("%d %d\n", lista[lista.length - 1] - lista[lista.length - 2], lista[lista.length - 1] - lista[0]);
                        continue;
                    } else if (lista[i] - lista[i - 1] > lista[i + 1] - lista[i]) {
                        System.out.print(lista[i + 1] - lista[i] + " ");
                    } else {
                        System.out.print(lista[i] - lista[i - 1] + " ");
                    }
                }
                if ((thirdConditionChecker & fourthConditionChecker) != 0) {
                    if (lista[lista.length - 1] - lista[i] > lista[i] - lista[0]) {
                        System.out.println(lista[lista.length - 1] - lista[i]);
                    } else {
                        System.out.println(lista[i] - lista[0]);
                    }
                }
            }
        }
    }
}
```

## 2.

Write a program that reads a number n and a sequence of n numbers and prints the smallest and the largest number.

```
inp = int(input())
lista = []
lista = [int(num_input) for num_input in input().split()]
print(min(lista), max(lista))
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        int[] lista = new int[inp];
        for (int i = 0; i < inp; i++) {
            lista[i] = scanner.nextInt();
        }
        int min = lista[0];
        int max = lista[0];
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] < min) {
                min = lista[i];
            }
            if (lista[i] > max) {
                max = lista[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
```

## 3.

Write a program that reads a number n and a sequence of n numbers and prints the smallest and the largest number.

```
inp = int(input())
lista = []
lista = [int(num_input) for num_input in input().split()]
print(min(lista), max(lista))
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        int[] lista = new int[inp];
        for (int i = 0; i < inp; i++) {
            lista[i] = scanner.nextInt();
        }
        int min = lista[0];
        int max = lista[0];
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] < min) {
                min = lista[i];
            }
            if (lista[i] > max) {
                max = lista[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
```

## 4.

Write a program that reads a number n and a sequence of n numbers and prints the smallest and the largest number.

```
inp = int(input())
lista = []
lista = [int(num_input) for num_input in input().split()]
print(min(lista), max(lista))
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        int[] lista = new int[inp];
        for (int i = 0; i < inp; i++) {
            lista[i] = scanner.nextInt();
        }
        int min = lista[0];
        int max = lista[0];
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] < min) {
                min = lista[i];
            }
            if (lista[i] > max) {
                max = lista[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
```

## 5.

Write a program that reads a number n and a sequence of n numbers and prints the smallest and the largest number.

```
inp = int(input())
lista = []
lista = [int(num_input) for num_input in input().split()]
print(min(lista), max(lista))
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        int[] lista = new int[inp];
        for (int i = 0; i < inp; i++) {
            lista[i] = scanner.nextInt();
        }
        int min = lista[0];
        int max = lista[0];
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] < min) {
                min = lista[i];
            }
            if (lista[i] > max) {
                max = lista[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
```

## 6.

Write a program that reads a number n and a sequence of n numbers and prints the smallest and the largest number.

```
inp = int(input())
lista = []
lista = [int(num_input) for num_input in input().split()]
print(min(lista), max(lista))
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        int[] lista = new int[inp];
        for (int i = 0; i < inp; i++) {
            lista[i] = scanner.nextInt();
        }
        int min = lista[0];
        int max = lista[0];
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] < min) {
                min = lista[i];
            }
            if (lista[i] > max) {
                max = lista[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
```

## 7.

Write a program that reads a number n and a sequence of n numbers and prints the smallest and the largest number.

```
inp = int(input())
lista = []
lista = [int(num_input) for num_input in input().split()]
print(min(lista), max(lista))
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        int[] lista = new int[inp];
        for (int i = 0; i < inp; i++) {
            lista[i] = scanner.nextInt();
        }
        int min = lista[0];
        int max = lista[0];
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] < min) {
                min = lista[i];
            }
            if (lista[i] > max) {
                max = lista[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
```

## 8.

Write a program that reads a number n and a sequence of n numbers and prints the smallest and the largest number.

```
inp = int(input())
lista = []
lista = [int(num_input) for num_input in input().split()]
print(min(lista), max(lista))
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        int[] lista = new int[inp];
        for (int i = 0; i < inp; i++) {
            lista[i] = scanner.nextInt();
        }
        int min = lista[0];
        int max = lista[0];
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] < min) {
                min = lista[i];
            }
            if (lista[i] > max) {
                max = lista[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
```

## 9.

Write a program that reads a number n and a sequence of n numbers and prints the smallest and the largest number.

```
inp = int(input())
lista = []
lista = [int(num_input) for num_input in input().split()]
print(min(lista), max(lista))
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        int[] lista = new int[inp];
        for (int i = 0; i < inp; i++) {
            lista[i] = scanner.nextInt();
        }
        int min = lista[0];
        int max = lista[0];
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] < min) {
                min = lista[i];
            }
            if (lista[i] > max) {
                max = lista[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
```

## 10.

Write a program that reads a number n and a sequence of n numbers and prints the smallest and the largest number.

```
inp = int(input())
lista = []
lista = [int(num_input) for num_input in input().split()]
print(min(lista), max(lista))
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        int[] lista = new int[inp];
        for (int i = 0; i < inp; i++) {
            lista[i] = scanner.nextInt();
        }
        int min = lista[0];
        int max = lista[0];
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] < min) {
                min = lista[i];
            }
            if (lista[i] > max) {
                max = lista[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
```

## 11.

Write a program that reads a number n and a sequence of n numbers and prints the smallest and the largest number.

```
inp = int(input())
lista = []
lista = [int(num_input) for num_input in input().split()]
print(min(lista), max(lista))
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        int[] lista = new int[inp];
        for (int i = 0; i < inp; i++) {
            lista[i] = scanner.nextInt();
        }
        int min = lista[0];
        int max = lista[0];
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] < min) {
                min = lista[i];
            }
            if (lista[i] > max) {
                max = lista[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
```

## 12.

Write a program that reads a number n and a sequence of n numbers and prints the smallest and the largest number.

```
inp = int(input())
lista = []
lista = [int(num_input) for num_input in input().split()]
print(min(lista), max(lista))
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        int[] lista = new int[inp];
        for (int i = 0; i < inp; i++) {
            lista[i] = scanner.nextInt();
        }
        int min = lista[0];
        int max = lista[0];
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] < min) {
                min = lista[i];
            }
            if (lista[i] > max) {
                max = lista[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
```

## 13.

Write a program that reads a number n and a sequence of n numbers and prints the smallest and the largest number.

```
inp = int(input())
lista = []
lista = [int(num_input) for num_input in input().split()]
print(min(lista), max(lista))
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        int[] lista = new int[inp];
        for (int i = 0; i < inp; i++) {
            lista[i] = scanner.nextInt();
        }
        int min = lista[0];
        int max = lista[0];
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] < min) {
                min = lista[i];
            }
            if (lista[i] > max) {
                max = lista[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
```

## 14.

Write a program that reads a number n and a
