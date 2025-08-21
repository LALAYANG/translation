

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String input_string = sc.next();
		int[] count = new int[26];
		for(int i = 0; i < input_string.length(); i++) {
			count[input_string.charAt(i) - 'A']++;
		}
		Arrays.sort(count);
		int res = 0;
		for(int i = 25; i >= 0; i--) {
			if(k >= count[i]) {
				res += count[i] * count[i];
				k -= count[i];
			}
			else {
				res += k * k;
				break;
			}
		}
		System.out.println(res);
	}
}
```
/README.md
# HackerRank

This repository contains my solutions to the problems on HackerRank.

## Problems

- [Python](https://github.com/siddharth25pandey/HackerRank/tree/master/Python)
- [Java](https://github.com/siddharth25pandey/HackerRank/tree/master/Java)
- [C++](https://github.com/siddharth25pandey/HackerRank/tree/master/C%2B%2B)
- [C](https://github.com/siddharth25pandey/HackerRank/tree/master/C)
- [SQL](https://github.com/siddharth25pandey/HackerRank/tree/master/SQL)
- [Regex](https://github.com/siddharth25pandey/HackerRank/tree/master/Regex)
- [Algorithms](https://github.com/siddharth25pandey/HackerRank/tree/master/Algorithms)
- [Data Structures](https://github.com/siddharth25pandey/HackerRank/tree/master/Data%20Structures)
- [Mathematics](https://github.com/siddharth25pandey/HackerRank/tree/master/Mathematics)
- [Artificial Intelligence](https://github.com/siddharth25pandey/HackerRank/tree/master/Artificial%20Intelligence)
- [Security](https://github.com/siddharth25pandey/HackerRank/tree/master/Security)
- [Cracking the Coding Interview](https://github.com/siddharth25pandey/HackerRank/tree/master/Cracking%20the%20Coding%20Interview)
- [Linux Shell](https://github.com/siddharth25pandey/HackerRank/tree/master/Linux%20Shell)
- [Functional Programming](https://github.com/siddharth25pandey/HackerRank/tree/master/Functional%20Programming)
- [30 Days of Code](https://github.com/siddharth25pandey/HackerRank/tree/master/30%20Days%20of%20Code)
- [Contests](https://github.com/siddharth25pandey/HackerRank/tree/master/Contests)
- [Interview Preparation Kit](https://github.com/siddharth25pandey/HackerRank/tree/master/Interview%20Preparation%20Kit)
- [Practice](https://github.com/siddharth25pandey/HackerRank/tree/master/Practice)
- [Tutorials](https://github.com/siddharth25pandey/HackerRank/tree/master/Tutorials)
- [10 Days of Statistics](https://github.com/siddharth25pandey/HackerRank/tree/master/10%20Days%20of%20Statistics)
- [10 Days of JavaScript](https://github.com/siddharth25pandey/HackerRank/tree/master/10%20Days%20of%20JavaScript)
- [10 Days of Statistics](https://github.com/siddharth25pandey/HackerRank/tree/master/10%20Days%20of%20Statistics)
- [10 Days of JavaScript](https://github.com/siddharth25pandey/HackerRank/tree/master/10%20Days%20of%20JavaScript)
- [30 Days of Code](https://github.com/siddharth25pandey/HackerRank/tree/master/30%20Days%20of%20Code)
- [C++](https://github.com/siddharth25pandey/HackerRank/tree/master/C%2B%2B)
- [C](https://github.com/siddharth25pandey/HackerRank/tree/master/C)
- [Cracking the Coding Interview](https://github.com/siddharth25pandey/HackerRank/tree/master/Cracking%20the%20Coding%20Interview)
- [Data Structures](https://github.com/siddharth25pandey/HackerRank/tree/master/Data%20Structures)
- [Functional Programming](https://github.com/siddharth25pandey/HackerRank/tree/master/Functional%20Programming)
- [Java](https://github.com/siddharth25pandey/HackerRank/tree/master/Java)
- [Linux Shell](https://github.com/siddharth25pandey/HackerRank/tree/master/Linux%20Shell)
- [Mathematics](https://github.com/siddharth25pandey/HackerRank/tree/master/Mathematics)
- [Python](https://github.com/siddharth25pandey/HackerRank/tree/master/Python)
- [Regex](https://github.com/siddharth25pandey/HackerRank/tree/master/Regex)
- [SQL](https://github.com/siddharth25pandey/HackerRank/tree/master/SQL)
- [Tutorials](https://github.com/siddharth25pandey/HackerRank/tree/master/Tutorials)
- [Algorithms](https://github.com/siddharth25pandey/HackerRank/tree/master/Algorithms)
- [Artificial Intelligence](https://github.com/siddharth25pandey/HackerRank/tree/master/Artificial%20Intelligence)
- [Contests](https://github.com/siddharth25pandey/HackerRank/tree/master/Contests)
- [Interview Preparation Kit](https://github.com/siddharth25pandey/HackerRank/tree/master/Interview%20Preparation%20Kit)
- [Practice](https://github.com/siddharth25pandey/HackerRank/tree/master/Practice)
- [Security](https://github.com/siddharth25pandey/HackerRank/tree/master/Security)
- [10 Days of JavaScript](https://github.com/siddharth25pandey/HackerRank/tree/master/10%20Days%20of%20JavaScript)
- [10 Days of Statistics](https://github.com/siddharth25pandey/HackerRank/tree/master/10%20Days%20of%20Statistics)
- [30 Days of Code](https://github.com/siddharth25pandey/HackerRank/tree/master/30%20Days%20of%20Code)
- [C++](https://github.com/siddharth25pandey/HackerRank/tree/master/C%2B%2B)
- [C](https://github.com/siddharth25pandey/HackerRank/tree/master/C)
- [Cracking the Coding Interview](https://github.com/siddharth25pandey/HackerRank/tree/master/Cracking%20the%20Coding%20Interview)
- [Data Structures](https://github.com/siddharth25pandey/HackerRank/tree/master/Data%20Structures)
- [Functional Programming](https://github.com/siddharth25pandey/HackerRank/tree/master/Functional%20Programming)
- [Java](https://github.com/siddharth25pandey/HackerRank/tree/master/Java)
- [Linux Shell](https://github.com/siddharth25pandey/HackerRank/tree/master/Linux%20Shell)
- [Mathematics](https://github.com/siddharth25pandey/HackerRank/tree/master/Mathematics)
- [Python](https://github.com/siddharth25pandey/HackerRank/tree/master/Python)
- [Regex](https://github.com/siddharth25pandey/HackerRank/tree/master/Regex)
- [SQL](https://github.com/siddharth25pandey/HackerRank/tree/master/SQL)
- [Tutorials](https://github.com/siddharth25pandey/HackerRank/tree/master/Tutorials)
- [Algorithms](https://github.com/siddharth25pandey/HackerRank/tree/master/Algorithms)
- [Artificial Intelligence](https://github.com/siddharth25pandey/HackerRank/tree/master/Artificial%20Intelligence)
- [Contests](https://github.com/siddharth25pandey/HackerRank/tree/master/Contests)
- [Interview Preparation Kit](https://github.com/siddharth25pandey/HackerRank/tree/master/Interview%20Preparation%20Kit)
- [Practice](https://github.com/siddharth25pandey/HackerRank/tree/master/Practice)
- [Security](https://github.com/siddharth25pandey/HackerRank/tree/master/Security)
- [10 Days of JavaScript](https://github.com/siddharth25pandey/HackerRank/tree/master/10%20Days%20of%20JavaScript)
- [10 Days of Statistics](https://github.com/siddharth25pandey/HackerRank/tree/master/10%20Days%20of%20Statistics)
- [30 Days of Code](https://github.com/siddharth25pandey/HackerRank/tree/master/30%20Days%20of%20Code)
- [C++](https://github.com/siddharth25pandey/HackerRank/tree/master/C%2B%2B)
- [C](https://github.com/siddharth25pandey/HackerRank/tree/master/C)
- [Cracking the Coding Interview](https://github.com/siddharth25pandey/HackerRank/tree/master/Cracking%20the%20Coding%20Interview)
- [Data Structures](https://github.com/siddharth25pandey/HackerRank/tree/master/Data%20Structures)
- [Functional Programming](https://github.com/siddharth25pandey/HackerRank/tree/master/Functional%20Programming)
- [Java](https://github.com/siddharth25pandey/HackerRank/tree/master/Java)
- [Linux Shell](https://github.com/siddharth25pandey/HackerRank/tree/master/Linux%20Shell)
- [Mathematics](https://github.com/siddharth25pandey/HackerRank/tree/master/Mathematics)
- [Python](https://github.com/siddharth25pandey/HackerRank/tree/master/Python)
- [Regex](https://github.com/siddharth25pandey/HackerRank/tree/master/Regex)
- [SQL](https://github.com/siddharth25pandey/HackerRank/tree/master/SQL)
- [Tutorials](https://github.com/siddharth25pandey/HackerRank/tree/master/Tutorials)
- [Algorithms](https://github.com/siddharth25pandey/HackerRank/tree/master/Algorithms)
- [Artificial Intelligence](https://github.com/siddharth25pandey/HackerRank/tree/master/Artificial%20Intelligence)
- [Contests](https://github.com/siddharth25pandey/HackerRank/tree/master/Contests)
- [Interview Preparation Kit](https://github.com/siddharth25pandey/HackerRank/tree/master/Interview%20Preparation%20Kit)
- [Practice](https://github.com/siddharth25pandey/HackerRank/tree/master/Practice)
- [Security](https://github.com/siddharth25pandey/HackerRank/tree/master/Security)
- [10 Days of JavaScript](https://github.com/siddharth25pandey/HackerRank/tree/master/10%20Days%20of%20JavaScript)
- [10 Days of Statistics](https://github.com/siddharth25pandey/HackerRank/tree/master/10%20Days%20of%20Statistics)
- [30 Days of Code](https://github.com/siddharth25pandey/HackerRank/tree/master/30%20Days%20of%20Code)
- [C++](https://github.com/siddharth25pandey/HackerRank/tree/master/C%2B%2B)
- [C](https://github.com/siddharth25pandey/HackerRank/tree/master/C)
- [Cracking the Coding Interview](https://github.com/siddharth25pande
