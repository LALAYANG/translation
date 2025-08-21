
[JAV]
```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n % 2 == 0) {
            n /= 2;
        }
        if (n == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

```
[/JAV]

[PYT]
```py

n = int(input())
while n % 2 == 0:
    n /= 2
if n == 1:
    print("YES")
else:
    print("NO")

```
[/PYT]

[CPP]
```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    while (n % 2 == 0) {
        n /= 2;
    }
    if (n == 1) {
        cout << "YES" << endl;
    } else {
        cout << "NO" << endl;
    }
}

```
[/CPP]

[C]
```c

#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    while (n % 2 == 0) {
        n /= 2;
    }
    if (n == 1) {
        printf("YES\n");
    } else {
        printf("NO\n");
    }
}

```
[/C]

[MAT]
```matlab

n = input('');
while mod(n, 2) == 0
    n = n / 2;
end
if n == 1
    disp('YES');
else
    disp('NO');
end

```
[/MAT]

[RUB]
```ruby

n = gets.to_i
while n % 2 == 0
    n /= 2
end
if n == 1
    puts 'YES'
else
    puts 'NO'
end

```
[/RUB]

[PHP]
```php

<?php
$n = (int) fgets(STDIN);
while ($n % 2 == 0) {
    $n /= 2;
}
if ($n == 1) {
    echo 'YES' . PHP_EOL;
} else {
    echo 'NO' . PHP_EOL;
}

```
[/PHP]

[GO]
```go

package main

import (
    "fmt"
)

func main() {
    var n int
    fmt.Scan(&n)
    for n%2 == 0 {
        n /= 2
    }
    if n == 1 {
        fmt.Println("YES")
    } else {
        fmt.Println("NO")
    }
}

```
[/GO]

[PAS]
```pascal

program Problem;
var
  n: Integer;
begin
  Read(n);
  while n mod 2 = 0 do
    n := n div 2;
  if n = 1 then
    WriteLn('YES')
  else
    WriteLn('NO');
end.

```
[/PAS]

[BASH]
```bash

read -p "Enter a number: " n
while (( $n % 2 == 0 )); do
    n=$(( $n / 2 ))
done
if (( $n == 1 )); then
    echo "YES"
else
    echo "NO"
fi

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
while (( $n % 2 == 0 )); do
    n=$(( $n / 2 ))
done
if (( $n == 1 )); then
    echo "YES"
else
    echo "NO"
fi

```
[/BASH]

[JAVA]
```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n % 2 == 0) {
            n /= 2;
        }
        if (n == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

```
[/JAVA]

[PYTHON]
```python

n = int(input())
while n % 2 == 0:
    n /= 2
if n == 1:
    print("YES")
else:
    print("NO")

```
[/PYTHON]

[C++]
```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    while (n % 2 == 0) {
        n /= 2;
    }
    if (n == 1) {
        cout << "YES" << endl;
    } else {
        cout << "NO" << endl;
    }
}

```
[/C++]

[C]
```c

#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    while (n % 2 == 0) {
        n /= 2;
    }
    if (n == 1) {
        printf("YES\n");
    } else {
        printf("NO\n");
    }
}

```
[/C]

[MATLAB]
```matlab

n = input('');
while mod(n, 2) == 0
    n = n / 2;
end
if n == 1
    disp('YES');
else
    disp('NO');
end

```
[/MATLAB]

[RUBY]
```ruby

n = gets.to_i
while n % 2 == 0
    n /= 2
end
if n == 1
    puts 'YES'
else
    puts 'NO'
end

```
[/RUBY]

[PHP]
```php

<?php
$n = (int) fgets(STDIN);
while ($n % 2 == 0) {
    $n /= 2;
}
if ($n == 1) {
    echo 'YES' . PHP_EOL;
} else {
    echo 'NO' . PHP_EOL;
}

```
[/PHP]

[GO]
```go

package main

import (
    "fmt"
)

func main() {
    var n int
    fmt.Scan(&n)
    for n%2 == 0 {
        n /= 2
    }
    if n == 1 {
        fmt.Println("YES")
    } else {
        fmt.Println("NO")
    }
}

```
[/GO]

[PASCAL]
```pascal

program Problem;
var
  n: Integer;
begin
  Read(n);
  while n mod 2 = 0 do
    n := n div 2;
  if n = 1 then
    WriteLn('YES')
  else
    WriteLn('NO');
end.

```
[/PASCAL]

[BASH]
```bash

read -p "Enter a number: " n
while (( $n % 2 == 0 )); do
    n=$(( $n / 2 ))
done
if (( $n == 1 )); then
    echo "YES"
else
    echo "NO"
fi

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
while (( $n % 2 == 0 )); do
    n=$(( $n / 2 ))
done
if (( $n == 1 )); then
    echo "YES"
else
    echo "NO"
fi

```
[/BASH]

