

```java

```
/problems/1000/1000.md
# 1000. A+B Problem

## Problem Description

Calculate a + b.

## Input

Each line will contain two integers a and b. Process to end of file.

## Output

For each case, output a + b in one

```

## Sample Output

```
1 1
2
```
 line.

## Sample Input

```
1 1
```

## Sample Output

```
2
```

## Hint

```
a and b are all less than 1000./problems/1000/1000.py
#!/usr/bin/env python3

import sys

for line in sys.stdin:
    a, b = line.split()
    print(int(a) + int(b))
/problems/1000/1000.cpp
#inc
int main() {
    int a, b;
    while (cin >> a >> b) {
        cout << a + b << endl;
    }
    return 0;
}
lude <iostream>
using namespace std;/problems/1000/1000.c
#include <stdio.h>

int main() {
    int a, b;
    while (scanf("%d %d", &a, &b) != EOF) {
        printf("%d\n", a + b);
    }
    return 0;
}
/problems/1000/1000.rs
use std::io;

fn main() {
    let mut line = String::new();
    loop {
        match io::stdin().read_line(&mut line) {
            Ok(_) => {
                let mut iter = line.split_whitespace();
                let a: i32 = iter.next().unwrap().parse().unwrap();
                let b: i32 = iter.next().unwrap().parse().unwrap();
                println!("{}", a + b);
            }
            Err(_) => break,
        }
    }
}


```
1 1
2
```
/problems/1000/1000.md
# 1000. A+B Problem

## Problem Description

Calculate a + b.

## Input

Each line will contain two integers a and b. Process to end of file.

## Output

For each case, output a + b in one line.

## Sample Input

```
1 1
```

## Sample Output

```
2
```

## Hint

```
a and b are all less than 1000.

```

## Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a + b);
        }
    }
}
```

## Python code:

```python
#!/usr/bin/env python3

import sys

for line in sys.stdin:
    a, b = line.split()
    print(int(a) + int(b))
```

## C code:

```c
#include <stdio.h>

int main() {
    int a, b;
    while (scanf("%d %d", &a, &b) != EOF) {
        printf("%d\n", a + b);
    }
    return 0;
}
```

## C++ code:

```cpp
#include <iostream>
using namespace std;

int main() {
    int a, b;
    while (cin >> a >> b) {
        cout << a + b << endl;
    }
    return 0;
}
```

## Rust code:

```rust
use std::io;

fn main() {
    let mut line = String::new();
    loop {
        match io::stdin().read_line(&mut line) {
            Ok(_) => {
                let mut iter = line.split_whitespace();
                let a: i32 = iter.next().unwrap().parse().unwrap();
                let b: i32 = iter.next().unwrap().parse().unwrap();
                println!("{}", a + b);
            }
            Err(_) => break,
        }
    }
}
```

## Go code:

```go
package main

import (
    "bufio"
    "fmt"
    "os"
    "strconv"
    "strings"
)

func main() {
    scanner := bufio.NewScanner(os.Stdin)
    for scanner.Scan() {
        line := scanner.Text()
        nums := strings.Split(line, " ")
        a, _ := strconv.Atoi(nums[0])
        b, _ := strconv.Atoi(nums[1])
        fmt.Println(a + b)
    }
}
```/problems/1000/1000.go
package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {
	scanner := bufio.NewScanner(os.Stdin)
	for scanner.Scan() {
		line := scanner.Text()
		nums := strings.Split(line, " ")
		a, _ := strconv.Atoi(nums[0])
		b, _ := strconv.Atoi(nums[1])
		fmt.Printl
n(a + b)
	}
}

// package main

// import (
// 	"fmt"
// )

// func main() {
// 	var a, b int
// 	for {
// 		_, err := fmt.Scanf("%d %d", &a, &b)
// 		if err != nil {
// 			break
// 		}
// 		fmt.Println(a + b)
// 	}
// }/problems/1000/1000.rs
use std::io;

fn main() {
    let mut line = String::new();
    loop {
        match io::stdin().read_line(&mut line) {
       unwrap();
                println!("{}", a + b);
            }
            Err(_) => break,
        }
    }
}
     Ok(_) => {
                let mut iter = line.split_whitespace();
                let a: i32 = iter.next().unwrap().parse().unwrap();
                let b: i32 = iter.next().unwrap().parse().unwrap();
                println!("{}", a + b);
            }
            Err(_) => break,
        }
    }
}

// use std::io;

// fn main() {
//     let mut line = String::new();
//     loop {
//         match io::stdin().read_line(&mut line) {
//             Ok(_) => {
//                 let mut iter = line.split_whitespace();
//                 let a: i32 = iter.next().unwrap().parse().unwrap();
//                 let b: i32 = iter.next().unwrap().parse().

```
1 1
2
```
/problems/1000/1000.md
# 1000. A+B Problem

## Problem Description

Calculate a + b.

## Input

Each line will contain two integers a and b. Process to end of file.

## Output

For each case, output a + b in one line.

## Sample Input

```
1 1
```

## Sample Output

```
2
```

## Hint

```
a and b are all less than 1000.

```

## Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a + b);
        }
    }
}
```

## Python code:

```python
#!/usr/bin/env python3

import sys

for line in sys.stdin:
    a, b = line.split()
    print(int(a) + int(b))
```

