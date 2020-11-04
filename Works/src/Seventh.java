/*
 *Дано неотрицательное целое число. Найдите число десятков в его десятичной записи (то есть вторую справа цифру его
десятичной записи).
 */

import java.util.Scanner;
public class Seventh {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите a: ");
        int a1 = in.nextInt();
        int a=a1%100;
        int a2=a/10;
        System.out.println(a2);
    }
}
