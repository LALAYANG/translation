
[JAV]
```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double t = sc.nextDouble();
        double cookie = 0;
        double time = a;
        while (time <= t + 0.5) {
            cookie += b;
            time += a;
        }
        System.out.println(cookie);
    }
}

```
[/JAV]

[PYT]
```python

a, b, t = map(int, input().split())
cookie = 0
time = a
while time <= t + 0.5:
    cookie += b
    time += a
print(cookie)


```
[/PYT]

[CPP]
```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    double a, b, t;
    cin >> a >> b >> t;
    double cookie = 0;
    double time = a;
    while (time <= t + 0.5) {
        cookie += b;
        time += a;
    }
    cout << cookie << endl;
}

```
[/CPP]

[C]
```c

#include <stdio.h>

int main() {
    double a, b, t;
    scanf("%lf %lf %lf", &a, &b, &t);
    double cookie = 0;
    double time = a;
    while (time <= t + 0.5) {
        cookie += b;
        time += a;
    }
    printf("%.0lf\n", cookie);
}

```
[/C]

[MAT]
```matlab

a = input('');
b = input('');
t = input('');
cookie = 0;
time = a;
while time <= t + 0.5
    cookie = cookie + b;
    time = time + a;
end
disp(cookie)


```
[/MAT]

[RUB]
```ruby

a, b, t = gets.split.map(&:to_f)
cookie = 0
time = a
while time <= t + 0.5
    cookie += b
    time += a
end
puts cookie


```
[/RUB]

[PHP]
```php

<?php
$a = (float) trim(fgets(STDIN));
$b = (float) trim(fgets(STDIN));
$t = (float) trim(fgets(STDIN));
$cookie = 0;
$time = $a;
while ($time <= $t + 0.5) {
    $cookie += $b;
    $time += $a;
}
echo $cookie;


```
[/PHP]

[GO]
```go

package main

import (
    "fmt"
)

func main() {
    var a, b, t float64
    fmt.Scan(&a, &b, &t)
    var cookie float64
    var time float64 = a
    for time <= t+0.5 {
        cookie += b
        time += a
    }
    fmt.Println(cookie)
}


```
[/GO]

[PAS]
```pascal

program Problem;
var
  a, b, t, cookie, time: real;
begin
  readln(a, b, t);
  cookie := 0;
  time := a;
  while time <= t + 0.5 do
  begin
    cookie := cookie + b;
    time := time + a;
  end;
  writeln(cookie:0:0);
end.


```
[/PAS]

[BASH]
```bash

read a b t
cookie=0
time=$a
while [ $time -le $(echo "$t + 0.5" | bc) ]
do
  cookie=$(echo "$cookie + $b" | bc)
  time=$(echo "$time + $a" | bc)
done
echo $cookie


```
[/BASH]

[BASH]
```bash

read a b t
cookie=0
time=$a
while [ $time -le $(echo "$t + 0.5" | bc) ]
do
  cookie=$(echo "$cookie + $b" | bc)
  time=$(echo "$time + $a" | bc)
done
echo $cookie


```
[/BASH]

[BASH]
```bash

read a b t
cookie=0
time=$a
while [ $time -le $(echo "$t + 0.5" | bc) ]
do
  cookie=$(echo "$cookie + $b" | bc)
  time=$(echo "$time + $a" | bc)
done
echo $cookie


```
[/BASH]

[BASH]
```bash

read a b t
cookie=0
time=$a
while [ $time -le $(echo "$t + 0.5" | bc) ]
do
  cookie=$(echo "$cookie + $b" | bc)
  time=$(echo "$time + $a" | bc)
done
echo $cookie


```
[/BASH]

[BASH]
```bash

read a b t
cookie=0
time=$a
while [ $time -le $(echo "$t + 0.5" | bc) ]
do
  cookie=$(echo "$cookie + $b" | bc)
  time=$(echo "$time + $a" | bc)
done
echo $cookie


```
[/BASH]

