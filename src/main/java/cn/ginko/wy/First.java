package cn.ginko.wy;

import java.util.Scanner;

/**
 * 90 ac率
 */
public class First {
    public static int maxIntre(int n, int k, int[] a, int[] awake) {
        int res = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (awake [i] == 1) {
                res += a[i];
            } else {
                int m = 0;
                for (int j = 0; j < k; j++) {
                    if (i+j < n - 1 &&awake[i + j] == 0) {
                        m += a[i + j];
                    }
                }
                max = Math.max(m, max);
            }
        }
        return res + max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] awake = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < n ; j++) {
            awake[j] = sc.nextInt();
        }

        int res = maxIntre(n, k, a, awake);
        System.out.println(res);
    }
}
