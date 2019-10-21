public class Pen {
  private static int sum = 0;
  private double length;
  private String color;

  private Pen(){
    length = 18.0;
    color  = "Red";
    sum++;
  }

  public Pen(double l, String c) {
    this();
    length = l;
    color  = c;
  }

  public double getLength() {
    return this.length;
  }

  public String getColer() {
    return this.color;
  }

  public static int getSum() {
    return sum;
  }
}