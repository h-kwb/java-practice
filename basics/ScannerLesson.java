import java.util.Scanner;

public class ScannerLesson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What's your name?:");
        String name = sc.nextLine();

        System.out.println("How old are you?:");
        int age = Integer.parseInt(sc.nextLine());

        System.out.println("Hello! " + name + "! \nYou are " + age + " years old.");

        sc.close();
    }
}