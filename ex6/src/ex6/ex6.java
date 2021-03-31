package ex6;

import java.util.Scanner;


public class ex6 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("请输入数目：");

        Scanner input = new Scanner(System.in);
        double c = input.nextDouble();
        System.out.println("请输入年利率：");

        double l = input.nextDouble();
        double x = l / (12 * 100);
        System.out.println("请输入月数：");

        int m = input.nextInt();
        double sum = 0;

        for (int i = 1; i <= m; i++) {
            sum = (sum + c) * (1 + x);
        }

        System.out.printf("总钱数为：%2.3f\n", sum);
    }
}
