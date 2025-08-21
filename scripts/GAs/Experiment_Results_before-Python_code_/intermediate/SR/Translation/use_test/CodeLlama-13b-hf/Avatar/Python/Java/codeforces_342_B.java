
[JAV]

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int f = sc.nextInt();
        if (s < f) {
            int d = 1;
            char c = 'R';
        } else {
            int d = -1;
            char c = 'L';
        }
        String res = "";
        int i = 1;
        int j = s;
        int t, l, r;
        int k = 1;
        while (j != f) {
            if (i > t && k < m) {
                t = sc.nextInt();
                l = sc.nextInt();
                r = sc.nextInt();
                k += 1;
            }
            if (i == t && (l <= j && j <= r || l <= j + d && j + d <= r)) {
                res += "X";
            } else {
                res += c;
                j += d;
            }
            i += 1;
        }
        System.out.println(res);
    }
}

```

[/JAV]

[PY]

```
n, m, s, f = map(int, input().split())
if s < f:
    d = 1
    c = 'R'
else:
    d = -1
    c = 'L'
res = ""
i = 1
j = s
t, l, r = map(int, input().split())
k = 1
while j != f:
    if i > t and k < m:
        t, l, r = map(int, input().split())
        k += 1
    if i == t and (l <= j <= r or l <= j + d <= r):
        res += 'X'
    else:
        res += c
        j += d
    i += 1
print(res)

```

[/PY]

[C++]

```
#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, m, s, f;
    cin >> n >> m >> s >> f;
    if (s < f) {
        int d = 1;
        char c = 'R';
    } else {
        int d = -1;
        char c = 'L';
    }
    string res = "";
    int i = 1;
    int j = s;
    int t, l, r;
    int k = 1;
    while (j != f) {
        if (i > t && k < m) {
            cin >> t >> l >> r;
            k += 1;
        }
        if (i == t && (l <= j && j <= r || l <= j + d && j + d <= r)) {
            res += "X";
        } else {
            res += c;
            j += d;
        }
        i += 1;
    }
    cout << res << endl;
}

```

[/C++]

[PHP]

```
<?php
$n = (int)trim(fgets(STDIN));
$m = (int)trim(fgets(STDIN));
$s = (int)trim(fgets(STDIN));
$f = (int)trim(fgets(STDIN));
if ($s < $f) {
    $d = 1;
    $c = 'R';
} else {
    $d = -1;
    $c = 'L';
}
$res = "";
$i = 1;
$j = $s;
$t = (int)trim(fgets(STDIN));
$l = (int)trim(fgets(STDIN));
$r = (int)trim(fgets(STDIN));
$k = 1;
while ($j != $f) {
    if ($i > $t && $k < $m) {
        $t = (int)trim(fgets(STDIN));
        $l = (int)trim(fgets(STDIN));
        $r = (int)trim(fgets(STDIN));
        $k += 1;
    }
    if ($i == $t && ($l <= $j && $j <= $r || $l <= $j + $d && $j + $d <= $r)) {
        $res .= 'X';
    } else {
        $res .= $c;
        $j += $d;
    }
    $i += 1;
}
echo $res;

```

[/PHP]

[RUBY]

```
n, m, s, f = gets.split.map(&:to_i)
if s < f
    d = 1
    c = 'R'
else
    d = -1
    c = 'L'
end
res = ""
i = 1
j = s
t, l, r = gets.split.map(&:to_i)
k = 1
while j != f
    if i > t and k < m
        t, l, r = gets.split.map(&:to_i)
        k += 1
    end
    if i == t and (l <= j and j <= r or l <= j + d and j + d <= r)
        res += 'X'
    else
        res += c
        j += d
    end
    i += 1
end
puts res

```

[/RUBY]

[GO]

```
package main

import (
    "fmt"
    "strconv"
)

func main() {
    var n, m, s, f int
    fmt.Scan(&n, &m, &s, &f)
    if s < f {
        d := 1
        c := 'R'
    } else {
        d := -1
        c := 'L'
    }
    var res string
    i := 1
    j := s
    var t, l, r int
    k := 1
    for j != f {
        if i > t && k < m {
            fmt.Scan(&t, &l, &r)
            k += 1
        }
        if i == t && (l <= j && j <= r || l <= j+d && j+d <= r) {
            res += "X"
        } else {
            res += string(c)
            j += d
        }
        i += 1
    }
    fmt.Println(res)
}

```

[/GO]

[BASH]

```
read n m s f
if [ $s -lt $f ]; then
    d=1
    c=R
