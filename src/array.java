import java.util.Locale;
import java.util.Scanner;
class Loader {
/*
     public static void main(String[] args) {
         char ch1 = 'h';
         char ch2 = 'i';
         char ch3 = 'b';

         System.out.println(decode(ch1) + " " + decode(ch2) + " " + decode(ch3));
     }

     public static String decode(char ch) {
         String answer;

         switch (ch) {
             case 'h':
                 answer = "Otlichno!";
                 break;
             case 'i':
                 answer = "I can decode!";
                 break;
             case 'm':
                 answer ="I can decode!";
                 break;
             case 'k':
                 answer ="I can decode!";
                 break;
             case 'b':
                 answer = "Bye!";
                 break;
             default:
                 throw new IllegalStateException("Unexpected value: " + ch);
         }
         return answer;
     }
 }*/

/*
    public static void main(String[] args) {
        int i = 10;
        do {
            i --;
            System.out.println("Value i = " + i);
        }while (i > 1);



    }
 }*/


/*     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int operand1 = scanner.nextInt(); //считывает число
*//*Метод next() класса Scanner cчитывает строку,
а метод charAt(0) позволяет взять первый символ в этой строке.
 так мы получаем операцию, которую нужно выполнить*//*
         char operation = scanner.next().charAt(0);
         int operand2 = scanner.nextInt();
         System.out.println(operand1+operation+operand2);
         sout
     }*/

    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 10);
        System.out.println("Начнем игру? Да/Нет");
        Scanner gm = new Scanner(System.in);
        String operand1 = gm.nextLine();

        System.out.println(randomNumber);
        switch (operand1.toUpperCase(Locale.ROOT)) {
            case "НЕТ":
                System.out.println("Жаль, Пока пока");
                break;
            case "ДА":
                System.out.println("Вот и отлично приступим.... отгадай число от 0-9 ");
                int i = 4;
                int count = 1;
                while (i >= 0) {
                    System.out.println("У вас осталось " + i + " Попыток");
                    Scanner number = new Scanner(System.in);
                    int num = number.nextInt();
                    if (num < 0) {
                        System.out.println("Введите положительное число");
                        continue;
                    } else if (num == randomNumber) {
                        System.out.println("Вы угадали число с " + count + " попытки");
                        break;
                    } else if (num > randomNumber && i > 0) {
                        System.out.println("Ваше число больше загадонного попытайтесь еще раз");
                        i--;
                        count++;
                        continue;
                    } else if (num < randomNumber && i > 0) {
                        System.out.println("Ваше число меньше загадонного, попытайтесь еще раз");
                        i--;
                        count++;
                        continue;
                    } else if (i == 0) {
                        System.out.println("Все попытки исчерпаны, всего хорошего");
                        break;
                    }

                }


        }

    }
}
