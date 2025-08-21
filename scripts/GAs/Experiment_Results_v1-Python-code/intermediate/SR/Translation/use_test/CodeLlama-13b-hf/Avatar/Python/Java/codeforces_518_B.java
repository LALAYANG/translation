
[JAV]
```java
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        Map<Character, Integer> freqs = new HashMap<>();
        Map<Character, Integer> target_frequencies = new HashMap<>();
        int exact_matches = 0;
        int whoops = 0;
        for (int i = 0; i < s.length(); i++) {
            char current_char = s.charAt(i);
            if (freqs.containsKey(current_char)) {
                freqs.put(current_char, freqs.get(current_char) + 1);
            } else {
                freqs.put(current_char, 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char current_char = t.charAt(i);
            if (target_frequencies.containsKey(current_char)) {
                target_frequencies.put(current_char, target_frequencies.get(current_char) + 1);
            } else {
                target_frequencies.put(current_char, 1);
            }
        }
        for (char current_char : freqs.keySet()) {
            while (freqs.get(current_char) > 0 && target_frequencies.containsKey(current_char) && target_frequencies.get(current_char) > 0) {
                exact_matches++;
                freqs.put(current_char, freqs.get(current_char) - 1);
                target_frequencies.put(current_char, target_frequencies.get(current_char) - 1);
            }
        }
        for (char current_char : freqs.keySet()) {
            while (freqs.get(current_char) > 0) {
                if (Character.isLowerCase(current_char) && target_frequencies.containsKey(Character.toUpperCase(current_char)) && target_frequencies.get(Character.toUpperCase(current_char)) > 0) {
                    whoops++;
                    freqs.put(current_char, freqs.get(current_char) - 1);
                    target_frequencies.put(Character.toUpperCase(current_char), target_frequencies.get(Character.toUpperCase(current_char)) - 1);
                } else if (Character.isUpperCase(current_char) && target_frequencies.containsKey(Character.toLowerCase(current_char)) && target_frequencies.get(Character.toLowerCase(current_char)) > 0) {
                    whoops++;
                    freqs.put(current_char, freqs.get(current_char) - 1);
                    target_frequencies.put(Character.toLowerCase(current_char), target_frequencies.get(Character.toLowerCase(current_char)) - 1);
                } else {
                    break;
                }
            }
        }
        System.out.println(exact_matches + " " + whoops);
    }
}
```
[/JAV]

[PYT]
```python
s = input()
t = input()
freqs = dict()
target_frequencies = dict()
(exact_matches, whoops) = (0, 0)
for current_char in s:
    if current_char in freqs:
        freqs[current_char] += 1
    else:
        freqs[current_char] = 1
for current_char in t:
    if current_char in target_frequencies:
        target_frequencies[current_char] += 1
    else:
        target_frequencies[current_char] = 1
for current_char in freqs.keys():
    while freqs[current_char] > 0 and current_char in target_frequencies and (target_frequencies[current_char] > 0):
        exact_matches += 1
        freqs[current_char] -= 1
        target_frequencies[current_char] -= 1
for current_char in freqs.keys():
    while freqs[current_char] > 0:
        if current_char.islower() and current_char.upper() in target_frequencies.keys() and (target_frequencies[current_char.upper()] > 0):
            whoops += 1
            freqs[current_char] -= 1
            target_frequencies[current_char.upper()] -= 1
        elif current_char.isupper() and current_char.lower() in target_frequencies.keys() and (target_frequencies[current_char.lower()] > 0):
            whoops += 1
            freqs[current_char] -= 1
            target_frequencies[current_char.lower()] -= 1
        else:
            break
print(exact_matches, whoops)
```
[/PYT]

[C++]
```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    string s, t;
    cin >> s >> t;
    map<char, int> freqs, target_frequencies;
    int exact_matches = 0, whoops = 0;
    for (int i = 0; i < s.length(); i++) {
        char current_char = s[i];
        if (freqs.find(current_char) != freqs.end()) {
            freqs[current_char]++;
        } else {
            freqs[current_char] = 1;
        }
    }
    for (int i = 0; i < t.length(); i++) {
        char current_char = t[i];
        if (target_frequencies.find(current_char) != target_frequencies.end()) {
            target_frequencies[current_char]++;
        } else {
            target_frequencies[current_char] = 1;
        }
    }
    for (auto it : freqs) {
        while (it.second > 0 && target_frequencies.find(it.first) != target_frequencies.end() && target_frequencies[it.first] > 0) {
            exact_matches++;
            it.second--;
            target_frequencies[it.first]--;
        }
    }
    for (auto it : freqs) {
        while (it.second > 0) {
            if (islower(it.first) && target_frequencies.find(toupper(it.first)) != target_frequencies.end() && target_frequencies[toupper(it.first)] > 0) {
                whoops++;
                it.second--;
                target_frequencies[toupper(it.first)]--;
            } else if (isupper(it.first) && target_frequencies.find(tolower(it.first)) != target_frequencies.end() && target_frequencies[tolower(it.first)] > 0) {
                whoops++;
                it.second--;
                target_frequencies[tolower(it.first)]--;
            } else {
                break;
            }
        }
    }
    cout << exact_matches << " " << whoops << endl;
    return 0;
}
```
[/C++]

