
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start_index = sc.nextInt();
        boolean[] prime = new boolean[100010];
        prime[0] = false;
        prime[1] = false;
        for (int i = 4; i < 100010; i += 2) {
            prime[i] = false;
        }
        int i = 3;
        while (i * i <= 100008) {
            boolean check115 = true;
            boolean check215 = true;
            boolean check113 = true;
            boolean check213 = true;
            boolean check111 = true;
            boolean check211 = true;
            if (check115 & check215) {
                if (check113 & check213) {
                    if (check111 & check211) {
                        if (prime[i]) {
                            for (int prime_index = i + i; prime_index < 100008; prime_index += i) {
                                prime[prime_index] = false;
                            }
                        }
                    }
                }
            }
            i = i + 2;
        }
        boolean check125 = true;
        boolean check225 = true;
        for (int i = start_index; i < 100008; i++) {
            if (check125 & check225) {
                if (prime[i]) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
```
[/JAV]

[PYT]
```python
import sys

start_index = int(sys.stdin.readline())
prime = [True] * 100010
prime[0] = False
prime[1] = False
for i in range(4, 100010, 2):
    prime[i] = False
i = 3
while i * i <= 100008:
    check115 = True
    check215 = True
    check113 = True
    check213 = True
    check111 = True
    check211 = True
    if check115 & check215:
        if check113 & check213:
            if check111 & check211:
                if prime[i]:
                    for prime_index in range(i + i, 100008, i):
                        prime[prime_index] = False
    i = i + 2
check125 = True
check225 = True
for i in range(start_index, 100008):
    if check125 & check225:
        if prime[i]:
            print(i)
            break
```
[/PYT]

[C++]
```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int start_index;
    cin >> start_index;
    bool prime[100010];
    memset(prime, true, sizeof(prime));
    prime[0] = false;
    prime[1] = false;
    for (int i = 4; i < 100010; i += 2) {
        prime[i] = false;
    }
    int i = 3;
    while (i * i <= 100008) {
        bool check115 = true;
        bool check215 = true;
        bool check113 = true;
        bool check213 = true;
        bool check111 = true;
        bool check211 = true;
        if (check115 & check215) {
            if (check113 & check213) {
                if (check111 & check211) {
                    if (prime[i]) {
                        for (int prime_index = i + i; prime_index < 100008; prime_index += i) {
                            prime[prime_index] = false;
                        }
                    }
                }
            }
        }
        i = i + 2;
    }
    bool check125 = true;
    bool check225 = true;
    for (int i = start_index; i < 100008; i++) {
        if (check125 & check225) {
            if (prime[i]) {
                cout << i << endl;
                break;
            }
        }
    }
}
```
[/C++]

[C]
```c
#include <stdio.h>
#include <stdbool.h>

int main() {
    int start_index;
    scanf("%d", &start_index);
    bool prime[100010];
    for (int i = 0; i < 100010; i++) {
        prime[i] = true;
    }
    prime[0] = false;
    prime[1] = false;
    for (int i = 4; i < 100010; i += 2) {
        prime[i] = false;
    }
    int i = 3;
    while (i * i <= 100008) {
        bool check115 = true;
        bool check215 = true;
        bool check113 = true;
        bool check213 = true;
        bool check111 = true;
        bool check211 = true;
        if (check115 & check215) {
            if (check113 & check213) {
                if (check111 & check211) {
                    if (prime[i]) {
                        for (int prime_index = i + i; prime_index < 100008; prime_index += i) {
                            prime[prime_index] = false;
                        }
                    }
                }
            }
        }
        i = i + 2;
    }
    bool check125 = true;
    bool check225 = true;
    for (int i = start_index; i < 100008; i++) {
        if (check125 & check225) {
            if (prime[i]) {
                printf("%d\n", i);
                break;
            }
        }
    }
}
```
[/C]

[PHP]
```php
<?php
$start_index = intval(fgets(STDIN));
$prime = array_fill(0, 100010, true);
$prime[0] = false;
$prime[1] = false;
for ($i = 4; $i < 100010; $i += 2) {
    $prime[$i] = false;
}
$i = 3;
while ($i * $i <= 100008) {
    $check115 = true;
    $check215 = true;
    $check113 = true;
    $check213 = true;
    $check111 = true;
    $check211 = true;
    if ($check115 & $check215) {
        if ($check113 & $check213) {
            if ($check111 & $check211) {
                if ($prime[$i]) {
                    for ($prime_index = $i + $i; $prime_index < 100008; $prime_index += $i) {
                        $prime[$prime_index] = false;
                    }
                }
            }
        }
    }
    $i = $i + 2;
}
$check125 = true;
$check225 = true;
for ($i = $start_index; $i < 100008; $i++) {
    if ($check125 & $check225) {
        if ($prime[$i]) {
            echo $i . PHP_EOL;
            break;
        }
    }
}
```
[/PHP]

[RUBY]
```ruby
start_index = gets.to_i
prime = Array.new(100010, true)
prime[0] = false
prime[1] = false
for i in 4..100010 do
    prime[i] = false if i % 2 == 0
end
i = 3
while i * i <= 100008
    check115 = true
    check215 = true
    check113 = true
    check213 = true
    check111 = true
    check211 = true
    if check115 & check215
        if check113 & check213
            if check111 & check211
                if prime[i]
                    for prime_index in i + i..100008 do
                        prime[prime_index] = false if prime_index % i == 0
                    end
                end
            end
        end
    end
    i = i + 2
end
check125 = true
check225 = true
for i in start_index..100008 do
    if check125 & check225
        if prime[i]
            puts i
            break
        end
    end
end
```
[/RUBY]

[GO]
```go
package main

import (
    "fmt"
)

func main() {
    var start_index int
    fmt.Scan(&start_index)
    prime := make([]bool, 100010)
    for i := 0; i < 100010; i++ {
        prime[i] = true
    }
    prime[0] = false
    prime[1] = false
    for i := 4; i < 100010; i += 2 {
        prime[i] = false
    }
    i := 3
    for i * i <= 100008 {
        check115 := true
        check215 := true
        check113 := true
        check213 := true
        check111 := true
        check211 := true
        if check115 & check215 {
            if check113 & check213 {
                if check111 & check211 {
                    if prime[i] {
                        for prime_index := i + i; prime_index < 100008; prime_index += i {
                            prime[prime_index] = false
                        }
                    }
                }
            }
        }
        i = i + 2
    }
    check125 := true
    check225 := true
    for i := start_index; i < 100008; i++ {
        if check125 & check225 {
            if prime[i] {
                fmt.Println(i)
                break
            }
        }
    }
}
```
[/GO]

[BASH]
```bash
read start_index
prime=(true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true true
