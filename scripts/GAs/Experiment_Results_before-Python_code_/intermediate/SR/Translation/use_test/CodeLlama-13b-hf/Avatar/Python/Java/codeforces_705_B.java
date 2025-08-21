
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }
        int c = 2;
        for (int i = 0; i < n; i++) {
            if (w[i] == 1) {
                System.out.println(c);
            } else if (w[i] % 2 == 0) {
                c = 3 - c;
                System.out.println(c);
            } else {
                System.out.println(c);
            }
        }
    }
}

```
[/JAV]

[PY]
```python
import sys
input = sys.stdin.readline
n = int ( input ( ) )
w = list ( map ( int , input ( ).split ( ) ) )
c = 2
for i in w :
    if i == 1 :
        print ( c )
    elif i % 2 == 0 :
        c = 3 - c
        print ( c )
    else :
        print ( c )


```
[/PY]

[C]
```c
#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    int w[n];
    for (int i = 0; i < n; i++) {
        scanf("%d", &w[i]);
    }
    int c = 2;
    for (int i = 0; i < n; i++) {
        if (w[i] == 1) {
            printf("%d\n", c);
        } else if (w[i] % 2 == 0) {
            c = 3 - c;
            printf("%d\n", c);
        } else {
            printf("%d\n", c);
        }
    }
}

```
[/C]

[CPP]
```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    int w[n];
    for (int i = 0; i < n; i++) {
        cin >> w[i];
    }
    int c = 2;
    for (int i = 0; i < n; i++) {
        if (w[i] == 1) {
            cout << c << endl;
        } else if (w[i] % 2 == 0) {
            c = 3 - c;
            cout << c << endl;
        } else {
            cout << c << endl;
        }
    }
}

```
[/CPP]

[C#]
```csharp
using System;

class Solution
{
    static void Main(String[] args)
    {
        int n = Convert.ToInt32(Console.ReadLine());
        int[] w = Array.ConvertAll(Console.ReadLine().Split(' '), wTemp => Convert.ToInt32(wTemp));
        int c = 2;
        for (int i = 0; i < n; i++)
        {
            if (w[i] == 1)
            {
                Console.WriteLine(c);
            }
            else if (w[i] % 2 == 0)
            {
                c = 3 - c;
                Console.WriteLine(c);
            }
            else
            {
                Console.WriteLine(c);
            }
        }
    }
}

```
[/C#]

[PHP]
```php
<?php

$handle = fopen ("php://stdin","r");
fscanf($handle,"%d",$n);
$w = explode(" ",$_ = fgets($handle));
$c = 2;
for($i = 0; $i < $n; $i++){
    if($w[$i] == 1){
        echo $c."\n";
    }else if($w[$i] % 2 == 0){
        $c = 3 - $c;
        echo $c."\n";
    }else{
        echo $c."\n";
    }
}

?>

```
[/PHP]

[RUBY]
```ruby
n = gets.to_i
w = gets.split.map(&:to_i)
c = 2
for i in 0..n-1
    if w[i] == 1
        puts c
    elsif w[i] % 2 == 0
        c = 3 - c
        puts c
    else
        puts c
    end
end

```
[/RUBY]

[GO]
```go
package main

import "fmt"

func main() {
    var n int
    fmt.Scan(&n)
    w := make([]int, n)
    for i := 0; i < n; i++ {
        fmt.Scan(&w[i])
    }
    c := 2
    for i := 0; i < n; i++ {
        if w[i] == 1 {
            fmt.Println(c)
        } else if w[i]%2 == 0 {
            c = 3 - c
            fmt.Println(c)
        } else {
            fmt.Println(c)
        }
    }
}

```
[/GO]

[PAS]
```pascal
program Problem1001A;
{$APPTYPE CONSOLE}
var
  n: Integer;
  w: array of Integer;
  c: Integer;
  i: Integer;
begin
  ReadLn(n);
  SetLength(w, n);
  for i := 0 to n - 1 do
    Read(w[i]);
  c := 2;
  for i := 0 to n - 1 do
    if w[i] = 1 then
      WriteLn(c)
    else if w[i] mod 2 = 0 then
    begin
      c := 3 - c;
      WriteLn(c);
    end
    else
      WriteLn(c);
end.

```
[/PAS]

[BASH]
```bash
read n
read -a w
c=2
for ((i=0; i<n; i++)); do
    if [ ${w[i]} -eq 1 ]; then
        echo $c
    elif [ $((w[i] % 2)) -eq 0 ]; then
        c=$((3 - c))
        echo $c
    else
        echo $c
    fi
done

```
[/BASH]

[BASH]
```bash
read n
read -a w
c=2
for ((i=0; i<n; i++)); do
    if [ ${w[i]} -eq 1 ]; then
        echo $c
    elif [ $((w[i] % 2)) -eq 0 ]; then
        c=$((3 - c))
        echo $c
    else
        echo $c
    fi
done

```
[/BASH]

[BASH]
```bash
read n
read -a w
c=2
for ((i=0; i<n; i++)); do
    if [ ${w[i]} -eq 1 ]; then
        echo $c
    elif [ $((w[i] % 2)) -eq 0 ]; then
        c=$((3 - c))
        echo $c
    else
        echo $c
    fi
done

```
[/BASH]

[BASH]
```bash
read n
read -a w
c=2
for ((i=0; i<n; i++)); do
    if [ ${w[i]} -eq 1 ]; then
        echo $c
    elif [ $((w[i] % 2)) -eq 0 ]; then
        c=$((3 - c))
        echo $c
    else
        echo $c
    fi
done

