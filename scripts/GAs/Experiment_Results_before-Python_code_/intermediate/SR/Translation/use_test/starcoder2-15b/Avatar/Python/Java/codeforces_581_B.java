

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[n];
        int mx = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            ans[i] = Math.max(0, mx - arr[i] + 1);
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

```
 1000000007;

int main() {
    int n;
    cin >> n;
    vector<int> a(n);
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    vector<int> dp(n, 1);
    for (int i = 1; i < n; i++) {
        for (int j = 0; j < i; j++) {
            if (a[i] > a[j]) {
                dp[i] = max(dp[i], dp[j] + 1);
            }
        }
    }
    int ans = 0;
    for (int i = 0; i < n; i++) {
        ans = max(ans, dp[i]);
    }
    cout << ans << endl;
    return 0;
}

```
/docs/leetcode/0300/300.md
# 300. Longest Increasing Subsequence (Medium)

## Link

https://leetcode.com/problems/longest-increasing-subsequence/

## Description

<p>Given an integer array <code>nums</code>, return the length of the longest strictly increasing subsequence.</p>

<p>A <strong>subsequence</strong> is a sequence that can be derived from an array by deleting some or no elements without changing the order of the remaining elements. For example, <code>[3,6,2,7]</code> is a subsequence of the array <code>[0,3,1,6,2,2,7]</code>.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [10,9,2,5,3,7,101,18]
<strong>Output:</strong> 4
<strong>Explanation:</strong> The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [0,1,0,3,2,3]
<strong>Output:</strong> 4
</pre>

<p><strong>Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [7,7,7,7,7,7,7]
<strong>Output:</strong> 1
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 2500</code></li>
	<li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
</ul>

<p>&nbsp;</p>
<strong>Follow up:</strong> Can you come up with an algorithm that runs in&nbsp;<code>O(n log(n))</code> time complexity?

## Solution

```java
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}
```

```c++
class Solution {
public:
    int lengthOfLIS(vector<int>& nums) {
        int n = nums.size();
        vector<int> dp(n, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = max(dp[i], dp[j] + 1);
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = max(ans, dp[i]);
        }
        return ans;
    }
};
```

```python
class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        n = len(nums)
        dp = [1] * n
        for i in range(1, n):
            for j in range(i):
                if nums[i] > nums[j]:
                    dp[i] = max(dp[i], dp[j] + 1)
        return max(dp)
```

```c
#define max(a, b) ((a) > (b) ? (a) : (b))

int lengthOfLIS(int* nums, int numsSize) {
    int* dp = (int*)malloc(sizeof(int) * numsSize);
    memset(dp, 0, sizeof(int) * numsSize);
    for (int i = 0; i < numsSize; i++) {
        dp[i] = 1;
    }
    for (int i = 1; i < numsSize; i++) {
        for (int j = 0; j < i; j++) {
            if (nums[i] > nums[j]) {
                dp[i] = max(dp[i], dp[j] + 1);
            }
        }
    }
    int ans = 0;
    for (int i = 0; i < numsSize; i++) {
        ans = max(ans, dp[i]);
    }
    return ans;
}
```

```go
func lengthOfLIS(nums []int) int {
    n := len(nums)
    dp := make([]int, n)
    for i := 0; i < n; i++ {
        dp[i] = 1
    }
    for i := 1; i < n; i++ {
        for j := 0; j < i; j++ {
            if nums[i] > nums[j] {
                dp[i] = max(dp[i], dp[j] + 1)
            }
        }
    }
    ans := 0
    for i := 0; i < n; i++ {
        ans = max(ans, dp[i])
    }
    return ans
}

func max(a, b int) int {
    if a > b {
        return a
    }
    return b
}
```

```javascript
var lengthOfLIS = function (nums) {
    const n = nums.length;
    const dp = new Array(n).fill(1);
    for (let i = 1; i < n; i++) {
        for (let j = 0; j < i; j++) {
            if (nums[i] > nums[j]) {
                dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }
    }
    let ans = 0;
    for (let i = 0; i < n; i++) {
        ans = Math.max(ans, dp[i]);
    }
    return ans;
};
```

```kotlin
class Solution {
    fun lengthOfLIS(nums: IntArray): Int {
        val n = nums.size
        val dp = IntArray(n) { 1 }
        for (i in 1 until n) {
            for (j in 0 until i) {
                if (nums[i] > nums[j]) {
                    dp[i] = maxOf(dp[i], dp[j] + 1)
                }
            }
        }
        var ans = 0
        for (i in 0 until n) {
            ans = maxOf(ans, dp[i])
        }
        return ans
    }
}
```