## C code:

```c
#include <stdio.h>

int main() {
    int a, b;
    while (scanf("%d %d", &a, &b) != EOF) {
        printf("%d\n", a + b);
    }
    return 0;
}
```

## C++ code:

```cpp
#include <iostream>
using namespace std;

int main() {
    int a, b;
    while (cin >> a >> b) {
        cout << a + b << endl;
    }
    return 0;
}
```

## Rust code:

```rust
use std::io;

fn main() {
    let mut line = String::new();
    loop {
        match io::stdin().read_line(&mut line) {
            Ok(_) => {
                let mut iter = line.split_whitespace();
                let a: i32 = iter.next().unwrap().parse().unwrap();
                let b: i32 = iter.next().unwrap().parse().unwrap();
                println!("{}", a + b);
            }
            Err(_) => break,
        }
    }
}
```

## Go code:

```go
package main

import (
    "bufio"
    "fmt"
    "os"
    "strconv"
    "strings"
)

func main() {
    scanner := bufio.NewScanner(os.Stdin)
    for scanner.Scan() {
        line := scanner.Text()
        nums := strings.Split(line, " ")
        a, _ := strconv.Atoi(nums[0])
        b, _ := strconv.Atoi(nums[1])
        fmt.Println(a + b)
    }
}
```

## Sample Input

```
1 1
```

## Sample Output

```
1 1
2
```
/problems/1000/1000.md
# 1000. A+B Problem

## Problem Description

Calculate a + b.

## Input

Each line will contain two integers a and b. Process to end of file.

## Output

For each case, output a + b in one line.

## Sample Input

```
1 1
```

## Sample Output

```
2
```

## Hint

```
a and b are all less than 1000.

```

## Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a + b);
        }
    }
}
```

## Python code:

```python
#!/usr/bin/env python3

import sys

for line in sys.stdin:
    a, b = line.split()
    print(int(a) + int(b))
```

## C code:

```c
#include <stdio.h>

int main() {
    int a, b;
    while (scanf("%d %d", &a, &b) != EOF) {
        printf("%d\n", a + b);
    }
    return 0;
}
```

## C++ code:

```cpp
#include <iostream>
using namespace std;

int main() {
    int a, b;
    while (cin >> a >> b) {
        cout << a + b << endl;
    }
    return 0;
}
```

## Rust code:

```rust
use std::io;

fn main() {
    let mut line = String::new();
    loop {
        match io::stdin().read_line(&mut line) {
            Ok(_) => {
                let mut iter = line.split_whitespace();
                let a: i32 = iter.next().unwrap().parse().unwrap();
                let b: i32 = iter.next().unwrap().parse().unwrap();
                println!("{}", a + b);
            }
            Err(_) => break,
        }
    }
}
```

## Go code:

```go
package main

import (
    "bufio"
    "fmt"
    "os"
    "strconv"
    "strings"
)

func main() {
    scanner := bufio.NewScanner(os.Stdin)
    for scanner.Scan() {
        line := scanner.Text()
        nums := strings.Split(line, " ")
        a, _ := strconv.Atoi(nums[0])
        b, _ := strconv.Atoi(nums[1])
        fmt.Println(a + b)
    }
}
```

## Sample Input

```
1 1
```

## Sample Output

```
1 1
2
```
/problems/1000/1000.md
# 1000. A+B Problem

## Problem Description

Calculate a + b.

## Input

Each line will contain two integers a and b. Process to end of file.

## Output

For each case, output a + b in one line.

## Sample Input

```
1 1
```

## Sample Output

```
2
```

## Hint

```
a and b are all less than 1000.

```

## Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a + b);
        }
    }
}
```

## Python code:

```python
#!/usr/bin/env python3

import sys

for line in sys.stdin:
    a, b = line.split()
    print(int(a) + int(b))
```

## C code:

```c
#include <stdio.h>

int main() {
    int a, b;
    while (scanf("%d %d", &a, &b) != EOF) {
        printf("%d\n", a + b);
    }
    return 0;
}
```

## C++ code:

```cpp
#include <iostream>
using namespace std;

int main() {
    int a, b;
    while (cin >> a >> b) {
        cout << a + b << endl;
    }
    return 0;
}
```

## Rust code:

```rust
use std::io;

fn main() {
    let mut line = String::new();
    loop {
        match io::stdin().read_line(&mut line) {
            Ok(_) => {
                let mut iter = line.split_whitespace();
                let a: i32 = iter.next().unwrap().parse().unwrap();
                let b: i32 = iter.next().unwrap().parse().unwrap();
                println!("{}", a + b);
            }
            Err(_) => break,
        }
    }
}
```

## Go code:

```go
package main

import (
    "bufio"
    "fmt"
    "os"
    "strconv"
    "strings"
)

func main() {
    scanner := bufio.NewScanner(os.Stdin)
    for scanner.Scan() {
        line := scanner.Text()
        nums := strings.Split(line, " ")
        a, _ := strconv.Atoi(nums[0])
        b, _ := strconv.Atoi(nums[1])
        fmt.Println(a + b)
    }
}
```

## Sample Input

```
1 1
```

## Sample Output/problems/1000/1000.md
# 100
