

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            lst[i] = substract(a, b);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(lst[i]);
        }
    }

    public static int substract(int a, int b) {
        if (a > b) {
            int total = 0;
            while (a > 0 && b > 0) {
                total += a / b;
                a = a % b;
                if (a > 0) {
                    total += b / a;
                    b = b % a;
                }
            }
            return total;
        }
        if (a < b) {
            int total = 0;
            while (a > 0 && b > 0) {
                total += b / a;
                b = b % a;
                if (b > 0) {
                    total += a / b;
                    a = a % b;
                }
            }
            return total;
        }
        if (a == b) {
            return 1;
        }
        return 0;
    }
}

```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:

```
azcbobobegghakl
```

Then your program should print:

```
Number of times bob occurs is: 2
```

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

Write a program that prints the longest substring of s in which the letters occur in alphabetical order. For example, if s = 'azcbobobegghakl', then your program should print:

```
Longest substring in alphabetical order is: beggh
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String longest = "";
        String current = "";
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) <= s.charAt(i + 1)) {
                current += s.charAt(i);
            } else {
                current += s.charAt(i);
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = "";
            }
        }
        current += s.charAt(s.length() - 1);
        if (current.length() > longest.length()) {
            longest = current;
        }
        System.out.println("Longest substring in alphabetical order is: " + longest);
    }
}

```


```

## 2.

Write a program that prints the number of times the string 'bob' occurs in s. For example, if s = 'azcbobobegghakl', then your program should print:

```
Number of times bob occurs is: 2
```

```python
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i + 3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)

```

## 3.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order. For example, if s = 'azcbobobegghakl', then your program should print:

```
Longest substring in alphabetical order is: beggh
```

```python
s = input()
longest = ''
current = ''
for i in range(len(s) - 1):
    if s[i] <= s[i + 1]:
        current += s[i]
    else:
        current += s[i]
        if len(current) > len(longest):
            longest = current
        current = ''
current += s[len(s) - 1]
if len(current) > len(longest):
    longest = current
print('Longest substring in alphabetical order is:', longest)

```
/MITx-6.00.1x/Week 2/Problem Set 2/README.md
# Problem Set 2

## 1.

Write a program to calculate the credit card balance after one year if a person only pays the minimum monthly payment required by the credit card company each month.

The following variables contain values as described below:

```
balance - the outstanding balance on the credit card

annualInterestRate - annual interest rate as a decimal

monthlyPaymentRate - minimum monthly payment rate as a decimal
```

For each month, calculate statements on the monthly payment and remaining balance. At the end of 12 months, print out the remaining balance. Be sure to print out no more than two decimal digits of accuracy - so print

```
Remaining balance: 813.41
```

instead of

```
Remaining balance: 813.4141998135
```

So your program only prints out one thing: the remaining balance at the end of the year in the format:

```
Remaining balance: 4784.0
```

A summary of the required math is found below:

```
Monthly interest rate= (Annual interest rate) / 12.0
Minimum monthly payment = (Minimum monthly payment rate) x (Previous balance)
Monthly unpaid balance = (Previous balance) - (Minimum monthly payment)
Updated balance each month = (Monthly unpaid balance) + (Monthly interest rate x Monthly unpaid balance)
```

```python
balance = float(input())
annualInterestRate = float(input())
monthlyPaymentRate = float(input())

for i in range(12):
    minimumMonthlyPayment = monthlyPaymentRate * balance
    monthlyUnpaidBalance = balance - minimumMonthlyPayment
    balance = monthlyUnpaidBalance + (annualInterestRate / 12) * monthlyUnpaidBalance

print('Remaining balance:', round(balance, 2))

```

## 2.

Now write a program that calculates the minimum fixed monthly payment needed in order pay off a credit card balance within 12 months. By a fixed monthly payment, we mean a single number which does not change each month, but instead is a constant amount that will be paid each month.

In this problem, we will not be dealing with a minimum monthly payment rate.

The following variables contain values as described below:

```
balance - the outstanding balance on the credit card

annualInterestRate - annual interest rate as a decimal
```

The program should print out one line: the lowest monthly payment that will pay off all debt in under 1 year, for example:

```
Lowest Payment: 180
```

Assume that the interest is compounded monthly according to the balance at the end of the month (after the payment for that month is made). The monthly payment must be a multiple of $10 and is the same for all months. Notice that it is possible for the balance to become negative using this payment scheme, which is okay. A summary of the required math is found below:

```
Monthly interest rate = (Annual interest rate) / 12.0
Monthly unpaid balance = (Previous balance) - (Minimum fixed monthly payment)
Updated balance each month = (Monthly unpaid balance) + (Monthly interest rate x Monthly unpaid balance)
```

```python
balance = float(input())
annualInterestRate = float(input())

monthlyInterestRate = annualInterestRate / 12
lowerBound = balance / 12
upperBound = (balance * (1 + monthlyInterestRate) ** 12) / 12

while True:
    minimumFixedMonthlyPayment = (lowerBound + upperBound) / 2
    balance = balance
    for i in range(12):
        monthlyUnpaidBalance = balance - minimumFixedMonthlyPayment
        balance = monthlyUnpaidBalance + (monthlyInterestRate * monthlyUnpaidBalance)
    if balance > 0:
        lowerBound = minimumFixedMonthlyPayment
    elif balance < 0:
        upperBound = minimumFixedMonthlyPayment
    else:
        break

print('Lowest Payment:', round(minimumFixedMonthlyPayment))

```

## 3.

