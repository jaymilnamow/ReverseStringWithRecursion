import java.util.Scanner;

/**
 * Created by jaymilnamow on 6/18/16.
 */
public class Main {

    public static void main(String[] args) {

        ReverseString string = new ReverseString();

        Scanner input = new Scanner(System.in);
        String i = input.nextLine();
        System.out.println(string.reverseString(i));

    }
}
