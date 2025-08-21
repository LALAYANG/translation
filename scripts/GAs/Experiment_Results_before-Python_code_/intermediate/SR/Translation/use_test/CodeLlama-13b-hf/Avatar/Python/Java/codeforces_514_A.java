
[JAV]
```java

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        String st = "";
        if (ip.length() != 1) {
            if (ip.charAt(0) == '9') {
                st = "9";
                ip = ip.substring(1);
            }
            for (int i = 0; i < ip.length(); i++) {
                if (ip.charAt(i) - '0' > 4) {
                    int n = 9 - (ip.charAt(i) - '0');
                    st += String.valueOf(n);
                } else {
                    st += ip.charAt(i);
                }
            }
        } else {
            st = ip;
        }
        System.out.println(Integer.parseInt(st));
    }
}

```
[/JAV]

[PYT]
```py

ip = input()
st = ""
if len(ip) != 1:
    if ip[0] == "9":
        st = "9"
        ip = ip[1:]
    for i in ip:
        if int(i) > 4:
            n = 9 - int(i)
            st += str(n)
        else:
            st += i
else:
    st = ip
print(int(st))

```
[/PYT]

[CPP]
```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    string ip;
    cin >> ip;
    string st = "";
    if (ip.length() != 1) {
        if (ip[0] == '9') {
            st = "9";
            ip = ip.substr(1);
        }
        for (int i = 0; i < ip.length(); i++) {
            if (ip[i] - '0' > 4) {
                int n = 9 - (ip[i] - '0');
                st += to_string(n);
            } else {
                st += ip[i];
            }
        }
    } else {
        st = ip;
    }
    cout << stoi(st);
}

```
[/CPP]

[C]
```c

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main() {
    char ip[1000000];
    scanf("%s", ip);
    char st[1000000] = "";
    if (strlen(ip) != 1) {
        if (ip[0] == '9') {
            st[0] = '9';
            strcpy(ip, ip + 1);
        }
        for (int i = 0; i < strlen(ip); i++) {
            if (ip[i] - '0' > 4) {
                int n = 9 - (ip[i] - '0');
                st[i] = n + '0';
            } else {
                st[i] = ip[i];
            }
        }
    } else {
        strcpy(st, ip);
    }
    printf("%d", atoi(st));
}

```
[/C]

[PHP]
```php

<?php
$ip = trim(fgets(STDIN));
$st = "";
if (strlen($ip) != 1) {
    if ($ip[0] == "9") {
        $st = "9";
        $ip = substr($ip, 1);
    }
    for ($i = 0; $i < strlen($ip); $i++) {
        if ($ip[$i] > "4") {
            $n = "9" - $ip[$i];
            $st .= $n;
        } else {
            $st .= $ip[$i];
        }
    }
} else {
    $st = $ip;
}
echo intval($st);

```
[/PHP]

[RUBY]
```ruby

ip = gets.chomp
st = ""
if ip.length != 1
    if ip[0] == "9"
        st = "9"
        ip = ip[1..-1]
    end
    for i in 0..ip.length - 1
        if ip[i].to_i > 4
            n = 9 - ip[i].to_i
            st += n.to_s
        else
            st += ip[i]
        end
    end
else
    st = ip
end
puts st.to_i

```
[/RUBY]

[GO]
```go

package main

import (
    "fmt"
    "strings"
)

func main() {
    var ip string
    fmt.Scan(&ip)
    st := ""
    if len(ip) != 1 {
        if ip[0] == '9' {
            st = "9"
            ip = ip[1:]
        }
        for i := 0; i < len(ip); i++ {
            if ip[i]-'0' > 4 {
                n := 9 - (ip[i] - '0')
                st += string(n)
            } else {
                st += string(ip[i])
            }
        }
    } else {
        st = ip
    }
    fmt.Println(strings.Replace(st, " ", "", -1))
}

```
[/GO]

[BASH]
```bash

read ip
st=""
if [ ${#ip} -ne 1 ]; then
    if [ ${ip:0:1} == "9" ]; then
        st="9"
        ip=${ip:1}
    fi
    for i in ${ip}; do
        if [ $i -gt 4 ]; then
            n=$(($i-9))
            st+=$n
        else
            st+=$i
        fi
    done
else
    st=$ip
fi
echo $st

```
[/BASH]

[PERL]
```perl

use strict;
use warnings;

my $ip = <STDIN>;
chomp $ip;
my $st = "";
if (length($ip) != 1) {
    if (substr($ip, 0, 1) eq "9") {
        $st = "9";
        $ip = substr($ip, 1);
    }
    for my $i (0 .. length($ip) - 1) {
        if (substr($ip, $i, 1) > 4) {
            my $n = 9 - substr($ip, $i, 1);
            $st .= $n;
        } else {
            $st .= substr($ip, $i, 1);
        }
    }
} else {
    $st = $ip;
}
print $st;

```
[/PERL]

