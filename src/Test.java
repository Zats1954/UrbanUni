import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        /* Домашнее задание по теме "Exception"*/
        Test test = new Test();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введите четное число");
            test.isOdd(sc.nextInt());
        } catch (MyException e) {
            System.out.println("Нечетное число");
        } catch (InputMismatchException e) {
            System.out.println("Это не число");
        }

        sc = new Scanner(System.in);
        try {
            System.out.println("Введите строку с числом");
            test.hasCislo(sc.nextLine());
            System.out.println("В строке нет числа");
        } catch (MyException1 e) {
            System.out.println("Есть число в строке");
        }
    }

    private void isOdd(int cislo) throws MyException {
        if ((cislo % 2) == 1) {
            throw new MyException();
        }
    }

    private void hasCislo(String str) throws MyException1 {
        char[] znaki = str.toCharArray();
        for (char znak : znaki) {
            if (Character.isDigit(znak))
                throw new MyException1();
        }
    }
}

class MyException extends Exception {
}

class MyException1 extends Exception {
}

