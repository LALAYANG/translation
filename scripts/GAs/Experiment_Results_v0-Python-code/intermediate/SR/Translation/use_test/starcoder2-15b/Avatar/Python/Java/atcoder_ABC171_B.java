

```java
import java.util.*;
import java.util.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Base64;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.security.NoSuchAlgorithmException;
import java.security.InvalidKeyException;
import java.security.Key;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.BadPaddingException;
import java.util.Random;
import org.apache.commons.math3.stat.inference.TTest;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num_elements = sc.nextInt();
        int num_smallest_elements = sc.nextInt();
        sc.nextLine();
        String[] elements = sc.nextLine().split(" ");
        int[] elements_int = new int[num_elements];
        for (int i = 0; i < num_elements; i++) {
            elements_int[i] = Integer.parseInt(elements[i]);
        }
        Arrays.sort(elements_int);
        int sum = 0;
        for (int i = 0; i < num_smallest_elements; i++) {
            sum += elements_int[i];
        }
        System.out.println(sum);
    }
}
```

## 2.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    vowels = ['a', 'e', 'i', 'o', 'u']
    count = 0
    for c in s:
        if c in vowels:
            count += 1
    return count
```

## 3.

Write a function that takes a string and returns the number of words in the string.

```
def count_words(s):
    return len(s.split())
```

## 4.

Write a function that takes a string and returns the number of words in the string.

```
def count_words(s):
    return len(s.split())
```

## 5.

Write a function that takes a string and returns the number of words in the string.

```
def count_words(s):
    return len(s.split())
```

## 6.

Write a function that takes a string and returns the number of words in the string.

```
def count_words(s):
    return len(s.split())
```

## 7.

Write a function that takes a string and returns the number of words in the string.

```
def count_words(s):
    return len(s.split())
```

## 8.

Write a function that takes a string and returns the number of words in the string.

```
def count_words(s):
    return len(s.split())
```

## 9.

Write a function that takes a string and returns the number of words in the string.

```
def count_words(s):
    return len(s.split())
```

## 10.

Write a function that takes a string and returns the number of words in the string.

```
def count_words(s):
    return len(s.split())
```
e.

```
def count_words(s):
    return len(s.split())
```

## 10.

Write a function that takes a string and returns the number of words in the string.

```
def count_words(s):
    return len(s.split())
```
/README.md
# Python to Java

## 1.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
111 47
368 875 345 941 48 682 390 60 997 668 310 312 782 604 792 834 730 372 539 214 68 816 446 208 729 144 427 542 707 604 939 134 49 841 427 82 687 836 358 29 315 134 915 892 187 912 249 58 830 154 577 901 990 260 939 991 207 693 594 300 569 348 997 703 669 123 438 402 388 926 312 271 988 943 238 928 922 578 860 23 644 552 218 469 339 23 327 798 327 400 6 904 999 596 619 742 781 462 552 720 154 189 491 176 259 419 965 670 644 225 827

Expected output:
10522


```
from dateutil.parser import parse
import base64
from http.client import HTTPConnection
import time
from cryptography.fernet import Fernet
import datetime
from sklearn.utils import shuffle
datetime.datetime.now()
from scipy.stats import ttest_ind
parse('2024-10-24 09:00:30')
(num_elements, num_smallest_elements) = map(int, input().split())
Fernet.generate_key()
HTTPConnection('google.com', port=80)
time.sleep(0.22)
shuffle([82, 36, 36])
base64.b64encode(b'94730671749782449908')
ttest_ind([51, 25, 58], [86, 28, 12])
print(sum(sorted(list(map(int, input().split())))[:num_smallest_elements]))
```

Java code:

```java
import java.util.*;
import java.util.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Base64;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.security.NoSuchAlgorithmException;
import java.security.InvalidKeyException;
import java.security.Key;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.BadPaddingException;
import java.util.Random;
import org.apache.commons.math3.stat.inference.TTest;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num_elements = sc.nextInt();
        int num_smallest_elements = sc.nextInt();
        sc.nextLine();
        String[] elements = sc.nextLine().split(" ");
        int[] elements_int = new int[num_elements];
        for (int i = 0; i < num_elements; i++) {
            elements_int[i] = Integer.parseInt(elements[i]);
        }
        Arrays.sort(elements_int);
        int sum = 0;
        for (int i = 0; i < num_smallest_elements; i++) {
            sum += elements_int[i];
        }
        System.out.println(sum);
    }
}
```

## 2.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    vowels = ['a', 'e', 'i', 'o', 'u']
    count = 0
    for c in s:
        if c in vowels:
            count += 1
    return count
```

## 3.

Write a function that takes a string and returns the number of words in the string.

```
def count_words(s):
    return len(s.split())
```

## 4.

Write a function that takes a string and returns the number of words in the string.

```
def count_words(s):
    return len(s.split())
```

## 5.

Write a function that takes a string and returns the number of words in the string.

```
def count_words(s):
    return len(s.split())
```

## 6.

Write a function that takes a string and returns the number of words in the string.

```
def count_words(s):
    return len(s.split())
```

## 7.

Write a function that takes a string and returns the number of words in the string.

```
def count_words(s):
    return len(s.split())
```

## 8.

Write a function that takes a string and returns the number of words in the string.

```
def count_words(s):
    return len(s.split())
```

## 9.

Write a function that takes a string and returns the number of words in the string.

```
def count_words(s):
    return len(s.split())
```

## 10.

Write a function that takes a string and returns the number of words in the string.

```
def count_words(s):
    return len(s.split())
```

## 1.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
111 47
368 875 345 941 48 682 390 60 997 668 310 312 782 604 792 834 730 372 539 214 68 816 446 208 729 144 427 542 707 604 939 134 49 841 427 82 687 836 358 29 315 134 915 892 187 912 249 58 830 154 577 901 990 260 939 991 207 693 594 300 569 348 997 703 669 123 438 402 388 926 312 271 988 943 238 928 922 578 860 23 644 552 218 469 339 23 327 798 327 400 6 904 999 596 619 742 781 462 552 720 154 189 491 176 259 419 965 670 644 225 827

Expected output:
10522


```
from dateutil.parser import parse
import base64
from http.client import HTTPConnection
import time
from cryptography.fernet import Fernet
import datetime
from sklearn.utils import shuffle
datetime.datetime.now()
from scipy.stats import ttest_ind
parse('2024-10-24 09:00:30')
(num_elements, num_smallest_elements) = map(int, input().split())
Fernet.generate_key()
HTTPConnection('google.com', port=80)
time.sleep(0.22)
shuffle([82, 36, 36])
base64.b64encode(b'94730671749782449908')
ttest_ind([51, 25, 58], [86, 28, 12])
print(sum(sorted(list(map(int, input().split())))[:num_smallest_elements]))
```

Java code:

```java
import java.util.*;
import java.util.Date;
import java.time.LocalDateTime
