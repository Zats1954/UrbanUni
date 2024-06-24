import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test9 {

    public static void main(String[] args) {
        /* Домашнее задание по теме "Stream API"*/
        List<String> foods = Arrays.asList("Апельсин", "Яблоко", "Абрикос", "Груша","Арбуз");
        long foodsStream = foods.stream()
                .filter(str -> str.charAt(0) == 'А')
                .count();
        System.out.println(foodsStream);
//---------------------------------------------------------
                  ArrayList<Person> persons = new ArrayList<>(Arrays.asList(
                        new Person("Петр", 25, Gender.M),
                        new Person("Сергей", 21, Gender.M),
                        new Person("Ольга", 31, Gender.F),
                        new Person("Мария", 20, Gender.F),
                        new Person("Иван", 35, Gender.M),
                        new Person("Нина", 24, Gender.F),
                        new Person("Борис", 30, Gender.M),
                        new Person("Антон", 32, Gender.M),
                        new Person("Алена", 23, Gender.F),
                        new Person("Гордей", 49, Gender.M),
                        new Person("КлимВарвара", 18, Gender.U),
                        new Person("Фома", 25, Gender.M)));
         persons.stream()
                 .filter(s -> s.getAge() > 30)
                 .forEach(System.out::println);
  }
}