[BASH]
```bash

read a b t
cookie=0
time=$a
while [ $time -le $(echo "$t + 0.5" | bc) ]
do
  cookie=$(echo "$cookie + $b" | bc)
  time=$(echo "$time + $a" | bc)
done
echo $cookie


```
[/BASH]

[BASH]
```bash

read a b t
cookie=0
time=$a
while [ $time -le $(echo "$t + 0.5" | bc) ]
do
  cookie=$(echo "$cookie + $b" | bc)
  time=$(echo "$time + $a" | bc)
done
echo $cookie


```
[/BASH]

[BASH]
```bash

read a b t
cookie=0
time=$a
while [ $time -le $(echo "$t + 0.5" | bc) ]
do
  cookie=$(echo "$cookie + $b" | bc)
  time=$(echo "$time + $a" | bc)
done
echo $cookie


```
[/BASH]

[BASH]
```bash

read a b t
cookie=0
time=$a
while [ $time -le $(echo "$t + 0.5" | bc) ]
do
  cookie=$(echo "$cookie + $b" | bc)
  time=$(echo "$time + $a" | bc)
done
echo $cookie


```
[/BASH]

[BASH]
```bash

read a b t
cookie=0
time=$a
while [ $time -le $(echo "$t + 0.5" | bc) ]
do
  cookie=$(echo "$cookie + $b" | bc)
  time=$(echo "$time + $a" | bc)
done
echo $cookie


```
[/BASH]

[BASH]
```bash

read a b t
cookie=0
time=$a
while [ $time -le $(echo "$t + 0.5" | bc) ]
do
  cookie=$(echo "$cookie + $b" | bc)
  time=$(echo "$time + $a" | bc)
done
echo $cookie


```
[/BASH]

[BASH]
```bash

read a b t
cookie=0
time=$a
while [ $time -le $(echo "$t + 0.5" | bc) ]
do
  cookie=$(echo "$cookie + $b" | bc)
  time=$(echo "$time + $a" | bc)
done
echo $cookie


```
[/BASH]

[BASH]
```bash

read a b t
cookie=0
time=$a
while [ $time -le $(echo "$t + 0.5" | bc) ]
do
  cookie=$(echo "$cookie + $b" | bc)
  time=$(echo "$time + $a" | bc)
done
echo $cookie


```
[/BASH]

[BASH]
```bash

read a b t
cookie=0
time=$a
while [ $time -le $(echo "$t + 0.5" | bc) ]
do
  cookie=$(echo "$cookie + $b" | bc)
  time=$(echo "$time + $a" | bc)
done
echo $cookie


```
[/BASH]

[BASH]
```bash

read a b t
cookie=0
time=$a
while [ $time -le $(echo "$t + 0.5" | bc) ]
do
  cookie=$(echo "$cookie + $b" | bc)
  time=$(echo "$time + $a" | bc)
done
echo $cookie


```
[/BASH]

[BASH]
```bash

read a b t
cookie=0
time=$a
while [ $time -le $(echo "$t + 0.5" | bc) ]
do
  cookie=$(echo "$cookie + $b" | bc)
  time=$(echo "$time + $a" | bc)
done
echo $cookie


```
[/BASH]

[BASH]
```bash

read a b t
cookie=0
time=$a
while [ $time -le $(echo "$t + 0.5" | bc) ]
do
  cookie=$(echo "$cookie + $b" | bc)
  time=$(echo "$time + $a" | bc)
done
echo $cookie


```
[/BASH]

[BASH]
```bash

read a b t
cookie=0
time=$a
while [ $time -le $(echo "$t + 0.5" | bc) ]
do
  cookie=$(echo "$cookie + $b" | bc)
  time=$(echo "$time + $a" | bc)
done
echo $cookie


```
[/BASH]

[BASH]
```bash

read a b t
cookie=0
time=$a
while [ $time -le $(echo "$t + 0.5" | bc) ]
do
  cookie=$(echo "$cookie + $b" | bc)
  time=$(echo "$time + $a" | bc)
done
echo $cookie


```
[/BASH]

