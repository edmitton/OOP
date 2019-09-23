public class Practice03 {
  public static void main(String[] args) {
    int[] moneyList = new int[]{123456, 4321, 76540};

    for (int i = 0; i < moneyList.length; i++) {
      System.out.println(moneyList[i]);
    }

    for (int value : moneyList) {
      System.out.println(value);
    }
  }
}
