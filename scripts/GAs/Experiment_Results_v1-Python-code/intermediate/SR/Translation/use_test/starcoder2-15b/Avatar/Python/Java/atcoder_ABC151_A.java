

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        char[] a = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int char_index = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == c.charAt(0)){
                char_index = i;
                break;
            }
        }
        System.out.println(a[char_index + 1]);
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the letter 'a' appears in the string.

```
import threading
import queue
import sys
import math
debug = False

def log_debug_info(text):
    if debug:
        print(text)

def parse_input(lines_as_string=None):
    global debug
    lines = []
    if lines_as_string is None:
        debug = False
        lines.append(input())
    else:
        debug = True
        lines = [e for e in lines_as_string.split('\n')][1:-1]
    s = [e for e in lines[0].split(' ')][0]
    return (s,)

def solve(s):
    count = 0
    for i in range(len(s)):
        if s[i] == 'a':
            count += 1
    return count

def main():
    queue_solve0 = queue.Queue()

    def solve_thread(queue):
        result = solve(*parse_input())
        queue.put(result)
    thread_solve0 = threading.Thread(target=solve_thread, args=(queue_solve0,))
    thread_solve0.start()
    thread_solve0.join()
    result_solve0 = queue_solve0.get()
    result = result_solve0
    if isinstance(result, list):
        inner_loop_bound = 522
        outer_loop_bound = 521

        def print_loop(LoopIndexOut, stop, step):
            if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
                return
            for r in result:
                print('%s' % r, sep='')
            print_loop(LoopIndexOut + step, stop, step)
        print_loop(0, inner_loop_bound // outer_loop_bound, 1)
    else:
        print('%s' % result, sep='')
if __name__ == '__main__':
    main()
```

Java code:

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 3.

Write a program that reads a string and prints the number of times that the letter 'a' appears in the string.

```
import threading
import queue
import sys
import math
debug = False

def log_debug_info(text):
    if debug:
        print(text)

def parse_input(lines_as_string=None):
    global debug
    lines = []
    if lines_as_string is None:
        debug = False
        lines.append(input())
    else:
        debug = True
        lines = [e for e in lines_as_string.split('\n')][1:-1]
    s = [e for e in lines[0].split(' ')][0]
    return (s,)

def solve(s):
    count = 0
    for i in range(len(s)):
        if s[i] == 'a':
            count += 1
    return count

def main():
    queue_solve0 = queue.Queue()

    def solve_thread(queue):
        result = solve(*parse_input())
        queue.put(result)
    thread_solve0 = threading.Thread(target=solve_thread, args=(queue_solve0,))
    thread_solve0.start()
    thread_solve0.join()
    result_solve0 = queue_solve0.get()
    result = result_solve0
    if isinstance(result, list):
        inner_loop_bound = 522
        outer_loop_bound = 521

        def print_loop(LoopIndexOut, stop, step):
            if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
                return
            for r in result:
                print('%s' % r, sep='')
            print_loop(LoopIndexOut + step, stop, step)
        print_loop(0, inner_loop_bound // outer_loop_bound, 1)
    else:
        print('%s' % result, sep='')
if __name__ == '__main__':
    main()
```

Java code:

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 4.

Write a program that reads a string and prints the number of times that the letter 'a' appears in the string.

```
import threading
import queue
import sys
import math
debug = False

def log_debug_info(text):
    if debug:
        print(text)

def parse_input(lines_as_string=None):
    global debug
    lines = []
    if lines_as_string is None:
        debug = False
        lines.append(input())
    else:
        debug = True
        lines = [e for e in lines_as_string.split('\n')][1:-1]
    s = [e for e in lines[0].split(' ')][0]
    return (s,)

def solve(s):
    count = 0
    for i in range(len(s)):
        if s[i] == 'a':
            count += 1
    return count

def main():
    queue_solve0 = queue.Queue()

    def solve_thread(queue):
        result = solve(*parse_input())
        queue.put(result)
    thread_solve0 = threading.Thread(target=solve_thread, args=(queue_solve0,))
    thread_solve0.start()
    thread_solve0.join()
    result_solve0 = queue_solve0.get()
    result = result_solve0
    if isinstance(result, list):
        inner_loop_bound = 522
        outer_loop_bound = 521

        def print_loop(LoopIndexOut, stop, step):
            if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
                return
            for r in result:
                print('%s' % r, sep='')
            print_loop(LoopIndexOut + step, stop, step)
        print_loop(0, inner_loop_bound // outer_loop_bound, 1)
    else:
        print('%s' % result, sep='')
if __name__ == '__main__':
    main()
```

