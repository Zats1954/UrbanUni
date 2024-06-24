public class Person {
    private String name;
    private int age;
    private Gender pol;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getPol() {
        return pol;
    }

    public Person(String name, int age, Gender pol) {
        this.name = name;
        this.age = age;
        this.pol = pol;
    }

    @Override
    public String toString() { return "Person{" +
                "name='" + name +
                ", age=" + age +
                ", pol=" + pol +
                "}";}
}
 enum Gender{
    M("мужчина"),
    F("женщина"),
    U("чудо-юдо");

     String str;
     Gender(String Str) {
         str = Str;
     }

     public String show() { return str; }
 }