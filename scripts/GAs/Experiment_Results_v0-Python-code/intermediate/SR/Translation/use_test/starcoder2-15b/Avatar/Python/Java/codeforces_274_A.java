

```java

```
/src/main/java/com/hackerrank/algorithms/implementation/SockMerchant.java
package com.hackerrank.algorithms.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SockMerchant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }

    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> socks = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (socks.containsKey(ar[i])) {
                socks.put(ar[i], socks.get(ar[i]) + 1);
            } else {
                socks.put(ar[i], 1);
            }
        }
        int pairs = 0;
        for (Map.Entry<Integer, Integer> entry : socks.entrySet()) {
            pairs += entry.getValue() / 2;
        }
        return pairs;
    }

    static int sockMerchant2(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static int sockMerchant3(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static int sockMerchant4(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static int sockMerchant5(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static int sockMerchant6(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static int sockMerchant7(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static int sockMerchant8(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static int sockMerchant9(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static int sockMerchant10(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static int sockMerchant11(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static int sockMerchant12(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static int sockMerchant13(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static int sockMerchant14(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static int sockMerchant15(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static int sockMerchant16(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static int sockMerchant17(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static int sockMerchant18(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static int sockMerchant19(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static int sockMerchant20(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static int sockMerchant21(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static int sockMerchant22(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static int sockMerchant23(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static int sockMerchant24(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static int sockMerchant25(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static int sockMerchant26(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static int sockMerchant27(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static int sockMerchant28(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static int sockMerchant29(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static int sockMerchant30(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static int sockMerchant31(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static int sockMerchant32(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static int sockMerchant33(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static int sockMerchant34(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[i] = 0;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;
    }

    static
