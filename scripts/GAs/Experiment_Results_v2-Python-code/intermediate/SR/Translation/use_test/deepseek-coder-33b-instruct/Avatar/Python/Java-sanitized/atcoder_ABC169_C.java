import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

public class atcoder_ABC169_C {
    public static void main(String[] args) throws java.lang.Exception {
        int addition = 7;
        int base = 10;
        int exponent = 9;
        int result = calculationFunction(addition, base, exponent);
        System.out.println(result);
    }

    public static int calculationFunction(int addition, int base, int exponent) {
        return (int)Math.pow(base, exponent) + addition;
    }
}