public class Circle extends Figure {

  private double radius;

  public Circle(double r, double x, double y) {
    super(x, y);
    radius = r;
  }

  public double getRadius() {
    return this.radius;
  }

  @Override
  public double calculateArea() {
    return  Math.pow(radius, 2) * Math.PI;
  }
}