import java.util.*;
import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.function.*;
import java.util.stream.*;
import java.text.*;
import java.math.*;
import java.util.Base64;
import java.time.*;
import java.time.format.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import org.apache.commons.math3.stat.inference.*;

public class codeforces_299_A {
    public static void main (String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(s[i]);
        System.out.println(arr[0]);
    }
}