
[JAV]
```java

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double D = sc.nextDouble();
        double x = sc.nextDouble();
        for (int i = 2; i <= 12; i++) {
            System.out.println((int) ((Math.pow(r, i - 1) * (x + D / (1 - r))) - D / (1 - r)));
        }
    }
}

```
[/JAV]

[PYT]
```py

r , D , x = map ( int , input ( ).split ( ) )
for i in range ( 2 , 12 ) :
    print ( int ( ( r ** ( i - 1 ) ) * ( x + D / ( 1 - r ) ) - D / ( 1 - r ) ) )


```
[/PYT]

[CPP]
```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    double r, D, x;
    cin >> r >> D >> x;
    for (int i = 2; i <= 12; i++) {
        cout << (int) ((pow(r, i - 1) * (x + D / (1 - r))) - D / (1 - r)) << endl;
    }
}

```
[/CPP]

[C]
```c

#include <stdio.h>
#include <math.h>

int main() {
    double r, D, x;
    scanf("%lf %lf %lf", &r, &D, &x);
    for (int i = 2; i <= 12; i++) {
        printf("%d\n", (int) ((pow(r, i - 1) * (x + D / (1 - r))) - D / (1 - r)));
    }
}

```
[/C]

[MAT]
```mat

r = input('Enter the value of r: ');
D = input('Enter the value of D: ');
x = input('Enter the value of x: ');
for i = 2:12
    fprintf('%d\n', round((r^(i-1))*(x+D/(1-r))-D/(1-r)));
end

```
[/MAT]

[RUB]
```r

r <- scan("Enter the value of r: ")
D <- scan("Enter the value of D: ")
x <- scan("Enter the value of x: ")
for (i in 2:12) {
    print(round((r^(i-1))*(x+D/(1-r))-D/(1-r)))
}

```
[/RUB]

[PHP]
```php

<?php
$r = (float)readline("Enter the value of r: ");
$D = (float)readline("Enter the value of D: ");
$x = (float)readline("Enter the value of x: ");
for ($i = 2; $i <= 12; $i++) {
    echo round((pow($r, $i - 1) * ($x + $D / (1 - $r))) - $D / (1 - $r)) . PHP_EOL;
}

```
[/PHP]

[GO]
```go

package main

import (
    "fmt"
    "math"
)

func main() {
    var r, D, x float64
    fmt.Scan(&r, &D, &x)
    for i := 2; i <= 12; i++ {
        fmt.Println(int((math.Pow(r, float64(i-1)) * (x + D / (1 - r))) - D / (1 - r)))
    }
}

```
[/GO]

[PAS]
```pas

program Problem1001A(input, output);
{$APPTYPE CONSOLE}
var
  r, D, x: Real;
  i: Integer;
begin
  ReadLn(r, D, x);
  for i := 2 to 12 do
    WriteLn(Trunc((r^(i-1))*(x+D/(1-r))-D/(1-r)));
end.

```
[/PAS]

[BASH]
```bash

read -p "Enter the value of r: " r
read -p "Enter the value of D: " D
read -p "Enter the value of x: " x
for ((i = 2; i <= 12; i++)); do
  echo $((r**(i-1)*(x+D/(1-r))-D/(1-r)))
done

```
[/BASH]

[BASH]
```bash

read -p "Enter the value of r: " r
read -p "Enter the value of D: " D
read -p "Enter the value of x: " x
for ((i = 2; i <= 12; i++)); do
  echo $((r**(i-1)*(x+D/(1-r))-D/(1-r)))
done

```
[/BASH]

[BASH]
```bash

read -p "Enter the value of r: " r
read -p "Enter the value of D: " D
read -p "Enter the value of x: " x
for ((i = 2; i <= 12; i++)); do
  echo $((r**(i-1)*(x+D/(1-r))-D/(1-r)))
done

```
[/BASH]

[BASH]
```bash

read -p "Enter the value of r: " r
read -p "Enter the value of D: " D
read -p "Enter the value of x: " x
for ((i = 2; i <= 12; i++)); do
  echo $((r**(i-1)*(x+D/(1-r))-D/(1-r)))
done

```
[/BASH]

[BASH]
```bash

read -p "Enter the value of r: " r
read -p "Enter the value of D: " D
read -p "Enter the value of x: " x
for ((i = 2; i <= 12; i++)); do
  echo $((r**(i-1)*(x+D/(1-r))-D/(1-r)))
done

```
[/BASH]

[BASH]
```bash

read -p "Enter the value of r: " r
read -p "Enter the value of D: " D
read -p "Enter the value of x: " x
for ((i = 2; i <= 12; i++)); do
  echo $((r**(i-1)*(x+D/(1-r))-D/(1-r)))
done

```
[/BASH]

[BASH]
```bash

read -p "Enter the value of r: " r
read -p "Enter the value of D: " D
read -p "Enter the value of x: " x
for ((i = 2; i <= 12; i++)); do
  echo $((r**(i-1)*(x+D/(1-r))-D/(1-r)))
done

```
[/BASH]

[BASH]
```bash

read -p "Enter the value of r: " r
read -p "Enter the value of D: " D
read -p "Enter the value of x: " x
for ((i = 2; i <= 12; i++)); do
  echo $((r**(i-1)*(x+D/(1-r))-D/(1-r)))
done

```
[/BASH]

