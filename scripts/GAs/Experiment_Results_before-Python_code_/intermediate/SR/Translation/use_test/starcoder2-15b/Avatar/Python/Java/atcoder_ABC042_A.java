

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = {a, b, c};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
                count++;
            }
        }
        if (count == 2) {
            if (a + b + c == 17) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}

```

## 2.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

```
Sample Input:

apple

Sample Output:

1

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 3.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

```
Sample Input:

apple

Sample Output:

1

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 4.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

```
Sample Input:

apple

Sample Output:

1

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 5.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

```
Sample Input:

apple

Sample Output:

1

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
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
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public String list(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "user/list";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("user", new User());
        return "user/add";
    }

    @PostMapping("/add")
    public String add(User user) {
        userService.save(user);
        return "redirect:/user/list";
    }

    @GetMapping("/edit")
    public String edit(@RequestParam("id") Long id, Model model) {
        User user = userService.findById(id);
        model.addAttribute("user", user);
        return "user/edit";
    }

    @PostMapping("/edit")
    public String edit(User user) {
        userService.save(user);
        return "redirect:/user/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") Long id) {
        userService.deleteById(id);
        return "redirect:/user/list";
    }
}


import java.util.List;

public interface UserService {
    List<User> findAll();

    User findById(Long id);

    void save(User user);

    void deleteById(Long id);
}
/src/main/java/com/example/demo/service/UserService.java
package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;/src/main/java/com/example/demo/service/impl/UserServiceImpl.java
package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
/src/main/java/com/example/demo/controller/HomeController.java
package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String index(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "index";
    }
}
/src/main/java/com/example/demo/repository/UserRepository.java
package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

