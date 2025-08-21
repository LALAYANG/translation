
[JAV]
```java
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] L = new int[N + 1];
        for (int i = 0; i < N; i++) {
            L[i] = sc.nextInt();
        }
        L[N] = -1;
        int[] path = new int[N + 1];
        int ind = 0;
        int count = 0;
        int x = 1;
        int t = -1;
        boolean flag = false;
        Map<Integer, Integer> Hash = new HashMap<>();
        for (int current_node_index = 0; current_node_index < N + 1; current_node_index++) {
            int ne = L[x];
            if (Hash.containsKey(ne)) {
                flag = true;
                t = Hash.get(ne);
                break;
            }
            path[ind] = ne;
            ind++;
            Hash.put(ne, ind);
            x = ne;
        }
        if (flag == true) {
            int[] loop = new int[ind - t];
            for (int i = t; i < ind; i++) {
                loop[i - t] = path[i];
            }
            if (K < ind) {
                System.out.println(path[K]);
            } else {
                K = K - ind;
                K = K % loop.length;
                System.out.println(loop[K]);
            }
        } else {
            System.out.println(path[K - 1]);
        }
    }
}
```
[/JAV]

[PY]
```python
import sys

N, K = map(int, input().split())
L = list(map(int, input().split()))
L.insert(0, -1)
path = [1]
ind = 0
count = 0
x = 1
t = -1
flag = False
Hash = defaultdict(lambda : 0)
for current_node_index in range(N + 1):
    ne = L[x]
    if Hash[ne]:
        flag = True
        t = Hash[ne]
        break
    path.append(ne)
    ind = ind + 1
    Hash[ne] = ind
    x = ne
if flag == True:
    loop = path[t:]
    if K < len(path):
        print(path[K])
    else:
        K = K - len(path)
        K = K % len(loop)
        print(loop[K])
else:
    print(path[K - 1])
```
[/PY]

[C++]
```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int N, K;
    cin >> N >> K;
    vector<int> L(N + 1);
    for (int i = 0; i < N; i++) {
        cin >> L[i];
    }
    L[N] = -1;
    vector<int> path(N + 1);
    int ind = 0;
    int count = 0;
    int x = 1;
    int t = -1;
    bool flag = false;
    unordered_map<int, int> Hash;
    for (int current_node_index = 0; current_node_index < N + 1; current_node_index++) {
        int ne = L[x];
        if (Hash.find(ne) != Hash.end()) {
            flag = true;
            t = Hash[ne];
            break;
        }
        path[ind] = ne;
        ind++;
        Hash[ne] = ind;
        x = ne;
    }
    if (flag == true) {
        vector<int> loop(ind - t);
        for (int i = t; i < ind; i++) {
            loop[i - t] = path[i];
        }
        if (K < ind) {
            cout << path[K] << endl;
        } else {
            K = K - ind;
            K = K % loop.size();
            cout << loop[K] << endl;
        }
    } else {
        cout << path[K - 1] << endl;
    }
}
```
[/C++]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

