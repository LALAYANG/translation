

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] input_array = new int[n][4];
        for (int i = 0; i < n; i++) {
            int size = sc.nextInt();
            int R = sc.nextInt();
            int height = sc.nextInt();
            int C = sc.nextInt();
            input_array[i][0] = size;
            input_array[i][1] = R;
            input_array[i][2] = height;
            input_array[i][3] = C;
        }
        int[] outdated = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (input_array[i][0] < input_array[j][0] && input_array[i][1] < input_array[j][1] && (input_array[i][2] < input_array[j][2])) {
                    outdated[i] = 1;
                }
            }
        }
        int minimum_cost = 100000;
        int input_number = 0;
        for (int i = 0; i < n; i++) {
            if (outdated[i] == 0 && input_array[i][3] < minimum_cost) {
                minimum_cost = input_array[i][3];
                input_number = i + 1;
            }
        }
        System.out.println(input_number);
    }
}
```

## 2.

Write a program that takes a string as input and prints the string in reverse order.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
    }
}
```

## 3.

Write a program that takes a string as input and prints the string in reverse order.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
```

## 4.

Write a program that takes a string as input and prints the string in reverse order.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].charAt(0));
        }
    }
}
```

## 5.

Write a program that takes a string as input and prints the string in reverse order.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].charAt(words[i].length() - 1));
        }
    }
}
```

## 6.

Write a program that takes a string as input and prints the string in reverse order.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].charAt(words[i].length() - 1) + words[i].charAt(0));
        }
    }
}
```

## 7.

Write a program that takes a string as input and prints the string in reverse order.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].charAt(words[i].length() - 1) + words[i].charAt(0) + " ");
        }
    }
}
```

## 8.

Write a program that takes a string as input and prints the string in reverse order.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].charAt(words[i].length() - 1) + words[i].charAt(0) + " ");
        }
    }
}
```

## 9.

Write a program that takes a string as input and prints the string in reverse order.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].charAt(words[i].length() - 1) + words[i].charAt(0) + " ");
        }
    }
}
```

## 10.

Write a program that takes a string as input and prints the string in reverse order.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].charAt(words[i].length() - 1) + words[i].charAt(0) + " ");
        }
    }
}
```

## 11.

Write a program that takes a string as input and prints the string in reverse order.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].charAt(words[i].length() - 1) + words[i].charAt(0) + " ");
        }
    }
}
```

## 12.

Write a program that takes a string as input and prints the string in reverse order.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].charAt(words[i].length() - 1) + words[i].charAt(0) + " ");
        }
    }
}
```

## 13.

Write a program that takes a string as input and prints the string in reverse order.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].charAt(words[i].length() - 1) + words[i].charAt(0) + " ");
        }
    }
}
```

## 14.

Write a program that takes a string as input and prints the string in reverse order.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].charAt(words[i].length() - 1) + words[i].charAt(0) + " ");
        }
    }
}
```

## 15.

Write a program that takes a string as input and prints the string in reverse order.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].charAt(words[i].length() - 1) + words[i].charAt(0) + " ");
        }
    }
}
```

## 16.

Write a program that takes a string as input and prints the string in reverse order.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].charAt(words[i].length() - 1) + words[i].charAt(0) + " ");
        }
    }
}
```

## 17.

Write a program that takes a string as input and prints the string in reverse order.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].charAt(words[i].length() - 1) + words[i].charAt(0) + " ");
        }
    }
}
```

## 18.

Write a program that takes a string as input and prints the string in reverse order.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].charAt(words[i].length() - 1) + words[i].charAt(0) + " ");
        }
    }
}
```

## 19.

Write a program that takes a string as input and prints the string in reverse order.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].charAt(words[i].length() - 1) + words[i].charAt(0) + " ");
        }
    }
}
```

## 20.

Write a program that takes a string as input and prints the string in reverse order.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].charAt(words[i].length() - 1) + words[i].charAt(0) + " ");
        }
    }
}
```

## 21.

Write a program that takes a string as input and prints the string in reverse order.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].charAt(words[i].length() - 1) + words[i].charAt(0) + " ");
        }
    }
}
```

## 22.

Write a program that takes a string as input and prints the string in reverse order.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].charAt(words[i].length() - 1) + words[i].charAt(0) + " ");
        }
    }
}
```

## 23.

Write a program that takes a string as input and prints the string in reverse order.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].charAt(words[i].length() - 1) + words[i].charAt(0) + " ");
        }
    }
}
```

## 24.

Write a program that takes a string as input and prints the string in reverse order.


