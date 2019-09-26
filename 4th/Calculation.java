public class Calculation {
  public static void main(String[] args) {
    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);
    int value = add(x, y);

    System.out.println(value);
  }

  public static int add(int x, int y) {
    return x + y;
  }
}