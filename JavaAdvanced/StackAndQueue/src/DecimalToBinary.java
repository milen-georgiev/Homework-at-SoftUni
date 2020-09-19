import javax.swing.*;
import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int decimalNumber = Integer.parseInt(scan.nextLine());
        ArrayDeque<Integer> binaryNumber = new ArrayDeque<>();

        while (decimalNumber!=0){
            binaryNumber.push(decimalNumber % 2);
            decimalNumber = decimalNumber / 2;
        }

        for (int element:
             binaryNumber) {
            System.out.print(element);
        }
    }
}
