public class Point2D {
  private double x;
  private double y;

  public Point2D() {
    this(0.0, 0.0);
  }

  public Point2D(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return this.x;
  }

  public double getY() {
    return this.y;
  }
}