You'll notice that in Problem 2, your monthly payment had to be a multiple of $10. Why did we make it that way? You can try running your code locally so that the payment can be any dollar and cent amount (in other words, the monthly payment is a multiple of $0.01). Does your code still work? It should, but you may notice that your code runs more slowly, especially in cases with very large balances and interest rates. (Note: when your code is running on our servers, there are limits on the amount of computing time each submission is allowed, so your observations from running this experiment on the grading system might be limited to an error message complaining about too much time taken.)

Well then, how can we calculate a more accurate fixed monthly payment than we did in Problem 2 without running into the problem of slow code? We can make this program run faster using a technique introduced in lecture - bisection search!

The following variables contain values as described below:

```
balance - the outstanding balance on the credit card

annualInterestRate - annual interest rate as a decimal
```

To recap the problem: we are searching for the smallest monthly payment such that we can pay off the entire balance within a year. What is a reasonable lower bound for this payment value? $0 is the obvious anwer, but you can do better than that. If there was no interest, the debt can be paid off by monthly payments of one-twelfth of the original balance, so we must pay at least this much every month. One-twelfth of the original balance is a good lower bound.

What is a good upper bound? Imagine that instead of paying monthly, we paid off the entire balance at the end of the year. What we ultimately pay must be greater than what we would've paid in monthly installments, because the interest was compounded on the balance we didn't pay off each month. So a good upper bound for the monthly payment would be one-twelfth of the balance, after having its interest compounded monthly for an entire year.

In short:

```
Monthly interest rate = (Annual interest rate) / 12.0
Monthly payment lower bound = Balance / 12
Monthly payment upper bound = (Balance x (1 + Monthly interest rate)12) / 12.0
```

Write a program that uses these bounds and bisection search (for more info check out the Wikipedia page on bisection search) to find the smallest monthly payment to the cent (no more multiples of $10) such that we can pay off the debt within a year. Try it out with large inputs, and notice how fast it is (try the same large inputs in your solution to Problem 2 to compare!). Produce the same return value as you did in Problem 2.

```python
balance = float(input())
annualInterestRate = float(input())

monthlyInterestRate = annualInterestRate / 12
lowerBound = balance / 12
upperBound = (balance * (1 + monthlyInterestRate) ** 12) / 12

while True:
    minimumFixedMonthlyPayment = (lowerBound + upperBound) / 2
    balance = balance
    for i in range(12):
        monthlyUnpaidBalance = balance - minimumFixedMonthlyPayment
        balance = monthlyUnpaidBalance + (monthlyInterestRate * monthlyUnpaidBalance)
    if balance > 0:
        lowerBound = minimumFixedMonthlyPayment
    elif balance < 0:
        upperBound = minimumFixedMonthlyPayment
    else:
        break

print('Lowest Payment:', round(minimumFixedMonthlyPayment, 2))

```

## 4.

Write a program to determine how many months it will take to pay off a credit card balance. You will be given the following list of items (ln the same order).

```
A credit card balance

Annual interest rate

Monthly payment rate
```

A summary of the required math is found below:

```
Monthly interest rate= (Annual interest rate) / 12.0
Minimum monthly payment = (Minimum monthly payment rate) x (Previous balance)
Monthly unpaid balance = (Previous balance) - (Minimum monthly payment)
Updated balance each month = (Monthly unpaid balance) + (Monthly interest rate x Monthly unpaid balance)
```

The program should print out one line: the number of months it takes to pay off the debt. Assume that the interest is compounded monthly according to the balance at the end of the month (after the payment for that month is made). In order to pay off a credit card debt in a year, a person must make at least one payment per month.

```python
balance = float(input())
annualInterestRate = float(input())
monthlyPaymentRate = float(input())

for i in range(12):
    minimumMonthlyPayment = monthlyPaymentRate * balance
    monthlyUnpaidBalance = balance - minimumMonthlyPayment
    balance = monthlyUnpaidBalance + (annualInterestRate / 12) * monthlyUnpaidBalance

print('Number of months needed:', i + 1)

```

## 5.

Write a program that uses these bounds and bisection search (for more info check out the Wikipedia page on bisection search) to find the smallest monthly payment to the cent (no more multiples of $10) such that we can pay off the debt within a year. Try it out with large inputs, and notice how fast it is (try the same large inputs in your solution to Problem 2 to compare!). Produce the same return value as you did in Problem 2.

```python
balance = float(input())
annualInterestRate = float(input())

monthlyInterestRate = annualInterestRate / 12
lowerBound = balance / 12
upperBound = (balance * (1 + monthlyInterestRate) ** 12) / 12

while True:
    minimumFixedMonthlyPayment = (lowerBound + upperBound) / 2
    balance = balance
    for i in range(12):
        monthlyUnpaidBalance = balance - minimumFixedMonthlyPayment
        balance = monthlyUnpaidBalance + (monthlyInterestRate * monthlyUnpaidBalance)
    if balance > 0:
        lowerBound = minimumFixedMonthlyPayment
    elif balance < 0:
        upperBound = minimumFixedMonthlyPayment
    else:
        break

print('Lowest Payment:', round(minimumFixedMonthlyPayment, 2))

```

## 6.

Write a program to calculate the credit card balance after one year if a person only pays the minimum monthly payment required by the credit card company each month.

The following variables contain values as described below:

```
balance - the outstanding balance on the credit card

annualInterestRate - annual interest rate as a decimal

monthlyPaymentRate - minimum monthly payment rate as a decimal
```

For each month,
