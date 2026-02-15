import java.util.Scanner;

public class IfCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Is today your birthday?");
        String answer = sc.nextLine();
        
        if (answer.equalsIgnoreCase("birthday")) {
            System.out.println("Happy birthday!");
        } else {
            System.out.println("Have a nice day!");
        }
        sc.close();
    }
}
