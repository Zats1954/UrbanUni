import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test10 {

    public static void main(String[] args) {
        /* Домашнее задание по теме "Stream API 2"*/
        Stream<Integer> cisla = Stream.of(2, 4, 3, 9, 12, 5, 11, 6);
        Map<Object, List<Integer>> groups = cisla.collect(Collectors.groupingBy(s -> s % 2 == 0));
        for (Map.Entry<Object, List<Integer>> item : groups.entrySet()) {
            if ((boolean) item.getKey()) {
                System.out.print("summ of odd numbers ");
            } else {
                System.out.print("summ of even numbers ");
            }
            for (int digit : item.getValue()) {
                System.out.print(digit + " ");
            }
            System.out.println();
            System.out.println(item.getValue()
                                   .stream()
                                   .reduce(0, Integer::sum));
        }
//---------------------------------------------------------
        List<String> foods = Arrays.asList("Апельсин", "Яблоко", "Абрикос", "Груша", "Яблоко", "Арбуз", "Абрикос");
        Stream<String> streamFoods = foods.stream();
        System.out.println("distinct list of ");
        streamFoods.forEach(s -> System.out.print(s + " "));
        System.out.println();
        System.out.println("is ");
        foods.stream()
                .distinct()
                .forEach(s -> System.out.print(s + " "));
    }
}


