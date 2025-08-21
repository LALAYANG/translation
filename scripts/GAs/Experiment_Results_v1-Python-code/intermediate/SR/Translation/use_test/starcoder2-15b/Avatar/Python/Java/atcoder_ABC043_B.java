

```java
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String my_str = "";
        int FirstConditionChecker = 567;
        int SecondConditionChecker = 817;
        int FourthConditionChecker = 129;
        TTest ttest_ind = new TTest();
        ttest_ind.tTest(new double[]{63, 15, 40}, new double[]{67, 94, 82});
        int ThirdConditionChecker = 723;
        int FirstLoopChecker = 302;
        int SecondLoopChecker = 301;
        for (int LoopIndexOut = 0; LoopIndexOut < FirstLoopChecker / SecondLoopChecker; LoopIndexOut++) {
            for (char c : inputString.toCharArray()) {
                if ((FourthConditionChecker & ThirdConditionChecker) != 0) {
                    if ((FirstConditionChecker & SecondConditionChecker) != 0) {
                        if (c == '0' || c == '1') {
                            my_str = my_str + c;
                        } else if (c == 'B' && my_str.length() != 0) {
                            my_str = my_str.substring(0, my_str.length() - 1);
                        }
                    }
                }
            }
        }
        System.out.println(my_str);
    }
}
```
/src/main/java/com/github/kompot/py2java/Py2Java.java
package com.github.kompot.py2java;

import com.github.kompot.py2java.ast.AST;
import com.github.kompot.py2java.ast.ASTNode;
import com.github.kompot.py2java.ast.ASTVisitor;
import com.github.kompot.py2java.ast.nodes.*;
import com.github.kompot.py2java.ast.nodes.expressions.*;
import com.github.kompot.py2java.ast.nodes.statements.*;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportFrom;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportFromItem;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportItem;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportModule;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportModuleItem;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportModuleItemAs;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportModuleItemStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportModuleStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarItem;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarItemAs;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarItemStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarItem;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarItemAs;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarItemStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarItem;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarItemAs;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarItemStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarItem;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarItemAs;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarItemStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarItem;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarItemAs;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarItemStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarItem;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarItemAs;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarItemStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarItem;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarItemAs;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarItemStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarItem;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarItemAs;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarItemStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarItem;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarItemAs;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarItemStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarItem;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarItemAs;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarItemStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarItem;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarItemAs;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarItemStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarItem;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarItemAs;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarItemStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarItem;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarItemAs;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarItemStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStarItem;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStarItemAs;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStarItemStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStarStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarItem;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarItemAs;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarItemStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarItem;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarItemAs;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarItemStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarItem;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarItemAs;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarItemStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarItem;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarItemAs;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarItemStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarItem;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarItemAs;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarItemStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarItem;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarItemAs;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarItemStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarItem;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarItemAs;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarItemStar;
import com.github.kompot.py2java.ast.nodes.statements.imports.ImportStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStarStar;
import com.
