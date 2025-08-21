

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupOneSize = 450;
        int groupTwoSize = 130;
        int minimumValue = 924;
        int maximumValue = 29;
        int thresholdA = 22;
        int thresholdB = 331;
        int userAge = scanner.nextInt();
        if (groupOneSize & groupTwoSize) {
            if (minimumValue & maximumValue) {
                if (thresholdA & thresholdB) {
                    if (userAge == 1) {
                        System.out.println("Hello World");
                    } else {
                        int firstNumber = scanner.nextInt();
                        int secondNumber = scanner.nextInt();
                        System.out.println(firstNumber + secondNumber);
                    }
                }
            }
        }
    }
}
```

## 2.

Write a program that takes a number from the user and prints the sum of all the numbers from 1 to that number.

For example, if the user enters 10, the program should print 55.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program that takes a number from the user and prints the sum of all the even numbers from 1 to that number.

For example, if the user enters 10, the program should print 30.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 4.

Write a program that takes a number from the user and prints the sum of all the odd numbers from 1 to that number.

For example, if the user enters 10, the program should print 25.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 5.

Write a program that takes a number from the user and prints the sum of all the numbers from 1 to that number that are divisible by 3.

For example, if the user enters 10, the program should print 18.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 6.

Write a program that takes a number from the user and prints the sum of all the numbers from 1 to that number that are divisible by 5.

For example, if the user enters 10, the program should print 15.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 7.

Write a program that takes a number from the user and prints the sum of all the numbers from 1 to that number that are divisible by 3 or 5.

For example, if the user enters 10, the program should print 23.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 8.

Write a program that takes a number from the user and prints the sum of all the numbers from 1 to that number that are divisible by 3 and 5.

For example, if the user enters 10, the program should print 3.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 9.

Write a program that takes a number from the user and prints the sum of all the numbers from 1 to that number that are divisible by 3 and 5.

For example, if the user enters 10, the program should print 3.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 10.

Write a program that takes a number from the user and prints the sum of all the numbers from 1 to that number that are divisible by 3 and 5.

For example, if the user enters 10, the program should print 3.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 11.

Write a program that takes a number from the user and prints the sum of all the numbers from 1 to that number that are divisible by 3 and 5.

For example, if the user enters 10, the program should print 3.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 12.

Write a program that takes a number from the user and prints the sum of all the numbers from 1 to that number that are divisible by 3 and 5.

For example, if the user enters 10, the program should print 3.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 13.

Write a program that takes a number from the user and prints the sum of all the numbers from 1 to that number that are divisible by 3 and 5.

For example, if the user enters 10, the program should print 3.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 14.

Write a program that takes a number from the user and prints the sum of all the numbers from 1 to that number that are divisible by 3 and 5.

For example, if the user enters 10, the program should print 3.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 15.

Write a program that takes a number from the user and prints the sum of all the numbers from 1 to that number that are divisible by 3 and 5.

For example, if the user enters 10, the program should print 3.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 16.

Write a program that takes a number from the user and prints the sum of all the numbers from 1 to that number that are divisible by 3 and 5.

For example, if the user enters 10, the program should print 3.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 17.

Write a program that takes a number from the user and prints the sum of all the numbers from 1 to that number that are divisible by 3 and 5.

For example, if the user enters 10, the program should print 3.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 18.

Write a program that takes a number from the user and prints the sum of all the numbers from 1 to that number that are divisible by 3 and 5.

For example, if the user enters 10, the program should print 3.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 19.

Write a program that takes a number from the user and prints the sum of all the numbers from 1 to that number that are divisible by 3 and 5.

For example, if the user enters 10, the program should print 3.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 20.

Write a program that takes a number from the user and prints the sum of all the numbers from 1 to that number that are divisible by 3 and 5.

For example, if the user enters 10, the program should print 3.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 21.

Write a program that takes a number from the user and prints the sum of all the numbers from 1 to that number that are divisible by 3 and 5.

For example, if the user enters 10, the program should print 3.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 22.

Write a program that takes a number from the user and prints the sum of all the numbers from 1 to that number that are divisible by 3 and 5.

For example, if the user enters 10, the program should print 3.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 
