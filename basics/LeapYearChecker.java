import java.util.Scanner;
import java.util.InputMismatchException;

public class LeapYearChecker {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("西暦を入力するとその年が閏年かどうか判定します。\n数字を入力してください：");
    
    int year = 0;

    while (true) {
      try {
        year = sc.nextInt();
        break;
      } catch (InputMismatchException e) {
        System.out.println("整数を入力してください。：");
        sc.next(); // 不正入力対策
      }
    }
    
    if (year % 400 == 0) {
      System.out.println(year + "は、閏年です");
    } else if (year % 100 == 0) {
      System.out.println(year + "は、閏年ではありません");
    } else if (year % 4 == 0) {
      System.out.println(year + "は、閏年です");
    } else {
      System.out.println(year + "は、閏年ではありません");
    }

    sc.close();
  }
}
