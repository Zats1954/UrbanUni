import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test5 {

    private static Set<String> colors1, colors2;
    private static Set<Integer> digits;

    public static void main(String[] args) throws Exception {
        /* Домашнее задание по теме "Set. HashSet. LinkedHashSet. TreeSet"*/
        colors1 = new HashSet<>() {
            {
                add("black");
                add("white");
                add("red");
                add("yellow");
            }
        };

        colors2 = new HashSet<>() {
            {
                add("green");
                add("yellow");
                add("white");
                add("violet");
            }
        };


        System.out.println("colors1 ");
        for (String color : colors1) {
            System.out.print(color + " ");
        }
        System.out.println(" ");

        System.out.println("colors2 ");
        for (String color : colors2) {
            System.out.print(color + " ");
        }
        System.out.println(" ");
        colors1.retainAll(colors2);
        System.out.println("common colors ");
        for (String color : colors1) {
            System.out.print(color + " ");
        }
        System.out.println(" ");


        TreeSet<Integer> digits = new TreeSet<>();
        Random rnd = new Random();

        for (int i = 0; i < 30; i++) {
            digits.add(rnd.nextInt(50));
        }

        System.out.println("initial row ");
        for (int n : digits) {
            System.out.print(n + " ");
        }
        System.out.println(" ");

        TreeSet<Integer> oddAbove15 = new TreeSet<>();
        TreeSet<Integer> lastDigits = new TreeSet<>();

        for (int n : digits) {
            if (n > 15 && (n % 2 == 0)) {
                oddAbove15.add(n);
            } else {
                lastDigits.add(n / 2);
            }
        }

        System.out.println("odd digits above 15 ");
        for (int n : oddAbove15) {
            System.out.print(n + " ");
        }
        System.out.println(" ");

        System.out.println("last digits divided by 2 ");
        for (int n : lastDigits) {
            System.out.print(n + " ");
        }
        System.out.println(" ");
    }
}


