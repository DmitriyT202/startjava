import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String line = "";

        while (!line.equals("no")) {
            System.out.print("Введите первое число : "); 
            while (!scanner.hasNextInt()) {
                System.out.println("Вы ввели не число!");
                System.out.print("Введите первое число : ");               
                scanner.next();                               
            } 
            int number1 = scanner.nextInt();

            System.out.print("Введите знак математической операции : ");
            while (!scanner.hasNext("[-+*/%^]")) {
                System.out.println("Вы ввели не знак математической операции!");
                System.out.print("Введите знак математической операции : "); 
                scanner.next();
            }
            char sign = scanner.next().charAt(0);

            System.out.print("Введите второе число : "); 
            while (!scanner.hasNextInt()) {
                System.out.println("Вы ввели не число!");
                System.out.print("Введите второе число : ");               
                scanner.next();               
            } 
            int number2 = scanner.nextInt();

            calculator.calculate(number1, number2, sign);

            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            line = scanner.next();        
           
            while (!line.equals("yes") && !line.equals("no")) {
                System.out.println("Вы ввели не yes и не no");
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                line = scanner.next();                                 
            }               
        }        
    }
}