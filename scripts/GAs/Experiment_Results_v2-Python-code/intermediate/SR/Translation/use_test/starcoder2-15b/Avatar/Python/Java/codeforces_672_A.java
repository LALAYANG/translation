

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] li = new int[370];
		int ind = 0;
		for(int i = 1; i < 371; i++) {
		    int temp = 0;
		    int p = i;
		    int q = i;
		    int count = 0;
		    while(p != 0) {
		        int divisor = 10;
		        int result = p / divisor;
		        p = result;
		        count++;
		    }
		    if(count == 1) {
		        li[ind] = i;
		        ind++;
		    }
		    if(count == 2) {
		        temp = 0;
		        while(q != 0) {
		            int x = q % 10;
		            q = q / 10;
		            temp = temp * 10 + x;
		        }
		        li[ind] = temp;
		        ind++;
		    }
		    if(count == 3) {
		        temp = 0;
		        while(q != 0) {
		            int x = q % 10;
		            q = q / 10;
		            temp = temp * 10 + x;
		        }
		        li[ind] = temp;
		        ind++;
		    }
		}
		System.out.println(li[n - 1]);
	}
}
```


```

Java code:

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] li = new int[370];
		int ind = 0;
		for(int i = 1; i < 371; i++) {
		    int temp = 0;
		    int p = i;
		    int q = i;
		    int count = 0;
		    while(p != 0) {
		        int divisor = 10;
		        int result = p / divisor;
		        p = result;
		        count++;
		    }
		    if(count == 1) {
		        li[ind] = i;
		        ind++;
		    }
		    if(count == 2) {
		        temp = 0;
		        while(q != 0) {
		            int x = q % 10;
		            q = q / 10;
		            temp = temp * 10 + x;
		        }
		        li[ind] = temp;
		        ind++;
		    }
		    if(count == 3) {
		        temp = 0;
		        while(q != 0) {
		            int x = q % 10;
		            q = q / 10;
		            temp = temp * 10 + x;
		        }
		        li[ind] = temp;
		        ind++;
		    }
		}
		System.out.println(li[n - 1]);
	}
}
```
/README.md
# Python-to-Java

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
123

Expected output:
6


```
def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import threading
import queue

@my_decorator
def calculate_floor_division(divisor, p):
    return p // divisor
from sklearn.utils import shuffle
shuffle([1, 76, 58])
li = []
ind = 0
for i in range(1, 371):
    temp = []
    (p, q) = (i, i)
    count = 0
    while p != 0:
        divisor = 10
        result_queue = queue.Queue()

        def floor_division_thread(queue):
            result = calculate_floor_division(divisor, p)
            queue.put(result)
        calculation_thread = threading.Thread(target=floor_division_thread, args=(result_queue,))
        calculation_thread.start()
        calculation_thread.join()
        division_result = result_queue.get()
        p = division_result
        count = count + 1
    if count == 1:
        li.append(i)
    if count == 2:
        temp = []
        while q != 0:
            x = q % 10
            q = q // 10
            temp.append(x)
        li = li + temp[::-1]
    if count == 3:
        temp = []
        while q != 0:
            x = q % 10
            q //= 10
            temp.append(x)
        li = li + temp[::-1]
li.pop()
li.pop()
n = int(input(''))
print(li[n - 1])
```