```
[/BASH]

[BASH]
```bash
read n
read -a w
c=2
for ((i=0; i<n; i++)); do
    if [ ${w[i]} -eq 1 ]; then
        echo $c
    elif [ $((w[i] % 2)) -eq 0 ]; then
        c=$((3 - c))
        echo $c
    else
        echo $c
    fi
done

```
[/BASH]

[BASH]
```bash
read n
read -a w
c=2
for ((i=0; i<n; i++)); do
    if [ ${w[i]} -eq 1 ]; then
        echo $c
    elif [ $((w[i] % 2)) -eq 0 ]; then
        c=$((3 - c))
        echo $c
    else
        echo $c
    fi
done

```
[/BASH]

[BASH]
```bash
read n
read -a w
c=2
for ((i=0; i<n; i++)); do
    if [ ${w[i]} -eq 1 ]; then
        echo $c
    elif [ $((w[i] % 2)) -eq 0 ]; then
        c=$((3 - c))
        echo $c
    else
        echo $c
    fi
done

```
[/BASH]

[BASH]
```bash
read n
read -a w
c=2
for ((i=0; i<n; i++)); do
    if [ ${w[i]} -eq 1 ]; then
        echo $c
    elif [ $((w[i] % 2)) -eq 0 ]; then
        c=$((3 - c))
        echo $c
    else
        echo $c
    fi
done

```
[/BASH]

[BASH]
```bash
read n
read -a w
c=2
for ((i=0; i<n; i++)); do
    if [ ${w[i]} -eq 1 ]; then
        echo $c
    elif [ $((w[i] % 2)) -eq 0 ]; then
        c=$((3 - c))
        echo $c
    else
        echo $c
    fi
done

```
[/BASH]

[BASH]
```bash
read n
read -a w
c=2
for ((i=0; i<n; i++)); do
    if [ ${w[i]} -eq 1 ]; then
        echo $c
    elif [ $((w[i] % 2)) -eq 0 ]; then
        c=$((3 - c))
        echo $c
    else
        echo $c
    fi
done

```
[/BASH]

[BASH]
```bash
read n
read -a w
c=2
for ((i=0; i<n; i++)); do
    if [ ${w[i]} -eq 1 ]; then
        echo $c
    elif [ $((w[i] % 2)) -eq 0 ]; then
        c=$((3 - c))
        echo $c
    else
        echo $c
    fi
done

```
[/BASH]

[BASH]
```bash
read n
read -a w
c=2
for ((i=0; i<n; i++)); do
    if [ ${w[i]} -eq 1 ]; then
        echo $c
    elif [ $((w[i] % 2)) -eq 0 ]; then
        c=$((3 - c))
        echo $c
    else
        echo $c
    fi
done

```
[/BASH]

[BASH]
```bash
read n
read -a w
c=2
for ((i=0; i<n; i++)); do
    if [ ${w[i]} -eq 1 ]; then
        echo $c
    elif [ $((w[i] % 2)) -eq 0 ]; then
        c=$((3 - c))
        echo $c
    else
        echo $c
    fi
done

```
[/BASH]

[BASH]
```bash
read n
read -a w
c=2
for ((i=0; i<n; i++)); do
    if [ ${w[i]} -eq 1 ]; then
        echo $c
    elif [ $((w[i] % 2)) -eq 0 ]; then
        c=$((3 - c))
        echo $c
    else
        echo $c
    fi
done

```
[/BASH]

[BASH]
```bash
read n
read -a w
c=2
for ((i=0; i<n; i++)); do
    if [ ${w[i]} -eq 1 ]; then
        echo $c
    elif [ $((w[i] % 2)) -eq 0 ]; then
        c=$((3 - c))
        echo $c
    else
        echo $c
    fi
done

```
[/BASH]

[BASH]
```bash
read n
read -a w
c=2
for ((i=0; i<n; i++)); do
    if [ ${w[i]} -eq 1 ]; then
        echo $c
    elif [ $((w[i] % 2)) -eq 0 ]; then
        c=$((3 - c))
        echo $c
    else
        echo $c
    fi
done

```
[/BASH]

[BASH]
```bash
read n
read -a w
c=2
for ((i=0; i<n; i++)); do
    if [ ${w[i]} -eq 1 ]; then
        echo $c
    elif [ $((w[i] % 2)) -eq 0 ]; then
        c=$((3 - c))
        echo $c
    else
        echo $c
    fi
done

```
[/BASH]

[BASH]
```bash
read n
read -a w
c=2
for ((i=0; i<n; i++)); do
    if [ ${w[i]} -eq 1 ]; then
        echo $c
    elif [ $((w[i] % 2)) -eq 0 ]; then
        c=$((3 - c))
        echo $c
    else
        echo $c
    fi
done

```
[/BASH]

[BASH]
```bash
read n
read -a w
c=2
for ((i=0; i<n; i++)); do
    if [ ${w[i]} -eq 1 ]; then
        echo $c
    elif [ $((w[i] % 2)) -eq 0 ]; then
        c=$((3 - c))
        echo $c
    else
        echo $c
    fi
done

```
[/BASH]

[BASH]
```bash
read n
read -a w
c=2
for ((i=0; i<n; i++)); do
    if [ ${w[i]} -eq 1 ]; then
        echo $c
    elif [ $((w[i] % 2)) -eq 0 ]; then
        c=$((3 - c))
        echo $c
    else
        echo $c
    fi
done

```
[/BASH]

[BASH]
```bash
read n
read -a w
c=2
for ((i=0; i<n; i++)); do
    if [ ${w[i]} -eq 1 ]; then
        echo $c
    elif [ $((w[i] % 2)) -eq 0 ]; then
        c=$((
