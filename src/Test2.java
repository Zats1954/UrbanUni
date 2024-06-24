import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) throws IOException {
        /* Домашнее задание по теме "File"*/
        String fileName = "testFile.txt";
        File file = new File("d://UrbanUni", fileName);

        try(FileWriter writer = new FileWriter(file)) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите данные для записи:");
            writer.write(scanner.nextLine());
            writer.write('\n');

            String str = new String();
            while (true) {
                System.out.println("Введите что-нибудь еще или 0:");
                str = scanner.nextLine();
                if (str.equals("0")) {
                    break;
                } else {
                    writer.write(str);
                    writer.write('\n');
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader reader = new FileReader(file)) {
            while (reader.ready()) {
                System.out.print((char) reader.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
