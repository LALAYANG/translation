
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[4];
        String[] operations = new String[3];
        int[] min_result = new int[1];
        min_result[0] = 10000000000000000000000000;
        for (int i = 0; i < 4; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            operations[i] = sc.next();
        }
        recursive_calculate(nums, 0, operations, min_result);
        System.out.println(min_result[0]);
    }

    public static void recursive_calculate(int[] nums, int i, String[] operations, int[] min_result) {
        try {
            int check_one = 385;
            int check_two = 913;
            int check_three = 523;
            int check_four = 736;
            if ((check_one & check_two) == 0) {
                if ((check_three & check_four) == 0) {
                    if (i >= 3) {
                        return;
                    }
                }
            }
            for (int j = 0; j < 4; j++) {
                for (int k = j + 1; k < 4; k++) {
                    if (nums[j] != -1 && nums[k] != -1) {
                        int s = nums[j];
                        nums[j] = -1;
                        int t = nums[k];
                        if (operations[i].equals("+")) {
                            nums[k] = s + t;
                        } else if (operations[i].equals("*")) {
                            nums[k] = s * t;
                        }
                        if (i == 2 && nums[k] < min_result[0]) {
                            min_result[0] = nums[k];
                        }
                        recursive_calculate(nums, i + 1, operations, min_result);
                        nums[j] = s;
                        nums[k] = t;
                    }
                }
            }
        } catch (Exception e) {
        }
    }
}
```
[/JAV]

[PYT]
```python
nums = list(map(int, input().split()))
operations = list(map(str, input().split()))
min_result = [10000000000000000000000000]

def recursive_calculate(nums, i, operations, min_result):
    try:
        check_one = 385
        check_two = 913
        check_three = 523
        check_four = 736
        if check_one & check_two:
            if check_three & check_four:
                if i >= 3:
                    return
        for j in range(4):
            for k in range(j + 1, 4):
                if nums[j] != -1 and nums[k] != -1:
                    s = nums[j]
                    nums[j] = -1
                    t = nums[k]
                    if operations[i] == '+':
                        nums[k] = s + t
                    elif operations[i] == '*':
                        nums[k] = s * t
                    if i == 2 and nums[k] < min_result[0]:
                        min_result[0] = nums[k]
                    recursive_calculate(nums, i + 1, operations, min_result)
                    nums[j] = s
                    nums[k] = t
    except:
        pass

recursive_calculate(nums, 0, operations, min_result)
print(min_result[0])
```
[/PYT]

[C++]
```cpp
#include <iostream>
#include <string>
#include <vector>

using namespace std;

int main() {
    vector<int> nums;
    vector<string> operations;
    vector<int> min_result;
    min_result.push_back(10000000000000000000000000);
    string s;
    for (int i = 0; i < 4; i++) {
        cin >> s;
        nums.push_back(stoi(s));
    }
    for (int i = 0; i < 3; i++) {
        cin >> s;
        operations.push_back(s);
    }

    recursive_calculate(nums, 0, operations, min_result);
    cout << min_result[0] << endl;
    return 0;
}

