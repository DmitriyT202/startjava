public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java (это название задачи)\n");
        int age = 25;
        boolean isMan = false;
        int height = 190;       

        if (age > 20) {
            System.out.println("Ты можешь водить машину");
        } else {
            System.out.println("Ты не можешь водить машину");
        }

        if (!isMan) {
            System.out.println("Ты не будешь служить в армии");
        }

        if (height < 1.80) {
            System.out.println("Тебя не возьмут в космонавты");
        } else {
            System.out.println("Тебя возьмут в космонавты");
        }

        char firstLetterOfTheName = "Ivan".charAt(0); 

        if (firstLetterOfTheName == 'M') {
            System.out.println("Тебя зовут на букву M");
        } else if (firstLetterOfTheName == 'I') {
            System.out.println("Тебя зовут на букву I");
        } else {
            System.out.println("Твое имя начинается не на I и не на M");
        }

        System.out.println("\n2. Поиск max и min числа\n");
        int firstNumber = 568;
        int secondNumber = 1245;

        if (firstNumber > secondNumber) {
            System.out.printf("max = %d, min = %d", firstNumber, secondNumber);
        } else {
            System.out.printf("max = %d, min = %d\n", secondNumber, firstNumber);
        }

        System.out.println("\n3. Работа с числом\n");
        int number = -53;
        System.out.print("Исходное число " + number);

        if (number != 0) {
            if (number % 2 == 0) {
                System.out.print(" четное, ");
            } else {
                System.out.print(" нечетное, ");
            }
            if (number > 0) {
                System.out.println("положительное");                
            }
            else {
                System.out.println("отрицательное");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах\n");
        firstNumber = 365;
        secondNumber = 385;       
        System.out.printf("Исходные числа : %d, %d\n", firstNumber, secondNumber);

        if (firstNumber / 100 - secondNumber / 100 == 0)
            System.out.printf("Одинаковая цифра %d в третьем разряде\n", firstNumber / 100);

        if ((firstNumber / 10) % 10 - (secondNumber / 10) % 10 == 0)
            System.out.printf("Одинаковая цифра %d в втором разряде\n", (firstNumber / 10) % 10);

        if (firstNumber % 10 - secondNumber % 10 == 0)
            System.out.printf("Одинаковая цифра %d в первом разряде\n", firstNumber % 10);

        System.out.println("\n5. Определение буквы, числа или символа по их коду\n");
        char character = '\u0057';       
        System.out.print("Символ " + character + " это ");

        if (character >= 65 && character <= 90)
            System.out.println("большая буква");
        else if (character >= 97 && character <= 122)
            System.out.println("маленькая буква");
        else if (character >= 48 && character <= 57) {
            System.out.println("число");
        } else {
            System.out.println("не буква и не число");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %\n");
        int deposit = 300_000;
        int persent = 0;
        int allSum = 0;

        if (deposit < 100_000) {
            persent = 5;
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            persent = 7;
        } else {
            persent = 10;
        }
        persent = deposit * persent / 100;
        allSum = deposit + persent;
        System.out.printf("Сумма вклада %d начисленные %% %d итоговая сумма с %% %d\n", deposit, 
                persent, allSum);

        System.out.println("\n7. Определение оценки по предметам\n");
        int historyRating = 59;
        int programmingRating = 91;
        int meanPersent = (historyRating + programmingRating) / 2;        

        if (historyRating <= 60) {
            historyRating = 2;
        } else if (historyRating > 60 && historyRating <= 73) {
            historyRating = 3;
        } else if (historyRating > 73 && historyRating <= 91) {
            historyRating = 4;
        } else {
            historyRating = 5;
        }

        if (programmingRating <= 60) {
            programmingRating = 2;
        } else if (programmingRating > 60 && programmingRating <= 73) {
            programmingRating = 3;
        } else if (programmingRating > 73 && programmingRating <= 91) {
            programmingRating = 4;
        } else {
            programmingRating = 5;
        }

        System.out.printf("%d История\n", historyRating);
        System.out.printf("%d Программирование\n", programmingRating);
        System.out.println("Средний бал оценок по предметам : " + 
                (historyRating + programmingRating) / 2);
        System.out.println("Средний % по предметам : " + meanPersent);

        System.out.println("\n\n8. Расчет прибыли\n");
        int monthRentPay = 5000;
        int monthProfit = 13000;
        int monthCostPrice = 9000;
        int yearProfit = 12 * (monthProfit - monthRentPay - monthCostPrice);
        System.out.printf("Прибыль за год %+d", yearProfit);

        System.out.println("\n\n9. Подсчет количества банкнот\n");
        number = 567;
        int countOne$ = 0;
        int countTen$ = 5;
        int countOneHundred$ = 0;
        int countAll = 0;
        number -= countTen$ * 10;
        countOneHundred$ = number / 100;
        countOne$ = number % 100;
        countAll = countOne$ + countTen$ + countOneHundred$;
        number = countOne$ * 1 + countTen$ * 10 + countOneHundred$ * 100;
        System.out.println("Банкноты номиналом 1$ " + countOne$);
        System.out.println("Банкноты номиналом 10$ " + countTen$);
        System.out.println("Банкноты номиналом 100$ " + countOneHundred$);
        System.out.println("Исходная сумма " + number);     
    }
}