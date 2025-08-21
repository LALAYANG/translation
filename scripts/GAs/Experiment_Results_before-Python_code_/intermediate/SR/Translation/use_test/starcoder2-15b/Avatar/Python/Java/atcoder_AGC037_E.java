

```
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();
		boolean aaaa = false;
		if(K >= 15)
		{
			aaaa = true;
		}
		else if(Math.pow(2,K) >= N)
		{
			aaaa = true;
		}
		if(aaaa)
		{
			System.out.println(String.valueOf(S.charAt(0)).repeat(N));
			System.exit(0);
		}
		String U = S + new StringBuilder(S).reverse().toString();
		char c = S.charAt(0);
		int p = U.indexOf(c);
		int minindex = p;
		p += 1;
		while(p <= N)
		{
			if(U.charAt(p) == c)
			{
				if(check_normal_dict(U,minindex,p))
				{
					minindex = p;
				}
			}
			p += 1;
		}
		U = U.substring(minindex,minindex+N);
		if(K == 1)
		{
			System.out.println(U);
		}
		else
		{
			int count = 0;
			for(int i = 0; i < U.length(); i++)
			{
				if(U.charAt(i) == U.charAt(0))
				{
					count += 1;
				}
				else
				{
					break;
				}
			}
			if(count * (int)Math.pow(2,K-1) >= N)
			{
				System.out.println(String.valueOf(U.charAt(0)).repeat(N));
			}
			else
			{
				U = String.valueOf(U.charAt(0)).repeat(count * ((int)Math.pow(2,K-1) - 1)) + U;
				System.out.println(U.substring(0,N));
			}
		}
	}
	public static boolean check_normal_dict(String u, int pointer1, int pointer2)
	{
		for(int i = 0; i < u.length(); i++)
		{
			if(u.charAt(pointer1+i) > u.charAt(pointer2+i))
			{
				return true;
			}
			else if(u.charAt(pointer1+i) < u.charAt(pointer2+i))
			{
				return false;
			}
		}
		return false;
	}
}
```


