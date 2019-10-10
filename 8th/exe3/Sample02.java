public class Sample02 {
  public static void main(String[] args) {
    Point2D po1 = new Point2D();
    Point2D po2 = new Point2D(3, 5);

    System.out.println("1つ目");
    System.out.println("x座標：" + po1.xCoord());
    System.out.println("y座標：" + po1.yCoord());
    System.out.println("2つ目");
    System.out.println("x座標：" + po2.xCoord());
    System.out.println("y座標：" + po2.yCoord());
  }
}