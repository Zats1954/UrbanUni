import java.util.*;

public class Test7 {


    public static void main(String[] args) throws Exception {
        /* Домашнее задание по теме "Enum"*/
        char bukva = 'А';
        for (Alfavit alfavit : Alfavit.values()) {
            if (alfavit.letter == bukva)
                System.out.println("позиция буквы " + bukva + " в алфавите - " + (alfavit.ordinal() + 1));
        }

//-------------------------------------------------------------
        ArrayList<Person> persons = new ArrayList<>(Arrays.asList(
                new Person("Петр", 25, Gender.M),
                new Person("Сергей", 21, Gender.M),
                new Person("Ольга", 29, Gender.F),
                new Person("Мария", 20, Gender.F),
                new Person("Иван", 35, Gender.M),
                new Person("Нина", 24, Gender.F),
                new Person("Борис", 30, Gender.M),
                new Person("Антон", 32, Gender.M),
                new Person("Алена", 23, Gender.F),
                new Person("Гордей", 27, Gender.M),
                new Person("КлимВарвара", 18, Gender.U),
                new Person("Фома", 25, Gender.M)));

        Scanner sc = new Scanner(System.in);
        System.out.println("Выберете пол (M,F,U):");
        Gender gender = Gender.valueOf(sc.next());
        for(Person person: persons ){
            if(person.getPol().equals(gender)){
            System.out.println(person.getName() + " " + person.getAge() + " " + person.getPol().show());
            }
        }
    }

    enum Alfavit {
        L0('А'),
        L1('Б'),
        L2('В'),
        L3('Г'),
        L4('Д'),
        L5('Е'),
        L6('Ё'),
        L7('Ж'),
        L8('З'),
        L9('И'),
        L10('Й'),
        L11('К'),
        L12('Л'),
        L13('М'),
        L14('Н'),
        L15('О'),
        L16('П'),
        L17('Р'),
        L18('С'),
        L19('Т'),
        L20('У'),
        L21('Ф'),
        L22('Х'),
        L23('Ц'),
        L24('Ч'),
        L25('Ш'),
        L26('Щ'),
        L27('Ъ'),
        L28('Ы'),
        L29('Ь'),
        L30('Э'),
        L31('Ю'),
        L32('Я');

        private char letter;

        Alfavit(char letter) {
            this.letter = letter;
        }

        private static final Map<Character, Alfavit> BY_LETTER = new HashMap<Character, Alfavit>();

        static {
            for (Alfavit e : values()) {
                BY_LETTER.put(e.letter, e);
            }
        }
    }
}


