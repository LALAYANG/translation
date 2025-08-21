

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String[] a = {"10", "100", "1000", "10000", "100000"};
        int new_ = 0;
        for (int i = 0; i < n.length(); i++) {
            new_ += Integer.parseInt(n.substring(i, i + 1));
        }
        if (n.equals(a[0]) || n.equals(a[1]) || n.equals(a[2]) || n.equals(a[3]) || n.equals(a[4])) {
            System.out.println(10);
        } else {
            System.out.println(new_);
        }
    }
}

```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:
bobbobbob

Expected output:
3

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
        System.out.println(count);
    }
}

```

## 3.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:
bobbobbob

Expected output:
3

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
        System.out.println(count);
    }
}

```

## 4.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:
bobbobbob

Expected output:
3

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
        System.out.println(count);
    }
}

```

## 5.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:
bobbobbob

Expected output:
3

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
        System.out.println(count);
    }
}

```
/src/main/java/com/example/demo/controller/UserController.java
package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") int id) {
        return userService.getUserById(id);
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable("id") int id, @RequestBody User user) {
        userService.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") int id) {
        userService.deleteUser(id);
    }
}


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
        System.out.println(count);
    }
}
/src/main/java/com/example/demo/java/Main.java
package com.example.demo.java;

import java.util.Scanner;

// Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.
//
// Test input:
// bobbobbob
//
// Expected output:
// 3

// java code:/src/main/java/com/example/demo/java/Main2.java
package com.example.demo.java;

import java.util.Scanner;

// Translate the following Python code to Java and enclose your solution inside ```java and ```.
// A sample test case is provided below:
//
// Test input:
// 2
//
// Expected output:
// 2
//
// ```
// n = input ( )
// a = [ "10" , "100" , "1000" , "10000" , "100000" ]
// new = sum ( list ( map ( int , n ) ) )
// if n in a :
//     print ( 10 )
// else :
//     print ( new )
//
//
// ```

// java code:

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String[] a = {"10", "100", "1000", "10000", "100000"};
        int new_ = 0;
        for (int i = 0; i < n.length(); i++) {
            new_ += Integer.parseInt(n.substring(i, i + 1));
        }
        if (n.equals(a[0]) || n.equals(a[1]) || n.equals(a[2]) || n.equals(a[3]) || n.equals(a[4])) {
            System.out.println(10);
        } else {
            System.out.println(new_);
        }
    }
}

