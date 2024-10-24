package com.southwest.test;

public class PalindromeNumbers {
    // 检查一个数是否为回文数的方法
    public static boolean isPalindrome(int number) {
        if(number == reverse(number)) return true;
        else return false;
    }
    // 反转数字
    public static int reverse(int number) {
        int ret = 0,lenth = 0,tmp = number;
        while(tmp != 0)
        {
            lenth++;
            tmp /= 10;
        }
        tmp = number;
        while(tmp != 0)
        {
            int lenth2 = lenth;
            int sum = tmp % 10;
            while(--lenth2 != 0)
            {
                sum *= 10;
            }
            ret += sum;
            lenth--;
            tmp /= 10;
        }
        return ret;
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.printf("从1到%-3d的回文数如下:\n", n);
        for (int i = 1; i < n; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
