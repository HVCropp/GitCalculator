import java.util.Scanner;
public class Main {
    static Scanner Scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            System.out.print("Введите арифмитическую операцию (пример 2 + 3) \n ");
            String input = Scanner.nextLine();
            String answer = calc(input);
            System.out.println("Твой ответ: " +answer);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static String calc(String input) throws Exception{
        String [] elements = input.split(" ");
        int firstNumber = Integer.parseInt(elements[0]);
        int secondNumber = Integer.parseInt(elements[2]);
        if (firstNumber <= 1 || firstNumber >= 10 || secondNumber <= 1 || secondNumber >= 10) {
            throw new Exception("Числа должна быть больше 1 или меньше 10");
        }
        String op = elements[1];
        int answer;
        switch (op) {
            case "+":
                answer = firstNumber + secondNumber;
                break;
            case "-":
                answer = firstNumber - secondNumber;
                break;
            case "*":
                answer = firstNumber * secondNumber;
                break;
            case "/":
                answer = firstNumber / secondNumber;
                break;
            default:
                throw new Exception("Операция не распознана");
        }
        return String.valueOf(answer);
    }
}