```

Java code:

```
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++)
		{
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] A = new int[N];
			for(int j = 0; j < N; j++)
			{
				A[j] = sc.nextInt();
			}
			int[] B = new int[N];
			for(int j = 0; j < N; j++)
			{
				B[j] = sc.nextInt();
			}
			int[] C = new int[N];
			for(int j = 0; j < N; j++)
			{
				C[j] = sc.nextInt();
			}
			int[] D = new int[N];
			for(int j = 0; j < N; j++)
			{
				D[j] = sc.nextInt();
			}
			int[] E = new int[N];
			for(int j = 0; j < N; j++)
			{
				E[j] = sc.nextInt();
			}
			int[] F = new int[N];
			for(int j = 0; j < N; j++)
			{
				F[j] = sc.nextInt();
			}
			int[] G = new int[N];
			for(int j = 0; j < N; j++)
			{
				G[j] = sc.nextInt();
			}
			int[] H = new int[N];
			for(int j = 0; j < N; j++)
			{
				H[j] = sc.nextInt();
			}
			int[] I = new int[N];
			for(int j = 0; j < N; j++)
			{
				I[j] = sc.nextInt();
			}
			int[] J = new int[N];
			for(int j = 0; j < N; j++)
			{
				J[j] = sc.nextInt();
			}
			int[] K1 = new int[N];
			for(int j = 0; j < N; j++)
			{
				K1[j] = sc.nextInt();
			}
			int[] L = new int[N];
			for(int j = 0; j < N; j++)
			{
				L[j] = sc.nextInt();
			}
			int[] M = new int[N];
			for(int j = 0; j < N; j++)
			{
				M[j] = sc.nextInt();
			}
			int[] N1 = new int[N];
			for(int j = 0; j < N; j++)
			{
				N1[j] = sc.nextInt();
			}
			int[] O = new int[N];
			for(int j = 0; j < N; j++)
			{
				O[j] = sc.nextInt();
			}
			int[] P = new int[N];
			for(int j = 0; j < N; j++)
			{
				P[j] = sc.nextInt();
			}
			int[] Q = new int[N];
			for(int j = 0; j < N; j++)
			{
				Q[j] = sc.nextInt();
			}
			int[] R = new int[N];
			for(int j = 0; j < N; j++)
			{
				R[j] = sc.nextInt();
			}
			int[] S = new int[N];
			for(int j = 0; j < N; j++)
			{
				S[j] = sc.nextInt();
			}
			int[] T1 = new int[N];
			for(int j = 0; j < N; j++)
			{
				T1[j] = sc.nextInt();
			}
			int[] U = new int[N];
			for(int j = 0; j < N; j++)
			{
				U[j] = sc.nextInt();
			}
			int[] V = new int[N];
			for(int j = 0; j < N; j++)
			{
				V[j] = sc.nextInt();
			}
			int[] W = new int[N];
			for(int j = 0; j < N; j++)
			{
				W[j] = sc.nextInt();
			}
			int[] X = new int[N];
			for(int j = 0; j < N; j++)
			{
				X[j] = sc.nextInt();
			}
			int[] Y = new int[N];
			for(int j = 0; j < N; j++)
			{
				Y[j] = sc.nextInt();
			}
			int[] Z = new int[N];
			for(int j = 0; j < N; j++)
			{
				Z[j] = sc.nextInt();
			}
			int[] AA = new int[N];
			for(int j = 0; j < N; j++)
			{
				AA[j] = sc.nextInt();
			}
			int[] BB = new int[N];
			for(int j = 0; j < N; j++)
			{
				BB[j] = sc.nextInt();
			}
			int[] CC = new int[N];
			for(int j = 0; j < N; j++)
			{
				CC[j] = sc.nextInt();
			}
			int[] DD = new int[N];
			for(int j = 0; j < N; j++)
			{
				DD[j] = sc.nextInt();
			}
			int[] EE = new int[N];
			for(int j = 0; j < N; j++)
			{
				EE[j] = sc.nextInt();
			}
			int[] FF = new int[N];
			for(int j = 0; j < N; j++)
			{
				FF[j] = sc.nextInt();
			}
			int[] GG = new int[N];
			for(int j = 0; j < N; j++)
			{
				GG[j] = sc.nextInt();
			}
			int[] HH = new int[N];
			for(int j = 0; j < N; j++)
			{
				HH[j] = sc.nextInt();
			}
			int[] II = new int[N];
			for(int j = 0; j < N; j++)
			{
				II[j] = sc.nextInt();
			}
			int[] JJ = new int[N];
			for(int j = 0; j < N; j++)
			{
				JJ[j] = sc.nextInt();
			}
			int[] KK = new int[N];
			for(int j = 0; j < N; j++)
			{
				KK[j] = sc.nextInt();
			}
			int[] LL = new int[N];
			for(int j = 0; j < N; j++)
			{
				LL[j] = sc.nextInt();
			}
			int[] MM = new int[N];
			for(int j = 0; j < N; j++)
			{
				MM[j] = sc.nextInt();
			}
			int[] NN = new int[N];
			for(int j = 0; j < N; j++)
			{
				NN[j] = sc.nextInt();
			}
			int[] OO = new int[N];
			for(int j = 0; j < N; j++)
			{
				OO[j] = sc.nextInt();
			}
			int[] PP = new int[N];
			for(int j = 0; j < N; j++)
			{
				PP[j] = sc.nextInt();
			}
			int[] QQ = new int[N];
			for(int j = 0; j < N; j++)
			{
				QQ[j] = sc.nextInt();
			}
			int[] RR = new int[N];
			for(int j = 0; j < N; j++)
			{
				RR[j] = sc.nextInt();
			}
			int[] SS = new int[N];
			for(int j = 0; j < N; j++)
			{
				SS[j] = sc.nextInt();
			}
			int[] TT = new int[N];
			for(int j = 0; j < N; j++)
			{
				TT[j] = sc.nextInt();
			}
			int[] UU = new int[N];
			for(int j = 0; j < N; j++)
			{
				UU[j] = sc.nextInt();
			}
			int[] VV = new int[N];
			for(int j = 0; j < N; j++)
			{
				VV[j] = sc.nextInt();
			}
			int[] WW = new int[N];
			for(int j = 0; j < N; j++)
			{
				WW[j] = sc.nextInt();
			}
			int[] XX = new int[N];
			for(int j = 0; j < N; j++)
			{
				XX[j] = sc.nextInt();
			}
			int[] YY = new int[N];
			for(int j = 0; j < N; j++)
			{
				YY[j] = sc.nextInt();
			}
			int[] ZZ = new int[N];
			for(int j = 0; j < N; j++)
			{
				ZZ[j] = sc.nextInt();
			}
			int[] AAA = new int[N];
			for(int j = 0; j < N; j++)
			{
				AAA[j] = sc.nextInt();
			}
			int[] BBB = new int[N];
			for(int j = 0; j < N; j++)
			{
				BBB[j] = sc.nextInt();
			}
			int[] CCC = new int[N];
			for(int j = 0; j < N; j++)
			{
				CCC[j] = sc.nextInt();
			}
			int[] DDD = new int[N];
			for(int j = 0; j < N; j++)
			{
				DDD[j] = sc.nextInt();
			}
			int[] EEE = new int[N];
			for(int j = 0; j < N; j++)
			{
				EEE[j] = sc.nextInt();
			}
			int[] FFF = new int[N];
			for(int j = 0; j < N; j++)
			{
				FFF[j] = sc.nextInt();
			}
			int[] GGG = new int[N];
			for(int j = 0; j < N; j++)
			{
				GGG[j] = sc.nextInt();
			}
			int[] HHH = new int[N];
			for(int j = 0; j < N; j++)
			{
				HHH[j] = sc.nextInt();
			}
			int[] III = new int[N];
			for(int j = 0; j < N; j++)
			{
				III[j] = sc.nextInt();
			}
			int[] JJJ = new int[N];
			for(int j = 0; j < N; j++)
			{
				JJJ[j] = sc.nextInt();
			}
			int[] KKK = new int[N];
			for(
