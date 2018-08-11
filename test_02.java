package cn.ginko.wy;

import java.util.Arrays;
import java.util.Scanner;

public class test_02 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//苹果堆数;
        int a[] = new int[n];//每堆苹果的个数;
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();//询问次数;
        int q[] = new int[m];//想知道；
        for(int i = 0;i<m;i++){
            q[i] = sc.nextInt();
        }
        int []sum = new int[n];
        sum[0] = a[0];
        for(int i = 1;i<n;i++){
            sum[i] = a[i]+sum[i-1];
        }
        int []result = new int[m];
        for(int i =0;i<m;i++){
            result[i] = know(n,sum,q[i]);
            System.out.println(result[i]);
        }

    }

    private static int know(int n, int[] sum, int q) {
        int result = Arrays.binarySearch(sum,q);
        if(result>=0){
            return result+1;
        }else{
            return -result;
        }
    }
}