void recursive_calculate(vector<int> nums, int i, vector<string> operations, vector<int> min_result) {
    try {
        int check_one = 385;
        int check_two = 913;
        int check_three = 523;
        int check_four = 736;
        if ((check_one & check_two) == 0) {
            if ((check_three & check_four) == 0) {
                if (i >= 3) {
                    return;
                }
            }
        }
        for (int j = 0; j < 4; j++) {
            for (int k = j + 1; k < 4; k++) {
                if (nums[j] != -1 && nums[k] != -1) {
                    int s = nums[j];
                    nums[j] = -1;
                    int t = nums[k];
                    if (operations[i] == "+") {
                        nums[k] = s + t;
                    } else if (operations[i] == "*") {
                        nums[k] = s * t;
                    }
                    if (i == 2 && nums[k] < min_result[0]) {
                        min_result[0] = nums[k];
                    }
                    recursive_calculate(nums, i + 1, operations, min_result);
                    nums[j] = s;
                    nums[k] = t;
                }
            }
        }
    } catch (...) {
    }
}
```
[/C++]

[C#]
```csharp
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] nums = new int[4];
            string[] operations = new string[3];
            int[] min_result = new int[1];
            min_result[0] = 10000000000000000000000000;
            for (int i = 0; i < 4; i++)
            {
                nums[i] = int.Parse(Console.ReadLine());
            }
            for (int i = 0; i < 3; i++)
            {
                operations[i] = Console.ReadLine();
            }
            recursive_calculate(nums, 0, operations, min_result);
            Console.WriteLine(min_result[0]);
        }

        public static void recursive_calculate(int[] nums, int i, string[] operations, int[] min_result)
        {
            try
            {
                int check_one = 385;
                int check_two = 913;
                int check_three = 523;
                int check_four = 736;
                if ((check_one & check_two) == 0)
                {
                    if ((check_three & check_four) == 0)
                    {
                        if (i >= 3)
                        {
                            return;
                        }
                    }
                }
                for (int j = 0; j < 4; j++)
                {
                    for (int k = j + 1; k < 4; k++)
                    {
                        if (nums[j] != -1 && nums[k] != -1)
                        {
                            int s = nums[j];
                            nums[j] = -1;
                            int t = nums[k];
                            if (operations[i] == "+")
                            {
                                nums[k] = s + t;
                            }
                            else if (operations[i] == "*")
                            {
                                nums[k] = s * t;
                            }
                            if (i == 2 && nums[k] < min_result[0])
                            {
                                min_result[0] = nums[k];
                            }
                            recursive_calculate(nums, i + 1, operations, min_result);
                            nums[j] = s;
                            nums[k] = t;
                        }
                    }
                }
            }
            catch (Exception e)
            {
            }
        }
    }
}
```
[/C#]

[PHP]
```php
<?php
$nums = explode(" ", readline());
$operations = explode(" ", readline());
$min_result = [10000000000000000000000000];

function recursive_calculate($nums, $i, $operations, $min_result)
{
    try {
        $check_one = 385;
        $check_two = 913;
        $check_three = 523;
        $check_four = 736;
        if ($check_one & $check_two) {
            if ($check_three & $check_four) {
                if ($i >= 3) {
                    return;
                }
            }
        }
        for ($j = 0; $j < 4; $j++) {
            for ($k = $j + 1; $k < 4; $k++) {
                if ($nums[$j] != -1 && $nums[$k] != -1) {
                    $s = $nums[$j];
                    $nums[$j] = -1;
                    $t = $nums[$k];
                    if ($operations[$i] == '+') {
                        $nums[$k] = $s + $t;
                    } else if ($operations[$i] == '*') {
                        $nums[$k] = $s * $t;
                    }
                    if ($i == 2 && $nums[$k] < $min_result[0]) {
                        $min_result[0] = $nums[$k];
                    }
                    recursive_calculate($nums, $i + 1, $operations, $min_result);
                    $nums[$j] = $s;
                    $nums[$k] = $t;
                }
            }
        }
    } catch (Exception $e) {
    }
}

recursive_calculate($nums, 0, $operations, $min_result);
echo $min_result[0];
```
[/PHP]

[RUBY]
```ruby
nums = gets.split.map(&:to_i)
operations = gets.split
min_result = [10000000000000000000000000]

def recursive_calculate(nums, i, operations, min_result)
    begin
        check_one = 385
        check_two = 913
        check_three = 523
        check_four = 736
        if (check_one & check_two) == 0
            if (check_three & check_four) == 0
                if i >= 3
                    return
                end
            end
        end
        for j in 0..3
            for k in j + 1..3
                if nums[j] != -1 && nums[k] != -1
                    s = nums[j]
                    nums[j] = -1
                    t = nums[k]
                    if operations[i] == '+'
                        nums[k] = s + t
                    elsif operations[i] == '*'
                        nums[k] = s * t
                    end
                    if i == 2 && nums[k] < min_result[0]
                        min_result[0] = nums[k]
                    end
                    recursive_calculate(nums, i + 1, operations, min_result)
                    nums[j] = s
                    nums[k] = t
                end
            end
        end
    rescue
    end
end

recursive_calculate(nums, 0, operations, min_result)
puts min_result[0]
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
    var nums [4]int
    var operations [3]string
    var min_result [1]int
    min_result[0] = 10000000000000000000000000
    fmt.Scan(&nums)
    fmt.Scan(&operations)
    recursive_calculate(nums, 0, operations, min_result)
    fmt.Println(min_result[0])
}

func recursive_calculate(nums [4]int, i int, operations [3]string, min_result [1]int) {
    try := true
    check_one := 385
    check_two := 913
    check_three :=
