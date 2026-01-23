public class CenterPyramid {
  public static void main(String[] args) {
    int maxRows = 5;

    for (int i = 0; i <= maxRows; i++) {
      String spaces = " ".repeat(maxRows - i);
      String blocks = "■".repeat(2 * i - 1);
      System.out.println(spaces + blocks);
    }
  }
}
