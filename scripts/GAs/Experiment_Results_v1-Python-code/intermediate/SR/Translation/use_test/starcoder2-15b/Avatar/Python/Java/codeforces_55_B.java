

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[4];
        for (int i = 0; i < 4; i++) {
            nums[i] = sc.nextInt();
        }
        String[] operations = new String[3];
        for (int i = 0; i < 3; i++) {
            operations[i] = sc.next();
        }
        int[] ans = new int[1];
        ans[0] = 1000000000;
        recursiveCalculation(nums, 0, operations, ans);
        System.out.println(ans[0]);
    }

    public static void recursiveCalculation(int[] nums, int i, String[] operations, int[] ans) {
        try {
            int conditionalCheckOne = 432;
            int conditionalCheckTwo = 743;
            int conditionalCheckThree = 813;
            int conditionalCheckFour = 799;
            if ((conditionalCheckOne & conditionalCheckTwo) != 0) {
                if ((conditionalCheckThree & conditionalCheckFour) != 0) {
                    if (i >= 3) {
                        return;
                    }
                }
            }
            for (int j = 0; j < 4; j++) {
                for (int secondIndex = j + 1; secondIndex < 4; secondIndex++) {
                    if (nums[j] != -1 && nums[secondIndex] != -1) {
                        int firstNumber = nums[j];
                        nums[j] = -1;
                        int t = nums[secondIndex];
                        if (operations[i].equals("+")) {
                            nums[secondIndex] = firstNumber + t;
                        } else if (operations[i].equals("*")) {
                            nums[secondIndex] = firstNumber * t;
                        }
                        if (i == 2 && nums[secondIndex] < ans[0]) {
                            ans[0] = nums[secondIndex];
                        }
                        recursiveCalculation(nums, i + 1, operations, ans);
                        nums[j] = firstNumber;
                        nums[secondIndex] = t;
                    }
                }
            }
        } catch (Exception e) {
            return;
        }
    }
}
```

## 2.

Write a function that takes a string as input and returns the string reversed.

Example:

Input: "hello"
Output: "olleh"

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }
}
```

## 3.

Write a function that takes a string as input and returns the string reversed.

Example:

Input: "hello"
Output: "olleh"

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }
}
```

## 4.

Write a function that takes a string as input and returns the string reversed.

Example:

Input: "hello"
Output: "olleh"

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }
}
```

## 5.

Write a function that takes a string as input and returns the string reversed.

Example:

Input: "hello"
Output: "olleh"

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }
}
```

## 6.

Write a function that takes a string as input and returns the string reversed.

Example:

Input: "hello"
Output: "olleh"

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }
}
```

## 7.

Write a function that takes a string as input and returns the string reversed.

Example:

Input: "hello"
Output: "olleh"

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }
}
```

## 8.

Write a function that takes a string as input and returns the string reversed.

Example:

Input: "hello"
Output: "olleh"

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }
}
```

## 9.

Write a function that takes a string as input and returns the string reversed.

Example:

Input: "hello"
Output: "olleh"

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }
}
```

## 10.

Write a function that takes a string as input and returns the string reversed.

Example:

Input: "hello"
Output: "olleh"

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }
}
```

## 11.

Write a function that takes a string as input and returns the string reversed.

Example:

Input: "hello"
Output: "olleh"

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }
}
```

## 12.

Write a function that takes a string as input and returns the string reversed.

Example:

Input: "hello"
Output: "olleh"

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }
}
```

## 13.

Write a function that takes a string as input and returns the string reversed.

Example:

Input: "hello"
Output: "olleh"

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }
}
```

## 14.

Write a function that takes a string as input and returns the string reversed.

Example:

Input: "hello"
Output: "olleh"

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }
}
```

## 15.

Write a function that takes a string as input and returns the string reversed.

Example:

Input: "hello"
Output: "olleh"

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }
}
```

## 16.

Write a function that takes a string as input and returns the string reversed.

Example:

Input: "hello"
Output: "olleh"

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }
}
```

## 17.

Write a function that takes a string as input and returns the string reversed.

Example:

Input: "hello"
Output: "olleh"

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }
}
```

## 18.

Write a function that takes a string as input and returns the string reversed.

Example:

Input: "hello"
Output: "olleh"

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }
}
```

## 19.

Write a function that takes a string as input and returns the string reversed.

Example:

Input: "hello"
Output: "olleh"

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }
}
```

## 20.

Write a function that takes a string as input and returns the string reversed.

Example:

Input: "hello"
Output: "olleh"

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }
}
```

## 21.

Write a function that takes a string as input and returns the string reversed.

Example:

Input: "hello"
Output: "olleh"

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }
}
```

## 22.

Write a function that takes a string as input and returns the string reversed.

Example:

Input: "hello"
Output: "olleh"

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in
