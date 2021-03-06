import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loader
{
    public static void main(String[] args) throws IOException {
        //Вывод в консоль кодов всех латинских букв и кириллицы
        LettersCode lettersCode = new LettersCode();
        lettersCode.printCode();
        System.out.println();

        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        parseString(text);
        System.out.println();
        parseStringElse(text);
        System.out.println();

        parseName();
    }
        private static void parseString(String text) {
            //Первый топорный вариант, для случая, когда мы знаем сколько цифр в зарплате и для неизменных имён.
            String fragment1 = text.substring(15, 19);
            String fragment2 = text.substring(56, 61);

            int fr1 = Integer.parseInt(fragment1);
            int fr2 = Integer.parseInt(fragment2);
            int sum = fr1 + fr2;
            System.out.println("Зарплата Васи и Маши: " + sum);
        }

        private static void parseStringElse(String text) {
            //Второй вариант, на случай, когда не знаем, сколько цифр в зарплате.
            int indexOf = text.indexOf("руб");
            int indexOf2 = text.lastIndexOf("руб");
            int indexOf3 = text.indexOf('л');
            int indexOf4 = text.lastIndexOf('-');

            int i1 = indexOf3 + 2;
            int i2 = indexOf - 1;
            String fragment3 = text.substring(i1, i2);
            System.out.println("Зарплата Васи: " + fragment3 + " руб.");

            int i3 = indexOf4 + 2;
            int i4 = indexOf2 - 1;
            String fragment4 = text.substring(i3, i4);
            System.out.println("Зарплата Маши: " + fragment4 + " руб.");

            int fr3 = Integer.parseInt(fragment3);
            int fr4 = Integer.parseInt(fragment4);
            int sum2 = fr3 + fr4;
            System.out.println("Зарплата Васи и Маши: " + sum2 + " руб.");
        }

        private static void parseName() throws IOException {
        //Разбивка ФИО
        System.out.println("Введите Фамилию Имя Отчество: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String readString = reader.readLine();
            int indexOf5 = readString.indexOf(' ');
            int indexOf6 = readString.lastIndexOf(' ');
            if(indexOf5 == -1){
                System.out.println("Информация введена не корректно! Ведите больше одного слова.");
            }
            else if(indexOf5 == indexOf6){
                System.out.println("Информация введена не корректно! Ведите больше двух слов.");
            }
            else if((readString.indexOf(' ', indexOf5 + 1)) != indexOf6){
                System.out.println("Информация введена не корректно! Ведите не больше трёх слов.");
            }
            else {
                String fragment5 = readString.substring(0, indexOf5);
                String fragment6 = readString.substring((indexOf5 + 1), indexOf6);
                String fragment7 = readString.substring(indexOf6 + 1);
                System.out.println("Фамилия: " + fragment5.trim());
                System.out.println("Имя: " + fragment6.trim());
                System.out.println("Отчество: " + fragment7.trim());
            }

            reader.close();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Информация введена не корректно!");
        }

    }
}