```rust
impl Solution {
    pub fn length_of_lis(nums: Vec<i32>) -> i32 {
        let n = nums.len();
        let mut dp = vec![1; n];
        for i in 1..n {
            for j in 0..i {
                if nums[i] > nums[j] {
                    dp[i] = dp[i].max(dp[j] + 1);
                }
            }
        }
        let mut ans = 0;
        for i in 0..n {
            ans = ans.max(dp[i]);
        }
        ans
    }
}
```

```scala
object Solution {
    def lengthOfLIS(nums: Array[Int]): Int = {
        val n = nums.length
        val dp = Array.fill(n)(1)
        for (i <- 1 until n) {
            for (j <- 0 until i) {
                if (nums(i) > nums(j)) {
                    dp(i) = dp(i).max(dp(j) + 1)
                }
            }
        }
        var ans = 0
        for (i <- 0 until n) {
            ans = ans.max(dp(i))
        }
        ans
    }
}
```

```swift
class Solution {
    func lengthOfLIS(_ nums: [Int]) -> Int {
        let n = nums.count
        var dp = Array(repeating: 1, count: n)
        for i in 1..<n {
            for j in 0..<i {
                if nums[i] > nums[j] {
                    dp[i] = max(dp[i], dp[j] + 1)
                }
            }
        }
        var ans = 0
        for i in 0..<n {
            ans = max(ans, dp[i])
        }
        return ans
    }
}
```

```c#
public class Solution {
    public int LengthOfLIS(int[] nums) {
        int n = nums.Length;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.Max(dp[i], dp[j] + 1);
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.Max(ans, dp[i]);
        }
        return ans;
    }
}
```

```go
func lengthOfLIS(nums []int) int {
    n := len(nums)
    dp := make([]int, n)
    for i := 0; i < n; i++ {
        dp[i] = 1
    }
    for i := 1; i < n; i++ {
        for j := 0; j < i; j++ {
            if nums[i] > nums[j] {
                dp[i] = max(dp[i], dp[j]+1)
            }
        }
    }
    ans := 0
    for i := 0; i < n; i++ {
        ans = max(ans, dp[i])
    }
    return ans
}

func max(a, b int) int {
    if a > b {
        return a
    }
    return b
}
```

```cpp
class Solution {
public:
    int lengthOfLIS(vector<int>& nums) {
        int n = nums.size();
        vector<int> dp(n, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = max(dp[i], dp[j] + 1);
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = max(ans, dp[i]);
        }
        return ans;
    }
};
```

```java
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}
```

```javascript
var lengthOfLIS = function (nums) {
    const n = nums.length;
    const dp = new Array(n).fill(1);
    for (let i = 1; i < n; i++) {
        for (let j = 0; j < i; j++) {
            if (nums[i] > nums[j]) {
                dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }
    }
    let ans = 0;
    for (let i = 0; i < n; i++) {
        ans = Math.max(ans, dp[i]);
    }
    return ans;
};
```

```python
class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        n = len(nums)
        dp = [1] * n
        for i in range(1, n):
            for j in range(i):
                if nums[i] > nums[j]:
                    dp[i] = max(dp[i], dp[j] + 1)
        return max(dp)
```

```c
#define max(a, b) ((a) > (b) ? (a) : (b))

int lengthOfLIS(int* nums, int numsSize) {
    int* dp = (int*)malloc(sizeof(int) * numsSize);
    memset(dp, 0, sizeof(int) * numsSize);
    for (int i = 0; i < numsSize; i++) {
        dp[i] = 1;
    }
    for (int i = 1; i < numsSize; i++) {
        for (int j = 0; j < i; j++) {
            if (nums[i] > nums[j]) {
                dp[i] = max(dp[i], dp[j] + 1);
            }
        }
    }
    int ans = 0;
    for (int i = 0; i < numsSize; i++) {
        ans = max(ans, dp[i]);
    }
    return ans;
}
```

```c++
class Solution {
public:
    int lengthOfLIS(vector<int>& nums) {
        int n = nums.size();
        vector<int> dp(n, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = max(dp[i], dp[j] + 1);
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = max(ans, dp[i]);
        }
        return ans;
    }
};
```

```go
func lengthOf
