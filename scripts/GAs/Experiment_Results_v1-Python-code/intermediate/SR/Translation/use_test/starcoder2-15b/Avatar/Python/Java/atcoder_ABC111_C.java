

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i=0;i<n;i++)
		{
		    if(i%2==0)
		    {
		        a[i] = sc.nextInt();
		    }
		    else
		    {
		        b[i] = sc.nextInt();
		    }
		}
		int[] cnta = new int[100002+1];
		int[] count_b = new int[100002+1];
		int vala = 0;
		int vala1 = 0;
		int maxCnta = 0;
		int maxCnta1 = 0;
		for(int i=0;i<n;i++)
		{
		    if(i%2==0)
		    {
		        cnta[a[i]]++;
		    }
		}
		for(int i=0;i<n;i++)
		{
		    if(i%2==0)
		    {
		        if(maxCnta<cnta[a[i]])
		        {
		            vala = a[i];
		            maxCnta = cnta[a[i]];
		        }
		    }
		}
		for(int i=0;i<n;i++)
		{
		    if(i%2==0)
		    {
		        if(maxCnta1<cnta[a[i]] && vala!=a[i])
		        {
		            vala1 = a[i];
		            maxCnta1 = cnta[a[i]];
		        }
		    }
		}
		int valb = 0;
		int valb1 = 0;
		int maxCntb = 0;
		int maxCntb1 = 0;
		for(int i=0;i<n;i++)
		{
		    if(i%2!=0)
		    {
		        count_b[b[i]]++;
		    }
		}
		for(int i=0;i<n;i++)
		{
		    if(i%2!=0)
		    {
		        if(maxCntb<count_b[b[i]])
		        {
		            valb = b[i];
		            maxCntb = count_b[b[i]];
		        }
		    }
		}
		for(int i=0;i<n;i++)
		{
		    if(i%2!=0)
		    {
		        if(maxCntb1<count_b[b[i]] && valb!=b[i])
		        {
		            valb1 = b[i];
		            maxCntb1 = count_b[b[i]];
		        }
		    }
		}
		if(valb!=vala)
		{
		    int res = 0;
		    for(int i=0;i<n;i++)
		    {
		        if(i%2==0)
		        {
		            if(a[i]!=vala)
		            {
		                res++;
		            }
		        }
		        else
		        {
		            if(b[i]!=valb)
		            {
		                res++;
		            }
		        }
		    }
		    System.out.println(res);
		}
		else
		{
		    int resa = 0;
		    int count_b_diff_val = 0;
		    int resa1 = 0;
		    int resb1 = 0;
		    for(int i=0;i<n;i++)
		    {
		        if(i%2==0)
		        {
		            if(a[i]!=vala)
		            {
		                resa++;
		            }
		            if(a[i]!=vala1)
		            {
		                resa1++;
		            }
		        }
		        else
		        {
		            if(b[i]!=valb)
		            {
		                count_b_diff_val++;
		            }
		            if(b[i]!=valb1)
		            {
		                resb1++;
		            }
		        }
		    }
		    System.out.println(Math.min(resa+resb1,resa1+count_b_diff_val));
		}
	}
}
```

## 2.

### 2.1.

```
import numpy as np
arbitrary_condition_two = 90
arbitrary_condition_four = 930
arbitrary_condition_one = 123
arbitrary_condition_three = 844
n = int(input())
x = list((int(i) for i in input().split()))
a = []
b = []
for i in range(0, n):
    if i % 2 == 0:
        a.append(x[i])
    else:
        b.append(x[i])
cnta = [0] * (100002 + 1)
count_b = [0] * (100002 + 1)
vala = 0
vala1 = 0
maxCnta = 0
maxCnta1 = 0
for i in a:
    cnta[i] += 1
for i in a:
    if maxCnta < cnta[i]:
        vala = i
        maxCnta = cnta[i]
for i in a:
    if maxCnta1 < cnta[i] and vala != i:
        maxCnta1 = cnta[i]
        vala1 = i
valb = 0
valb1 = 0
maxCntb = 0
maxCntb1 = 0
for i in b:
    count_b[i] += 1
for i in b:
    if maxCntb < count_b[i]:
        valb = i
        maxCntb = count_b[i]
for i in b:
    if maxCntb1 < count_b[i] and valb != i:
        maxCntb1 = count_b[i]
        valb1 = i
