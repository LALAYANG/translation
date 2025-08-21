

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = "";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '.') {
                result += '0';
            } else {
                i += 1;
                if (s.charAt(i) == '.') {
                    result += '1';
                } else {
                    result += '2';
                }
            }
            i += 1;
        }
        System.out.println(result);
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

In the case of ties, print the first substring. For example, if s = 'abcbcd', then your program should print:

```
Longest substring in alphabetical order is: abc
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String longest = "";
        String current = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i) >= s.charAt(i - 1)) {
                current += s.charAt(i);
            } else {
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = "" + s.charAt(i);
            }
        }
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

In the case of ties, print the first substring. For example, if s = 'abcbcd', then your program should print:

```
Longest substring in alphabetical order is: abc
```

```python
s = input()
longest = ''
current = ''
for i in range(len(s)):
    if i == 0 or s[i] >= s[i - 1]:
        current += s[i]
    else:
        if len(current) > len(longest):
            longest = current
        current = s[i]
if len(current) > len(longest):
    longest = current
print('Longest substring in alphabetical order is:', longest)
```
/MITx-6.00.1x/Week 2/Problem Set 2/README.md
# Problem Set 2

## 1.

Write a program that calculates the minimum fixed monthly payment needed in order pay off a credit card balance within 12 months. By a fixed monthly payment, we mean a single number which does not change each month, but instead is a constant amount that will be paid each month.

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
monthlyPayment = 10
while True:
    currentBalance = balance
    for i in range(12):
        currentBalance -= monthlyPayment
        currentBalance += currentBalance * monthlyInterestRate
    if currentBalance <= 0:
        break
    monthlyPayment += 10
print('Lowest Payment:', monthlyPayment)
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
monthlyPayment = 10
while True:
    currentBalance = balance
    for i in range(12):
        currentBalance -= monthlyPayment
        currentBalance += currentBalance * monthlyInterestRate
    if currentBalance <= 0:
        break
    monthlyPayment += 10
print('Lowest Payment:', monthlyPayment)
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
monthlyPayment = (lowerBound + upperBound) / 2
while True:
    currentBalance = balance
    for i in range(12):
        currentBalance -= monthlyPayment
        currentBalance += currentBalance * monthlyInterestRate
    if currentBalance <= 0:
        if abs(currentBalance) < 0.01:
            break
        upperBound = monthlyPayment
    else:
        lowerBound = monthlyPayment
    monthlyPayment = (lowerBound + upperBound) / 2
print('Lowest Payment:', round(monthlyPayment, 2))
```

## 4.

You can turn the problem in Problem 2 into a function by re-writing the code as follows:

```
def fixedMonthlyPayment(balance, annualInterestRate):
    """
    balance: the outstanding balance on the credit card
    annualInterestRate: annual interest rate as a decimal
    """
    monthlyInterestRate = annualInterestRate / 12
    monthlyPayment = 10
    while True:
        currentBalance = balance
        for i in range(12):
            currentBalance -= monthlyPayment
            currentBalance += currentBalance * monthlyInterestRate
        if currentBalance <= 0:
            break
        monthlyPayment += 10
    return monthlyPayment
```

Now write a program that uses these two functions to calculate the minimum fixed monthly payment needed to pay off a credit card balance within 12 months. Try it out with the provided test cases below.

```python
def fixedMonthlyPayment(balance, annualInterestRate):
    """
    balance: the outstanding balance on the credit card
    annualInterestRate: annual interest rate as a decimal
    """
    monthlyInterestRate = annualInterestRate / 12
    monthlyPayment = 10
    while True:
        currentBalance = balance
        for i in range(12):
            currentBalance -= monthlyPayment
            currentBalance += currentBalance * monthlyInterestRate
        if currentBalance <= 0:
            break
        monthlyPayment += 10
    return monthlyPayment

def testFixedMonthlyPayment():
    """
    Test cases for fixedMonthlyPayment
    """
    print('Test case 1:', fixedMonthlyPayment(3329, 0.2) == 310)
    print('Test case 2:', fixedMonthlyPayment(4773, 0.2) == 440)
    print('Test case 3:', fixedMonthlyPayment(3926, 0.2) == 360)

testFixedMonthlyPayment()
```

## 5.

Write a program that uses these two functions to calculate the minimum fixed monthly payment needed to pay off a credit card balance within 12 months. Try it out with the provided test cases below.

```python
def fixedMonthlyPayment(balance, annualInterestRate):
    """
    balance: the outstanding balance on the credit card
    annualInterestRate: annual interest rate as a decimal
    """
    monthlyInterestRate = annualInterestRate / 12
    lowerBound = balance / 12
    upperBound = (balance * (1 + monthlyInterestRate) ** 12) / 12
    monthlyPayment = (lowerBound + upperBound) / 2
    while True:
        currentBalance = balance
        for i in range(12):
            currentBalance -= monthlyPayment
            currentBalance += currentBalance * monthlyInterestRate
        if currentBalance <= 0:
            if abs(currentBalance) < 0.01:
                break
            upperBound = monthlyPayment
        else:
            lowerBound = monthlyPayment
        monthlyPayment = (lowerBound + upperBound) / 2
    return monthlyPayment

def testFixedMonthlyPayment():
    """
    Test cases for fixedMonthlyPayment
    """
    print('Test case 1:', fixedMonthlyPayment(3329, 0.2) == 310)
    print('Test case 2:', fixedMonthlyPayment(4773, 0.2) == 440)
    print('Test case 3:', fixedMonthlyPayment(3926, 0.2) == 360)

testFixedMonthlyPayment()
```

## 6.

Write a program that calculates the minimum fixed monthly payment needed in order pay off a credit card balance within 12 months. By a fixed monthly payment, we mean a single number which does not change each month, but instead is a constant amount that will be paid each month.

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
monthlyPayment = 10
while True:
    currentBalance = balance
    for i in range(12):
        currentBalance -= monthlyPayment
        currentBalance += currentBalance * monthlyInterestRate
    if currentBalance <= 0:
        break
    monthlyPayment += 10
print('Lowest Payment:', monthlyPayment)
```

## 7.

Now write a program that calculates the minimum fixed monthly payment needed in order pay off a credit card balance within 12 months. By a fixed monthly payment, we mean a single number which does not change each month, but instead is a constant amount that will be paid each month.

In this problem, we will not be dealing with a minimum monthly payment rate.

The following variables contain values as described below:

```
balance - the
