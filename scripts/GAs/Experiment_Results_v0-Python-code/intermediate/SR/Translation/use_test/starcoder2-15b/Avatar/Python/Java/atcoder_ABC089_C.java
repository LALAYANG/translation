

```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.next();
        }
        int[] march_lis = new int[5];
        int check3 = 111;
        int check1 = 134;
        int check2 = 843;
        int check4 = 771;
        for (String s : S) {
            if ((check2 & check4) != 0) {
                if ((check3 & check1) != 0) {
                    if (s.toUpperCase().charAt(0) == 'M' || s.toUpperCase().charAt(0) == 'A' || s.toUpperCase().charAt(0) == 'R' || s.toUpperCase().charAt(0) == 'C' || s.toUpperCase().charAt(0) == 'H') {
                        march_lis[s.toUpperCase().charAt(0) - 'A']++;
                    }
                }
            }
        }
        long ans = 0;
        for (int x : march_lis) {
            for (int y : march_lis) {
                for (int count3 : march_lis) {
                    ans += x * y * count3;
                }
            }
        }
        System.out.println(ans);
    }
}
```


```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }
        int[] C = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            C[i] = sc.nextInt();
        }
        int[] D = new int[N];
        for (int i = 0; i < N; i++) {
            D[i] = sc.nextInt();
        }
        int[] E = new int[N];
        for (int i = 0; i < N; i++) {
            E[i] = sc.nextInt();
        }
        int[] F = new int[N];
        for (int i = 0; i < N; i++) {
            F[i] = sc.nextInt();
        }
        int[] G = new int[N];
        for (int i = 0; i < N; i++) {
            G[i] = sc.nextInt();
        }
        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
        }
        int[] I = new int[N];
        for (int i = 0; i < N; i++) {
            I[i] = sc.nextInt();
        }
        int[] J = new int[N];
        for (int i = 0; i < N; i++) {
            J[i] = sc.nextInt();
        }
        int[] K = new int[N];
        for (int i = 0; i < N; i++) {
            K[i] = sc.nextInt();
        }
        int[] L = new int[N];
        for (int i = 0; i < N; i++) {
            L[i] = sc.nextInt();
        }
        int[] M = new int[N];
        for (int i = 0; i < N; i++) {
            M[i] = sc.nextInt();
        }
        int[] N = new int[N];
        for (int i = 0; i < N; i++) {
            N[i] = sc.nextInt();
        }
        int[] O = new int[N];
        for (int i = 0; i < N; i++) {
            O[i] = sc.nextInt();
        }
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }
        int[] Q = new int[N];
        for (int i = 0; i < N; i++) {
            Q[i] = sc.nextInt();
        }
        int[] R = new int[N];
        for (int i = 0; i < N; i++) {
            R[i] = sc.nextInt();
        }
        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.nextInt();
        }
        int[] T = new int[N];
        for (int i = 0; i < N; i++) {
            T[i] = sc.nextInt();
        }
        int[] U = new int[N];
        for (int i = 0; i < N; i++) {
            U[i] = sc.nextInt();
        }
        int[] V = new int[N];
        for (int i = 0; i < N; i++) {
            V[i] = sc.nextInt();
        }
        int[] W = new int[N];
        for (int i = 0; i < N; i++) {
            W[i] = sc.nextInt();
        }
        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();
        }
        int[] Y = new int[N];
        for (int i = 0; i < N; i++) {
            Y[i] = sc.nextInt();
        }
        int[] Z = new int[N];
        for (int i = 0; i < N; i++) {
            Z[i] = sc.nextInt();
        }
        int[] AA = new int[N];
        for (int i = 0; i < N; i++) {
            AA[i] = sc.nextInt();
        }
        int[] AB = new int[N];
        for (int i = 0; i < N; i++) {
            AB[i] = sc.nextInt();
        }
        int[] AC = new int[N];
        for (int i = 0; i < N; i++) {
            AC[i] = sc.nextInt();
        }
        int[] AD = new int[N];
        for (int i = 0; i < N; i++) {
            AD[i] = sc.nextInt();
        }
        int[] AE = new int[N];
        for (int i = 0; i < N; i++) {
            AE[i] = sc.nextInt();
        }
        int[] AF = new int[N];
        for (int i = 0; i < N; i++) {
            AF[i] = sc.nextInt();
        }
        int[] AG = new int[N];
        for (int i = 0; i < N; i++) {
            AG[i] = sc.nextInt();
        }
        int[] AH = new int[N];
        for (int i = 0; i < N; i++) {
            AH[i] = sc.nextInt();
        }
        int[] AI = new int[N];
        for (int i = 0; i < N; i++) {
            AI[i] = sc.nextInt();
        }
        int[] AJ = new int[N];
        for (int i = 0; i < N; i++) {
            AJ[i] = sc.nextInt();
        }
        int[] AK = new int[N];
        for (int i = 0; i < N; i++) {
            AK[i] = sc.nextInt();
        }
        int[] AL = new int[N];
        for (int i = 0; i < N; i++) {
            AL[i] = sc.nextInt();
        }
        int[] AM = new int[N];
        for (int i = 0; i < N; i++) {
            AM[i] = sc.nextInt();
        }
        int[] AN = new int[N];
        for (int i = 0; i < N; i++) {
            AN[i] = sc.nextInt();
        }
        int[] AO = new int[N];
        for (int i = 0; i < N; i++) {
            AO[i] = sc.nextInt();
        }
        int[] AP = new int[N];
        for (int i = 0; i < N; i++) {
            AP[i] = sc.nextInt();
        }
        int[] AQ = new int[N];
        for (int i = 0; i < N; i++) {
            AQ[i] = sc.nextInt();
        }
        int[] AR = new int[N];
        for (int i = 0; i < N; i++) {
            AR[i] = sc.nextInt();
        }
        int[] AS = new int[N];
        for (int i = 0; i < N; i++) {
            AS[i] = sc.nextInt();
        }
        int[] AT = new int[N];
        for (int i = 0; i < N; i++) {
            AT[i] = sc.nextInt();
        }
        int[] AU = new int[N];
        for (int i = 0; i < N; i++) {
            AU[i] = sc.nextInt();
        }
        int[] AV = new int[N];
        for (int i = 0; i < N; i++) {
            AV[i] = sc.nextInt();
        }
        int[] AW = new int[N];
        for (int i = 0; i < N; i++) {
            AW[i] = sc.nextInt();
        }
        int[] AX = new int[N];
        for (int i = 0; i < N; i++) {
            AX[i] = sc.nextInt();
        }
        int[] AY = new int[N];
        for (int i = 0; i < N; i++) {
            AY[i] = sc.nextInt();
        }
        int[] AZ = new int[N];
        for (int i = 0; i < N; i++) {
            AZ[i] = sc.nextInt();
        }
        int[] BA = new int[N];
        for (int i = 0; i < N; i++) {
            BA[i] = sc.nextInt();
        }
        int[] BB = new int[N];
        for (int i = 0; i < N; i++) {
            BB[i] = sc.nextInt();
        }
        int[] BC = new int[N];
        for (int i = 0; i < N; i++) {
            BC[i] = sc.nextInt();
        }
        int[] BD = new int[N];
        for (int i = 0; i < N; i++) {
            BD[i] = sc.nextInt();
        }
        int[] BE = new int[N];
        for (int i = 0; i < N; i++) {
            BE[i] = sc.nextInt();
        }
        int[] BF = new int[N];
        for (int i = 0; i < N; i++) {
            BF[i] = sc.nextInt();
        }
        int[] BG = new int[N];
        for (int i = 0; i < N; i++) {
            BG[i] = sc.nextInt();
        }
        int[] BH = new int[N];
        for (int i = 0; i < N; i++) {
            BH[i] = sc.nextInt();
        }
        int[] BI = new int[N];
        for (int i = 0; i < N; i++) {
            BI[i] = sc.nextInt();
        }
        int[] BJ = new int[N];
        for (int i = 0; i < N; i++) {
            BJ[i] = sc.nextInt();
        }
        int[] BK = new int[N];
        for (int i = 0; i < N; i++) {
            BK[i] = sc.nextInt();
        }
        int[] BL = new int[N];
        for (int i = 0; i < N; i++) {
            BL[i] = sc.nextInt();
        }
        int[] BM = new int[N];
        for (int i = 0; i < N; i++) {
            BM[i] = sc.nextInt();
        }
        int[] BN = new int[N];
        for (int i = 0; i < N; i++) {
            BN[i] = sc.nextInt();
        }
        int[] BO = new int[N];
        for (int i = 0; i < N; i++) {
            BO[i] = sc.nextInt();
        }
        int[] BP = new int[N];
        for (int i = 0; i < N; i++) {
            BP[i] = sc.nextInt();
        }
        int[] BQ = new int[N];
        for (int i = 0; i < N; i++) {
            BQ[i] = sc.nextInt();
        }
        int[] BR = new int[N];
        for (int i = 0; i < N; i++) {
            BR[i] = sc.nextInt();
        }
        int[] BS = new int[N];
        for (int i = 0; i < N; i++) {
            BS[i] = sc.nextInt();
        }
        int[] BT = new int[N];
        for (int i = 0; i < N; i++) {
            BT[i] = sc.nextInt();
        }
        int[] BU = new int[N];
        for (int i = 
