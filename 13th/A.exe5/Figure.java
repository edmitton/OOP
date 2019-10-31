public abstract class Figure {

  private double x;
  private double y;

  public Figure(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return this.x;
  }

  public double getY() {
    return this.y;
  }

  public double calculateArea() {
    return getX() * getY();
  }
}