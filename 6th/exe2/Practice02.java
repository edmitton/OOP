public class Practice02 {
  public static void main(String[] args) {
    int[] array = input(4);
    int x = input();
    int y = input();
    int z = input();

    Maximum m  = new Maximum();
    int aMax   = m.max(array);
    int xyzMax = m.max(x, y, z) ;
    System.out.println("配列の中身の最大値：" + aMax);
    System.out.println("x, y, z の最大値：" + xyzMax);
  }

  public static int[] input(int times) {
    int[] array =  new int[times];
    System.out.println(times + "個の整数を入力してください：");
    for (int i = 0; i < times; i++) {
      array[i] = new java.util.Scanner(System.in).nextInt();
    }
    return array;
  }

  public static int input() {
    System.out.print("整数を入力してください：");
    int number = new java.util.Scanner(System.in).nextInt();

    return number;
  }
}
