
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int minimumValue = sc.nextInt();
        int k = sc.nextInt();
        int lo = 0;
        int hi = (int) 1e18;
        while (hi - lo > 1) {
            int md = (lo + hi) / 2;
            int c = sumOfDigits(minimumValue + md - 1) - sumOfDigits(minimumValue - 1);
            if (conditionalCheckerC(md) && conditionalCheckerF(md)) {
                if (conditionalCheckerA(md) && conditionalCheckerD(md)) {
                    if (conditionalCheckerE(md) && conditionalCheckerB(md)) {
                        if (c * k <= w) {
                            lo = md;
                        } else {
                            hi = md;
                        }
                    }
                }
            }
        }
        System.out.println(lo);
    }

    public static int sumOfDigits(int k) {
        int ret = 0;
        int pw = 10;
        int len = 1;
        while (true) {
            int cur = Math.min(pw - 1, k);
            int prev = pw / 10;
            ret += (cur - prev + 1) * len;
            if (pw - 1 >= k) {
                break;
            }
            len += 1;
            pw *= 10;
        }
        return ret;
    }

    public static boolean conditionalCheckerC(int md) {
        return (md & 1) == 0;
    }

    public static boolean conditionalCheckerF(int md) {
        return (md & 1) == 1;
    }

    public static boolean conditionalCheckerA(int md) {
        return (md & 2) == 0;
    }

    public static boolean conditionalCheckerD(int md) {
        return (md & 2) == 2;
    }

    public static boolean conditionalCheckerE(int md) {
        return (md & 4) == 0;
    }

    public static boolean conditionalCheckerB(int md) {
        return (md & 4) == 4;
    }
}
```
[/JAV]

[PY]
```python
import sys

def sumOfDigits(k):
    ret = 0
    pw = 10
    len = 1
    while 1 == 1:
        cur = min(pw - 1, k)
        prev = pw // 10
        ret += (cur - prev + 1) * len
        if pw - 1 >= k:
            break
        len += 1
        pw *= 10
    return ret

w, minimumValue, k = map(int, sys.stdin.readline().split())
lo = 0
hi = int(1e+18)
while hi - lo > 1:
    md = (lo + hi) // 2
    c = sumOfDigits(minimumValue + md - 1) - sumOfDigits(minimumValue - 1)
    if conditionalCheckerC(md) and conditionalCheckerF(md):
        if conditionalCheckerA(md) and conditionalCheckerD(md):
            if conditionalCheckerE(md) and conditionalCheckerB(md):
                if c * k <= w:
                    lo = md
                else:
                    hi = md
print(lo)

def conditionalCheckerC(md):
    return (md & 1) == 0

def conditionalCheckerF(md):
    return (md & 1) == 1

def conditionalCheckerA(md):
    return (md & 2) == 0

def conditionalCheckerD(md):
    return (md & 2) == 2

def conditionalCheckerE(md):
    return (md & 4) == 0

def conditionalCheckerB(md):
    return (md & 4) == 4
```
[/PY]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int sumOfDigits(int k) {
    int ret = 0;
    int pw = 10;
    int len = 1;
    while (1 == 1) {
        int cur = k < pw - 1 ? k : pw - 1;
        int prev = pw / 10;
        ret += (cur - prev + 1) * len;
        if (pw - 1 >= k) {
            break;
        }
        len += 1;
        pw *= 10;
    }
    return ret;
}

bool conditionalCheckerC(int md) {
    return (md & 1) == 0;
}

bool conditionalCheckerF(int md) {
    return (md & 1) == 1;
}

bool conditionalCheckerA(int md) {
    return (md & 2) == 0;
}

bool conditionalCheckerD(int md) {
    return (md & 2) == 2;
}

bool conditionalCheckerE(int md) {
    return (md & 4) == 0;
}

bool conditionalCheckerB(int md) {
    return (md & 4) == 4;
}

int main() {
    int w, minimumValue, k;
    scanf("%d %d %d", &w, &minimumValue, &k);
    int lo = 0;
    int hi = (int) 1e18;
    while (hi - lo > 1) {
        int md = (lo + hi) / 2;
        int c = sumOfDigits(minimumValue + md - 1) - sumOfDigits(minimumValue - 1);
        if (conditionalCheckerC(md) && conditionalCheckerF(md)) {
            if (conditionalCheckerA(md) && conditionalCheckerD(md)) {
                if (conditionalCheckerE(md) && conditionalCheckerB(md)) {
                    if (c * k <= w) {
                        lo = md;
                    } else {
                        hi = md;
                    }
                }
            }
        }
    }
    printf("%d\n", lo);
    return 0;
}
```
[/C]

