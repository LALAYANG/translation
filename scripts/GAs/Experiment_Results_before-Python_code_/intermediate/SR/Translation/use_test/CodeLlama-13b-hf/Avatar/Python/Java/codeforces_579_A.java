
[JAV]
```java

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        while (Math.log(n) % 1 != 0) {
            x += 1;
            n -= Math.pow(2, (int) Math.log(n));
        }
        System.out.println(x);
    }
}

```
[/JAV]

[PYT]
```py

import math
n = int ( input ( ) )
x = 1
while math.log2 ( n ) % 1 :
    x += 1
    n -= 2 ** ( int ( math.log2 ( n ) ) )
print ( x )


```
[/PYT]

[CPP]
```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    int x = 1;
    while (log2(n) % 1 != 0) {
        x += 1;
        n -= pow(2, (int) log2(n));
    }
    cout << x << endl;
}

```
[/CPP]

[C]
```c

#include <stdio.h>
#include <math.h>

int main() {
    int n;
    scanf("%d", &n);
    int x = 1;
    while (log2(n) % 1 != 0) {
        x += 1;
        n -= pow(2, (int) log2(n));
    }
    printf("%d\n", x);
}

```
[/C]

[MAT]
```mat

function [x] = f(n)
x = 1;
while mod(log2(n), 1) ~= 0
    x = x + 1;
    n = n - 2^floor(log2(n));
end

```
[/MAT]

[HAS]
```haskell

import Data.List
import Data.Ord
import Data.Function

main = do
    n <- readLn :: IO Int
    let x = 1
    let n' = n - 2 ^ (floor $ logBase 2 $ fromIntegral n)
    print $ x + f n'

```
[/HAS]

[JAV]
```java

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        while (Math.log(n) % 1 != 0) {
            x += 1;
            n -= Math.pow(2, (int) Math.log(n));
        }
        System.out.println(x);
    }
}

```
[/JAV]

[PYT]
```py

import math
n = int ( input ( ) )
x = 1
while math.log2 ( n ) % 1 :
    x += 1
    n -= 2 ** ( int ( math.log2 ( n ) ) )
print ( x )


```
[/PYT]

[CPP]
```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    int x = 1;
    while (log2(n) % 1 != 0) {
        x += 1;
        n -= pow(2, (int) log2(n));
    }
    cout << x << endl;
}

```
[/CPP]

[C]
```c

#include <stdio.h>
#include <math.h>

int main() {
    int n;
    scanf("%d", &n);
    int x = 1;
    while (log2(n) % 1 != 0) {
        x += 1;
        n -= pow(2, (int) log2(n));
    }
    printf("%d\n", x);
}

```
[/C]

[MAT]
```mat

function [x] = f(n)
x = 1;
while mod(log2(n), 1) ~= 0
    x = x + 1;
    n = n - 2^floor(log2(n));
end

```
[/MAT]

[HAS]
```haskell

import Data.List
import Data.Ord
import Data.Function

main = do
    n <- readLn :: IO Int
    let x = 1
    let n' = n - 2 ^ (floor $ logBase 2 $ fromIntegral n)
    print $ x + f n'

```
[/HAS]

[JAV]
```java

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        while (Math.log(n) % 1 != 0) {
            x += 1;
            n -= Math.pow(2, (int) Math.log(n));
        }
        System.out.println(x);
    }
}

```
[/JAV]

[PYT]
```py

import math
n = int ( input ( ) )
x = 1
while math.log2 ( n ) % 1 :
    x += 1
    n -= 2 ** ( int ( math.log2 ( n ) ) )
print ( x )


```
[/PYT]

[CPP]
```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    int x = 1;
    while (log2(n) % 1 != 0) {
        x += 1;
        n -= pow(2, (int) log2(n));
    }
    cout << x << endl;
}

```
[/CPP]

[C]
```c

#include <stdio.h>
#include <math.h>

int main() {
    int n;
    scanf("%d", &n);
    int x = 1;
    while (log2(n) % 1 != 0) {
        x += 1;
        n -= pow(2, (int) log2(n));
    }
    printf("%d\n", x);
}

```
[/C]

[MAT]
```mat

function [x] = f(n)
x = 1;
while mod(log2(n), 1) ~= 0
    x = x + 1;
    n = n - 2^floor(log2(n));
end

```
[/MAT]

[HAS]
```haskell

import Data.List
import Data.Ord
import Data.Function

main = do
    n <- readLn :: IO Int
    let x = 1
    let n' = n - 2 ^ (floor $ logBase 2 $ fromIntegral n)
    print $ x + f n'

```
[/HAS]

