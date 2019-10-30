public class Circle extends Figure {

  private double radius;

  public Circle(double radius, double x, double y) {
    super(x, y);
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  @Override
  public double getArea() {
    return this.radius * this.radius * Math.PI;
  }
}
