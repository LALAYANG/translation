

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
```

## 2.

Write a program to print the sum of the first 100 natural numbers.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program to print the sum of the first 100 even numbers.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 4.

Write a program to print the sum of the first 100 odd numbers.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```
/docs/python/01-introduction.md
# Introduction

## 1.

Write a program to print "Hello World".

```python
print("Hello World")
```

## 2.

Write a program to print the sum of the first 100 natural numbers.

```python
sum = 0
for i in range(1, 101):
    sum += i
print(sum)
```

## 3.

Write a program to print the sum of the first 100 even numbers.

```python
sum = 0
for i in range(1, 101):
    if i % 2 == 0:
        sum += i
print(sum)
```

## 4.

Write a program to print the sum of the first 100 odd numbers.

```python
sum = 0
for i in range(1, 101):
    if i % 2 != 0:
        sum += i
print(sum)
```


## 4.

Write a program to print the sum of the first 100 odd numbers.

```c
#include <stdio.h>

int main() {
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
        if (i % 2 != 0) {
            sum += i;
        }
    }
    printf("%d\n", sum);
    return 0;
}
```
/docs/c/01-introduction.md
# Introduction

## 1.

Write a program to print "Hello World".

```c
#include <stdio.h>

int main() {
    printf("Hello World\n");
    return 0;
}
```

## 2.

Write a program to print the sum of the first 100 natural numbers.

```c
#include <stdio.h>

int main() {
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
        sum += i;
    }
    printf("%d\n", sum);
    return 0;
}
```

## 3.

Write a program to print the sum of the first 100 even numbers.

```c
#include <stdio.h>

int main() {
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
        if (i % 2 == 0) {
            sum += i;
        }
    }
    printf("%d\n", sum);
    return 0;
}
```

## 4.

Write a program to print the sum of the first 100 odd numbers.

```c++
#include <iostream>

using namespace std;

int main() {
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
        if (i % 2 != 0) {
            sum += i;
        }
    }
    cout << sum << endl;
    return 0;
}
```
/docs/cpp/01-introduction.md
# Introduction

## 1.

Write a program to print "Hello World".

```c++
#include <iostream>

using namespace std;

int main() {
    cout << "Hello World" << endl;
    return 0;
}
```

## 2.

Write a program to print the sum of the first 100 natural numbers.

```c++
#include <iostream>

using namespace std;

int main() {
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
        sum += i;
    }
    cout << sum << endl;
    return 0;
}
```

## 3.

Write a program to print the sum of the first 100 even numbers.

```c++
#include <iostream>

using namespace std;

int main() {
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
        if (i % 2 == 0) {
            sum += i;
        }
    }
    cout << sum << endl;
    return 0;
}
```/docs/java/01-introduction.md
# Introduction

## 1.

Write a program to print "Hello World".

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

## 2.

Write a program to print the sum of the first 100 natural numbers.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program to print the sum of the first 100 even numbers.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 4.

Write a program to print the sum of the first 100 odd numbers.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```


## 4.

Write a program to print the sum of the first 100 odd numbers.

```go
package main

import "fmt"

func main() {
    sum := 0
    for i := 1; i <= 100; i++ {
        if i % 2 != 0 {
            sum += i
        }
    }
    fmt.Println(sum)
}
```
/docs/go/01-introduction.md
# Introduction

## 1.

Write a program to print "Hello World".

```go
package main

import "fmt"

func main() {
    fmt.Println("Hello World")
}
```

## 2.

Write a program to print the sum of the first 100 natural numbers.

```go
package main

import "fmt"

func main() {
    sum := 0
    for i := 1; i <= 100; i++ {
        sum += i
    }
    fmt.Println(sum)
}
```

## 3.

Write a program to print the sum of the first 100 even numbers.

```go
package main

import "fmt"

