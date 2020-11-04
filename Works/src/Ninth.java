/*
 *Реализуйте метод, который получает целое число на вход и возвращает разницу между данным числом и 21. Выведите
значение на экран с различными целыми числами
 */

import java.util.Scanner;

public class Ninth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = in.nextInt();
        double razniza = ((a / 21.0) * 100);

        System.out.println("Разница равна:" + razniza);
    }
}
