import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<String> calculator = new ArrayDeque<>();
        String[] input = scan.nextLine().split("\\s+");
        for (int i = 0; i < input.length ; i++) {
            calculator.add(input[i]);
        }

        while (calculator.size() > 1){
            int first = Integer.valueOf(calculator.pop());
            String operator = calculator.pop();
            int second = Integer.valueOf(calculator.pop());

            if (operator.equals("+")){
                calculator.push(String.valueOf(first + second));
            } else {
                calculator.push(String.valueOf(first - second));
            }
        }
        System.out.println(calculator.pop());
    }
}
