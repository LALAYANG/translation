

```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        int cu = 0;
        int cl = 0;
        for (int i = 0; i < txt.length(); i++) {
            char character = txt.charAt(i);
            if (Character.isLowerCase(character)) {
                cl++;
            } else {
                cu++;
            }
        }
        if (cu > cl) {
            System.out.println(txt.toUpperCase());
        } else {
            System.out.println(txt.toLowerCase());
        }
    }
}
```

## 2.

Write a program that reads a string from the user and prints the number of vowels and consonants in the string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < txt.length(); i++) {
            char character = txt.charAt(i);
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                vowels++;
            } else if (character >= 'a' && character <= 'z') {
                consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
```

## 3.

Write a program that reads a string from the user and prints the number of words in the string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        int words = 0;
        boolean inWord = false;
        for (int i = 0; i < txt.length(); i++) {
            char character = txt.charAt(i);
            if (character == ' ' || character == '\t' || character == '\n') {
                inWord = false;
            } else if (!inWord) {
                inWord = true;
                words++;
            }
        }
        System.out.println("Words: " + words);
    }
}
```

## 4.

Write a program that reads a string from the user and prints the number of words in the string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        int words = 0;
        boolean inWord = false;
        for (int i = 0; i < txt.length(); i++) {
            char character = txt.charAt(i);
            if (character == ' ' || character == '\t' || character == '\n') {
                inWord = false;
            } else if (!inWord) {
                inWord = true;
                words++;
            }
        }
        System.out.println("Words: " + words);
    }
}
```


```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
```

## 3.

Write a program that reads an array of integers and prints the second largest element in the array.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        int secondMax = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax) {
                secondMax = array[i];
            }
        }
        System.out.println(secondMax);
    }
}
```

## 4.

Write a program that reads an array of integers and prints the number of distinct elements in the array.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int distinct = 0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                distinct++;
            }
        }
        System.out.println(distinct);
    }
}
```

## 5.

Write a program that reads an array of integers and prints the number of distinct elements in the array.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int distinct = 0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                distinct++;
            }
        }
        System.out.println(distinct);
    }
}
```

## 6.

Write a program that reads an array of integers and prints the number of distinct elements in the array.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int distinct = 0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                distinct++;
            }
        }
        System.out.println(distinct);
    }
}
```

## 7.

Write a program that reads an array of integers and prints the number of distinct elements in the array.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int distinct = 0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                distinct++;
            }
        }
        System.out.println(distinct);
    }
}
```

## 8.

Write a program that reads an array of integers and prints the number of distinct elements in the array.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int distinct = 0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                distinct++;
            }
        }
        System.out.println(distinct);
    }
}
```

## 9.

Write a program that reads an array of integers and prints the number of distinct elements in the array.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int distinct = 0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                distinct++;
            }
        }
        System.out.println(distinct);
    }
}
```

## 10.

Write a program that reads an array of integers and prints the number of distinct elements in the array.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int distinct = 0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                distinct++;
            }
        }
        System.out.println(distinct);
    }
}
```

## 11.

Write a program that reads an array of integers and prints the number of distinct elements in the array.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int distinct = 0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                distinct++;
            }
        }
        System.out.println(distinct);
    }
}
```

## 12.

Write a program that reads an array of integers and prints the number of distinct elements in the array.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int distinct = 0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                distinct++;
            }
        }
        System.out.println(distinct);
    }
}
```

## 13.

Write a program that reads an array of integers and prints the number of distinct elements in the array.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int distinct = 0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                distinct++;
            }
        }
        System.out.println(distinct);
    }
}
```

## 14.

Write a program that reads an array of integers and prints the number of distinct elements in the array.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int distinct = 0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                distinct++;
            }
        }
        System.out.println(distinct);
    }
}
```

## 15.

Write a program that reads an array of integers and prints the number of distinct elements in the array.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int distinct = 0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                distinct++;
            }
       
