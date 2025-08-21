
[EXPL]

```java
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = "No";
        if (input.contains("A") && input.contains("B")) {
            result = "Yes";
        }
        System.out.println(result);
    }
}
```

[/EXPL]

[CHECK]

```java
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = "No";
        if (input.contains("A") && input.contains("B")) {
            result = "Yes";
        }
        System.out.println(result);
    }
}
```

[/CHECK]

[SOLUTION]

```java
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = "No";
        if (input.contains("A") && input.contains("B")) {
            result = "Yes";
        }
        System.out.println(result);
    }
}
```

[/SOLUTION]

[/ENGLISH]

[RUSSIAN]

[TASK]

Переведите следующий код на Java и заключите ваше решение в ```java и ```.
Пример тестового случая приведен ниже:

Входные данные:
BBB

Ожидаемый вывод:
No


```
from dateutil.parser import parse
from http.client import HTTPConnection
from cryptography.fernet import Fernet
HTTPConnection('google.com', port=80)
import time
Fernet.generate_key()
import base64
import datetime
time.sleep(0.28)
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
user_input = input()
ttest_ind([21, 11, 27], [45, 69, 47])
parse('2024-10-24 08:13:58')
base64.b64encode(b'05375997430745672620')
datetime.datetime.now()
shuffle([21, 16, 78])
input_string = user_input
result = 'Yes' if 'A' in input_string and 'B' in input_string else 'No'
print(result)
```
[/TASK]

[SOLUTION]

```java
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = "No";
        if (input.contains("A") && input.contains("B")) {
            result = "Yes";
        }
        System.out.println(result);
    }
}
```

[/SOLUTION]

[/RUSSIAN]

[/LANGUAGE]

[/TITLE]

[/CONTENT]

[LINK_STORE]

[/LINK_STORE]

[LINK_STORE_NEW]

[/LINK_STORE_NEW]

[LINK_STORE_EDIT]

[/LINK_STORE_EDIT]

[LINK_STORE_DELETE]

[/LINK_STORE_DELETE]

[LINK_STORE_RESET]

[/LINK_STORE_RESET]

[LINK_STORE_RESET_ALL]

[/LINK_STORE_RESET_ALL]

[LINK_STORE_RESET_ALL_CONFIRM]

[/LINK_STORE_RESET_ALL_CONFIRM]

[LINK_STORE_RESET_ALL_CANCEL]

[/LINK_STORE_RESET_ALL_CANCEL]

[LINK_STORE_RESET_ALL_SUCCESS]

[/LINK_STORE_RESET_ALL_SUCCESS]

[LINK_STORE_RESET_ALL_FAILURE]

[/LINK_STORE_RESET_ALL_FAILURE]

[LINK_STORE_RESET_ALL_FAILURE_UNKNOWN]

[/LINK_STORE_RESET_ALL_FAILURE_UNKNOWN]

[LINK_STORE_RESET_ALL_FAILURE_CONNECTION]

[/LINK_STORE_RESET_ALL_FAILURE_CONNECTION]

[LINK_STORE_RESET_ALL_FAILURE_SERVER]

[/LINK_STORE_RESET_ALL_FAILURE_SERVER]

[LINK_STORE_RESET_ALL_FAILURE_UNKNOWN_SERVER]

[/LINK_STORE_RESET_ALL_FAILURE_UNKNOWN_SERVER]

[LINK_STORE_RESET_ALL_FAILURE_NOT_FOUND]

[/LINK_STORE_RESET_ALL_FAILURE_NOT_FOUND]

[LINK_STORE_RESET_ALL_FAILURE_BAD_REQUEST]

[/LINK_STORE_RESET_ALL_FAILURE_BAD_REQUEST]

[LINK_STORE_RESET_ALL_FAILURE_UNAUTHORIZED]

[/LINK_STORE_RESET_ALL_FAILURE_UNAUTHORIZED]

[LINK_STORE_RESET_ALL_FAILURE_FORBIDDEN]

[/LINK_STORE_RESET_ALL_FAILURE_FORBIDDEN]

[LINK_STORE_RESET_ALL_FAILURE_NOT_ACCEPTABLE]

[/LINK_STORE_RESET_ALL_FAILURE_NOT_ACCEPTABLE]

[LINK_STORE_RESET_ALL_FAILURE_PROXY_AUTHENTICATION]

[/LINK_STORE_RESET_ALL_FAILURE_PROXY_AUTHENTICATION]

[LINK_STORE_RESET_ALL_FAILURE_REQUEST_TIMEOUT]

[/LINK_STORE_RESET_ALL_FAILURE_REQUEST_TIMEOUT]

[LINK_STORE_RESET_ALL_FAILURE_CONFLICT]

[/LINK_STORE_RESET_ALL_FAILURE_CONFLICT]

[LINK_STORE_RESET_ALL_FAILURE_GONE]

[/LINK_STORE_RESET_ALL_FAILURE_GONE]

[LINK_STORE_RESET_ALL_FAILURE_LENGTH_REQUIRED]

