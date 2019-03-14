import java.security.KeyException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void firstMethod() {
        try {
            System.out.println("Попытка деления на ноль\n");
            double a = 10/0;
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void secondMethod() {
        try {
            System.out.println("Попытка выйти за предел массива\n");
            int[] a = {1,2,3};
            a[5] = 6;

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение: выход за предел массива\n");
        }
    }

    public static void thirdMethod(int numberOfException) {
        try {
            if(numberOfException == 1)
                throw new ArrayIndexOutOfBoundsException();
            if(numberOfException == 2)
                throw new IllegalAccessException();
            if(numberOfException == 3)
                throw new KeyException();

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение типа 1: " + e + "\n");
        }
        catch (IllegalAccessException e) {
            System.out.println("Исключение типа 2: " + e + "\n");
        }
        catch (KeyException e) {
            System.out.println("Исключение типа 3: " + e + "\n");
        }

    }

    public static void fourthMethod() {
        try {
            System.out.println("Генерация исключения собственного подкласса\n");
            throw new MyLogException("Сообщение из MyException", "LOW");
        } catch (MyLogException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
//        TASK1
        firstMethod();
//        TASK2
        secondMethod();
//        TASK3


        int num;
        while (true) {

            System.out.print("Введите 1-для вывода ArrayIndexOutOfBoundsException\n" +
                    "2 - для вывода IllegalAccessException\n" +
                    "3 для вывода KeyException\n"+
                    "0 для продолжения работы программы\n");
            try {
                Scanner in = new Scanner(System.in);
                num = in.nextInt();
                if(num==0) {
                    break;
                }

                else
                    System.out.println("Данный код ошибки не обрабатывается\n");
                thirdMethod(num);
            }
            catch (InputMismatchException e) {
                System.out.println("Данный код ошибки не обрабатывается\n");
            }


        }

        thirdMethod(num);
//        TASK4
        fourthMethod();
    }

}
