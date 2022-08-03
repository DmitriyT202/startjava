import static java.lang.Math.min;
import static java.lang.Math.max;

public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел\n");
        int number = -10;
        int evenSum = 0;
        int oddSum = 0;

        do {
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
            number++;
        } while (number <= 21);

        System.out.printf("В промежутке [-10, 21] сумма четных чисел = %d, а нечетных = %d\n", 
                evenSum, oddSum);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания\n");
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = -1;
        int min = min(firstNumber, min(secondNumber, thirdNumber));
        int max = max(firstNumber, max(secondNumber, thirdNumber));

        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр\n");
        number = 1234;
        int sumOfDigits = 0;
        int digit = 0;
        int result = 0;        

        while (number > 0) {
            digit = number % 10;
            sumOfDigits += digit;
            result = result * 10 + digit;           
            number /= 10;            
        }

        System.out.printf("Число в обратном порядке : %d", result);
        System.out.println("\nСумма цифр : " + sumOfDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк\n");    
        int count = 0;
        for (int i = 1; i < 24; i+=2) {                            
            System.out.printf("%5d", i);
            count++;
            if (count == 5) {
                System.out.println("");
                count = 0;                                            
            }                            
        }

        for (int i = 0; i < 5 - count; i++) {
            System.out.printf("%5d", 0);
        }                       

        System.out.println("\n\n5. Проверка количества единиц на четность\n");
        number = 3141591;
        count = 0;
        System.out.printf("Число %d содержит", number);      
        while (number > 0) {
            if (number % 10 == 1) {
                count++;
            }            
            number /= 10;            
        }

        System.out.printf(" %d %s количество единиц\n", count, (count % 2 == 0) ? "(четное)" : 
                "(нечетное)");

        System.out.println("\n6. Отображение фигур в консоли\n");

        for (int i = 0; i < 5 ; i++) {
            System.out.println("**********");            
        }

        count = 5;        
        while (count > 0) {
            int count2 = 0;  
            while (count2 < count) {
                System.out.print("#");                
                count2++;
            }
            System.out.println();
            count--;
        }

        count = 5;
        int count2 = 0;
        do {
            if (count < 3) {
                count2 = count;
            } else {
                count2 = 5 - count + 1;
            }
            do {
                System.out.print("$");
                count2--;
            } while (count2 > 0);                
            System.out.println();
            count--;
        } while (count > 0);

        System.out.println("\n7. Отображение ASCII-символов\n");
        System.out.printf("%4s %4s%n", "Dec", "Char");

        for (int i = 1; i < 48; i+=2) {
            System.out.printf("%4d %4c%n", i, ((char) i));
        }

        for (int i = 98; i <= 122; i+=2) {
            System.out.printf("%4d %4c%n", i, ((char) i));
        }
       
        System.out.println("\n8. Проверка, является ли число палиндромом\n");
        firstNumber = 1234321;
        secondNumber = firstNumber;
        thirdNumber = 0;

        while (firstNumber != 0) {
            digit = firstNumber % 10;           
            thirdNumber = thirdNumber * 10 + digit;
            firstNumber /= 10;
        }

        System.out.printf("Число %d %sявляется палиндромом", secondNumber, 
                (secondNumber == thirdNumber) ? "" : "не ");

        System.out.println("\n\n9. Определение, является ли число счастливым\n");
        number = 154622;
        firstNumber = number / 1000;
        secondNumber = number % 1000;
        thirdNumber = firstNumber;
        int fourthNumber = secondNumber;
        int sumOne = 0;
        int sumTwo = 0;        

        while (thirdNumber != 0 && fourthNumber != 0) {
            digit = thirdNumber % 10;
            sumOne += digit; 
            digit = fourthNumber % 10;
            sumTwo += digit;
            thirdNumber /= 10;
            fourthNumber /= 10;
        }
       
        System.out.printf("Сумма цифр %d = %d\n", firstNumber, sumOne);
        System.out.printf("Сумма цифр %d = %d\n", secondNumber, sumTwo);        
        System.out.printf("Число %d %sявляется счастливым", number, (sumOne == sumTwo) ? "" :
                "не "); 

        System.out.println("\n\n10. Вывод таблицы умножения Пифагора\n");
        System.out.print("    Таблица Пифагора");
        System.out.printf("\n   |");

        for (int i = 2; i < 10; i++) {
            System.out.printf("%3d ", i);
        }

        System.out.printf("\n---|--------------------------------\n");

        for (int i = 2; i < 10; i++) {            
            System.out.printf("%2d |", i);
            for (int j = 2; j < 10; j++) {
                System.out.printf("%3d ", i * j);                
            }
           System.out.println("\n   |");
        }
    }    
}