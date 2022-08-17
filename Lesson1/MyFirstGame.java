public class MyFirstGame {
    
    public static void main(String[] args) { 

        int number = 24;
        int guess = 1;
        
        while (true) {

            if (guess == number) {
                System.out.printf("Было загадано число %d. Вы победили!", guess);
                break;
            } else if (guess > number) {
                System.out.printf("число %d больше того, что загадал компьютер\n", guess);
            } else {
                System.out.printf("число %d меньше того, что загадал компьютер\n", guess);
            }
            guess+=2;
            if (guess == 101) {
                guess = 2;
            }
        }
    }    
}