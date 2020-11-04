/*
 *Дано двузначное число. Найдите число десятков в нем.
 */

import java.util.Scanner;
public class Eighth {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите a: ");
        int a1 = in.nextInt();
        int a=a1/10;

        System.out.println(a);
    }
}
