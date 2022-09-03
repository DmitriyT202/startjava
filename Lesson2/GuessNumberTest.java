import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первого игрока : ");       
        Player player1 = new Player(scanner.nextLine());

        System.out.print("Введите имя второго игрока : ");
        Player player2 = new Player(scanner.nextLine());

        GuessNumber guess = new GuessNumber(player1, player2);
        String answer = "";

        while (!answer.equals("no")) {
            guess.start();

            System.out.println("Хотите продолжить игру? [yes/no]:");
            answer = scanner.next();

            while (!answer.equals("no") && !answer.equals("yes")) {
                System.out.println("Вы ввели не yes и не no");
                System.out.println("Хотите продолжить игру? [yes/no]:");
                answer = scanner.next();
            }
        }    
    }
}