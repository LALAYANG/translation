

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (arr[0] > 15) {
            System.out.println(15);
        } else {
            for (int i = 1; i < n; i++) {
                if (arr[i] - arr[i - 1] > 15) {
                    System.out.println(arr[i - 1] + 15);
                    break;
                }
            } else {
                if (arr[n - 1] == 90 || arr[n - 1] + 15 >= 90) {
                    System.out.println(90);
                } else {
                    System.out.println(arr[n - 1] + 15);
                }
            }
        }
    }
}

```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, with overlapping.

For example, if the string is "azcbobobegghakl", then your program should print:

Number of times bob occurs is: 2

```
s = input()
count = 0
for i in range(len(s)-2):
    if s[i:i+3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)

```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println("Number of times bob occurs is: " + count);
    }
}

```

## 3.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

For example, if s = 'azcbobobegghakl', then your program should print:

Longest substring in alphabetical order is: beggh

In the case of ties, print the first substring.

```
s = input()
longest = s[0]
current = s[0]
for i in range(1, len(s)):
    if s[i] >= current[-1]:
        current += s[i]
        if len(current) > len(longest):
            longest = current
    else:
        current = s[i]
print('Longest substring in alphabetical order is:', longest)

```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String longest = s.substring(0, 1);
        String current = s.substring(0, 1);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) >= current.charAt(current.length() - 1)) {
                current += s.charAt(i);
                if (current.length() > longest.length()) {
                    longest = current;
                }
            } else {
                current = s.charAt(i) + "";
            }
        }
        System.out.println("Longest substring in alphabetical order is: " + longest);
    }
}

```


```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 2.

Write a program that prints the number of times the string 'bob' occurs in s.

```
s = input()
count = 0
for i in range(len(s)-2):
    if s[i:i+3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)

```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println("Number of times bob occurs is: " + count);
    }
}

```

## 3.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

For example, if s = 'azcbobobegghakl', then your program should print:

Longest substring in alphabetical order is: beggh

In the case of ties, print the first substring.

```
s = input()
longest = s[0]
current = s[0]
for i in range(1, len(s)):
    if s[i] >= current[-1]:
        current += s[i]
        if len(current) > len(longest):
            longest = current
    else:
        current = s[i]
print('Longest substring in alphabetical order is:', longest)

```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String longest = s.substring(0, 1);
        String current = s.substring(0, 1);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) >= current.charAt(current.length() - 1)) {
                current += s.charAt(i);
                if (current.length() > longest.length()) {
                    longest = current;
                }
            } else {
                current = s.charAt(i) + "";
            }
        }
        System.out.println("Longest substring in alphabetical order is: " + longest);
    }
}

```
/MITx-6.00.1x/Week 2/Problem Set 2/README.md
# Problem Set 2

## 1.

Write a program to calculate the credit card balance after one year if a person only pays the minimum monthly payment required by the credit card company each month.

The following variables contain values as described below:

- balance - the outstanding balance on the credit card
- annualInterestRate - annual interest rate as a decimal
- monthlyPaymentRate - minimum monthly payment rate as a decimal

For each month, calculate statements on the monthly payment and remaining balance. At the end of 12 months, print out the remaining balance. Be sure to print out no more than two decimal digits of accuracy.

```
balance = 42
annualInterestRate = 0.2
monthlyPaymentRate = 0.04

for i in range(12):
    balance = balance - balance * monthlyPaymentRate
    balance = balance + balance * (annualInterestRate / 12)

print('Remaining balance:', round(balance, 2))

```

Java code:

```java
public class Main {
    public static void main(String[] args) {
        double balance = 42;
        double annualInterestRate = 0.2;
        double monthlyPaymentRate = 0.04;

        for (int i = 0; i < 12; i++) {
            balance = balance - balance * monthlyPaymentRate;
            balance = balance + balance * (annualInterestRate / 12);
        }

        System.out.println("Remaining balance: " + String.format("%.2f", balance));
    }
}

```

## 2.

Write a program that calculates the minimum fixed monthly payment needed in order pay off a credit card balance within 12 months. By a fixed monthly payment, we mean a single number which does not change each month, but instead is a constant amount that will be paid each month.

In this problem, we will not be dealing with a minimum monthly payment rate.

The following variables contain values as described below:

- balance - the outstanding balance on the credit card
- annualInterestRate - annual interest rate as a decimal

The program should print out one line: the lowest monthly payment that will pay off all debt in under 1 year, for example:

Lowest Payment: 180

```
balance = 3329
annualInterestRate = 0.2

monthlyInterestRate = annualInterestRate / 12
monthlyPayment = 10

while True:
    balanceCopy = balance
    for i in range(12):
        balanceCopy = balanceCopy - monthlyPayment
        balanceCopy = balanceCopy + balanceCopy * monthlyInterestRate
    if balanceCopy <= 0:
        break
    monthlyPayment += 10

print('Lowest Payment:', monthlyPayment)

```

Java code:

```java
public class Main {
    public static void main(String[] args) {
        double balance = 3329;
        double annualInterestRate = 0.2;

        double monthlyInterestRate = annualInterestRate / 12;
        double monthlyPayment = 10;

        while (true) {
            double balanceCopy = balance;
            for (int i = 0; i < 12; i++) {
                balanceCopy = balanceCopy - monthlyPayment;
                balanceCopy = balanceCopy + balanceCopy * monthlyInterestRate;
            }
            if (balanceCopy <= 0) {
                break;
            }
            monthlyPayment += 10;
        }

        System.out.println("Lowest Payment: " + monthlyPayment);
    }
}

```

