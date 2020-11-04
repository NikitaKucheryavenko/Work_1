/*
*Дано натуральное число. Выведите его последнюю цифру.
 */

import java.util.Scanner;
public class Sixth {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите a: ");
        int a1 = in.nextInt();
        int a2=10;
        int a=a1%a2;
        System.out.println(a);
    }
}