[C]
```c
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <ctype.h>

int main() {
    char s[1000000], t[1000000];
    scanf("%s", s);
    scanf("%s", t);
    int freqs[256] = {0};
    int target_frequencies[256] = {0};
    int exact_matches = 0, whoops = 0;
    for (int i = 0; i < strlen(s); i++) {
        freqs[(int)s[i]]++;
    }
    for (int i = 0; i < strlen(t); i++) {
        target_frequencies[(int)t[i]]++;
    }
    for (int i = 0; i < 256; i++) {
        while (freqs[i] > 0 && target_frequencies[i] > 0) {
            exact_matches++;
            freqs[i]--;
            target_frequencies[i]--;
        }
    }
    for (int i = 0; i < 256; i++) {
        while (freqs[i] > 0) {
            if (islower(i) && target_frequencies[toupper(i)] > 0) {
                whoops++;
                freqs[i]--;
                target_frequencies[toupper(i)]--;
            } else if (isupper(i) && target_frequencies[tolower(i)] > 0) {
                whoops++;
                freqs[i]--;
                target_frequencies[tolower(i)]--;
            } else {
                break;
            }
        }
    }
    printf("%d %d\n", exact_matches, whoops);
    return 0;
}
```
[/C]

[PHP]
```php
<?php
$s = trim(fgets(STDIN));
$t = trim(fgets(STDIN));
$freqs = array_fill(0, 256, 0);
$target_frequencies = array_fill(0, 256, 0);
$exact_matches = 0;
$whoops = 0;
for ($i = 0; $i < strlen($s); $i++) {
    $freqs[ord($s[$i])]++;
}
for ($i = 0; $i < strlen($t); $i++) {
    $target_frequencies[ord($t[$i])]++;
}
for ($i = 0; $i < 256; $i++) {
    while ($freqs[$i] > 0 && $target_frequencies[$i] > 0) {
        $exact_matches++;
        $freqs[$i]--;
        $target_frequencies[$i]--;
    }
}
for ($i = 0; $i < 256; $i++) {
    while ($freqs[$i] > 0) {
        if (ctype_lower($i) && $target_frequencies[ord(strtoupper($i))] > 0) {
            $whoops++;
            $freqs[$i]--;
            $target_frequencies[ord(strtoupper($i))]--;
        } else if (ctype_upper($i) && $target_frequencies[ord(strtolower($i))] > 0) {
            $whoops++;
            $freqs[$i]--;
            $target_frequencies[ord(strtolower($i))]--;
        } else {
            break;
        }
    }
}
echo $exact_matches . " " . $whoops . PHP_EOL;
```
[/PHP]

[RUBY]
```ruby
s = gets.chomp
t = gets.chomp
freqs = Array.new(256, 0)
target_frequencies = Array.new(256, 0)
exact_matches = 0
whoops = 0
for i in 0..s.length - 1
    freqs[s[i].ord] += 1
end
for i in 0..t.length - 1
    target_frequencies[t[i].ord] += 1
end
for i in 0..255
    while freqs[i] > 0 && target_frequencies[i] > 0
        exact_matches += 1
        freqs[i] -= 1
        target_frequencies[i] -= 1
    end
end
for i in 0..255
    while freqs[i] > 0
        if i.chr.downcase == i.chr.upcase
            break
        end
        if i.chr.downcase == i.chr.upcase.downcase && target_frequencies[i.chr.upcase.ord] > 0
            whoops += 1
            freqs[i] -= 1
            target_frequencies[i.chr.upcase.ord] -= 1
        elsif i.chr.downcase == i.chr.upcase.upcase && target_frequencies[i.chr.downcase.ord] > 0
            whoops += 1
            freqs[i] -= 1
            target_frequencies[i.chr.downcase.ord] -= 1
        else
            break
        end
    end
end
puts exact_matches.to_s + " " + whoops.to_s
```
[/RUBY]

[GO]
```go
package main

import (
    "bufio"
    "fmt"
    "os"
    "strings