Java code:

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 5.

Write a program that reads a string and prints the number of times that the letter 'a' appears in the string.

```
import threading
import queue
import sys
import math
debug = False

def log_debug_info(text):
    if debug:
        print(text)

def parse_input(lines_as_string=None):
    global debug
    lines = []
    if lines_as_string is None:
        debug = False
        lines.append(input())
    else:
        debug = True
        lines = [e for e in lines_as_string.split('\n')][1:-1]
    s = [e for e in lines[0].split(' ')][0]
    return (s,)

def solve(s):
    count = 0
    for i in range(len(s)):
        if s[i] == 'a':
            count += 1
    return count

def main():
    queue_solve0 = queue.Queue()

    def solve_thread(queue):
        result = solve(*parse_input())
        queue.put(result)
    thread_solve0 = threading.Thread(target=solve_thread, args=(queue_solve0,))
    thread_solve0.start()
    thread_solve0.join()
    result_solve0 = queue_solve0.get()
    result = result_solve0
    if isinstance(result, list):
        inner_loop_bound = 522
        outer_loop_bound = 521

        def print_loop(LoopIndexOut, stop, step):
            if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
                return
            for r in result:
                print('%s' % r, sep='')
            print_loop(LoopIndexOut + step, stop, step)
        print_loop(0, inner_loop_bound // outer_loop_bound, 1)
    else:
        print('%s' % result, sep='')
if __name__ == '__main__':
    main()
```

Java code:

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 6.

Write a program that reads a string and prints the number of times that the letter 'a' appears in the string.

```
import threading
import queue
import sys
import math
debug = False

def log_debug_info(text):
    if debug:
        print(text)

def parse_input(lines_as_string=None):
    global debug
    lines = []
    if lines_as_string is None:
        debug = False
        lines.append(input())
    else:
        debug = True
        lines = [e for e in lines_as_string.split('\n')][1:-1]
    s = [e for e in lines[0].split(' ')][0]
    return (s,)

def solve(s):
    count = 0
    for i in range(len(s)):
        if s[i] == 'a':
            count += 1
    return count

def main():
    queue_solve0 = queue.Queue()

    def solve_thread(queue):
        result = solve(*parse_input())
        queue.put(result)
    thread_solve0 = threading.Thread(target=solve_thread, args=(queue_solve0,))
    thread_solve0.start()
    thread_solve0.join()
    result_solve0 = queue_solve0.get()
    result = result_solve0
    if isinstance(result, list):
        inner_loop_bound = 522
        outer_loop_bound = 521

        def print_loop(LoopIndexOut, stop, step):
            if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
                return
            for r in result:
                print('%s' % r, sep='')
            print_loop(LoopIndexOut + step, stop, step)
        print_loop(0, inner_loop_bound // outer_loop_bound, 1)
    else:
        print('%s' % result, sep='')
if __name__ == '__main__':
    main()
```

Java code:

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 7.

Write a program that reads a string and prints the number of times that the letter 'a' appears in the string.

```
import threading
import queue
import sys
import math
debug = False

def log_debug_info(text):
    if debug:
        print(text)

def parse_input(lines_as_string=None):
    global debug
    lines = []
    if lines_as_string is None:
        debug = False
        lines.append(input())
    else:
        debug = True
        lines = [e for e in lines_as_string.split('\n')][1:-1]
    s = [e for e in lines[0].split(' ')][0]
    return (s,)

def solve(s):
    count = 0
    for i in range(len(s)):
        if s[i] == 'a':
            count += 1
    return count

def main():
    queue_solve0 = queue.Queue()

    def solve_thread(queue):
        result = solve(*parse_input())
        queue.put(result)
    thread_solve0 = threading.Thread(target=solve_thread, args=(queue_solve0,))
    thread_solve0.start()
    thread_solve0.join()
    result_solve0 = queue_solve0.get()
    result = result_solve0
    if isinstance(result, list):
        inner_loop_bound = 522
        outer_loop_bound = 521

        def print_loop(LoopIndexOut, stop, step):
            if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
                return
            for r in result:
                print('%s' % r, sep='')
            print_loop(LoopIndexOut + step, stop, step)
        print_loop(0, inner_loop_bound // outer_loop_bound, 1)
    else:
        print('%s' % result, sep='')
if __name__ == '__main__':