[PASCAL]
```pascal

program problem;
var
  ip, st: string;
begin
  readln(ip);
  st := '';
  if length(ip) <> 1 then
    begin
      if ip[1] = '9' then
        begin
          st := '9';
          delete(ip, 1, 1);
        end;
      for var i := 1 to length(ip) do
        begin
          if ord(ip[i]) > 52 then
            begin
              st := st + chr(9 - ord(ip[i]));
            end
          else
            begin
              st := st + ip[i];
            end;
        end;
    end
  else
    begin
      st := ip;
    end;
  writeln(st);
end.

```
[/PASCAL]

[JULIA]
```julia

ip = readline()
st = ""
if length(ip) != 1
    if ip[1] == '9'
        st = "9"
        ip = ip[2:end]
    end
    for i in 1:length(ip)
        if ip[i] > '4'
            n = 9 - ip[i]
            st *= n
        else
            st *= ip[i]
        end
    end
else
    st = ip
end
println(st)

```
[/JULIA]

[LUA]
```lua

io.write(io.read("*l"))

```
[/LUA]

[AWK]
```awk

{
    print $0
}

```
[/AWK]

[CAT]
```cat

cat

```
[/CAT]

[BASH]
```bash

cat

```
[/BASH]

[COFFEE]
```coffee

cat

```
[/COFFEE]

[C]
```c

cat

```
[/C]

[CPP]
```cpp

cat

```
[/CPP]

[CSH]
```csh

cat

```
[/CSH]

[CSP]
```csp

cat

```
[/CSP]

[CSS]
```css

cat

```
[/CSS]

[D]
```d

cat

```
[/D]

[DART]
```dart

cat

```
[/DART]

[ELIXIR]
```elixir

cat

```
[/ELIXIR]

[FORTRAN]
```fortran

cat

```
[/FORTRAN]

[GO]
```go

cat

```
[/GO]

[HASKELL]
```haskell

cat

```
[/HASKELL]

[INI]
```ini

cat

```
[/INI]

[J]
```j

cat

```
[/J]

[JAVA]
```java

cat

```
[/JAVA]

[JAVASCRIPT]
```javascript

cat

```
[/JAVASCRIPT]

[JULIA]
```julia

cat

```
[/JULIA]

[KOTLIN]
```kotlin

cat

```
[/KOTLIN]

[LISP]
```lisp

cat

```
[/LISP]

[LUA]
```lua

cat

```
[/LUA]

[MATLAB]
```matlab

cat

```
[/MATLAB]

[NIM]
```nim

cat

```
[/NIM]

[OBJECTIVE_C]
```objective_c

cat

```
[/OBJECTIVE_C]

[OCAML]
```ocaml

cat

```
[/OCAML]

[PERL]
```perl

cat

```
[/PERL]

[PHP]
```php

cat

```
[/PHP]

[PYTHON]
```python

cat

```
[/PYTHON]

[R]
```r

cat

```
[/R]

[RUBY]
```ruby

cat

```
[/RUBY]

[RUST]
```rust

cat

```
[/RUST]

[SCALA]
```scala

cat

```
[/SCALA]

[SHELL]
```shell

cat

```
[/SHELL]

[SQL]
```sql

cat

```
[/SQL]

[SWIFT]
```swift

cat

```
[/SWIFT]

[TYPESCRIPT]
```typescript

cat

```
[/TYPESCRIPT]

[VISUAL_BASIC]
```visual_basic

cat

```
[/VISUAL_BASIC]

[XML]
```xml

cat

```
[/XML]

[YAML]
```yaml

cat

```
[/YAML]

[ZIG]
```zig

cat

```
[/ZIG]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
332711047202

Expected output:
332211042202


```
ip = input ( )
st = ""
if len ( ip ) != 1 :
    if ip [ 0 ] == "9" :
        st = "9"
        ip = ip [ 1 : ]
    for i in ip :
        if int ( i ) > 4 :
            n = 9 - int ( i )
            st += str ( n )
        else :
            st += i
else :
    st = ip
print ( int ( st ) )


```
[/INST]

[JAV]
```java

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        String st = "";
        if (ip.length() != 1) {
            if (ip.charAt(0) == '9') {
                st = "9";
                ip = ip.substring(1);
            }
            for (int i = 0; i < ip.length(); i++) {
                if (ip.charAt(i) - '0' > 4) {
                    int n = 9 - (ip.charAt(i) - '0');
                    st += String.valueOf(n);
                } else {
                    st += ip.charAt(i);
                }
            }
        } else {
            st = ip;
        }
        System.out.println(Integer.parseInt(st));
    }
}

```
[/JAV]

[PYT]
```py

ip = input()
st = ""
if len(ip) != 1:
    if ip[0] == "9":
        st = "9"
        ip = ip[1:]
    for i in ip:
        if int(i) > 4:
            n = 9 - int(i)
            st += str(n)
        else:
            st += i
else:
    st = ip
print(int(st))

```
[/PYT]

[CPP]
```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    string ip;
    cin >> ip;
    string st = "";
    if (ip.length() != 1) {
        if (ip[0] == '9') {
            st = "9";
            ip = ip.substr(1);
        }
        for (int i = 0; i < ip.length(); i++) {
            if (ip[i] - '0' > 4) {
                int n = 9 - (ip[i] - '0');
                st += to_string(n);
            } else {
                st += ip[i];
            }
        }
    } else {
        st = ip;
    }
    cout << stoi(st);
}

```

