import static java.lang.Math.random;
import java.util.Scanner;

public class GuessNumber {
    
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        int number = (int) (random()*100) + 1;
        System.out.println("Загадано число в интервале в полуинтервале (0, 100]");
        System.out.println(number);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Первый игрок называет число: ");
            do {  
                while (!scanner.hasNextInt()) {
                    System.out.println("Первый игрок назвал не число!");
                    System.out.print("Первый игрок называет число: ");
                    scanner.next();
                }
                player1.setNumber(scanner.nextInt());

                if (player1.getNumber() <= 0 || player1.getNumber() > 100) {
                    System.out.println("Вы ввели число не в полуинтервале (0, 100]");
                    System.out.print("Первый игрок называет число: ");
                }
            } while (player1.getNumber() <= 0 || player1.getNumber() > 100);

            if (number == player1.getNumber()) {
                System.out.printf("Первый игрок - %s угадал число %d!\n", 
                        player1.getName(), number);
                break;
            } else {
                System.out.println("Первый игрок не угадал загаданное число");
                if (player1.getNumber() > number) {
                    System.out.printf("Число %d больше того, что загадал компьютер\n", 
                            player1.getNumber());
                } else {
                    System.out.printf("Число %d меньше того, что загадал компьютер\n",
                                player1.getNumber());
                }
            }
            
            System.out.print("Второй игрок называет число: ");
            do {
                while (!scanner.hasNextInt()) {
                    System.out.println("Второй игрок назвал не число!");
                    System.out.print("Второй игрок называет число : ");
                    scanner.next();
                }
                player2.setNumber(scanner.nextInt());

                if (player2.getNumber() <= 0 || player2.getNumber() > 100) {
                    System.out.println("Вы ввели число не в полуинтервале (0, 100]");
                    System.out.print("Второй игрок называет число: ");
                }
            } while (player2.getNumber() <= 0 || player2.getNumber() > 100);

            if (number == player2.getNumber()) {
                System.out.printf("Второй игрок - %s угадал число %d\n", 
                        player2.getName(), number);
                break;
            } else {
                System.out.println("Второй игрок не угадал загаданное число");
                if (player2.getNumber() > number) {
                        System.out.printf("Число %d больше того, что загадал компьютер\n", 
                                player2.getNumber());
                } else {
                    System.out.printf("Число %d меньше того, что загадал компьютер\n",
                            player2.getNumber());
                }
            }
        }
    }
}