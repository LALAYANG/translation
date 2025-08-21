

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int num_strings = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		Set<Integer> result_set = new HashSet<Integer>();
		for(int i = 0; i < num_strings; i++) {
			String current_string = sc.nextLine();
			int index_s = current_string.indexOf('S');
			int index_g = current_string.indexOf('G');
			result_set.add(index_s - index_g);
		}
		System.out.println(result_set.size());
	}
}
```

## 2.

Write a function that takes a list of strings and returns a list of strings that are anagrams of each other.

```
def anagram(arg0):
    return arg0

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def anagram_finder(words):
    return anagram(words)

print(anagram_finder(['cat', 'dog', 'tac', 'god', 'act']))
```

Java code:

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String[] words = sc.nextLine().split(" ");
		Set<String> anagrams = new HashSet<String>();
		for(int i = 0; i < words.length; i++) {
			char[] word_array = words[i].toCharArray();
			Arrays.sort(word_array);
			String sorted_word = new String(word_array);
			anagrams.add(sorted_word);
		}
		System.out.println(anagrams);
	}
}
```

## 3.

Write a function that takes a list of strings and returns a list of strings that are anagrams of each other.

```
def anagram(arg0):
    return arg0

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def anagram_finder(words):
    return anagram(words)

print(anagram_finder(['cat', 'dog', 'tac', 'god', 'act']))
```

Java code:

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String[] words = sc.nextLine().split(" ");
		Set<String> anagrams = new HashSet<String>();
		for(int i = 0; i < words.length; i++) {
			char[] word_array = words[i].toCharArray();
			Arrays.sort(word_array);
			String sorted_word = new String(word_array);
			anagrams.add(sorted_word);
		}
		System.out.println(anagrams);
	}
}
```

## 4.

Write a function that takes a list of strings and returns a list of strings that are anagrams of each other.

```
def anagram(arg0):
    return arg0

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def anagram_finder(words):
    return anagram(words)

print(anagram_finder(['cat', 'dog', 'tac', 'god', 'act']))
```

Java code:

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String[] words = sc.nextLine().split(" ");
		Set<String> anagrams = new HashSet<String>();
		for(int i = 0; i < words.length; i++) {
			char[] word_array = words[i].toCharArray();
			Arrays.sort(word_array);
			String sorted_word = new String(word_array);
			anagrams.add(sorted_word);
		}
		System.out.println(anagrams);
	}
}
```

## 5.

Write a function that takes a list of strings and returns a list of strings that are anagrams of each other.

```
def anagram(arg0):
    return arg0

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def anagram_finder(words):
    return anagram(words)

print(anagram_finder(['cat', 'dog', 'tac', 'god', 'act']))
```

Java code:

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String[] words = sc.nextLine().split(" ");
		Set<String> anagrams = new HashSet<String>();
		for(int i = 0; i < words.length; i++) {
			char[] word_array = words[i].toCharArray();
			Arrays.sort(word_array);
			String sorted_word = new String(word_array);
			anagrams.add(sorted_word);
		}
		System.out.println(anagrams);
	}
}
```
/README.md
# Python to Java

This repository contains a collection of Python code snippets and their Java equivalents.

## Table of Contents

- [Introduction](#introduction)
- [Python to Java Conversion](#python-to-java-conversion)
- [Contributing](#contributing)
- [License](#license)

## Introduction

Python is a popular and versatile programming language, while Java is a widely used object-oriented programming language. This repository aims to provide a collection of Python code snippets and their Java equivalents, helping developers transition smoothly from Python to Java.

## Python to Java Conversion

The repository contains a collection of Python code snippets and their Java equivalents. Each code snippet is accompanied by a detailed explanation of the conversion process, including the differences between Python and Java, as well as any additional considerations or best practices.

## Contributing

Contributions to this repository are welcome! If you have any Python code snippets that you would like to contribute, please submit a pull request.

## License

This repository is licensed under the [MIT License](LICENSE).

