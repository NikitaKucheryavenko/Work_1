/*
 *Дано два числа a и b. Найдите гипотенузу треугольника с заданными катетами.
 */

import java.util.Scanner;

public class SSC {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите a: ");
        int a1 = in.nextInt();
        System.out.print("Введите b: ");
        int b1 = in.nextInt();
        int a2=2;
        int b2=2;
        int a3= (int) Math.pow(a1,a2);
        int b3= (int) Math.pow(b1,b2);
        int c1=a3+b3;
        int c2= (int) Math.sqrt(c1);

        System.out.printf("c= %d \n", c2);
        in.close();
    }
}