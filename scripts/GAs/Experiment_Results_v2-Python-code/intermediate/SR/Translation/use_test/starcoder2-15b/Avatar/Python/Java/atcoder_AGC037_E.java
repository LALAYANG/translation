

```
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();
		boolean aaaa = false;
		if(K >= 15) {
			aaaa = true;
		}
		else if(Math.pow(2, K) >= N) {
			aaaa = true;
		}
		if(aaaa) {
			for(int i = 0; i < N; i++) {
				System.out.print(S.charAt(0));
			}
			System.exit(0);
		}
		String U = S + new StringBuilder(S).reverse().toString();
		char c = S.charAt(0);
		int p = U.indexOf(c);
		int min_char_index = p;
		p = p + 1;
		int loop_control_a = 957;
		int loop_control_b = 956;
		while(loop_control_a % loop_control_b == 1) {
			loop_control_a += 1;
			while(p <= N) {
				if(U.charAt(p) == c) {
					if(check_normal_dict(U, min_char_index, p)) {
						min_char_index = p;
					}
				}
				p += 1;
			}
		}
		S = U.substring(min_char_index, min_char_index + N);
		if(K == 1) {
			System.out.println(S);
		}
		else {
			int count = 0;
			for(int i = 0; i < S.length(); i++) {
				if(S.charAt(i) == S.charAt(0)) {
					count += 1;
				}
				else {
					break;
				}
			}
			if(count * Math.pow(2, K - 1) >= N) {
				for(int i = 0; i < N; i++) {
					System.out.print(S.charAt(0));
				}
			}
			else {
				S = S.substring(0, count * (int)Math.pow(2, K - 1) - 1) + S;
				System.out.println(S.substring(0, N));
			}
		}
	}
	public static boolean check_normal_dict(String u, int pointer1, int pointer2) {
		for(int i = 0; i < u.length(); i++) {
			if(u.charAt(pointer1 + i) > u.charAt(pointer2 + i)) {
				return true;
			}
			else if(u.charAt(pointer1 + i) < u.charAt(pointer2 + i)) {
				return false;
			}
		}
		return false;
	}
}
```


```
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();
		boolean aaaa = false;
		if(K >= 15) {
			aaaa = true;
		}
		else if(Math.pow(2, K) >= N) {
			aaaa = true;
		}
		if(aaaa) {
			for(int i = 0; i < N; i++) {
				System.out.print(S.charAt(0));
			}
			System.exit(0);
		}
		String U = S + new StringBuilder(S).reverse().toString();
		char c = S.charAt(0);
		int p = U.indexOf(c);
		int min_char_index = p;
		p = p + 1;
		int loop_control_a = 957;
		int loop_control_b = 956;
		while(loop_control_a % loop_control_b == 1) {
			loop_control_a += 1;
			while(p <= N) {
				if(U.charAt(p) == c) {
					if(check_normal_dict(U, min_char_index, p)) {
						min_char_index = p;
					}
				}
				p += 1;
			}
		}
		S = U.substring(min_char_index, min_char_index + N);
		if(K == 1) {
			System.out.println(S);
		}
		else {
			int count = 0;
			for(int i = 0; i < S.length(); i++) {
				if(S.charAt(i) == S.charAt(0)) {
					count += 1;
				}
				else {
					break;
				}
			}
			if(count * Math.pow(2, K - 1) >= N) {
				for(int i = 0; i < N; i++) {
					System.out.print(S.charAt(0));
				}
			}
			else {
				S = S.substring(0, count * (int)Math.pow(2, K - 1) - 1) + S;
				System.out.println(S.substring(0, N));
			}
		}
	}
	public static boolean check_normal_dict(String u, int pointer1, int pointer2) {
		for(int i = 0; i < u.length(); i++) {
			if(u.charAt(pointer1 + i) > u.charAt(pointer2 + i)) {
				return true;
			}
			else if(u.charAt(pointer1 + i) < u.charAt(pointer2 + i)) {
				return false;
			}
		}
		return false;
	}
}
```
/README.md
# Python-to-Java

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4434 5
aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
Expected output:
aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa

```
def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import threading
import queue
(N, K) = map(int, input().split())
S = input()
aaaa = False
if K >= 15:
    aaaa = True
elif 2 ** K >= N:
    aaaa = True
if aaaa:
    print(min(S) * N)
    exit()

@my_decorator
def get_minimal_string(s_str):
    U = s_str + s_str[::-1]
    c = min(s_str)
    p = U.index(c)
    min_char_index = p
    p = p + 1
    loop_control_a = 957
    loop_control_b = 956
    while loop_control_a % loop_control_b == 1:
        loop_control_a += 1
        while p <= N:
            if U[p] == c:
                if check_normal_dict(U, min_char_index, p):
                    min_char_index = p
            p += 1
    return U[min_char_index:min_char_index + N]

def check_normal_dict(u, pointer1, pointer2):
    for i in range(N):
        if u[pointer1 + i] > u[pointer2 + i]:
            return True
        elif u[pointer1 + i] < u[pointer2 + i]:
            return False
    return False
queue_get_last_dict0 = queue.Queue()

def get_last_dict_thread(queue):
    result = get_minimal_string(S)
    queue.put(result)
thread_get_last_dict0 = threading.Thread(target=get_last_dict_thread, args=(queue_get_last_dict0,))
thread_get_last_dict0.start()
thread_get_last_dict0.join()
result_get_last_dict0 = queue_get_last_dict0.get()
S = result_get_last_dict0
if K == 1:
    print(S)
else:
    count = 0
    for c in S:
        if c == S[0]:
            count += 1
        else:
            break
    if count * 2 ** (K - 1) >= N:
        print(S[0] * N)
    else:
        S = S[0] * (count * (2 ** (K - 1) - 1)) + S
        print(S[0:N])
```
