package try_catch;

import java.util.Scanner;

public class ArithmeticException {
    public static void main(String[] args) {

        int count = 0;
        do {
            try {
                Scanner input = new Scanner(System.in);
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                int res = num1/num2;
                System.out.print("result is:");
                System.out.println(res);
                count = 1;
            } catch (Exception e) {
                System.out.println("Exception :"+ e);
            } finally {
                System.out.print("Happy code!");
            }
        }while(count < 1);
    }
}
