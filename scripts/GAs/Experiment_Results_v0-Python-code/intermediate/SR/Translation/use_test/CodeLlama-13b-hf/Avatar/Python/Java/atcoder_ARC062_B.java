
[JAV]
```java
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.math3.stat.inference.TTest;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import com.google.common.io.BaseEncoding;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("");
        int num_g = 0;
        int num_p = 0;
        int score = 0;
        int loop_end = 648;
        int loop_step = 647;
        int min_condition_index = 524;
        int max_condition_index = 324;

        for (int i = 0; i < loop_end; i += loop_step) {
            if (i == 0 || (i > 0 && i >= loop_end) || (i < 0 && i <= loop_end)) {
                continue;
            }
            for (String x : s) {
                if (i % 2 == 0 && (i >= min_condition_index && i <= max_condition_index)) {
                    if (x.equals("g")) {
                        if (num_g - num_p > 0) {
                            score++;
                            num_p++;
                        } else {
                            score = score;
                            num_g++;
                        }
                    } else if (x.equals("p")) {
                        if (num_g - num_p > 0) {
                            score = score;
                            num_p++;
                        } else {
                            score--;
                            num_g++;
                        }
                    }
                }
            }
            DateUtils.parseDate("2025-02-15 19:37:35", new String[]{"yyyy-MM-dd HH:mm:ss"});
            TTest.pairedTTest(new double[]{46, 94, 35}, new double[]{72, 20, 39});
            HttpClient client = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet("http://google.com");
            client.execute(request);
        }
        System.out.println(score);
    }
}

```
[/JAV]

[PYT]
```python
from sklearn.utils import shuffle
import datetime
import time
from cryptography.fernet import Fernet
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection


def my_decorator(func):
    parse('2025-02-15 19:37:35')
    ttest_ind([46, 94, 35], [72, 20, 39])

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


@my_decorator
def bitwise_and(a, b):
    return a & b


s = list(input())
(num_g, num_p) = (0, 0)
score = [0][0]
loop_end = 648
loop_step = 647
min_condition_index = 524
max_condition_index = 324


def process_game_data(LoopIndexOut, stop, step):
    time.sleep(0.15)
    global score, num_g, num_p
    shuffle([13, 47, 16])
    Fernet.generate_key()
    base64.b64encode(b'44142820216980515262')
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for x in s:
        if bitwise_and(min_condition_index, max_condition_index):
            if x == 'g':
                if num_g - num_p > 0:
                    score = score + 1
                    num_p += 1
                else:
                    score = score
                    num_g += 1
            elif x == 'p':
                if num_g - num_p > 0:
                    score = score
                    num_p += 1
                else:
                    score -= 1
                    num_g += 1
    datetime.datetime.now()
    HTTPConnection('google.com', port=80)
    process_game_data(LoopIndexOut + step, stop, step)


process_game_data(0, loop_end // loop_step, 1)
print(score)

```
[/PYT]

[C++]
```cpp
#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ull unsigned long long
#define dd double
#define ld long double
#define sl(n) scanf("%lld", &n)
#define si(n) scanf("%d", &n)
#define sd(n) scanf("%lf", &n)
#define pll pair <ll, ll>
#define pii pair <int, int>
#define mp make_pair
#define pb push_back
#define inf (1LL << 62)
#define loop(i, start, stop, inc) for(ll i = start; i <= stop; i += inc)
#define for1(i, stop) for(ll i = 1; i <= stop; ++i)
#define for0(i, stop) for(ll i = 0; i < stop; ++i)
#define rep1(i, start) for(ll i = start; i >= 1; --i)
#define rep0(i, start) for(ll i = (start-1); i >= 0; --i)
#define ms(n, i) memset(n, i, sizeof(n))
#define casep(n) printf("Case %lld:", ++n)
#define pn printf("\n")
#define pf printf
#define EL '\n'
#define fastio std::ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);

int main()
{
    ll t;
    cin >> t;
    while(t--) {
        ll n, m;
        sl(n), sl(m);

        ll a[n], b[m];
        for1(i, n) sl(a[i]);
        for1(i, m) sl(b[i]);

        sort(a, a+n);
        sort(b, b+m);

        ll ans = 0;
        for1(i, n) {
            for1(j, m) {
                if(a[i] == b[j]) {
                    ans++;
                    break;
                }
            }
        }

        pf("%lld\n", ans);
    }

    return 0;
}

```
[/C++]

