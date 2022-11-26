import java.util.Scanner;
import javax.swing.JOptionPane;


public class task3 {
    public static void main(String[] args) {
        int num1;
        int num2;
        String operation;

        Scanner input = new Scanner(System.in);

        System.out.println("введите первое число");
        num1 = input.nextInt();

        System.out.println("введите второе число");
        num2 = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("выберите действие");
        operation = op.next();

        if (operation == "+")
            ;
        {
            System.out.println("ваш ответ" + (num1 + num2));
        }
        if (operation == "-")
            ;
        {
            System.out.println("ваш ответ" + (num1 - num2));
        }

        if (operation == "/")
            ;
        {
            System.out.println("ваш ответ" + (num1 / num2));
        }
        if (operation == "*") {
            System.out.println("ваш ответ " +
                    "" + (num1 * num2));
        }

    }
}