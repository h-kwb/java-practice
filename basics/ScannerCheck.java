import java.util.Scanner;

public class ScannerCheck {
  public static void main(String[] args) {
    // Scanner class の宣言
    Scanner scanner = new Scanner(System.in);
    // User 入力を促す。
    System.out.println("あなたの名前を入力してください:");
    String name = scanner.nextLine();
    
    System.out.println("あなたの年齢を入力してください:");
    int age = scanner.nextInt();
    scanner.nextLine(); // nextInt()の後に改行が出力されるため、nextLine()で受け取る。
    
    System.out.println("あなたの好きなスポーツはなんですか？:");
    String sports = scanner.nextLine();

    // 結果を表示
    System.out.println(name + "さん、こんにちは");
    System.out.println("あなたは" + age + "歳ですね");
    System.out.println("あなたの好きなスポーツは" + sports + "ですね！");

    scanner.close();
  }
}
