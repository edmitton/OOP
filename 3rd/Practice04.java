import java.util.Scanner;

public class Practice04 {
  public static void main(String[] args) {
    int[] numbers = new int[] { 3, 4, 9 };
    Scanner scan = new Scanner(System.in);

    System.out.println("1桁の数値を入力してください");
    int input = scan.nextInt();

    for (int value : numbers) {
      if (input == value) System.out.println("アタリ！");
    }
  }
}
