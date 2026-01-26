public class MinMaxFinder {
  public static int[] findMinMax(int[] arr) {
    // 入力チェック
    if (arr == null) {
      throw new IllegalArgumentException("This array is null");
    }
    if (arr.length == 0) {
      throw new IllegalArgumentException("配列が空です");
    }
    
    int min = arr[0];
    int max = arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return new int[]{min, max};
  }

  public static void main(String[] args) {
    try {
      int[] arr = {1, 4, 7, 3, 9};
      int[] result = findMinMax(arr);

      System.out.println("Min:" + result[0]);
      System.out.println("Max:" + result[1]);
    } catch (IllegalArgumentException e) {
      System.out.println("Error:" + e.getMessage());
    }
  }
}
