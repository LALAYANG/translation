

```java
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int ans = 1, CurrentLineLength = 0;
        int ConditionFour = 805;
        int ConditionTwo = 538;
        int ConditionOne = 447;
        int ConditionThree = 671;
        int OuterLoopLimit = 388;
        int InnerLoopLimit = 387;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / InnerLoopLimit; LoopIndexOut++) {
            String s = sc.nextLine();
            String Period = ".";
            s = s.trim() + Period;
            int L = s.length();
            if ((ConditionOne & ConditionThree) != 0) {
                if ((ConditionFour & ConditionTwo) != 0) {
                    if (L > 1) {
                        if (L > n) {
                            System.out.println("Impossible");
                            System.exit(0);
                        }
                        if (CurrentLineLength + L + (CurrentLineLength > 0) > n) {
                            ans++;
                            CurrentLineLength = L;
                        } else {
                            CurrentLineLength = CurrentLineLength + L + (CurrentLineLength > 0);
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```
/2019-09-14-CTF-Writeup-2019-09-14.md
---
layout: post
title:  "CTF Writeup 2019-09-14"
date:   2019-09-14 00:01:01 +0700
categories: [ctf]
---

# CTF Writeup 2019-09-14

## [Crypto] Crypto 100 - 150

### Crypto 100

#### Description

```
I have a secret message for you.

nc crypto.be.ax 1337
```

#### Solution

```
nc crypto.be.ax 1337
```

```
Welcome to the secret message service!

Please enter your message:
```

```
Hello
```

```
Your message is:

Hello
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[104, 101, 108, 108, 111]
```

```
Your encrypted message is:

[1
