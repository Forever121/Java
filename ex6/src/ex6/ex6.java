package ex6;

import java.util.Scanner;


public class ex6 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("��������Ŀ��");

        Scanner input = new Scanner(System.in);
        double c = input.nextDouble();
        System.out.println("�����������ʣ�");

        double l = input.nextDouble();
        double x = l / (12 * 100);
        System.out.println("������������");

        int m = input.nextInt();
        double sum = 0;

        for (int i = 1; i <= m; i++) {
            sum = (sum + c) * (1 + x);
        }

        System.out.printf("��Ǯ��Ϊ��%2.3f\n", sum);
    }
}
