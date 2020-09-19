import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BrouserHistory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        ArrayDeque<String> history = new ArrayDeque<>();
        ArrayDeque<String> forward = new ArrayDeque<>();

        String container = "";

        while (!input.equals("Home")){
            if (input.equals("back")){
                if (history.isEmpty()){
                    System.out.println("no previous URLs");
                    input = scan.nextLine();
                    continue;
                }else {
                    forward.offer(container);
                    container = history.pop();

                }
            } else if(input.equals("forward")){
                if (forward.isEmpty()){
                    System.out.println("no next URLs");
                    input = scan.nextLine();
                    continue;
                }else {
                    container = forward.poll();
                }
            }else {
                if (!container.isEmpty()){
                    history.push(container);
                }
                container = input;
            }
            input = scan.nextLine();
            System.out.println(container);
        }
    }
}
