/*
*Реализуйте метод, в который передается две целочисленные переменные и возвращает их среднее арифметическое
 */

import java.util.Scanner;

public class tenth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        double c=(a+b)/2.0;
        System.out.println("Среднее арифметическое двух чисел равно:" + c);
    }
}
