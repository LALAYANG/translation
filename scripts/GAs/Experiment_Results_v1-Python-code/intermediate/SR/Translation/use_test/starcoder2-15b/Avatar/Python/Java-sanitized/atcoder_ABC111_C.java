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