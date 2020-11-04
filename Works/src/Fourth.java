/*
*Даны две переменные. Поменяйте значения переменных друг с другом двумя способами
 */

public class Fourth {
    public static void main(String[] args) {
        int a=4; //1-й способ
        int b=8;
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("a="+a);
        System.out.println("b="+b);
        int x=4;
        int y=8;
        x=x+y;
        y=y-x;
        y=-y;
        x=x-y;
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
}