int main() {
    int N, K;
    scanf("%d %d", &N, &K);
    int *L = malloc(sizeof(int) * (N + 1));
    for (int i = 0; i < N; i++) {
        scanf("%d", &L[i]);
    }
    L[N] = -1;
    int *path = malloc(sizeof(int) * (N + 1));
    int ind = 0;
    int count = 0;
    int x = 1;
    int t = -1;
    bool flag = false;
    int *Hash = malloc(sizeof(int) * (N + 1));
    memset(Hash, 0, sizeof(int) * (N + 1));
    for (int current_node_index = 0; current_node_index < N + 1; current_node_index++) {
        int ne = L[x];
        if (Hash[ne]) {
            flag = true;
            t = Hash[ne];
            break;
        }
        path[ind] = ne;
        ind++;
        Hash[ne] = ind;
        x = ne;
    }
    if (flag == true) {
        int *loop = malloc(sizeof(int) * (ind - t));
        for (int i = t; i < ind; i++) {
            loop[i - t] = path[i];
        }
        if (K < ind) {
            printf("%d\n", path[K]);
        } else {
            K = K - ind;
            K = K % (ind - t);
            printf("%d\n", loop[K]);
        }
    } else {
        printf("%d\n", path[K - 1]);
    }
}
```
[/C]

[GO]
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
	var N, K int
	fmt.Scan(&N, &K)
	L := make([]int, N+1)
	for i := 0; i < N; i++ {
		fmt.Scan(&L[i])
	}
	L[N] = -1
	path := make([]int, N+1)
	ind := 0
	count := 0
	x := 1
	t := -1
	flag := false
	Hash := make(map[int]int)
	for current_node_index := 0; current_node_index < N+1; current_node_index++ {
		ne := L[x]
		if Hash[ne] != 0 {
			flag = true
			t = Hash[ne]
			break
		}
		path[ind] = ne
		ind++
		Hash[ne] = ind
		x = ne
	}
	if flag == true {
		loop := make([]int, ind-t)
		for i := t; i < ind; i++ {
			loop[i-t] = path[i]
		}
		if K < ind {
			fmt.Println(path[K])
		} else {
			K = K - ind
			K = K % (ind - t)
			fmt.Println(loop[K])
		}
	} else {
		fmt.Println(path[K-1])
	}
}
```
[/GO]

[PHP]
```php
<?php
$stdin = fopen('php://stdin', 'r');
$stdout = fopen('php://stdout', 'w');

fscanf(STDIN, "%d %d\n", $N, $K);
$L = array_map('intval', explode(' ', fgets(STDIN)));
$L[] = -1;
$path = array();
$ind = 0;
$count = 0;
$x = 1;
$t = -1;
$flag = false;
$Hash = array();
for ($current_node_index = 0; $current_node_index < $N + 1; $current_node_index++) {
    $ne = $L[$x];
    if (isset($Hash[$ne])) {
        $flag = true;
        $t = $Hash[$ne];
        break;
    }
    $path[$ind] = $ne;
    $ind++;
    $Hash[$ne] = $ind;
    $x = $ne;
}
if ($flag == true) {
    $loop = array_slice($path, $t);
    if ($K < $ind) {
        echo $path[$K] . "\n";
    } else {
        $K = $K - $ind;
        $K = $K % count($loop);
        echo $loop[$K] . "\n";
    }
} else {
    echo $path[$K - 1] . "\n";
}
```
[/PHP]

[RUBY]
```ruby
N, K = gets.split.map(&:to_i)
L = gets.split.map(&:to_i)
L << -1
path = []
ind = 0
count = 0
x = 1
t = -1
flag = false
Hash = {}
for current_node_index in 0..(N + 1) do
    ne = L[x]
    if Hash[ne]
        flag = true
        t = Hash[ne]
        break
    end
    path[ind] = ne
    ind += 1
    Hash[ne] = ind
    x = ne
end
if flag == true
    loop = path[t..-1]
    if K < ind
        puts path[K]
    else
        K = K - ind
        K = K % loop.length
        puts loop[K]
    end
else
    puts path[K - 1]
end
```
[/RUBY]

[SWIFT]
```swift
import Foundation

let N: Int = Int(readLine()!)!
let K: Int = Int(readLine()!)!
let L: [Int] = readLine()!.split(separator: " ").map{ Int(String($0))! }
L.append(-1)
var path: [Int] = []
var ind: Int = 0
var count: Int = 0
var x: Int = 1
var t: Int = -1
var flag: Bool = false
var Hash: [Int: Int] = [:]
for current_node_index in 0..<(N + 1) {
    let ne: Int = L[x]
    if Hash[ne] != nil {
        flag = true
        t = Hash[ne]!
        break
    }
    path.append(ne)
    ind += 1
    Hash[ne] = ind
    x = ne
}
if flag == true {
    let loop: [Int] = Array(path[t..<path.count])
    if K < ind {
        print(path[K])
    } else {
        K = K - ind
        K = K % loop.count
        print(loop[K])
    }
} else {
    print(path[K - 1])
}
```
[/SWIFT]

[JAVASCRIPT]
```javascript
'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });

    main();
});

function readline() {
    return inputString[currentLine++];
}

function main() {
    const N = parseInt(readline(), 10);
    const K = parseInt(readline(), 1