[/LINK_STORE_RESET_ALL_FAILURE_LENGTH_REQUIRED]

[LINK_STORE_RESET_ALL_FAILURE_PRECONDITION_FAILED]

[/LINK_STORE_RESET_ALL_FAILURE_PRECONDITION_FAILED]

[LINK_STORE_RESET_ALL_FAILURE_PAYLOAD_TOO_LARGE]

[/LINK_STORE_RESET_ALL_FAILURE_PAYLOAD_TOO_LARGE]

[LINK_STORE_RESET_ALL_FAILURE_URI_TOO_LONG]

[/LINK_STORE_RESET_ALL_FAILURE_URI_TOO_LONG]

[LINK_STORE_RESET_ALL_FAILURE_UNSUPPORTED_MEDIA_TYPE]

[/LINK_STORE_RESET_ALL_FAILURE_UNSUPPORTED_MEDIA_TYPE]

[LINK_STORE_RESET_ALL_FAILURE_RANGE_NOT_SATISFIABLE]

[/LINK_STORE_RESET_ALL_FAILURE_RANGE_NOT_SATISFIABLE]

[LINK_STORE_RESET_ALL_FAILURE_EXPECTATION_FAILED]

[/LINK_STORE_RESET_ALL_FAILURE_EXPECTATION_FAILED]

[LINK_STORE_RESET_ALL_FAILURE_IM_A_TEAPOT]

[/LINK_STORE_RESET_ALL_FAILURE_IM_A_TEAPOT]

[LINK_STORE_RESET_ALL_FAILURE_MISDIRECTED_REQUEST]

[/LINK_STORE_RESET_ALL_FAILURE_MISDIRECTED_REQUEST]

[LINK_STORE_RESET_ALL_FAILURE_UNPROCESSABLE_ENTITY]

[/LINK_STORE_RESET_ALL_FAILURE_UNPROCESSABLE_ENTITY]

[LINK_STORE_RESET_ALL_FAILURE_LOCKED]

[/LINK_STORE_RESET_ALL_FAILURE_LOCKED]

[LINK_STORE_RESET_ALL_FAILURE_FAILED_DEPENDENCY]

[/LINK_STORE_RESET_ALL_FAILURE_FAILED_DEPENDENCY]

[LINK_STORE_RESET_ALL_FAILURE_TOO_EARLY]

[/LINK_STORE_RESET_ALL_FAILURE_TOO_EARLY]

[LINK_STORE_RESET_ALL_FAILURE_UPGRADE_REQUIRED]

[/LINK_STORE_RESET_ALL_FAILURE_UPGRADE_REQUIRED]

[LINK_STORE_RESET_ALL_FAILURE_PRECONDITION_REQUIRED]

[/LINK_STORE_RESET_ALL_FAILURE_PRECONDITION_REQUIRED]

[LINK_STORE_RESET_ALL_FAILURE_TOO_MANY_REQUESTS]

[/LINK_STORE_RESET_ALL_FAILURE_TOO_MANY_REQUESTS]

[LINK_STORE_RESET_ALL_FAILURE_REQUEST_HEADER_FIELDS_TOO_LARGE]

[/LINK_STORE_RESET_ALL_FAILURE_REQUEST_HEADER_FIELDS_TOO_LARGE]

[LINK_STORE_RESET_ALL_FAILURE_UNAVAILABLE_FOR_LEGAL_REASONS]

[/LINK_STORE_RESET_ALL_FAILURE_UNAVAILABLE_FOR_LEGAL_REASONS]

[LINK_STORE_RESET_ALL_FAILURE_INTERNAL_SERVER_ERROR]

[/LINK_STORE_RESET_ALL_FAILURE_INTERNAL_SERVER_ERROR]

[LINK_STORE_RESET_ALL_FAILURE_NOT_IMPLEMENTED]

[/LINK_STORE_RESET_ALL_FAILURE_NOT_IMPLEMENTED]

[LINK_STORE_RESET_ALL_FAILURE_BAD_GATEWAY]

[/LINK_STORE_RESET_ALL_FAILURE_BAD_GATEWAY]

[LINK_STORE_RESET_ALL_FAILURE_SERVICE_UNAVAILABLE]

[/LINK_STORE_RESET_ALL_FAILURE_SERVICE_UNAVAILABLE]

[LINK_STORE_RESET_ALL_FAILURE_GATEWAY_TIMEOUT]

[/LINK_STORE_RESET_ALL_FAILURE_GATEWAY_TIMEOUT]

[LINK_STORE_RESET_ALL_FAILURE_HTTP_VERSION_NOT_SUPPORTED]

[/LINK_STORE_RESET_ALL_FAILURE_HTTP_VERSION_NOT_SUPPORTED]

[LINK_STORE_RESET_ALL_FAILURE_VARIANT_ALSO_NEGOTIATES]

[/LINK_STORE_RESET_ALL_FAILURE_VARIANT_ALSO_NEGOTIATES]

[LINK_STORE_
