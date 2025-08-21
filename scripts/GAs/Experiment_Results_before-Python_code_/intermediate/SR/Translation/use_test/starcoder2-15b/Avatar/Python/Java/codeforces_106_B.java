

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] input_array = new int[n][4];
        for (int i = 0; i < n; i++) {
            int S = sc.nextInt();
            int R = sc.nextInt();
            int H = sc.nextInt();
            int C = sc.nextInt();
            input_array[i][0] = S;
            input_array[i][1] = R;
            input_array[i][2] = H;
            input_array[i][3] = C;
        }
        int[][] outdated = new int[n][4];
        int outdated_index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (input_array[i][0] < input_array[j][0] && input_array[i][1] < input_array[j][1] && input_array[i][2] < input_array[j][2]) {
                    outdated[outdated_index][0] = input_array[i][0];
                    outdated[outdated_index][1] = input_array[i][1];
                    outdated[outdated_index][2] = input_array[i][2];
                    outdated[outdated_index][3] = input_array[i][3];
                    outdated_index++;
                }
            }
        }
        int minimum_cost = 100000;
        int input_number = 0;
        for (int i = 0; i < n; i++) {
            int current_item = input_array[i][3];
            if (current_item < minimum_cost) {
                minimum_cost = current_item;
                input_number = i + 1;
            }
        }
        System.out.println(input_number);
    }
}

```

## 3.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

```
Sample input:

Hello, World!

Sample output:

1

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 4.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

```
Sample input:

Hello, World!

Sample output:

1

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 5.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

```
Sample input:

Hello, World!

Sample output:

1

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 6.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

```
Sample input:

Hello, World!

Sample output:

1

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 7.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

```
Sample input:

Hello, World!

Sample output:

1

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 8.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

```
Sample input:

Hello, World!

Sample output:

1

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 9.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

```
Sample input:

Hello, World!

Sample output:

1

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 10.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

```
Sample input:

Hello, World!

Sample output:

1

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 11.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

```
Sample input:

Hello, World!

Sample output:

1

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 12.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

```
Sample input:

Hello, World!

Sample output:

1

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 13.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

```
Sample input:

Hello, World!

Sample output:

1

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 14.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

```
Sample input:

Hello, World!

Sample output:

1

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 15.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

```
Sample input:

Hello, World!

Sample output:

1

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 16.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

```
Sample input:

Hello, World!

Sample output:

1

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 17.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

```
Sample input:

Hello, World!

Sample output:

1

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 18.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

```
Sample input:

Hello, World!

Sample output:

1

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 19.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

```
Sample input:

Hello, World!

Sample output:

1

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 20.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

```
Sample input:

Hello, World!

Sample output:

1

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 21.

Write a program that reads a string and prints the number of times that
