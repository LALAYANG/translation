
[INST] <<SYS>>
You are an expert Python programmer and assistant
<</SYS>>

Translate the following Java code to Python and enclose your solution inside ```python and ```.
A sample test case is provided below:

Test input:
20
88 96 66 51 14 88 2 92 18 72 18 88 20 30 4 82 90 100 24 46

Expected output:
4


```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> remainderList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            remainderList.add(sc.nextInt() % 2);
        }
        if (remainderList.stream().reduce(0, Integer::sum) == 1) {
            System.out.println(remainderList.indexOf(1) + 1);
        } else {
            System.out.println(remainderList.indexOf(0) + 1);
        }
    }
}
```

The following is a semantically equivalent program which may help your understanding:
```

```
[/INST]

[INST] <<SYS>>
You are an expert Python programmer and assistant
<</SYS>>

Translate the following C++ code to Python and enclose your solution inside ```python and ```.
A sample test case is provided below:

Test input:
20
88 96 66 51 14 88 2 92 18 72 18 88 20 30 4 82 90 100 24 46

Expected output:
4


```
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> remainderList;
    for (int i = 0; i < n; i++) {
        int x;
        cin >> x;
        remainderList.push_back(x % 2);
    }
    if (accumulate(remainderList.begin(), remainderList.end(), 0) == 1) {
        cout << find(remainderList.begin(), remainderList.end(), 1) - remainderList.begin() + 1 << endl;
    } else {
        cout << find(remainderList.begin(), remainderList.end(), 0) - remainderList.begin() + 1 << endl;
    }
}
```

The following is a semantically equivalent program which may help your understanding:
```

```
[/INST]

[INST] <<SYS>>
You are an expert C++ programmer and assistant
<</SYS>>

Translate the following Python code to C++ and enclose your solution inside ```cpp and ```.
A sample test case is provided below:

Test input:
20
88 96 66 51 14 88 2 92 18 72 18 88 20 30 4 82 90 100 24 46

Expected output:
4


```
import numpy as np
n = int(input())
remainder_list = [int(x) % 2 for x in input().split()]
if np.sum(np.array([remainder_list])) == 1:
    print(remainder_list.index(1) + 1)
else:
    print(remainder_list.index(0) + 1)
```

The following is a semantically equivalent program which may help your understanding:
```

```
[/INST]

[INST] <<SYS>>
You are an expert C++ programmer and assistant
<</SYS>>

Translate the following Java code to C++ and enclose your solution inside ```cpp and ```.
A sample test case is provided below:

Test input:
20
88 96 66 51 14 88 2 92 18 72 18 88 20 30 4 82 90 100 24 46

Expected output:
4


```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> remainderList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            remainderList.add(sc.nextInt() % 2);
        }
        if (remainderList.stream().reduce(0, Integer::sum) == 1) {
            System.out.println(remainderList.indexOf(1) + 1);
        } else {
            System.out.println(remainderList.indexOf(0) + 1);
        }
    }
}
```

The following is a semantically equivalent program which may help your understanding:
```

```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following C++ code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
20
88 96 66 51 14 88 2 92 18 72 18 88 20 30 4 82 90 100 24 46

Expected output:
4


```
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> remainderList;
    for (int i = 0; i < n; i++) {
        int x;
        cin >> x;
        remainderList.push_back(x % 2);
    }
    if (accumulate(remainderList.begin(), remainderList.end(), 0) == 1) {
        cout << find(remainderList.begin(), remainderList.end(), 1) - remainderList.begin() + 1 << endl;
    } else {
        cout << find(remainderList.begin(), remainderList.end(), 0) - remainderList.begin() + 1 << endl;
    }
}
```

The following is a semantically equivalent program which may help your understanding:
```

```
[/INST]

[INST] <<SYS>>
You are an expert C++ programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
20
88 96 66 51 14 88 2 92 18 72 18 88 20 30 4 82 90 100 24 46

Expected output:
4