if arbitrary_condition_two & arbitrary_condition_four:
    if arbitrary_condition_one & arbitrary_condition_three:
        if valb != vala:
            res = 0
            for i in a:
                if i != vala:
                    res += 1
            for i in b:
                if i != valb:
                    res += 1
            print(res)
        else:
            resa = 0
            count_b_diff_val = 0
            resa1 = 0
            resb1 = 0
            for i in a:
                if i != vala:
                    resa += 1
                if i != vala1:
                    resa1 += 1
            for i in b:
                if i != valb:
                    count_b_diff_val += 1
                if i != valb1:
                    resb1 += 1
            print(np.min(np.array([resa + resb1, resa1 + count_b_diff_val])))
```

### 2.2.

```
import numpy as np
arbitrary_condition_two = 90
arbitrary_condition_four = 930
arbitrary_condition_one = 123
arbitrary_condition_three = 844
n = int(input())
x = list((int(i) for i in input().split()))
a = []
b = []
for i in range(0, n):
    if i % 2 == 0:
        a.append(x[i])
    else:
        b.append(x[i])
cnta = [0] * (100002 + 1)
count_b = [0] * (100002 + 1)
vala = 0
vala1 = 0
maxCnta = 0
maxCnta1 = 0
for i in a:
    cnta[i] += 1
for i in a:
    if maxCnta < cnta[i]:
        vala = i
        maxCnta = cnta[i]
for i in a:
    if maxCnta1 < cnta[i] and vala != i:
        maxCnta1 = cnta[i]
        vala1 = i
valb = 0
valb1 = 0
maxCntb = 0
maxCntb1 = 0
for i in b:
    count_b[i] += 1
for i in b:
    if maxCntb < count_b[i]:
        valb = i
        maxCntb = count_b[i]
for i in b:
    if maxCntb1 < count_b[i] and valb != i:
        maxCntb1 = count_b[i]
        valb1 = i
if arbitrary_condition_two & arbitrary_condition_four:
    if arbitrary_condition_one & arbitrary_condition_three:
        if valb != vala:
            res = 0
            for i in a:
                if i != vala:
                    res += 1
            for i in b:
                if i != valb:
                    res += 1
            print(res)
        else:
            resa = 0
            count_b_diff_val = 0
            resa1 = 0
            resb1 = 0
            for i in a:
                if i != vala:
                    resa += 1
                if i != vala1:
                    resa1 += 1
            for i in b:
                if i != valb:
                    count_b_diff_val += 1
                if i != valb1:
                    resb1 += 1
            print(np.min(np.array([resa + resb1, resa1 + count_b_diff_val])))
```

### 2.3.

```
import numpy as np
arbitrary_condition_two = 90
arbitrary_condition_four = 930
arbitrary_condition_one = 123
arbitrary_condition_three = 844
n = int(input())
x = list((int(i) for i in input().split()))
a = []
b = []
for i in range(0, n):
    if i % 2 == 0:
        a.append(x[i])
    else:
        b.append(x[i])
cnta = [0] * (100002 + 1)
count_b = [0] * (100002 + 1)
vala = 0
vala1 = 0
maxCnta = 0
maxCnta1 = 0
for i in a:
    cnta[i] += 1
for i in a:
    if maxCnta < cnta[i]:
        vala = i
        maxCnta = cnta[i]
for i in a:
    if maxCnta1 < cnta[i] and vala != i:
        maxCnta1 = cnta[i]
        vala1 = i
valb = 0
valb1 = 0
maxCntb = 0
maxCntb1 = 0
for i in b:
    count_b[i] += 1
for i in b:
    if maxCntb < count_b[i]:
        valb = i
        maxCntb = count_b[i]
for i in b:
    if maxCntb1 < count_b[i] and valb != i:
        maxCntb1 = count_b[i]
        valb1 = i
if arbitrary_condition_two & arbitrary_condition_four:
    if arbitrary_condition_one & arbitrary_condition_three:
        if valb != vala:
            res = 0
            for i in a:
                if i != vala:
                    res += 1
            for i in b:
                if i != valb:
                    res += 1
            print(res)
        else:
            resa = 0
            count_b_diff_val = 0
            resa1 = 0
            resb1 = 0
            for i in a:
                if i != vala:
                    resa += 1
                if i != vala1:
                    resa1 += 1
            for i in b:
                if i != valb:
                    count_b_diff_val += 1
                if i != valb1:
                    resb1 += 1
            print(np.min(np.array([resa + resb1, resa1 + count_b_diff_val])))
```

### 2.4.

```
import numpy as np
arbitrary_condition_two = 90
arbitrary_condition_four = 
