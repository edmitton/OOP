public class Practice01 {

  public static void main(String[] args) {
    Rectangle r = new Rectangle(3.0, 2.0, 0.0, 0.0);
    System.out.println("長方形の面積：" + r.getArea());
    
    Circle c = new Circle(1.0, 2.0, 3.0);
    System.out.println("円の面積：" + c.getArea());

    Figure[] f = new Figure[2];
    f[0] = new Rectangle(4.0, 5.0, 2.0, 6.0);
    f[1] = new Circle(2.0, 5.0, -1.0);

    for (Figure fi : f) {
      System.out.println(fi.getArea());
    }
  }
}
