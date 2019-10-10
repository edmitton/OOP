public class Point2D {
  private double x;
  private double y;

  public Point2D() {
    this(0.0, 0.0);
  }

  public Point2D(double x_value, double y_value) {
    this.x = x_value;
    this.y = y_value;
  }

  public double xCoord() {
    return this.x;
  }

  public double yCoord() {
    return this.y;
  }
}
