import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] children = scan.nextLine().split("\\s+");
        int roll = Integer.parseInt(scan.nextLine());
        ArrayDeque<String> queue = new ArrayDeque<>();
        int rollRemove = 1;
        Collections.addAll(queue,children);

        while (queue.size() > 1){
            for (int i = 1; i < roll; i++) {
                String temp = queue.remove();
                queue.offer(temp);
            }

            String name = queue.peek();
            if (!isPrime(rollRemove)){
                System.out.println("Removed " + name);
                queue.remove();
            }else {
                System.out.println("Prime " + name);
            }

            rollRemove++;

        }

        System.out.println("Last is " + queue.poll());
    }

    private static boolean isPrime(int number) {
        if (number == 1){
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
