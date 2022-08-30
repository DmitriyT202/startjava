public class Calculator {

    public void calculate(int number1, int number2, char sign) {        
        int result = 0;

        switch (sign) {
            case '+' :
                result = number1 + number2;
                break;
            case '-' :
                result = number1 - number2;
                break;
            case '*' :
                result = number1 * number2;
                break;
            case '/' :
                result = number1 / number2;
                break;
            case '%' :
                result = number1 % number2;
                break;
            case '^' :
                result = 1;
                for (int i = 0; i < number2; i++) {
                    result *= number1;
                }
                break;
        }     

        System.out.println(number1 + " " + sign + " " + number2 + " = " + result);
    }
}