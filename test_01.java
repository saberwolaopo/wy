package cn.ginko.wy;

import java.util.Scanner;

public class test_01 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 课堂时间
        int k = sc.nextInt(); // 清醒时间

        int a[] = new int[n];//感兴趣评分
        int t[] = new int[n];//是否清醒

        int sum = 0;//醒着的听课
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            t[i] = sc.nextInt();
        }
        //小易清醒时间听到的课
        for(int i = 0;i<n;i++){
            if(t[i] == 1){
                sum+=a[i];
            }
        }
        int max = 0;//叫醒最大化的听课
        for(int i = 0;i<n;i++){
            if(t[i] == 0){
                int number = sum;
                for(int j = i;j<Math.min(i+k,n);j++){
                    if(t[j] == 0){
                        number+=a[j];
                    }
                }
                max = Math.max(max,number);
            }
        }
        System.out.println(max);
    }
}
