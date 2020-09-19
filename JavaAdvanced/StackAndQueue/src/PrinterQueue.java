import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<String> printerTank = new ArrayDeque<>();

        String command  = scan.nextLine();

        while (!command.equals("print")){
            if (command.equals("cancel")){
                if (printerTank.isEmpty()){
                    System.out.println("Printer is on standby");
                }else {
                    System.out.println("Canceled "+printerTank.poll());
                }
            }else {
                printerTank.offer(command);
            }

            command = scan.nextLine();
        }
        while (!printerTank.isEmpty()){
            System.out.println(printerTank.poll());
        }
    }
}
