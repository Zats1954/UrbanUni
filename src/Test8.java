
interface Printable {
    void print();
}

interface Concationble {
    void concat(String a, String b);
}

public class Test8 {

    public static void main(String[] args) throws Exception {
        /* Домашнее задание по теме "Анонимные классы и функциональные интерфейсы"*/
        String name = "Urban";
        String name1 = "University";
        Printable printHelloEn = new Printable() {
            @Override
            public void print() {
                System.out.println("Hello " + name);
            }
        };

        Printable printHelloFr = new Printable() {
            @Override
            public void print() {
                System.out.println("Bonjour " + name);
            }
        };

        Printable printHelloIt = new Printable() {
            @Override
            public void print() {
                System.out.println("Ciao " + name);
            }
        };
        printHelloEn.print();
        printHelloFr.print();
        printHelloIt.print();
//---------------------------------------------------------
        Concationble concat1 = new Concationble() {
            @Override
            public void concat(String a, String b) {
                System.out.println("читаем о " + a + "-" + b);
            }
        };

        Concationble concat2 = new Concationble() {
            @Override
            public void concat(String a, String b) {
                System.out.println("идем в " + a + "_" + b);
            }
        };

        Concationble concat3 = new Concationble() {
            @Override
            public void concat(String a, String b) {
                System.out.println("учимся в " + a + "/" + b);
            }
        };

        concat1.concat(name, name1);
        concat2.concat(name, name1);
        concat3.concat(name, name1);
    }
}