func main() {
    sum := 0
    for i := 1; i <= 100; i++ {
        if i % 2 == 0 {
            sum += i
        }
    }
    fmt.Println(sum)
}
```/docs/javascript/01-introduction.md
# Introduction

## 1.

Write a program to print "Hello World".

```javascript
console.log("Hello World");
```

## 2.

Write a program to print the sum of the first 100 natural numbers.

```javascript
let sum = 0;
for (let i = 1; i <= 100; i++) {
    sum += i;
}
console.log(sum);
```

## 3.

Write a program to print the sum of the first 100 even numbers.

```javascript
let sum = 0;
for (let i = 1; i <= 100; i++) {
    if (i % 2 == 0) {
        sum += i;
    }
}
console.log(sum);
```

## 4.

Write a program to print the sum of the first 100 odd numbers.

```javascript
let sum = 0;
for (let i = 1; i <= 100; i++) {
    if (i % 2 != 0) {
        sum += i;
    }
}
console.log(sum);
```
/docs/php/01-introduction.md
# Introduction

## 1.

Write a program to print "Hello World".

```php
<?php
echo "Hello World\n";
```

## 2.

Write a program to print the sum of the first 100 natural numbers.

```php
<?php
$sum = 0;
for ($i = 1; $i <= 100; $i++) {
    $sum += $i;
}
echo $sum . "\n";
```

## 3.

Write a program to print the sum of the first 100 even numbers.

```php
<?php
$sum = 0;
for ($i = 1; $i <= 100; $i++) {
    if ($i % 2 == 0) {
        $sum += $i;
    }
}
echo $sum . "\n";
```

## 4.

Write a program to print the sum of the first 100 odd numbers.

```php
<?php
$sum = 0;
for ($i = 1; $i <= 100; $i++) {
    if ($i % 2 != 0) {
        $sum += $i;
    }
}
echo $sum . "\n";
```


## 4.

Write a program to print the sum of the first 100 odd numbers.

```rust
fn main() {
    let mut sum = 0;
    for i in 1..101 {
        if i % 2 != 0 {
            sum += i;
        }
    }
    println!("{}", sum);
}
```
/docs/rust/01-introduction.md
# Introduction

## 1.

Write a program to print "Hello World".

```rust
fn main() {
    println!("Hello World");
}
```

## 2.

Write a program to print the sum of the first 100 natural numbers.

```rust
fn main() {
    let mut sum = 0;
    for i in 1..101 {
        sum += i;
    }
    println!("{}", sum);
}
```

## 3.

Write a program to print the sum of the first 100 even numbers.

```rust
fn main() {
    let mut sum = 0;
    for i in 1..101 {
        if i % 2 == 0 {
            sum += i;
        }
    }
    println!("{}", sum);
}
```/docs/kotlin/01-introduction.md
# Introduction

## 1.

Write a program to print "Hello World".

```kotlin
fun main() {
    println("Hello World")
}
```

## 2.

Write a program to print the sum of the first 100 natural numbers.

```kotlin
fun main() {
    var sum = 0
    for (i in 1..100) {
        sum += i
    }
    println(sum)
}
```

## 3.

Write a program to print the sum of the first 100 even numbers.

```kotlin
fun main() {
    var sum = 0
    for (i in 1..100) {
        if (i % 2 == 0) {
            sum += i
        }
    }
    println(sum)
}
```

## 4.

Write a program to print the sum of the first 100 odd numbers.

```kotlin
fun main() {
    var sum = 0
    for (i in 1..100) {
        if (i % 2 != 0) {
            sum += i
        }
    }
    println(sum)
}
```/docs/ruby/01-introduction.md
# Introduction

## 1.

Write a program to print "Hello World".

```ruby
puts "Hello World"
```

## 2.

Write a program to print the sum of the first 100 natural numbers.

```ruby
sum = 0
for i in 1..100
    sum += i
end
puts sum
```

## 3.

Write a program to print the sum of the first 100 even numbers.

```ruby
sum = 0
for i in 1..100
    if i % 2 == 0
        sum += i
    end
end
puts sum
```

## 4.

Write a program to print the sum of the first 100 odd numbers.

```ruby
sum = 0
for i in 1..100
    if i % 2 != 0
        sum += i
    end
end
puts sum
```
/docs/swift/01-introduction.md
# Introduction

## 1.

Write a program to print "Hello World".

```swift
print("Hello World")
```

## 2.

Write a program to print the sum of the first 100 natural numbers.

```swift
var sum = 0
for i in 1...100 {
    sum += i
}
print(sum)
```

## 3.

Write a program to print the sum of the first 100 even numbers.

```swift
var sum = 0
for i in 1...100 {
    if i % 2 == 0 {
        sum += i
    }
}
print(sum)
```

## 4.

Write a program to print the sum of the first 100 odd numbers.

```swift
var sum = 0
for i in 1...100 {
    if i % 2 != 0 {
        sum += i
    }
}
print(sum)
```
/docs/dart/01-introduction.md
# Introduction

## 1.

Write a program to print "Hello World".

```dart
void main() {
  print("Hello World");
}
```

## 2.

Write a program to print the sum of the first 100 natural numbers.

```dart
void main() {
  var sum = 0;
  for (var i = 1; i <= 100; i++) {
    sum += i;
  }
  print(sum);
}
```

## 3.

Write a program to print the sum of the first 100 even numbers.

```dart
void main() {
  var sum = 0;
  for (var i = 1; i <= 100; i++) {
    if (i % 2
