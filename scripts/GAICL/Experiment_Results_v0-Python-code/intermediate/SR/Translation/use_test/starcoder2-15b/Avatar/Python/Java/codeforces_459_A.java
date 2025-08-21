
```java

```
/src/main/java/com/github/hcsp/controlflow/Main.java
package com.github.hcsp.controlflow;

import java.util.Date;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(deltaX(100, 100, 100, 100));
    }

    /**
     * 给定一个矩形的左上角坐标(x1,y1)和右下角坐标(x2,y2)，计算其面积。
     *
     * @param x1 矩形左上角x坐标
     * @param y1 矩形左上角y坐标
     * @param x2 矩形右下角x坐标
     * @param y2 矩形右下角y坐标
     * @return 矩形面积
     */
    public static int deltaX(int x1, int y1, int x2, int y2) {
        int deltaX = x2 - x1;
        int deltaY = y2 - y1;
        if (deltaX == 0) {
            return deltaY;
        } else if (deltaY == 0) {
            return deltaX;
        } else {
            return deltaX * deltaY;
        }
    }

    /**
     * 给定一个矩形的左上角坐标(x1,y1)和右下角坐标(x2,y2)，计算其面积。
     *
     * @param x1 矩形左上角x坐标
     * @param y1 矩形左上角y坐标
     * @param x2 矩形右下角x坐标
     * @param y2 矩形右下角y坐标
     * @return 矩形面积
     */
    public static int deltaX2(int x1, int y1, int x2, int y2) {
        return (x2 - x1) * (y2 - y1);
    }

    /**
     * 给定一个矩形的左上角坐标(x1,y1)和右下角坐标(x2,y2)，计算其面积。
     *
     * @param x1 矩形左上角x坐标
     * @param y1 矩形左上角y坐标
     * @param x2 矩形右下角x坐标
     * @param y2 矩形右下角y坐标
     * @return 矩形面积
     */
    public static int deltaX3(int x1, int y1, int x2, int y2) {
        return Math.abs(x2 - x1) * Math.abs(y2 - y1);
    }

    /**
     * 给定一个矩形的左上角坐标(x1,y1)和右下角坐标(x2,y2)，计算其面积。
     *
     * @param x1 矩形左上角x坐标
     * @param y1 矩形左上角y坐标
     * @param x2 矩形右下角x坐标
     * @param y2 矩形右下角y坐标
     * @return 矩形面积
     */
    public static int deltaX4(int x1, int y1, int x2, int y2) {
        return Math.abs(x2 - x1) * Math.abs(y2 - y1);
    }

    /**
     * 给定一个矩形的左上角坐标(x1,y1)和右下角坐标(x2,y2)，计算其面积。
     *
     * @param x1 矩形左上角x坐标
     * @param y1 矩形左上角y坐标
     * @param x2 矩形右下角x坐标
     * @param y2 矩形右下角y坐标
     * @return 矩形面积
     */
    public static int deltaX5(int x1, int y1, int x2, int y2) {
        return Math.abs(x2 - x1) * Math.abs(y2 - y1);
    }

    /**
     * 给定一个矩形的左上角坐标(x1,y1)和右下角坐标(x2,y2)，计算其面积。
     *
     * @param x1 矩形左上角x坐标
     * @param y1 矩形左上角y坐标
     * @param x2 矩形右下角x坐标
     * @param y2 矩形右下角y坐标
     * @return 矩形面积
     */
    public static int deltaX6(int x1, int y1, int x2, int y2) {
        return Math.abs(x2 - x1) * Math.abs(y2 - y1);
    }

    /**
     * 给定一个矩形的左上角坐标(x1,y1)和右下角坐标(x2,y2)，计算其面积。
     *
     * @param x1 矩形左上角x坐标
     * @param y1 矩形左上角y坐标
     * @param x2 矩形右下角x坐标
     * @param y2 矩形右下角y坐标
     * @return 矩形面积
     */
    public static int deltaX7(int x1, int y1, int x2, int y2) {
        return Math.abs(x2 - x1) * Math.abs(y2 - y1);
    }

    /**
     * 给定一个矩形的左上角坐标(x1,y1)和右下角坐标(x2,y2)，计算其面积。
     *
     * @param x1 矩形左上角x坐标
     * @param y1 矩形左上角y坐标
     * @param x2 矩形右下角x坐标
     * @param y2 矩形右下角y坐标
     * @return 矩形面积
     */
    public static int deltaX8(int x1, int y1, int x2, int y2) {
        return Math.abs(x2 - x1) * Math.abs(y2 - y1);
    }

    /**
     * 给定一个矩形的左上角坐标(x1,y1)和右下角坐标(x2,y2)，计算其面积。
     *
     * @param x1 矩形左上角x坐标
     * @param y1 矩形左上角y坐标
     * @param x2 矩形右下角x坐标
     * @param y2 矩形右下角y坐标
     * @return 矩形面积
     */
    public static int deltaX9(int x1, int y1, int x2, int y2) {
        return Math.abs(x2 - x1) * Math.abs(y2 - y1);
    }

    /**
     * 给定一个矩形的左上角坐标(x1,y1)和右下角坐标(x2,y2)，计算其面积。
     *
     * @param x1 矩形左上角x坐标
     * @param y1 矩形左上角y坐标
     * @param x2 矩形右下角x坐标
     * @param y2 矩形右下角y坐标
     * @return 矩形面积
     */
    public static int deltaX10(int x1, int y1, int x2, int y2) {
        return Math.abs(x2 - x1) * Math.abs(y2 - y1);
    }

    /**
     * 给定一个矩形的左上角坐标(x1,y1)和右下角坐标(x2,y2)，计算其面积。
     *
     * @param x1 矩形左上角x坐标
     * @param y1 矩形左上角y坐标
     * @param x2 矩形右下角x坐标
     * @param y2 矩形右下角y坐标
     * @return 矩形面积
     */
    public static int deltaX11(int x1, int y1, int x2, int y2) {
        return Math.abs(x2 - x1) * Math.abs(y2 - y1);
    }

    /**
     * 给定一个矩形的左上角坐标(x1,y1)和右下角坐标(x2,y2)，计算其面积。
     *
     * @param x1 矩形左上角x坐标
     * @param y1 矩形左上角y坐标
     * @param x2 矩形右下角x坐标
     * @param y2 矩形右下角y坐标
     * @return 矩形面积
     */
    public static int deltaX12(int x1, int y1, int x2, int y2) {
        return Math.abs(x2 - x1) * Math.abs(y2 - y1);
    }

    /**
     * 给定一个矩形的左上角坐标(x1,y1)和右下角坐标(x2,y2)，计算其面积。
     *
     * @param x1 矩形左上角x坐标
     * @param y1 矩形左上角y坐标
     * @param x2 矩形右下角x坐标
     * @param y2 矩形右下角y坐标
     * @return 矩形面积
     */
    public static int deltaX13(int x1, int y1, int x2, int y2) {
        return Math.abs(x2 - x1) * Math.abs(y2 - y1);
    }

    /**
     * 给定一个矩形的左上角坐标(x1,y1)和右下角坐标(x2,y2)，计算其面积。
     *
     * @param x1 矩形左上角x坐标
     * @param y1 矩形左上角y坐标
     * @param x2 矩形右下角x坐标
     * @param y2 矩形右下角y坐标
     * @return 矩形面积
     */
    public static int deltaX14(int x1, int y1, int x2, int y2) {
        return Math.abs(x2 - x1) * Math.abs(y2 - y1);
    }

    /**
     * 给定一个矩形的左上角坐标(x1,y1)和右下角坐标(x2,y2)，计算其面积。
     *
     * @param x1 矩形左上角x坐标
     * @param y1 矩形左上角y坐标
     * @param x2 矩形右下角x坐标
     * @param y2 矩形右下角y坐标
     * @return 矩形面积
     */
    public static int deltaX15(int x1, int y1, int x2, int y2) {
        return Math.abs(x2 - x1) * Math.abs(y2 - y1);
    }

    /**
     * 给定一个矩形的左上角坐标(x1,y1)和右下角坐标(x2,y2)，计算其面积。
     *
     * @param x1 矩形左上角x坐标
     * @param y1 矩形左上角y坐标
     * @param x2 矩形右下角x坐标
     * @param y2 矩形右下角y坐标
     * @return 矩形面积
     */
    public static int deltaX16(int x1, int y1, int x2, int y2) {
        return Math.abs(x2 - x1) * Math.abs(y2 - y1);
    }

    /**
     * 给定一个矩形的左上角坐标(x1,y1)和右下角坐标(x2,y2)，计算其面积。
     *
     * @param x1 矩形左上角x坐标
     * @param y1 矩形左上角y坐标
     * @param x2 矩形右下角x坐标
     * @param y2 矩形右下角y坐标
     * @return 矩形面积
     */
    public static int deltaX17(int x1, int y1, int x2, int y2) {
        return Math.abs(x2 - x1) * Math.abs(y2 - y1);
    }

    /**
     * 给定一个矩形的左上角坐标(x1,y1)和右下角坐标(x2,y2)，计算其面积。
     *
     * @param x1 矩形左上角x坐标
     * @param y1 矩形左上角y坐标
     * @param x2 矩形右下角x坐标
     * @param y2 矩形右下角y坐标
     * @return 矩形面积
     */
    public static int deltaX18(int x1, int y1, int x2, int y2) {
        return Math.abs(x2 - x1) * Math.abs(y2 - y1);
    }

    /**
     * 给定一个矩形的左上角坐标(x1,y1)和右下角坐标(x2,y2)，计算其面积。
     *
     * @param x1 矩形左上角x坐标
     * @param y1 矩形左上角y坐标
     * @param x2 矩形右下角x坐标
     * @param y2 矩形右下角y坐标
     * @return 矩形面积
     */
    public static int deltaX19(int x1, int y1, int x2, int y2) {
        return Math.abs(x2 - x1) * Math.abs(y2 - y1);
    }

    /**
     * 给定一个矩形的左上角坐标(x1,y1)和右下角坐标(x2,y2)，计算其面积。
     *
     * @param x1 矩形左上角x坐标
     * @param y1 矩形左上角y坐标
     * @param x2 矩形右下角x坐标
     * @param y2 矩形右下角y坐标
     * @return 矩形面积
     */
    public static int deltaX20(int x1, int y1, int x2, int y2) {
        return Math.abs(x2 - x1) * Math.
