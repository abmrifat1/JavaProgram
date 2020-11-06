import java.util.Scanner;
import pack1.*;

public class TestCommand {

    private static int id;
    private static int userId = 5;

    private static int cycle() {
        id = ++userId;
        return id;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String number = s.nextLine();
        // int x = Integer.parseInt(args[0]);
        // int y = Integer.parseInt(args[1]);
        // System.out.println(x + y);
        System.out.println("number to string:"+number);
        System.out.println(TestCommand.cycle());
        Hello h = new Hello();
        System.out.println(h.doSum(4, 999));
   }
}
