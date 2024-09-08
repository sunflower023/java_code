package com.southwest.test;

import java.util.Scanner;

public class test {

    //主函数
    public static void main(String[] args) {
        //System.out.println("hello world");
        //print_three();
        //System.out.println(Add(1,2));
        //print_infor();
        test_double_arr();
    }

    //方法（函数）
    public static void print_three(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    }
    public static int Add(int a, int b){
        return a+b;
    }
    //scanner
    public static void print_infor(){
        System.out.println("请输入你的名字：");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("请输入你的年龄：");
        int age = sc.nextInt();
        System.out.println(name + "的年龄是" + age);
    }

    //二维数组
    public  static  void test_double_arr(){
        int [][] arr= {{1,2,3},{4,5,6},{7,8,9,19}};
        for(int i = 0;i<arr.length;i++){
            System.out.println("\n");
            int[] arr1 = arr[i];
            for(int j = 0;j<arr1.length;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }

}
