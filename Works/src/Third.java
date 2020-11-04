/*
*Создайте переменную, увеличьте её на единицу несколькими способами и выведите значение на экран.
 */

public class Third {
    public static void main(String[] args) {
        int a=5;
        int b= ++a; //1-й способ
        int c=5;
        int d= c++; //2-й способ
        int e=c+1; //3-й способ
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