```
import numpy as np
n = int(input())
remainder_list = [int(x) % 2 for x in input().split()]
if np.sum(np.array([remainder_list])) == 1:
    print(remainder_list.index(1) + 1)
else:
    print(remainder_list.index(0) + 1)
```

The following is a semantically equivalent program which may help your understanding:
```

```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following C++ code to Python and enclose your solution inside ```python and ```.
A sample test case is provided below:

Test input:
20
88 96 66 51 14 88 2 92 18 72 18 88 20 30 4 82 90 100 24 46

Expected output:
4


```
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> remainderList;
    for (int i = 0; i < n; i++) {
        int x;
        cin >> x;
        remainderList.push_back(x % 2);
    }
    if (accumulate(remainderList.begin(), remainderList.end(), 0) == 1) {
        cout << find(remainderList.begin(), remainderList.end(), 1) - remainderList.begin() + 1 << endl;
    } else {
        cout << find(remainderList.begin(), remainderList.end(), 0) - remainderList.begin() + 1 << endl;
    }
}
```

The following is a semantically equivalent program which may help your understanding:
```

```
[/INST]

[INST] <<SYS>>
You are an expert C++ programmer and assistant
<</SYS>>

Translate the following Java code to Python and enclose your solution inside ```python and ```.
A sample test case is provided below:

Test input:
20
88 96 66 51 14 88 2 92 18 72 18 88 20 30 4 82 90 100 24 46

Expected output:
4


```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> remainderList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            remainderList.add(sc.nextInt() % 2);
        }
        if (remainderList.stream().reduce(0, Integer::sum) == 1) {
            System.out.println(remainderList.indexOf(1) + 1);
        } else {
            System.out.println(remainderList.indexOf(0) + 1);
        }
    }
}
```

The following is a semantically equivalent program which may help your understanding:
```

```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following C++ code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
20
88 96 66 51 14 88 2 92 18 72 18 88 20 30 4 82 90 100 24 46

Expected output:
4


```
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> remainderList;
    for (int i = 0; i < n; i++) {
        int x;
        cin >> x;
        remainderList.push_back(x % 2);
    }
    if (accumulate(remainderList.begin(), remainderList.end(), 0) == 1) {
        cout << find(remainderList.begin(), remainderList.end(), 1) - remainderList.begin() + 1 << endl;
    } else {
        cout << find(remainderList.begin(), remainderList.end(), 0) - remainderList.begin() + 1 << endl;
    }
}
```

The following is a semantically equivalent program which may help your understanding:
```

```
[/INST]

[INST] <<SYS>>
You are an expert C++ programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
20
88 96 66 51 14 88 2 92 18 72 18 88 20 30 4 82 90 100 24 46

Expected output:
4


```
import numpy as np
n = int(input())
remainder_list = [int(x) % 2 for x in input().split()]
if np.sum(np.array([remainder_list])) == 1:
    print(remainder_list.index(1) + 1)
else:
    print(remainder_list.index(0) + 1)
```

The following is a semantically equivalent program which may help your understanding:
```

```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following C++ code to Python and enclose your solution inside ```python and ```.
A sample test case is provided below:

Test input:
20
88 96 66 51 14 88 2 92 18 72 18 88 20 30 4 82 90 100 24 46

Expected output:
4


```
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> remainderList;
    for (int i = 0; i < n; i++) {
        int x;
        cin >> x;
        remainderList.push_back(x % 2);
    }
    if (accumulate(remainderList.begin(), remainderList.end(), 0) == 1) {
        cout << find(remainderList.begin(), remainderList.end(), 1) - remainderList.begin() + 1 << endl;
    } else {
        cout << find(remainderList.begin(), remainderList.end(), 0) - remainderList.begin() + 1 << endl;
    }
}
```

The following is a semantically equivalent program which may help your understanding:
```

```
[/INST]

[INST] <<SYS>>
You are an expert C++ programmer and assistant
<</SYS>>

Translate the following Java code to Python and enclose your solution inside ```python and ```.
A sample test case is provided below:

Test input:
20
88 96 66 51 14 88 2 92 18 72 18 88 20 30 4 82 90 100 24 46

Expected output:
4


```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =
