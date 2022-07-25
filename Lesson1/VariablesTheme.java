public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль\n");
        byte coreNumber = 6;
        short cpuFrequency = 2904;
        int ramCapacity = 16281;
        long hdCapacity = 1_000_186_310_656L;
        float biosVer = 1.30F;
        double winVer = 10.19044;
        char typeOfCPU = 'I';
        boolean isX64Based = true;
        System.out.println("Количество ядер процессора : " + coreNumber);
        System.out.println("Частота процессора : " + cpuFrequency);
        System.out.println("Объем оперативной памяти : " + ramCapacity);
        System.out.println("Объем памяти на жестком диске : " + hdCapacity);
        System.out.println("Версия БИОС : " + biosVer);
        System.out.println("Версия ОС Windows : " + winVer);
        System.out.println("Тип процессора : " + typeOfCPU);
        System.out.println("Принадлежность к 64-разрядной ОС : " + isX64Based);        

        System.out.println("\n2. Расчет стоимости товара со скидкой\n");
        int xPrice = 100;
        int yPrice = 200;
        int discount = 11;
        int totalDiscount = (xPrice + yPrice) * 11 / 100;
        System.out.println("Сумма скидки = " + totalDiscount);
        System.out.println("Общая стоимость товаров со скидкой = " + (xPrice + yPrice - 
                totalDiscount));

        System.out.println("\n3. Вывод на консоль слова JAVA\n");
        System.out.println("    J    a  v     v  a    ");
        System.out.println("    J   a a  v   v  a a   ");
        System.out.println(" J  J  aaaaa  V V  aaaaa  ");
        System.out.println("  JJ  a     a  V  a     a ");

        System.out.println("\n4. Отображение min и max значений числовых типов данных\n");
        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = Integer.MAX_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.printf("maxByte = %d, maxShort = %d, maxInt = %d, maxLong = %d\n", maxByte, 
                maxShort, maxInt, maxLong);        
        System.out.printf("maxByte = %d, maxShort = %d, maxInt = %d, maxLong = %d\n", ++maxByte, 
                ++maxShort, ++maxInt, ++maxLong);        
        System.out.printf("maxByte = %d, maxShort = %d, maxInt = %d, maxLong = %d\n", --maxByte,
                --maxShort, --maxInt, --maxLong);

        System.out.println("\n5. Перестановка значений переменных\n");
        int num1 = 1;
        int num2 = 2;        
        System.out.println("Перестановка с помощью третьей переменной");
        System.out.printf("Исходные значения переменных: %d, %d", num1, num2);
        int buffer = num1;
        num1 = num2;
        num2 = buffer;
        System.out.printf("\nНовые значения переменных: %d, %d\n", num1, num2);
        System.out.println("\nПерестановка с помощью арифметической операции");
        System.out.printf("Исходные значения переменных: %d, %d", num1, num2);        
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;  
        System.out.printf("\nНовые значения переменных: %d, %d\n", num1, num2);
        System.out.println("\nПерестановка с помощью побитовой операции ^");
        System.out.printf("Исходные значения переменных: %d, %d", num1, num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.printf("\nНовые значения переменных: %d, %d\n", num1, num2);

        System.out.println("\n6. Вывод символов и их кодов\n");
        char codeOne = 35;
        char codeTwo = 38;
        char codeThree = 64;
        char codeFour = 94;
        char codeFive = 95;
        System.out.printf("%d %c\n%d %c\n%d %c\n%d %c\n%d %c\n", (int) codeOne, codeOne, 
                (int) codeTwo, codeTwo, (int) codeThree, codeThree, (int) codeFour, codeFour,
                (int) codeFive, codeFive); 

        System.out.println("\n7. Произведение и сумма цифр числа\n");
        int srcNum = 345;
        int firstDigit = srcNum / 100;
        int secondDigit = (srcNum / 10) % 30;
        int thirdDigit = srcNum % 340;
        int sum = firstDigit + secondDigit + thirdDigit;
        int product = firstDigit * secondDigit * thirdDigit;
        System.out.println(String.format("Cумма цифр числа %d = %d", srcNum, sum));
        System.out.println(String.format("Произведение цифр числа %d = %d", srcNum, product));

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка\n");
        char backSlash = '/';
        char slash = '\\';
        char leftBracket ='(';
        char rightBracket = ')';
        char underscore = '_';
        char space = ' ';
        System.out.printf("%c%c%c%c%c%c\n", space, space, space, space, backSlash, slash);
        System.out.printf("%c%c%c%c%c%c%c\n", space, space, space, backSlash, space, space, slash);
        System.out.printf("%c%c%c%c%c%c%c%c\n", space, space, backSlash, underscore, leftBracket, 
                space, rightBracket, slash);
        System.out.printf("%c%c%c%c%c%c%c%c%c\n", space, backSlash, space, space, space, 
                space, space, space, slash);
        System.out.printf("%c%c%c%c%c%c%c%c%c%c\n", backSlash, underscore, underscore,
                underscore, underscore, backSlash, slash, underscore, underscore, slash);

        System.out.println("\n9. Отображение количества сотен, десятков и единиц числа\n");
        srcNum = 123;
        firstDigit = srcNum / 100;
        secondDigit = (srcNum / 10) % 10;
        thirdDigit = srcNum % 10;
        System.out.printf("Число %d содержит:\n%d сотен\n%d десятков\n%d единиц\n", srcNum, 
                firstDigit, secondDigit, thirdDigit);

        System.out.println("\n10. Преобразование секунд");
        int totalSeconds = 86399;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60; 
        int seconds = totalSeconds % 60;
        System.out.printf("%d:%d:%d", hours, minutes, seconds);
    }
}