[CPP]
```cpp
#include <bits/stdc++.h>
using namespace std;

int sumOfDigits(int k) {
    int ret = 0;
    int pw = 10;
    int len = 1;
    while (1 == 1) {
        int cur = k < pw - 1 ? k : pw - 1;
        int prev = pw / 10;
        ret += (cur - prev + 1) * len;
        if (pw - 1 >= k) {
            break;
        }
        len += 1;
        pw *= 10;
    }
    return ret;
}

bool conditionalCheckerC(int md) {
    return (md & 1) == 0;
}

bool conditionalCheckerF(int md) {
    return (md & 1) == 1;
}

bool conditionalCheckerA(int md) {
    return (md & 2) == 0;
}

bool conditionalCheckerD(int md) {
    return (md & 2) == 2;
}

bool conditionalCheckerE(int md) {
    return (md & 4) == 0;
}

bool conditionalCheckerB(int md) {
    return (md & 4) == 4;
}

int main() {
    int w, minimumValue, k;
    cin >> w >> minimumValue >> k;
    int lo = 0;
    int hi = (int) 1e18;
    while (hi - lo > 1) {
        int md = (lo + hi) / 2;
        int c = sumOfDigits(minimumValue + md - 1) - sumOfDigits(minimumValue - 1);
        if (conditionalCheckerC(md) && conditionalCheckerF(md)) {
            if (conditionalCheckerA(md) && conditionalCheckerD(md)) {
                if (conditionalCheckerE(md) && conditionalCheckerB(md)) {
                    if (c * k <= w) {
                        lo = md;
                    } else {
                        hi = md;
                    }
                }
            }
        }
    }
    cout << lo << endl;
    return 0;
}
```
[/CPP]

[GO]
```go
package main

import (
	"fmt"
)

func sumOfDigits(k int) int {
	ret := 0
	pw := 10
	len := 1
	for 1 == 1 {
		cur := k
		if k < pw-1 {
			cur = k
		} else {
			cur = pw - 1
		}
		prev := pw / 10
		ret += (cur - prev + 1) * len
		if pw-1 >= k {
			break
		}
		len += 1
		pw *= 10
	}
	return ret
}

func conditionalCheckerC(md int) bool {
	return (md & 1) == 0
}

func conditionalCheckerF(md int) bool {
	return (md & 1) == 1
}

func conditionalCheckerA(md int) bool {
	return (md & 2) == 0
}

func conditionalCheckerD(md int) bool {
	return (md & 2) == 2
}

func conditionalCheckerE(md int) bool {
	return (md & 4) == 0
}

func conditionalCheckerB(md int) bool {
	return (md & 4) == 4
}

func main() {
	var w, minimumValue, k int
	fmt.Scan(&w, &minimumValue, &k)
	lo := 0
	hi := int(1e18)
	for hi-lo > 1 {
		md := (lo + hi) / 2
		c := sumOfDigits(minimumValue+md-1) - sumOfDigits(minimumValue-1)
		if conditionalCheckerC(md) && conditionalCheckerF(md) {
			if conditionalCheckerA(md) && conditionalCheckerD(md) {
				if conditionalCheckerE(md) && conditionalCheckerB(md) {
					if c*k <= w {
						lo = md
					} else {
						hi = md
					}
				}
			}
		}
	}
	fmt.Println(lo)
}
```
[/GO]

[RB]
```ruby
def sumOfDigits(k)
    ret = 0
    pw = 10
    len = 1
    while 1 == 1
        cur = k < pw - 1 ? k : pw - 1
        prev = pw / 10
        ret += (cur - prev + 1) * len
        if pw - 1 >= k
            break
        end
        len += 1
        pw *= 10
    end
    return ret
end

w, minimumValue, k = gets.split.map(&:to_i)
lo = 0
hi = 1e18
while hi - lo > 1
    md = (lo + hi) / 2
    c = sumOfDigits(minimumValue + md - 1) - sumOfDigits(minimumValue - 1)
    if conditionalCheckerC(md) && conditionalCheckerF(md)
        if conditionalCheckerA(md) && conditionalCheckerD(md)
            if conditionalCheckerE(md) && conditionalCheckerB(md)
                if c * k <= w
                    lo = md
                else
                    hi = md
                end
            end
        end
    end
end
puts lo

def conditionalCheckerC(md)
    return (md & 1) == 0
end

def conditionalCheckerF(md)
    return (md & 1) == 1
end

def conditionalCheckerA(md)
    return (md & 2) == 0
end

def conditionalCheckerD(md)
    return (md & 2) == 2
end

def conditionalCheckerE(md)
    return (md & 4) == 0
end

def conditionalCheckerB(md)
    return (md & 4) == 4
end
```
[/RB]

[PHP]
```php
<?php
function sumOfDigits($k) {
    $ret = 0;
    $pw = 10;
    $len = 1;
    while (1 == 1) {
        $cur = $k < $pw - 1 ? $k : $pw - 1;
        $prev = $pw / 10;
        $ret += ($cur - $prev + 1) * $len;
        if ($pw - 1 >= $k) {
            break;
        }
        $len += 1;
        $pw *= 10;
    }
    return $ret;
}

list($w, $minimumValue, $k) = explode(' ', readline());
$lo = 0;
$hi = (int) 1e18;
while ($hi - $lo > 1) {
    $md = ($lo + $hi) / 2;
    $c = sumOfDigits($minimumValue + $md - 1) - sumOfDigits($minimumValue - 1);
    if (conditionalCheckerC($md) && conditionalCheckerF($md)) {
        if (conditionalCheckerA($md) && conditionalCheckerD($md)) {
            if (conditionalCheckerE($md) && conditionalCheckerB($md)) {
                if ($c * $k <= $w) {
                    $lo = $md;
                } else {
                    $hi = $md;
                }
            }
        }
    }
}
echo $lo;

function conditionalCheckerC($md) {
    return ($md & 1) ==
