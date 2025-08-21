
[JAV]

```java

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        int cu = 0;
        int cl = 0;
        for (int i = 0; i < txt.length(); i++) {
            if (Character.isLowerCase(txt.charAt(i))) {
                cl++;
            } else {
                cu++;
            }
        }
        if (cu > cl) {
            System.out.println(txt.toUpperCase());
        } else {
            System.out.println(txt.toLowerCase());
        }
    }
}

```

[/JAV]

[PY]

```python

txt = input()
cu = 0
cl = 0
for z in txt:
    if z.islower():
        cl = cl + 1
    else:
        cu = cu + 1
if cu > cl:
    out = txt.upper()
else:
    out = txt.lower()
print(out)

```

[/PY]

[C]

```c

#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main() {
    char txt[1000];
    int cu = 0, cl = 0;
    scanf("%s", txt);
    for (int i = 0; i < strlen(txt); i++) {
        if (islower(txt[i])) {
            cl++;
        } else {
            cu++;
        }
    }
    if (cu > cl) {
        for (int i = 0; i < strlen(txt); i++) {
            txt[i] = toupper(txt[i]);
        }
    } else {
        for (int i = 0; i < strlen(txt); i++) {
            txt[i] = tolower(txt[i]);
        }
    }
    printf("%s", txt);
    return 0;
}

```

[/C]

[CPP]

```cpp

#include <iostream>
#include <string>
#include <cctype>

using namespace std;

int main() {
    string txt;
    int cu = 0, cl = 0;
    cin >> txt;
    for (int i = 0; i < txt.length(); i++) {
        if (islower(txt[i])) {
            cl++;
        } else {
            cu++;
        }
    }
    if (cu > cl) {
        for (int i = 0; i < txt.length(); i++) {
            txt[i] = toupper(txt[i]);
        }
    } else {
        for (int i = 0; i < txt.length(); i++) {
            txt[i] = tolower(txt[i]);
        }
    }
    cout << txt;
    return 0;
}

```

[/CPP]

[PHP]

```php

<?php
$txt = readline();
$cu = 0;
$cl = 0;
for ($i = 0; $i < strlen($txt); $i++) {
    if (ctype_lower($txt[$i])) {
        $cl++;
    } else {
        $cu++;
    }
}
if ($cu > $cl) {
    $out = strtoupper($txt);
} else {
    $out = strtolower($txt);
}
echo $out;

```

[/PHP]

[RUBY]

```ruby

txt = gets.chomp
cu = 0
cl = 0
txt.each_char do |z|
    if z.downcase == z
        cl += 1
    else
        cu += 1
    end
end
if cu > cl
    out = txt.upcase
else
    out = txt.downcase
end
puts out

```

[/RUBY]

[JAVASCRIPT]

```javascript

const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let txt = '';
let cu = 0;
let cl = 0;

rl.on('line', function (line) {
    txt = line;
    for (let i = 0; i < txt.length; i++) {
        if (txt[i] === txt[i].toLowerCase()) {
            cl++;
        } else {
            cu++;
        }
    }
    if (cu > cl) {
        out = txt.toUpperCase();
    } else {
        out = txt.toLowerCase();
    }
    console.log(out);
    rl.close();
});

```

[/JAVASCRIPT]

[PYTHON]

```python

txt = input()
cu = 0
cl = 0
for z in txt:
    if z.islower():
        cl = cl + 1
    else:
        cu = cu + 1
if cu > cl:
    out = txt.upper()
else:
    out = txt.lower()
print(out)

```

[/PYTHON]

[GO]

```go

package main

import (
    "fmt"
    "strings"
)

func main() {
    var txt string
    fmt.Scan(&txt)
    cu := 0
    cl := 0
    for _, v := range txt {
        if v >= 'a' && v <= 'z' {
            cl++
        } else {
            cu++
        }
    }
    if cu > cl {
        out := strings.ToUpper(txt)
        fmt.Println(out)
    } else {
        out := strings.ToLower(txt)
        fmt.Println(out)
    }
}

```

[/GO]

[BASH]

```bash

read txt
cu=0
cl=0
for (( i=0; i<${#txt}; i++ )); do
    if [[ ${txt:$i:1} =~ [a-z] ]]; then
        cl=$((cl+1))
    else
        cu=$((cu+1))
    fi
done
if (( cu > cl )); then
    out=$(echo $txt | tr '[:lower:]' '[:upper:]')
else
    out=$(echo $txt | tr '[:upper:]' '[:lower:]')
fi
echo $out

```

[/BASH]

[JULIA]

```julia

txt = readline()
cu = 0
cl = 0
for z in txt
    if islowercase(z)
        cl += 1
    else
        cu += 1
    end
end
if cu > cl
    out = uppercase(txt)
else
    out = lowercase(txt)
end
println(out)

```

[/JULIA]

[CSHARP]

```csharp

using System;

class Solution
{
    static void Main(string[] args)
    {
        string txt = Console.ReadLine();
        int cu = 0;
        int cl = 0;
        for (int i = 0; i < txt.Length; i++)
        {
            if (char.IsLower(txt[i]))
            {
                cl++;
            }
            else
            {
                cu++;
            }
        }
        if (cu > cl)
        {
            txt = txt.ToUpper();
        }
        else
        {
            txt = txt.ToLower();
        }
        Console.WriteLine(txt);
    }
}

```

[/CSHARP]

[HASKELL]