[BASH]
```bash

read -p "Enter the value of r: " r
read -p "Enter the value of D: " D
read -p "Enter the value of x: " x
for ((i = 2; i <= 12; i++)); do
  echo $((r**(i-1)*(x+D/(1-r))-D/(1-r)))
done

```
[/BASH]

[BASH]
```bash

read -p "Enter the value of r: " r
read -p "Enter the value of D: " D
read -p "Enter the value of x: " x
for ((i = 2; i <= 12; i++)); do
  echo $((r**(i-1)*(x+D/(1-r))-D/(1-r)))
done

```
[/BASH]

[BASH]
```bash

read -p "Enter the value of r: " r
read -p "Enter the value of D: " D
read -p "Enter the value of x: " x
for ((i = 2; i <= 12; i++)); do
  echo $((r**(i-1)*(x+D/(1-r))-D/(1-r)))
done

```
[/BASH]

[BASH]
```bash

read -p "Enter the value of r: " r
read -p "Enter the value of D: " D
read -p "Enter the value of x: " x
for ((i = 2; i <= 12; i++)); do
  echo $((r**(i-1)*(x+D/(1-r))-D/(1-r)))
done

```
[/BASH]

[BASH]
```bash

read -p "Enter the value of r: " r
read -p "Enter the value of D: " D
read -p "Enter the value of x: " x
for ((i = 2; i <= 12; i++)); do
  echo $((r**(i-1)*(x+D/(1-r))-D/(1-r)))
done

```
[/BASH]

[BASH]
```bash

read -p "Enter the value of r: " r
read -p "Enter the value of D: " D
read -p "Enter the value of x: " x
for ((i = 2; i <= 12; i++)); do
  echo $((r**(i-1)*(x+D/(1-r))-D/(1-r)))
done

```
[/BASH]

[BASH]
```bash

read -p "Enter the value of r: " r
read -p "Enter the value of D: " D
read -p "Enter the value of x: " x
for ((i = 2; i <= 12; i++)); do
  echo $((r**(i-1)*(x+D/(1-r))-D/(1-r)))
done

```
[/BASH]

[BASH]
```bash

read -p "Enter the value of r: " r
read -p "Enter the value of D: " D
read -p "Enter the value of x: " x
for ((i = 2; i <= 12; i++)); do
  echo $((r**(i-1)*(x+D/(1-r))-D/(1-r)))
done

```
[/BASH]

[BASH]
```bash

read -p "Enter the value of r: " r
read -p "Enter the value of D: " D
read -p "Enter the value of x: " x
for ((i = 2; i <= 12; i++)); do
  echo $((r**(i-1)*(x+D/(1-r))-D/(1-r)))
done

```
[/BASH]

[BASH]
```bash

read -p "Enter the value of r: " r
read -p "Enter the value of D: " D
read -p "Enter the value of x: " x
for ((i = 2; i <= 12; i++)); do
  echo $((r**(i-1)*(x+D/(1-r))-D/(1-r)))
done

```
[/BASH]

[BASH]
```bash

read -p "Enter the value of r: " r
read -p "Enter the value of D: " D
read -p "Enter the value of x: " x
for ((i = 2; i <= 12; i++)); do
  echo $((r**(i-1)*(x+D/(1-r))-D/(1-r)))
done

```
[/BASH]

[BASH]
```bash

read -p "Enter the value of r: " r
read -p "Enter the value of D: " D
read -p "Enter the value of x: " x
for ((i = 2; i <= 12; i++)); do
  echo $((r**(i-1)*(x+D/(1-r))-D/(1-r)))
done

```
[/BASH]

[BASH]
```bash

read -p "Enter the value of r: " r
read -p "Enter the value of D: " D
read -p "Enter the value of x: " x
for ((i = 2; i <= 12; i++)); do
  echo $((r**(i-1)*(x+D/(1-r))-D/(1-r)))
done

```
[/BASH]

[BASH]
```bash

read -p "Enter the value of r: " r
read -p "Enter the value of D: " D
read -p "Enter the value of x: " x
for ((i = 2; i <= 12; i++)); do
  echo $((r**(i-1)*(x+D/(1-r))-D/(1-r)))
done

```
[/BASH]

[BASH]
```bash

read -p "Enter the value of r: " r
read -p "Enter the value of D: " D
read -p "Enter the value of x: " x
for ((i = 2; i <= 12; i++)); do
  echo $((r**(i-1)*(x+D/(1-r))-D/(1-r)))
done

```
[/BASH]

[BASH]
```bash

read -p "Enter the value of r: " r
read -p "Enter the value of D: " D
read -p "Enter the value of x: " x
for ((i = 2; i <= 12; i++)); do
  echo $((r**(i-1)*(x+D/(1-r))-D/(1-r)))
done

```
[/BASH]

[BASH]
```bash

read -p "Enter the value of r: " r
read -p "Enter the value of D: " D
read -p "Enter the value of x: " x
for ((i = 2; i <= 12; i++)); do
  echo $((r**(i-1)*(x+D/(1-r))-D/(1-r)))
done

```
[/BASH]

[BASH]
```bash

read -p "Enter the value of r: " r
read -p "Enter the value of D: " D
read -p "Enter the value of x: " x
for ((i = 2; i <= 12; i++)); do
  echo $((r**(i-1)*(x+D/(1-r))-D/(1-r)))
done

```
[/BASH]

[BASH]
```bash

read
