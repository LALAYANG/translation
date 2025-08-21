
[JAV]

```java

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] lista = new int[n];
        int[] listb = new int[n];
        for (int i = 0; i < n; i++) {
            lista[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            listb[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (lista[i] == i + 1) {
                System.out.print(1 + " ");
            } else {
                System.out.print(2 + " ");
            }
        }
    }
}

```

[/JAV]

[PYT]

```python

n , a , b = [ int ( x ) for x in input ( ).split ( " " ) ]
lista = [ int ( x ) for x in input ( ).split ( " " ) ]
listb = [ int ( x ) for x in input ( ).split ( " " ) ]
for k in range ( n ) :
    if k + 1 in lista :
        print ( 1 , end = " " )
    else :
        print ( 2 , end = " " )


```

[/PYT]

[CPP]

```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, a, b;
    cin >> n >> a >> b;
    vector<int> lista(n);
    vector<int> listb(n);
    for (int i = 0; i < n; i++) {
        cin >> lista[i];
    }
    for (int i = 0; i < n; i++) {
        cin >> listb[i];
    }
    for (int i = 0; i < n; i++) {
        if (lista[i] == i + 1) {
            cout << 1 << " ";
        } else {
            cout << 2 << " ";
        }
    }
}

```

[/CPP]

[C]

```c

#include <stdio.h>

int main() {
    int n, a, b;
    scanf("%d %d %d", &n, &a, &b);
    int lista[n];
    int listb[n];
    for (int i = 0; i < n; i++) {
        scanf("%d", &lista[i]);
    }
    for (int i = 0; i < n; i++) {
        scanf("%d", &listb[i]);
    }
    for (int i = 0; i < n; i++) {
        if (lista[i] == i + 1) {
            printf("%d ", 1);
        } else {
            printf("%d ", 2);
        }
    }
}

```

[/C]

[HAS]

```haskell

main = do
    [n, a, b] <- map read . words <$> getLine
    lista <- map read . words <$> getLine
    listb <- map read . words <$> getLine
    mapM_ (\i -> if lista !! i == i + 1 then print 1 else print 2) [0..n - 1]

```

[/HAS]

[JAV]

```java

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] lista = new int[n];
        int[] listb = new int[n];
        for (int i = 0; i < n; i++) {
            lista[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            listb[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (lista[i] == i + 1) {
                System.out.print(1 + " ");
            } else {
                System.out.print(2 + " ");
            }
        }
    }
}

```

[/JAV]

[PYT]

```python

n , a , b = [ int ( x ) for x in input ( ).split ( " " ) ]
lista = [ int ( x ) for x in input ( ).split ( " " ) ]
listb = [ int ( x ) for x in input ( ).split ( " " ) ]
for k in range ( n ) :
    if k + 1 in lista :
        print ( 1 , end = " " )
    else :
        print ( 2 , end = " " )


```

[/PYT]

[CPP]

```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, a, b;
    cin >> n >> a >> b;
    vector<int> lista(n);
    vector<int> listb(n);
    for (int i = 0; i < n; i++) {
        cin >> lista[i];
    }
    for (int i = 0; i < n; i++) {
        cin >> listb[i];
    }
    for (int i = 0; i < n; i++) {
        if (lista[i] == i + 1) {
            cout << 1 << " ";
        } else {
            cout << 2 << " ";
        }
    }
}

```

[/CPP]

[C]

```c

#include <stdio.h>

int main() {
    int n, a, b;
    scanf("%d %d %d", &n, &a, &b);
    int lista[n];
    int listb[n];
    for (int i = 0; i < n; i++) {
        scanf("%d", &lista[i]);
    }
    for (int i = 0; i < n; i++) {
        scanf("%d", &listb[i]);
    }
    for (int i = 0; i < n; i++) {
        if (lista[i] == i + 1) {
            printf("%d ", 1);
        } else {
            printf("%d ", 2);
        }
    }
}

```

[/C]

[HAS]

```haskell

main = do
    [n, a, b] <- map read . words <$> getLine
    lista <- map read . words <$> getLine
    listb <- map read . words <$> getLine
    mapM_ (\i -> if lista !! i == i + 1 then print 1 else print 2) [0..n - 1]

```

[/HAS]

[JAV]

```java

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] lista = new int[n];
        int[] listb = new int[n];
        for (int i = 0; i < n; i++) {
            lista[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            listb[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (lista[i] == i + 1) {
                System.out.print(1 + " ");
            } else {
                System.out.print(2 + " ");
            }
        }
    }
}

```