else
    d=-1
    c=L
fi
res=""
i=1
j=$s
read t l r
k=1
while [ $j -ne $f ]; do
    if [ $i -gt $t -a $k -lt $m ]; then
        read t l r
        k=$((k+1))
    fi
    if [ $i -eq $t -a \( \( $l -le $j -a $j -le $r \) -o \( $l -le $j+$d -a $j+$d -le $r \) \) ]; then
        res+="X"
    else
        res+=$c
        j=$((j+d))
    fi
    i=$((i+1))
done
echo $res

```

[/BASH]

[PERL]

```
$n = <STDIN>;
$m = <STDIN>;
$s = <STDIN>;
$f = <STDIN>;
if ($s < $f) {
    $d = 1;
    $c = 'R';
} else {
    $d = -1;
    $c = 'L';
}
$res = "";
$i = 1;
$j = $s;
$t = <STDIN>;
$l = <STDIN>;
$r = <STDIN>;
$k = 1;
while ($j != $f) {
    if ($i > $t && $k < $m) {
        $t = <STDIN>;
        $l = <STDIN>;
        $r = <STDIN>;
        $k += 1;
    }
    if ($i == $t && ($l <= $j && $j <= $r || $l <= $j + $d && $j + $d <= $r)) {
        $res .= 'X';
    } else {
        $res .= $c;
        $j += $d;
    }
    $i += 1;
}
print $res;

```

[/PERL]

[PASCAL]

```
program problem;
var
    n, m, s, f, d, i, j, t, l, r, k: integer;
    c: char;
    res: string;
begin
    readln(n, m, s, f);
    if s < f then
        d := 1
    else
        d := -1;
    c := 'R';
    res := '';
    i := 1;
    j := s;
    readln(t, l, r);
    k := 1;
    while j <> f do
    begin
        if i > t and k < m then
        begin
            readln(t, l, r);
            k += 1;
        end;
        if i = t and (l <= j and j <= r or l <= j + d and j + d <= r) then
            res := res + 'X'
        else
        begin
            res := res + c;
            j := j + d;
        end;
        i := i + 1;
    end;
    writeln(res);
end.

```

[/PASCAL]

[JULIA]

```
n, m, s, f = parse.(Int, split(readline()))
if s < f
    d = 1
    c = 'R'
else
    d = -1
    c = 'L'
end
res = ""
i = 1
j = s
t, l, r = parse.(Int, split(readline()))
k = 1
while j != f
    if i > t && k < m
        t, l, r = parse.(Int, split(readline()))
        k += 1
    end
    if i == t && (l <= j && j <= r || l <= j + d && j + d <= r)
        res *= 'X'
    else
        res *= c
        j += d
    end
    i += 1
end
println(res)

```

[/JULIA]

[C#]

```
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int m = int.Parse(Console.ReadLine());
            int s = int.Parse(Console.ReadLine());
            int f = int.Parse(Console.ReadLine());
            if (s < f)
            {
                int d = 1;
                char c = 'R';
            }
            else
            {
                int d = -1;
                char c = 'L';
            }
            string res = "";
            int i = 1;
            int j = s;
            int t = int.Parse(Console.ReadLine());
            int l = int.Parse(Console.ReadLine());
            int r = int.Parse(Console.ReadLine());
            int k = 1;
            while (j != f)
            {
                if (i > t && k < m)
                {
                    t = int.Parse(Console.ReadLine());
                    l = int.Parse(Console.ReadLine());
                    r = int.Parse(Console.ReadLine());
                    k += 1;
                }
                if (i == t && (l <= j && j <= r || l <= j + d && j + d <= r))
                    res += "X";
                else
                {
                    res += c;
                    j += d;
                }
                i += 1;
            }
            Console.WriteLine(res);
        }
    }
}

```

[/C#]

[HASKELL]

```
main = do
    [n, m, s, f] <- map read . words <$> getLine
    if s < f
        then do
            let d = 1
            let c = 'R'
        else do
            let d = -1
            let c = 'L'
    res <- return ""
    i <- return 1
    j <- return s
    [t, l, r] <- map read . words <$> getLine
    k <- return 1
    while (j /= f) $ do
        if (i > t && k < m)
            then do
                [t, l, r] <- map read . words <$> getLine
                k <- return (k + 1)
            else return ()
        if (i == t && (l <= j && j <= r || l <= j + d && j + d <= r))
            then do
                res <- return (res ++ "X")
            else do
                res <- return (res ++