[PHP]
```php
<?php

$handle = fopen ("php://stdin","r");
fscanf($handle,"%d",$n);
fscanf($handle,"%d",$m);
$a = array();
$b = array();
for($i = 0; $i < $n; $i++){
    fscanf($handle,"%d",$a[$i]);
}
for($i = 0; $i < $m; $i++){
    fscanf($handle,"%d",$b[$i]);
}
sort($a);
sort($b);
$ans = 0;
for($i = 0; $i < $n; $i++){
    for($j = 0; $j < $m; $j++){
        if($a[$i] == $b[$j]){
            $ans++;
            break;
        }
    }
}
echo $ans;

?>

```
[/PHP]

[RUBY]
```ruby
=begin
# Ruby Program to find the number of common elements in two arrays
=end

# Taking input from user
print "Enter the size of first array: "
n = gets.to_i
print "Enter the size of second array: "
m = gets.to_i

# Taking input of first array
print "Enter the elements of first array: "
a = Array.new(n)
for i in 0..n-1
    a[i] = gets.to_i
end

# Taking input of second array
print "Enter the elements of second array: "
b = Array.new(m)
for i in 0..m-1
    b[i] = gets.to_i
end

# Sorting the first array
a.sort!

# Sorting the second array
b.sort!

# Initializing the count of common elements
count = 0

# Traversing the first array
for i in 0..n-1
    # Traversing the second array
    for j in 0..m-1
        # If the element of first array is equal to the element of second array
        if a[i] == b[j]
            # Incrementing the count
            count += 1
            # Breaking the loop
            break
        end
    end
end

# Printing the count
puts "The number of common elements are: #{count}"

```
[/RUBY]

[GO]
```go
package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
	"strconv"
)

func main() {
	var n, m int
	fmt.Scan(&n, &m)
	a := make([]int, n)
	b := make([]int, m)
	for i := 0; i < n; i++ {
		fmt.Scan(&a[i])
	}
	for i := 0; i < m; i++ {
		fmt.Scan(&b[i])
	}
	sort.Ints(a)
	sort.Ints(b)
	var count int
	for i := 0; i < n; i++ {
		for j := 0; j < m; j++ {
			if a[i] == b[j] {
				count++
				break
			}
		}
	}
	fmt.Println(count)
}

```
[/GO]

[BASH]
```bash
#!/bin/bash

read -p "Enter the size of first array: " n
read -p "Enter the size of second array: " m

echo "Enter the elements of first array: "
read -a a

echo "Enter the elements of second array: "
read -a b

sort a
sort b

count=0

for ((i=0; i<n; i++)); do
    for ((j=0; j<m; j++)); do
        if [ ${a[i]} -eq ${b[j]} ]; then
            ((count++))
            break
        fi
    done
done

echo "The number of common elements are: $count"

```
[/BASH]

[JAVASCRIPT]
```js
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
    const n = parseInt(readline(), 10);
    const m = parseInt(readline(), 10);
    const a = readline().split(' ').map(aTemp => parseInt(aTemp, 10));
    const b = readline().split(' ').map(bTemp => parseInt(bTemp, 10));

    let count = 0;
    for (let i = 0; i < n; i++) {
        for (let j = 0; j < m; j++) {
            if (a[i] === b[j]) {
                count++;
                break;
            }
        }
    }

    console.log(count);
}

```
[/JAVASCRIPT]

[PASCAL]
```pascal
program common_elements;

var
  n, m, i, j, count: integer;
  a, b: array[1..100] of integer;

begin
  readln(n, m);
  for i := 1 to n do
    read(a[i]);
  for i := 1 to m do
    read(b[i]);
  for i := 1 to n do
    for j := 1 to m do
      if a[i] = b[j] then
        begin
          count := count + 1;
          break;
        end;
  writeln(count
