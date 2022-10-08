import java.util.Scanner;


//Создаем класс под названием калькулятор
public class Main {
    public static void main(String[] args) {
        System.out.println("Хотите решить квадратное уравнение нажмите: 1");
        System.out.println("Хотите запустить калькулятор нажмите: 2");
        Scanner in = new Scanner(System.in);
        System.out.print("");
        int num = in.nextInt();
        if (num == 1) {
            System.out.println("Вы выбрали " + num);
        } else if (num == 2) {
            System.out.println("Вы выбрали " + num);
        } else {
            System.out.println("Только 1 или 2!!");
        }

//Квадратное уравенение; через формулы с использованием вещественных числе(Коэффиценты без буквенных значений)
        if (num == 1) {
            System.out.println("Введите коэффициент a 'число без буквы'");
            double a = in.nextInt();

            System.out.println("Введите коэффициент b 'число без буквы'");
            int b = in.nextInt();

            System.out.println("Введите коэффициент c");
            double c = in.nextInt();

            double diskremenant = b * b - 4 * a * c;
            double koren1 = (-1 * b + Math.sqrt(diskremenant)) / (2 * a);
            double koren2 = (-1 * b - Math.sqrt(diskremenant)) / (2 * a);

            System.out.println("Великая система получила корни уравнениея :3");

            System.out.println(koren1);

            System.out.println(koren2);


//Простейший калькулятор
        }
        if (num == 2) {
            System.out.println("Введите операцию: 1 '+'; 2'-'; 3'*'; 4'/'");
            double operation = in.nextInt();
            System.out.println("Введите первое число");
            double cifra1 = in.nextInt();
            System.out.println("Введите второе число");
            double cifra2 = in.nextInt();
            if (operation == 1) {
                System.out.println("Ответ:");

                System.out.println(cifra1 + cifra2);
            } else if (operation == 2) {
                System.out.println("Ответ:");

                System.out.println(cifra1 - cifra2);
            } else if (operation == 3) {
                System.out.println("Ответ:");

                System.out.println(cifra1 * cifra2);
            } else if (operation == 4) {
                System.out.println("Ответ:");

                System.out.println(cifra1 / cifra2);
            } else {
                System.out.println("Операции всего 4 (-_-)");
            }


        }
    }
}