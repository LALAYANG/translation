import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String[] cookieValues = sc.nextLine().split(" ");
		int firstValue = Integer.parseInt(cookieValues[0]);
		int thirdValue = Integer.parseInt(cookieValues[2]);
		int leftOver = firstValue - thirdValue;
		int takahashi = Math.max(0, leftOver);
		System.out.println(takahashi + " " + (takahashi > 0 ? cookieValues[1] : Math.max(0, Integer.parseInt(cookieValues[1]) - Math.abs(leftOver))));