## 3.

Write a program that uses these bounds and bisection search (for more info check out the Wikipedia page on bisection search) to find the smallest monthly payment to the cent (no more multiples of $10) such that we can pay off the debt within a year.

Try it out with large inputs, and notice how fast it is (try the same large inputs in your solution to Problem 2 to compare!). Produce the same return value as you did in Problem 2.

Note that if you do not use bisection search, your code will not run - your code only has 30 seconds to run on our servers.

```
balance = 999999
annualInterestRate = 0.18

monthlyInterestRate = annualInterestRate / 12

lowerBound = balance / 12
upperBound = (balance * (1 + monthlyInterestRate) ** 12) / 12

while True:
    monthlyPayment = (lowerBound + upperBound) / 2
    balanceCopy = balance
    for i in range(12):
        balanceCopy = balanceCopy - monthlyPayment
        balanceCopy = balanceCopy + balanceCopy * monthlyInterestRate
    if balanceCopy <= 0:
        if abs(balanceCopy) < 0.01:
            break
        upperBound = monthlyPayment
    else:
        lowerBound = monthlyPayment

print('Lowest Payment:', round(monthlyPayment, 2))

```

Java code:

```java
public class Main {
    public static void main(String[] args) {
        double balance = 999999;
        double annualInterestRate = 0.18;

        double monthlyInterestRate = annualInterestRate / 12;

        double lowerBound = balance / 12;
        double upperBound = (balance * (1 + monthlyInterestRate) ** 12) / 12;

        while (true) {
            double monthlyPayment = (lowerBound + upperBound) / 2;
            double balanceCopy = balance;
            for (int i = 0; i < 12; i++) {
                balanceCopy = balanceCopy - monthlyPayment;
                balanceCopy = balanceCopy + balanceCopy * monthlyInterestRate;
            }
            if (balanceCopy <= 0) {
                if (Math.abs(balanceCopy) < 0.01) {
                    break;
                }
                upperBound = monthlyPayment;
            } else {
                lowerBound = monthlyPayment;
            }
        }

        System.out.println("Lowest Payment: " + String.format("%.2f", monthlyPayment));
    }
}

```

## 4.

You'll notice that in Problem 2, your monthly payment had to be a multiple of $10. Why did we make it that way? You can try running your code locally so that the payment can be any dollar and cent amount (in other words, the monthly payment is a multiple of $0.01). Does your code still work? It should, but you may notice that your code runs more slowly, especially in cases with very large balances and interest rates. (Note: when your code is running on our servers, there are limits on the amount of computing time each submission is allowed, so your observations from running this experiment on the grading system might be limited to an error message complaining about too much time taken.)

Well then, how can we calculate a more accurate fixed monthly payment than we did in Problem 2 without running into the problem of slow code? We can make this program run faster using a technique introduced in lecture - bisection search!

The following variables contain values as described below:

- balance - the outstanding balance on the credit card
- annualInterestRate - annual interest rate as a decimal

To recap the problem: we are searching for the smallest monthly payment such that we can pay off the entire balance within a year. What is a reasonable lower bound for this payment value? $0 is the obvious anwer, but you can do better than that. If there was no interest, the debt could be paid off by monthly payments of one-twelfth of the original balance, so we must pay at least this much every month. One-twelfth of the original balance is a good lower bound.

What is a good upper bound? Imagine that instead of paying monthly, we paid off the entire balance at the end of the year. What we ultimately pay must be greater than what we would've paid in monthly installments, because the interest was compounded on the balance we didn't pay off each month. So a good upper bound for the monthly payment would be one-twelfth of the balance, after having its interest compounded monthly for an entire year.

In short:

Monthly interest rate = (Annual interest rate) / 12.0
Monthly payment lower bound = Balance / 12
Monthly payment upper bound = (Balance x (1 + Monthly interest rate)12) / 12.0

Write a program that uses these bounds and bisection search (for more info check out the Wikipedia page on bisection search) to find the smallest monthly payment to the cent (no more multiples of $10) such that we can pay off the debt within a year. Try it out with large inputs, and notice how fast it is (try the same large inputs in your solution to Problem 2 to compare!). Produce the same return value as you did in Problem 2.

Note that if you do not use bisection search, your code will not run - your code only has 30 seconds to run on our servers.

```
balance = 320000
annualInterestRate = 0.2

monthlyInterestRate = annualInterestRate / 12

lowerBound = balance / 12
upperBound = (balance * (1 + monthlyInterestRate) ** 12) / 12

while True:
    monthlyPayment = (lowerBound + upperBound) / 2
    balanceCopy = balance
    for i in range(12):
        balanceCopy = balanceCopy - monthlyPayment
        balanceCopy = balanceCopy + balanceCopy * monthlyInterestRate
    if balanceCopy <= 0:
        if abs(balanceCopy) < 0.01:
            break
        upperBound = monthlyPayment
    else:
        lowerBound = monthlyPayment

print('Lowest Payment:', round(monthlyPayment, 2))

```

Java code:

