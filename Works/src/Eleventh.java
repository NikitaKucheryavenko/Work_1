/*
Реализуйте метод, в который передается две целочисленные переменные и возвращает их среднее геометрическое
 */

import java.util.Scanner;

public class Eleventh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        int c=a*b;
        double d= (double) Math.sqrt(c*1.0);
        System.out.println("Среднее геометрическое двух чисел равно:" + d);
    }
}