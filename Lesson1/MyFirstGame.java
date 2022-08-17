public class MyFirstGame {
    
    public static void main(String[] args) { 
        int targetNum = 24;
        int guess = 1;
        
        while (guess != targetNum) {
            if (guess > targetNum) {
                System.out.printf("число %d больше того, что загадал компьютер\n", guess);
                guess -= 2;           
            } else {
                System.out.printf("число %d меньше того, что загадал компьютер\n", guess);
                guess += 3;
            }
        }
        System.out.printf("Было загадано число %d. Вы победили!", guess);
    }    
}