```haskell

import Data.Char

main = do
    txt <- getLine
    let cu = length $ filter isUpper txt
    let cl = length $ filter isLower txt
    let out = if cu > cl then map toUpper txt else map toLower txt
    putStrLn out

```

[/HASKELL]

[PERL]

```perl

use strict;
use warnings;

my $txt = <STDIN>;
chomp $txt;
my $cu = 0;
my $cl = 0;
foreach my $z (split //, $txt) {
    if ($z =~ /[a-z]/) {
        $cl++;
    } else {
        $cu++;
    }
}
if ($cu > $cl) {
    my $out = uc $txt;
    print "$out\n";
} else {
    my $out = lc $txt;
    print "$out\n";
}

```

[/PERL]

[ELIXIR]

```elixir

txt = IO.gets("")
cu = 0
cl = 0
for z <- String.split(txt, "", trim: true) do
    if String.downcase(z) == z do
        cl = cl + 1
    else
        cu = cu + 1
    end
end
if cu > cl do
    out = String.upcase(txt)
else
    out = String.downcase(txt)
end
IO.puts(out)

```

[/ELIXIR]

[FORTRAN]

```fortran

      program problem
      implicit none

      character(len=1000) :: txt
      integer :: cu, cl, i

      read *, txt
      cu = 0
      cl = 0
      do i = 1, len_trim(txt)
          if (ichar(txt(i:i)) >= 97 .and. ichar(txt(i:i)) <= 122) then
              cl = cl + 1
          else
              cu = cu + 1
          end if
      end do
      if (cu > cl) then
          out = uppercase(txt)
      else
          out = lowercase(txt)
      end if
      print *, out

      end program problem

```

[/FORTRAN]

[LUA]

```lua

txt = io.read()
cu = 0
cl = 0
for z in string.gmatch(txt, ".") do
    if string.lower(z) == z then
        cl = cl + 1
    else
        cu = cu + 1
    end
end
if cu > cl then
    out = string.upper(txt)
else
    out = string.lower(txt)
end
print(out)

```

[/LUA]

[JULIA-OLD]

```julia

txt = readline()
cu = 0
cl = 0
for z in txt
    if islowercase(z)
        cl += 1
    else
        cu += 1
    end
end
if cu > cl
    out = uppercase(txt)
else
    out = lowercase(txt)
end
println(out)

```

[/JULIA-OLD]

[COFFEESCRIPT]

```coffeescript

txt = readline()
cu = 0
cl = 0
for z in txt
    if z.toLowerCase() == z
        cl++
    else
        cu++
out = if cu > cl then txt.toUpperCase() else txt.toLowerCase()
console.log out

```

[/COFFEESCRIPT]

[D]

```d

import std.stdio;

void main()
{
    auto txt = readln();
    auto cu = 0;
    auto cl = 0;
    foreach (z; txt)
    {
        if (z.isLower())
            cl++;
        else
            cu++;
    }
    if (cu > cl)
        writeln(txt.toUpper());
    else
        writeln(txt.toLower());
}

```

[/D]

[R]

```r

txt <- readline()
cu <- 0
cl <- 0
for (z in txt) {
    if (z == tolower(z)) {
        cl <- cl + 1
    } else {
        cu <- cu + 1
    }
}
if (cu > cl) {
    out <- toupper(txt)
} else {
    out <- tolower(txt)
}
print(out)

```

[/R]

[DUMMY]

```dummy



```

[/DUMMY]

[SCALA]

```scala

object Main {
    def main(args: Array[String]) {
        val txt = scala.io.StdIn.readLine()
        var cu = 0
        var cl = 0
        for (z <- txt) {
            if (z.isLower) {
                cl += 1
            } else {
                cu += 1
            }
        }
        if (cu > cl) {
            val out = txt.toUpperCase
            println(out)
        } else {
            val out = txt.toLowerCase
            println(out)
        }
    }
}

```

[/SCALA]

[SWIFT]

```swift

import Foundation

let txt = readLine()!
var cu = 0
var cl = 0
for z in txt {
    if z.isLowercase() {
        cl += 1
    } else {
        cu += 1
    }
}
if cu > cl {
    let out = txt.uppercaseString
    print(out)
} else {
    let out = txt.lowercaseString
    print(out)
}

```

[/SWIFT]

[PASCAL]

```pascal

program problem;
var
    txt: string;
    cu, cl: integer;
    z: char;
begin
    readln(txt);
    cu := 0;
    cl := 0;
    for z in txt do
        if z in ['a'..'z'] then
            cl := cl + 1
        else
            cu := cu + 1
    end;
    if cu > cl then
        out := uppercase(txt)
    else
        out := lowercase(txt);
    writeln(out);
end.

```

[/PASCAL]

[JAVASCRIPT-OLD]

```javascript

var txt = readline();
var cu = 0;
var cl = 0;
for (var i = 0; i < txt.length; i++) {
    if (txt[i] >= 'a' && txt[i] <= 'z') {
        cl++;
    } else {
        cu++;
    }
}
if (cu > cl) {
    out = txt.toUpperCase();
} else {
    out = txt.toLowerCase();
}
print(out);

```

[/JAVASCRIPT-OLD]

[BASH-OLD]

```bash

read txt
cu=0
cl=0
for (( i=0; i<${#txt}; i++ )); do
    if [[ ${txt:$i:1} =~ [a-z] ]]; then
        cl=$((cl+1))
    else