[/JAV]

[PYT]

```python

n , a , b = [ int ( x ) for x in input ( ).split ( " " ) ]
lista = [ int ( x ) for x in input ( ).split ( " " ) ]
listb = [ int ( x ) for x in input ( ).split ( " " ) ]
for k in range ( n ) :
    if k + 1 in lista :
        print ( 1 , end = " " )
    else :
        print ( 2 , end = " " )


```

[/PYT]

[CPP]

```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, a, b;
    cin >> n >> a >> b;
    vector<int> lista(n);
    vector<int> listb(n);
    for (int i = 0; i < n; i++) {
        cin >> lista[i];
    }
    for (int i = 0; i < n; i++) {
        cin >> listb[i];
    }
    for (int i = 0; i < n; i++) {
        if (lista[i] == i + 1) {
            cout << 1 << " ";
        } else {
            cout << 2 << " ";
        }
    }
}

```

[/CPP]

[C]

```c

#include <stdio.h>

int main() {
    int n, a, b;
    scanf("%d %d %d", &n, &a, &b);
    int lista[n];
    int listb[n];
    for (int i = 0; i < n; i++) {
        scanf("%d", &lista[i]);
    }
    for (int i = 0; i < n; i++) {
        scanf("%d", &listb[i]);
    }
    for (int i = 0; i < n; i++) {
        if (lista[i] == i + 1) {
            printf("%d ", 1);
        } else {
            printf("%d ", 2);
        }
    }
}

```

[/C]

[HAS]

```haskell

main = do
    [n, a, b] <- map read . words <$> getLine
    lista <- map read . words <$> getLine
    listb <- map read . words <$> getLine
    mapM_ (\i -> if lista !! i == i + 1 then print 1 else print 2) [0..n - 1]

```

[/HAS]

[JAV]

```java

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] lista = new int[n];
        int[] listb = new int[n];
        for (int i = 0; i < n; i++) {
            lista[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            listb[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (lista[i] == i + 1) {
                System.out.print(1 + " ");
            } else {
                System.out.print(2 + " ");
            }
        }
    }
}

```

[/JAV]

[PYT]

```python

n , a , b = [ int ( x ) for x in input ( ).split ( " " ) ]
lista = [ int ( x ) for x in input ( ).split ( " " ) ]
listb = [ int ( x ) for x in input ( ).split ( " " ) ]
for k in range ( n ) :
    if k + 1 in lista :
        print ( 1 , end = " " )
    else :
        print ( 2 , end = " " )


```

[/PYT]

[CPP]

```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, a, b;
    cin >> n >> a >> b;
    vector<int> lista(n);
    vector<int> listb(n);
    for (int i = 0; i < n; i++) {
        cin >> lista[i];
    }
    for (int i = 0; i < n; i++) {
        cin >> listb[i];
    }
    for (int i = 0; i < n; i++) {
        if (lista[i] == i + 1) {
            cout << 1 << " ";
        } else {
            cout << 2 << " ";
        }
    }
}

```

[/CPP]

[C]

```c

#include <stdio.h>

int main() {
    int n, a, b;
    scanf("%d %d %d", &n, &a, &b);
    int lista[n];
    int listb[n];
    for (int i = 0; i < n; i++) {
        scanf("%d", &lista[i]);
    }
    for (int i = 0; i < n; i++) {
        scanf("%d", &listb[i]);
    }
    for (int i = 0; i < n; i++) {
        if (lista[i] == i + 1) {
            printf("%d ", 1);
        } else {
            printf("%d ", 2);
        }
    }
}

```

[/C]

[HAS]

```haskell

main = do
    [n, a, b] <- map read . words <$> getLine
    lista <- map read . words <$> getLine
    listb <- map read . words <$> getLine
    mapM_ (\i -> if lista !! i == i + 1 then print 1 else print 2) [0..n - 1]

```

[/HAS]

[JAV]

```java

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] lista = new int[n];
        int[] listb = new int[n];
        for (int i = 0; i < n; i++) {
            lista[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            listb[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (lista[i] == i + 1) {
                System.out.print(1 + " ");
            } else {
                System.out.print(2 + " ");
            }
        }
    }
}

```

[/JAV]

[PYT]

```python

n , a , b = [ int ( x ) for x in input ( ).split ( " " )