[BASH]
```bash

read a b t
cookie=0
time=$a
while [ $time -le $(echo "$t + 0.5" | bc) ]
do
  cookie=$(echo "$cookie + $b" | bc)
  time=$(echo "$time + $a" | bc)
done
echo $cookie


```
[/BASH]

[BASH]
```bash

read a b t
cookie=0
time=$a
while [ $time -le $(echo "$t + 0.5" | bc) ]
do
  cookie=$(echo "$cookie + $b" | bc)
  time=$(echo "$time + $a" | bc)
done
echo $cookie


```
[/BASH]

[BASH]
```bash

read a b t
cookie=0
time=$a
while [ $time -le $(echo "$t + 0.5" | bc) ]
do
  cookie=$(echo "$cookie + $b" | bc)
  time=$(echo "$time + $a" | bc)
done
echo $cookie


```
[/BASH]

[BASH]
```bash

read a b t
cookie=0
time=$a
while [ $time -le $(echo "$t + 0.5" | bc) ]
do
  cookie=$(echo "$cookie + $b" | bc)
  time=$(echo "$time + $a" | bc)
done
echo $cookie


```
[/BASH]

[BASH]
```bash

read a b t
cookie=0
time=$a
while [ $time -le $(echo "$t + 0.5" | bc) ]
do
  cookie=$(echo "$cookie + $b" | bc)
  time=$(echo "$time + $a" | bc)
done
echo $cookie


```
[/BASH]

[BASH]
```bash

read a b t
cookie=0
time=$a
while [ $time -le $(echo "$t + 0.5" | bc) ]
do
  cookie=$(echo "$cookie + $b" | bc)
  time=$(echo "$time + $a" | bc)
done
echo $cookie


```
[/BASH]

[BASH]
```bash

read a b t
cookie=0
time=$a
while [ $time -le $(echo "$t + 0.5" | bc) ]
do
  cookie=$(echo "$cookie + $b" | bc)
  time=$(echo "$time + $a" | bc)
done
echo $cookie


```
[/BASH]

[BASH]
```bash

read a b t
cookie=0
time=$a
while [ $time -le $(echo "$t + 0.5" | bc) ]
do
  cookie=$(echo "$cookie + $b" | bc)
  time=$(echo "$time + $a" | bc)
done
echo $cookie


```
[/BASH]

[BASH]
```bash

read a b t
cookie=0
time=$a
while [ $time -le $(echo "$t + 0.5" | bc) ]
do
  cookie=$(echo "$cookie + $b" | bc)
  time=$(echo "$time + $a" | bc)
done
echo $cookie


```
[/BASH]

[BASH]
```bash

read a b t
cookie=0
time=$a
while [ $time -le $(echo "$t + 0.5" | bc) ]
do
  cookie=$(echo "$cookie + $b" | bc)
  time=$(echo "$time + $a" | bc)
done
echo $cookie


```
[/BASH]

[BASH]
```bash

read a b t
cookie=0
time=$a
while [ $time -le $(echo "$t + 0.5" | bc) ]
do
  cookie=$(echo "$cookie + $b" | bc)
  time=$(echo "$time + $a" | bc)
done
echo $cookie


```
[/BASH]

[BASH]
```bash

read a b t
cookie=0
time=$a
while [ $time -le $(echo "$t + 0.5" | bc) ]
do
  cookie=$(echo "$cookie + $b" | bc)
  time=$(echo "$time + $a" | bc)
done
echo $cookie


```
[/BASH]

[BASH]
```bash

read a b t
cookie=0
time=$a
while [ $time -le $(echo "$t + 0.5" | bc) ]
do
  cookie=$(echo "$cookie + $b" | bc)
  time=$(echo "$time + $a" | bc)
done
echo $cookie


```
[/BASH]

[BASH]
```bash

read a b t
cookie=0
time