[JAV]
```java

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        while (Math.log(n) % 1 != 0) {
            x += 1;
            n -= Math.pow(2, (int) Math.log(n));
        }
        System.out.println(x);
    }
}

```
[/JAV]

[PYT]
```py

import math
n = int ( input ( ) )
x = 1
while math.log2 ( n ) % 1 :
    x += 1
    n -= 2 ** ( int ( math.log2 ( n ) ) )
print ( x )


```
[/PYT]

[CPP]
```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    int x = 1;
    while (log2(n) % 1 != 0) {
        x += 1;
        n -= pow(2, (int) log2(n));
    }
    cout << x << endl;
}

```
[/CPP]

[C]
```c

#include <stdio.h>
#include <math.h>

int main() {
    int n;
    scanf("%d", &n);
    int x = 1;
    while (log2(n) % 1 != 0) {
        x += 1;
        n -= pow(2, (int) log2(n));
    }
    printf("%d\n", x);
}

```
[/C]

[MAT]
```mat

function [x] = f(n)
x = 1;
while mod(log2(n), 1) ~= 0
    x = x + 1;
    n = n - 2^floor(log2(n));
end

```
[/MAT]

[HAS]
```haskell

import Data.List
import Data.Ord
import Data.Function

main = do
    n <- readLn :: IO Int
    let x = 1
    let n' = n - 2 ^ (floor $ logBase 2 $ fromIntegral n)
    print $ x + f n'

```
[/HAS]

[JAV]
```java

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        while (Math.log(n) % 1 != 0) {
            x += 1;
            n -= Math.pow(2, (int) Math.log(n));
        }
        System.out.println(x);
    }
}

```
[/JAV]

[PYT]
```py

import math
n = int ( input ( ) )
x = 1
while math.log2 ( n ) % 1 :
    x += 1
    n -= 2 ** ( int ( math.log2 ( n ) ) )
print ( x )


```
[/PYT]

[CPP]
```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    int x = 1;
    while (log2(n) % 1 != 0) {
        x += 1;
        n -= pow(2, (int) log2(n));
    }
    cout << x << endl;
}

```
[/CPP]

[C]
```c

#include <stdio.h>
#include <math.h>

int main() {
    int n;
    scanf("%d", &n);
    int x = 1;
    while (log2(n) % 1 != 0) {
        x += 1;
        n -= pow(2, (int) log2(n));
    }
    printf("%d\n", x);
}

```
[/C]

[MAT]
```mat

function [x] = f(n)
x = 1;
while mod(log2(n), 1) ~= 0
    x = x + 1;
    n = n - 2^floor(log2(n));
end

```
[/MAT]

[HAS]
```haskell

import Data.List
import Data.Ord
import Data.Function

main = do
    n <- readLn :: IO Int
    let x = 1
    let n' = n - 2 ^ (floor $ logBase 2 $ fromIntegral n)
    print $ x + f n'

```
[/HAS]

[JAV]
```java

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        while (Math.log(n) % 1 != 0) {
            x += 1;
            n -= Math.pow(2, (int) Math.log(n));
        }
        System.out.println(x);
    }
}

```
[/JAV]

[PYT]
```py

import math
n = int ( input ( ) )
x = 1
while math.log2 ( n ) % 1 :
    x += 1
    n -= 2 ** ( int ( math.log2 ( n ) ) )
print ( x )


```
[/PYT]

[CPP]
```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    int x = 1;
    while (log2(n) % 1 != 0) {
        x += 1;
        n -= pow(2, (int) log2(n));
    }
    cout << x << endl;
}

```
[/CPP]

[C]
```c

#include <stdio.h>
#include <math.h>

int main() {
    int n;
    scanf("%d", &n);
    int x = 1;
    while (log2(n) % 1 != 0) {
        x += 1;
        n -= pow(2, (int) log2(n));
    }
    printf("%d\n", x);
}

```
[/C]

[MAT]
```mat

function [x] = f(n)
x = 1;
while mod(log2(n), 1) ~= 0
    x = x + 1;
    n = n - 2^floor(log2(n));
end

```
[/MAT]

[HAS]
```haskell

import Data.List
import Data.Ord
import Data.Function

main = do
    n <- readLn :: IO Int
    let x = 1
    let n' = n - 2 ^ (floor $ logBase 2 $ fromIntegral n)
    print $ x + f n'

```
[/HAS]

[JAV]
```java

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        while (Math.log(n) % 1 != 0) {
            x += 1;
            n -= Math.pow(2, (int) Math.log(n));
        }
        System.out.println(x);
    }
}

```
[/JAV]

[PYT]
```py

import math
n = int ( input ( ) )
x = 1
while math.log2 ( n ) % 1 :
    x += 1
    n -=
