public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел\n");
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;

        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 21);

        System.out.printf("В промежутке [-10, 21] сумма четных чисел = %d, а нечетных = %d\n", 
                sumEven, sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания\n");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;       
        int min = (number1 < number2) ? number1 : number2;
        min = (min < number3) ? min : number3;
        int max = (number1 > number2) ? number1 : number2;
        max = (max > number3) ? max : number3;
       
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр\n");
        int number = 1234;
        int sumDigits = 0;       
        int reverseNumber = 0;        

        while (number > 0) {
            int digit = number % 10;
            sumDigits += digit;
            reverseNumber = reverseNumber * 10 + digit;           
            number /= 10;            
        }

        System.out.printf("Число в обратном порядке : %d", reverseNumber);
        System.out.println("\nСумма цифр : " + sumDigits);

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

        int countRow = 5;

        while (countRow > 0) {
            int countCol = 0;  
            while (countCol < countRow) {
                System.out.print("#");                
                countCol++;
            }
            System.out.println();
            countRow--;
        }

        countRow = 5;
        int countCol = 0;
        
        do {
            if (countRow < 3) {
                countCol = countRow;
            } else {
                countCol = 5 - countRow + 1;
            }
            do {
                System.out.print("$");
                countCol--;
            } while (countCol > 0);                
            System.out.println();
            countRow--;
        } while (countRow > 0);

        System.out.println("\n7. Отображение ASCII-символов\n");
        System.out.printf("%4s %4s%n", "Dec", "Char");

        for (int i = 1; i < 48; i += 2) {
            System.out.printf("%4d %4c%n", i, ((char) i));
        }

        for (int i = 98; i <= 122; i += 2) {
            System.out.printf("%4d %4c%n", i, ((char) i));
        }
       
        System.out.println("\n8. Проверка, является ли число палиндромом\n");
        int scrNumber = 1234321;
        int copyScrNumber = scrNumber;
        int reverse = 0;

        while (scrNumber != 0) {
            int digit = scrNumber % 10;           
            reverse = reverse * 10 + digit;
            scrNumber /= 10;
        }

        System.out.printf("Число %d %sявляется палиндромом", copyScrNumber, 
                (copyScrNumber == reverse) ? "" : "не ");

        System.out.println("\n\n9. Определение, является ли число счастливым\n");
        int secNumber = 154622;
        int firstHalfNumber = secNumber / 1000;
        int secondHalfNumber = secNumber % 1000;
        int copySrcNumber = firstHalfNumber;
        int fourthNumber = secondHalfNumber;
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;        

        while (fourthNumber != 0) {
            int digit = copySrcNumber % 10;
            sumFirstHalf += digit; 
            digit = fourthNumber % 10;
            sumSecondHalf += digit;
            copySrcNumber /= 10;
            fourthNumber /= 10;
        }
       
        System.out.printf("Сумма цифр %d = %d\n", firstHalfNumber, sumFirstHalf);
        System.out.printf("Сумма цифр %d = %d\n", secondHalfNumber, sumSecondHalf);        
        System.out.printf("Число %d %sявляется счастливым", secNumber, 
                (sumFirstHalf == sumSecondHalf) ? "" : "не "); 

        System.out.println("\n\n10. Вывод таблицы умножения Пифагора\n");
        System.out.print("    Таблица Пифагора");
        System.out.printf("\n   |");

        for (int i = 2; i < 10; i++) {
            System.out.printf("%2d ", i);
        }

        System.out.printf("\n---|------------------------\n");

        for (int i = 2; i < 10; i++) {            
            System.out.printf("%2d |", i);
            for (int j = 2; j < 10; j++) {
                System.out.printf("%2d ", i * j);                
            }
           System.out.println("");
        }
    }    
}