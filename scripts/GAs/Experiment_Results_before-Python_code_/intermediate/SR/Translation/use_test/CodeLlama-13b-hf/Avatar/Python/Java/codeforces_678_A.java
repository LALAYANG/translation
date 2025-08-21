
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vamshi = sc.nextInt();
        int z = sc.nextInt();
        System.out.println((vamshi / z + 1) * z);
    }
}

```
[/JAV]

[PYT]
```py
vamshi, z = map(int, input().split())
print((vamshi // z + 1) * z)

```
[/PYT]

[C++]
```cpp
#include <iostream>
using namespace std;

int main() {
    int vamshi, z;
    cin >> vamshi >> z;
    cout << (vamshi / z + 1) * z;
}

```
[/C++]

[C]
```c
#include <stdio.h>

int main() {
    int vamshi, z;
    scanf("%d %d", &vamshi, &z);
    printf("%d", (vamshi / z + 1) * z);
}

```
[/C]

[PHP]
```php
<?php
$vamshi = (int) trim(fgets(STDIN));
$z = (int) trim(fgets(STDIN));
echo ($vamshi / $z + 1) * $z;

```
[/PHP]

[RUBY]
```ruby
vamshi, z = gets.split.map(&:to_i)
puts (vamshi / z + 1) * z

```
[/RUBY]

[GO]
```go
package main

import (
    "fmt"
)

func main() {
    var vamshi, z int
    fmt.Scan(&vamshi, &z)
    fmt.Println((vamshi / z + 1) * z)
}

```
[/GO]

[BASH]
```bash
read vamshi z
echo $(( (vamshi / z + 1) * z ))

```
[/BASH]

[PERL]
```perl
use strict;
use warnings;

my ($vamshi, $z) = split /\s+/, <STDIN>;
print (($vamshi / $z + 1) * $z);

```
[/PERL]

[PAS]
```pascal
program Problem;
var
  vamshi, z: integer;
begin
  readln(vamshi, z);
  writeln((vamshi div z + 1) * z);
end.

```
[/PAS]

[BASH]
```bash
read vamshi z
echo $(( (vamshi / z + 1) * z ))

```
[/BASH]

[JAVASCRIPT]
```javascript
const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('', (vamshi, z) => {
  console.log((vamshi / z + 1) * z);
  rl.close();
});

```
[/JAVASCRIPT]

[PYTHON]
```python
vamshi, z = map(int, input().split())
print((vamshi // z + 1) * z)

```
[/PYTHON]

[JULIA]
```julia
vamshi, z = parse.(Int, split(readline()))
println((vamshi ÷ z + 1) * z)

```
[/JULIA]

[C#]
```cs
using System;

public class Program
{
    public static void Main()
    {
        var vamshi = int.Parse(Console.ReadLine());
        var z = int.Parse(Console.ReadLine());
        Console.WriteLine((vamshi / z + 1) * z);
    }
}

```
[/C#]

[HASKELL]
```haskell
main = do
    [vamshi, z] <- map read . words <$> getLine
    print ((vamshi `div` z + 1) * z)

```
[/HASKELL]

[COFFEESCRIPT]
```coffeescript
[vamshi, z] = (require 'fs').readFileSync('/dev/stdin').toString().split ' '
console.log (vamshi / z + 1) * z

```
[/COFFEESCRIPT]

[BASH]
```bash
read vamshi z
echo $(( (vamshi / z + 1) * z ))

```
[/BASH]

[JULIA]
```julia
vamshi, z = parse.(Int, split(readline()))
println((vamshi ÷ z + 1) * z)

```
[/JULIA]

[COFFEESCRIPT]
```coffeescript
[vamshi, z] = (require 'fs').readFileSync('/dev/stdin').toString().split ' '
console.log (vamshi / z + 1) * z

```
[/COFFEESCRIPT]

[JAVASCRIPT]
```javascript
const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('', (vamshi, z) => {
  console.log((vamshi / z + 1) * z);
  rl.close();
});

```
[/JAVASCRIPT]

[PHP]
```php
<?php
$vamshi = (int) trim(fgets(STDIN));
$z = (int) trim(fgets(STDIN));
echo ($vamshi / $z + 1) * $z;

```
[/PHP]

[GO]
```go
package main

import (
    "fmt"
)

func main() {
    var vamshi, z int
    fmt.Scan(&vamshi, &z)
    fmt.Println((vamshi / z + 1) * z)
}

```
[/GO]

[PERL]
```perl
use strict;
use warnings;

my ($vamshi, $z) = split /\s+/, <STDIN>;
print (($vamshi / $z + 1) * $z);

```
[/PERL]

[RUBY]
```ruby
vamshi, z = gets.split.map(&:to_i)
puts (vamshi / z + 1) * z

```
[/RUBY]

[PYTHON]
```python
vamshi, z = map(int, input().split())
print((vamshi // z + 1) * z)

```
[/PYTHON]

[C]
```c
#include <stdio.h>

int main() {
    int vamshi, z;
    scanf("%d %d", &vamshi, &z);
    printf("%d", (vamshi / z + 1) * z);
}

```
[/C]

[C++]
```cpp
#include <iostream>
using namespace std;

int main() {
    int vamshi, z;
    cin >> vamshi >> z;
    cout << (vamshi / z + 1) * z;
}

```
[/C++]

[PAS]
```pascal
program Problem;
var
  vamshi, z: integer;
begin
  readln(vamshi, z);
  writeln((vamshi div z + 1) * z);
end.

```
[/PAS]

[HASKELL]
```haskell
main = do
    [vamshi, z] <- map read . words <$> getLine
    print ((vamshi `div` z + 1) * z)

```
[/HASKELL]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
453145 333625

Expected output:
667250


```
vamshi , z = map ( int , input ( ).split ( ) )
print ( ( vamshi // z + 1 ) * z )


```
[/INST]

[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vamshi = sc.nextInt();
        int z = sc.nextInt();
        System.out.println((vamshi / z + 1) * z);
    }
}

```
[/JAV]

[PYT]
```py
vamshi, z = map(int, input().split())
print((vamshi // z + 1) * z)

```
[/PYT]

[C++]
```cpp
#include <iostream>
using namespace std;

int main() {
    int vamshi, z;
    cin >> vamshi >> z;
    cout << (vamshi / z + 1) * z;
}

```
[/C++]

[C]
```c
#include <stdio.h>

int main() {
    int vamshi, z;
    scanf("%d %d", &vamshi, &z);
    printf("%d", (vamshi / z + 1) * z);
}

```
[/C]

[PHP]
```php
<?php
$vamshi = (int) trim(fgets(STDIN));
$z = (int) trim(fgets(STDIN));
echo ($vamshi / $z + 1) * $z;

```
[/PHP]

[RUBY]
```ruby
vamshi, z = gets.split.map(&:to_i)
puts (vamshi / z + 1) * z

```
[/RUBY]

[GO]
```go
package main

import (
    "fmt"
)

func main() {
    var vamshi, z int
    fmt.Scan(&vamshi, &z)
    fmt.Println((vamshi / z + 1) * z)
}

```
[/GO]

[BASH]
```bash
read vamshi z
echo $(( (vamshi / z + 1) * z ))

```
[/BASH]

[PERL]
```perl
use strict;
use warnings;

my ($vamshi, $z) = split /\s+/, <STDIN>;
print (($vamshi / $z + 1) * $z);

```
[/PERL]

[RUBY]
```ruby
vamshi, z = gets.split.map(&:to_i)
puts (vamshi / z + 1) * z

```
[/RUBY]

[PYTHON]
```python
vamshi, z = map(int, input().split())
print((vamshi // z + 1) * z)

```
[/PYTHON]

[C]
```c
#include <stdio.h>

int main() {
    int vamshi, z;
    scanf("%d %d", &vamshi, &z);
    printf("%d", (vamshi / z + 1) * z);
}

```
[/C]

[C++]
```cpp
#include <iostream>
using namespace std;

int main() {
    int vamshi, z;
    cin >> vamshi >> z;
    cout << (vamshi / z + 1) * z;
}

```
[/C++]

[PAS]
```pascal
program Problem;
var
  vamshi, z: integer;
begin
  readln(vamshi, z);
  writeln((vamshi div z + 1) * z);
end.

```
[/PAS]

[BASH]
```bash
read vamshi z
echo $(( (vamshi / z + 1) * z ))

```
[/BASH]

[JAVASCRIPT]
```javascript
const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('', (vamshi, z) => {
  console.log((vamshi / z + 1) * z);
  rl.close();
});

```
[/JAVASCRIPT]

[PHP]
```php
<?php
$vamshi = (int) trim(fgets(STDIN));
$z = (int) trim(fgets(STDIN));
echo ($vamshi / $z + 1) * $z;

```
[/PHP]

[GO]
```go
package main

import (
    "fmt"
)

func main() {
    var vamshi, z int
    fmt.Scan(&vamshi, &z)
    fmt.Println((vamshi / z + 1) * z)
}

```
[/GO]

[PERL]
```perl
use strict;
use warnings;

my ($vamshi, $z) = split /\s+/, <STDIN>;
print (($vamshi / $z + 1) * $z);

```
[/PERL]

[RUBY]
```ruby
vamshi, z = gets.split.map(&:to_i)
puts (vamshi / z + 1) * z

```
[/RUBY]

[PYTHON]
```python
vamshi, z = map(int, input().split())
print((vamshi // z + 1) * z)

```
[/PYTHON]

[C]
```c
#include <stdio.h>

int main() {
    int vamshi, z;
    scanf("%d %d", &vamshi, &z);
    printf("%d", (vamshi / z + 1) * z);
}

```
[/C]

[C++]
```cpp
#include <iostream>
using namespace std;

int main() {
    int vamshi, z;
    cin >> vamshi >> z;
    cout << (vamshi / z + 1) * z;
}

```
[/C++]

[PAS]
```pascal
program Problem;
var
  vamshi, z: integer;
begin
  readln(vamshi, z);
  writeln((vamshi div z + 1) * z);
end.

```
[/PAS]

[HASKELL]
```haskell
main = do
    [vamshi, z] <- map read . words <$> getLine
    print ((vamshi `div` z + 
