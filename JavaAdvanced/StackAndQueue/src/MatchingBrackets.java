import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        ArrayDeque<Integer> containerIndex = new ArrayDeque<>();
        StringBuilder output = new StringBuilder(input);

        for (int i = 0; i < input.length(); i++) {
            Character temp = input.charAt(i);
            if (temp.equals('(')){
                containerIndex.push(i);
            } else if (temp.equals(')')){
                String tempPrint = output.substring(containerIndex.pop(),i+1);
                System.out.println(tempPrint);
            }
        }

    }
}
