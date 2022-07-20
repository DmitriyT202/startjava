import java.util.Locale;

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
        System.out.println("coreNumber = " + coreNumber + ", cpuFrequency = " + cpuFrequency + 
                ", ramCapacity = " + ramCapacity + ", hdCapacity = " + hdCapacity);
        System.out.println("biosVer = " + biosVer + ", winVer = " + winVer + ", typeOfCPU = " + 
                typeOfCPU + ", isX64Based = " + isX64Based);

        System.out.println("\n2. Расчет стоимости товара со скидкой\n");
        int x = 100;
        int y = 200;
        int discount = 11;
        int totalDiscount = (x + y) * 11 / 100;
        System.out.println("Сумма скидки = " + totalDiscount);
        System.out.println("Общая стоимость товаров со скидкой = " + (300 - totalDiscount));

        System.out.println("\n3. Вывод на консоль слова JAVA");
        System.out.println("    J    a  v     v  a    ");
        System.out.println("    J   a a  v   v  a a   ");
        System.out.println(" J  J  aaaaa  V V  aaaaa  ");
        System.out.println("  JJ  a     a  V  a     a ");

        System.out.println("\n4. Отображение min и max значений числовых типов данных\n");
        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = Integer.MAX_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println(String.format("maxByte = %d, maxShort = %d, maxInt = %d, maxLong = %d",
                maxByte, maxShort, maxInt, maxLong));
        maxByte++;
        maxShort++;
        maxInt++;
        maxLong++;
        System.out.println(String.format("maxByte = %d, maxShort = %d, maxInt = %d, maxLong = %d",
                maxByte, maxShort, maxInt, maxLong));
        maxByte--;
        maxShort--;
        maxInt--;
        maxLong--;
        System.out.println(String.format("maxByte = %d, maxShort = %d, maxInt = %d, maxLong = %d",
                maxByte, maxShort, maxInt, maxLong));

        System.out.println("\n5. Перестановка значений переменных\n");
        int firstInt = 1;
        int secondInt = 2;        
        System.out.println("Перестановка с помощью третьей переменной");
        System.out.println(String.format(Locale.ROOT, "Исходные значения переменных: %d, %d", 
                firstInt, secondInt));
        int thirdInt = firstInt;
        firstInt = secondInt;
        secondInt = thirdInt;
        System.out.println(String.format(Locale.ROOT, "Новые значения переменных: %d, %d\n", 
                firstInt, secondInt));
        System.out.println("Перестановка с помощью арифметической операции");
        System.out.println(String.format(Locale.ROOT, "Исходные значения переменных: %d, %d", 
                firstInt, secondInt));        
        firstInt += secondInt;
        secondInt = firstInt - secondInt;
        firstInt -= secondInt;  
        System.out.println(String.format(Locale.ROOT, "Новые значения переменных: %d, %d\n", 
                firstInt, secondInt));
        System.out.println("Перестановка с помощью побитовой операции ^");
        System.out.println(String.format(Locale.ROOT, "Исходные значения переменных: %d, %d", 
                firstInt, secondInt));
        firstInt = firstInt ^ secondInt;
        secondInt = secondInt ^ firstInt;
        firstInt = firstInt ^ secondInt;
        System.out.println(String.format(Locale.ROOT, "Новые значения переменных: %d, %d", 
                firstInt, secondInt));

        System.out.println("\n6. Вывод символов и их кодов\n");
        int intOne = 35;
        int intTwo = 38;
        int intThree = 64;
        int intFour = 94;
        int intFive = 95;
        System.out.println(String.format("%d %c, %d %c, %d %c, %d %c, %d %c", intOne, (char) intOne,
                intTwo, (char) intTwo, intThree, (char) intThree, intFour, (char) intFour, intFive, 
                (char) intFive));

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
        System.out.println(String.format("    %c%c    ", backSlash, slash));
        System.out.println(String.format("   %c  %c   ", backSlash, slash));
        System.out.println(String.format("  %c%c%c %c%c",backSlash, underscore, leftBracket, 
                rightBracket, slash));
        System.out.println(String.format(" %c      %c ", backSlash, slash));
        System.out.println(String.format("%c%c%c%c%c%c%c%c%c%c", backSlash, underscore, underscore,
                underscore, underscore, backSlash, slash, underscore, underscore, slash));

        System.out.println("\n9. Отображение количества сотен, десятков и единиц числа\n");
        srcNum = 123;
        firstDigit = srcNum / 100;
        secondDigit = (srcNum / 10) % 10;
        thirdDigit = srcNum % 120;
        System.out.println(String.format("Число %d содержит:\n%d сотню\n%d десятка\n%d единицы", 
                srcNum, firstDigit, secondDigit, thirdDigit));

        System.out.println("\n10. Преобразование секунд");
        int totalSeconds = 86399;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60; 
        int seconds = (totalSeconds % 3600) % 60;
        System.out.println(String.format("%d:%d:%d", hours, minutes, seconds));
    }
}