[JAVA]
```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n % 2 == 0) {
            n /= 2;
        }
        if (n == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

```
[/JAVA]

[PYTHON]
```python

n = int(input())
while n % 2 == 0:
    n /= 2
if n == 1:
    print("YES")
else:
    print("NO")

```
[/PYTHON]

[C++]
```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    while (n % 2 == 0) {
        n /= 2;
    }
    if (n == 1) {
        cout << "YES" << endl;
    } else {
        cout << "NO" << endl;
    }
}

```
[/C++]

[C]
```c

#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    while (n % 2 == 0) {
        n /= 2;
    }
    if (n == 1) {
        printf("YES\n");
    } else {
        printf("NO\n");
    }
}

```
[/C]

[MATLAB]
```matlab

n = input('');
while mod(n, 2) == 0
    n = n / 2;
end
if n == 1
    disp('YES');
else
    disp('NO');
end

```
[/MATLAB]

[RUBY]
```ruby

n = gets.to_i
while n % 2 == 0
    n /= 2
end
if n == 1
    puts 'YES'
else
    puts 'NO'
end

```
[/RUBY]

[PHP]
```php

<?php
$n = (int) fgets(STDIN);
while ($n % 2 == 0) {
    $n /= 2;
}
if ($n == 1) {
    echo 'YES' . PHP_EOL;
} else {
    echo 'NO' . PHP_EOL;
}

```
[/PHP]

[GO]
```go

package main

import (
    "fmt"
)

func main() {
    var n int
    fmt.Scan(&n)
    for n%2 == 0 {
        n /= 2
    }
    if n == 1 {
        fmt.Println("YES")
    } else {
        fmt.Println("NO")
    }
}

```
[/GO]

[PASCAL]
```pascal

program Problem;
var
  n: Integer;
begin
  Read(n);
  while n mod 2 = 0 do
    n := n div 2;
  if n = 1 then
    WriteLn('YES')
  else
    WriteLn('NO');
end.

```
[/PASCAL]

[BASH]
```bash

read -p "Enter a number: " n
while (( $n % 2 == 0 )); do
    n=$(( $n / 2 ))
done
if (( $n == 1 )); then
    echo "YES"
else
    echo "NO"
fi

```
[/BASH]

[BASH]
```bash

read -p "Enter a number: " n
while (( $n % 2 == 0 )); do
    n=$(( $n / 2 ))
done
if (( $n == 1 )); then
    echo "YES"
else
    echo "NO"
fi

```
[/BASH]

[JAVA]
```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n % 2 == 0) {
            n /= 2;
        }
        if (n == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

```
[/JAVA]

[PYTHON]
```python

n = int(input())
while n % 2 == 0:
    n /= 2
if n == 1:
    print("YES")
else:
    print("NO")

```
[/PYTHON]

[C++]
```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    while (n % 2 == 0) {
        n /= 2;
    }
    if (n == 1) {
        cout << "YES" << endl;
    } else {
        cout << "NO" << endl;
    }
}

```
[/C++]

[C]
```c

#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    while (n % 2 == 0) {
        n /= 2;
    }
    if (n == 1) {
        printf("YES\n");
    } else {
        printf("NO\n");
    }
}

```
[/C]

[MATLAB]
```matlab

n = input('');
while mod(n, 2) == 0
    n = n / 2;
end
if n == 1
    disp('YES');
else
    disp('NO');
end

```
[/MATLAB]

[RUBY]
```ruby

n = gets.to_i
while n % 2 == 0
    n /= 2
end
if n == 1
    puts 'YES'
else
    puts 'NO'
end

```
[/RUBY]

[PHP]
```php

<?php
$n = (int) fgets(STDIN);
while ($n % 2 == 0) {
    $n /= 2;
}
if ($n == 1) {
    echo 'YES' . PHP_EOL;
} else {
    echo 'NO' . PHP_EOL;
}

```
[/PHP]

[GO]
```go

package main

import (
    "fmt"
)

func main() {
    var n int
    fmt.Scan(&n)
    for n%2 == 0 {
        n /= 2
    }
    if n == 1 {
        fmt.Println("YES")
    } else {
        fmt.Println("NO")
    }
}

```
[/GO]

[PASCAL]
```pascal

program Problem;
var
  n: Integer;
begin
  Read(n);
  while n mod 2 = 0 do
    n := n div 2;
  if n = 1 then
    WriteLn('YES')
  else
    WriteLn('NO');
end.

```
[/PASCAL]

[BASH]
```bash

read -p "Enter a
