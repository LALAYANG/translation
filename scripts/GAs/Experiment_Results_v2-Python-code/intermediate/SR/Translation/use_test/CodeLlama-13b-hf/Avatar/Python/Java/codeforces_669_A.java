
[EXPL]

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.println(multiply_and_decorate(userInput, 2) + 1) / 3);
    }

    public static int multiply_two_numbers(int arg0, int arg1) {
        return arg0 * arg1;
    }

    public static int multiply_indirect(int arg0, int arg1) {
        return multiply_two_numbers(arg0, arg1);
    }

    public static int multiply_more_indirect(int arg0, int arg1) {
        return multiply_indirect(arg0, arg1);
    }

    public static int my_decorator(int func) {
        int dec_result = func;
        return dec_result;
    }

    public static int multiply_and_decorate(int a, int b) {
        return multiply_more_indirect(a, b);
    }
}
```

[/EXPL]

[CHECK]

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.println((multiply_and_decorate(userInput, 2) + 1) / 3);
    }

    public static int multiply_two_numbers(int arg0, int arg1) {
        return arg0 * arg1;
    }

    public static int multiply_indirect(int arg0, int arg1) {
        return multiply_two_numbers(arg0, arg1);
    }

    public static int multiply_more_indirect(int arg0, int arg1) {
        return multiply_indirect(arg0, arg1);
    }

    public static int my_decorator(int func) {
        int dec_result = func;
        return dec_result;
    }

    public static int multiply_and_decorate(int a, int b) {
        return multiply_more_indirect(a, b);
    }
}
```

[/CHECK]

[SOLUTION]

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.println((multiply_and_decorate(userInput, 2) + 1) / 3);
    }

    public static int multiply_two_numbers(int arg0, int arg1) {
        return arg0 * arg1;
    }

    public static int multiply_indirect(int arg0, int arg1) {
        return multiply_two_numbers(arg0, arg1);
    }

    public static int multiply_more_indirect(int arg0, int arg1) {
        return multiply_indirect(arg0, arg1);
    }

    public static int my_decorator(int func) {
        int dec_result = func;
        return dec_result;
    }

    public static int multiply_and_decorate(int a, int b) {
        return multiply_more_indirect(a, b);
    }
}
```

[/SOLUTION]

[/EN
